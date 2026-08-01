package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.a4;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.h2;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.t7;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class o {
    private static final a l = new a();

    /* renamed from: a, reason: collision with root package name */
    private final l f4499a;
    private long c;
    private Long d;
    private long e;
    private long h;
    private Object i;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final Map j = new HashMap();
    private final Object k = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f4500a = -1;
        private int b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f4500a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long b = b();
            return ((((int) (b ^ (b >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public int a() {
            return this.b;
        }
    }

    o(l lVar) {
        this.f4499a = lVar;
    }

    public void a(boolean z) {
        synchronized (this.f) {
            this.g.set(z);
            if (z) {
                this.h = System.currentTimeMillis();
                this.f4499a.Q();
                if (p.a()) {
                    this.f4499a.Q().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.h);
                }
                ActivityManager.MemoryInfo a2 = t7.a((ActivityManager) l.p().getSystemService("activity"));
                if (a2 != null) {
                    this.e = a2.availMem;
                }
                final Long l2 = (Long) this.f4499a.a(c5.O1);
                if (l2.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.this.a(l2);
                        }
                    }, l2.longValue());
                }
            } else {
                this.h = 0L;
                this.f4499a.Q();
                if (p.a()) {
                    this.f4499a.Q().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.c;
    }

    public Long c() {
        return this.d;
    }

    public boolean d() {
        return this.b.get();
    }

    public boolean e() {
        return this.g.get();
    }

    public void b(Object obj) {
        if (!a4.a(obj) && this.b.compareAndSet(true, false)) {
            this.i = null;
            this.f4499a.Q();
            if (p.a()) {
                this.f4499a.Q().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.k) {
            a aVar = (a) this.j.get(str);
            if (aVar == null) {
                aVar = new a();
                this.j.put(str, aVar);
            }
            aVar.f4500a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.k) {
            aVar = (a) this.j.get(str);
            if (aVar == null) {
                aVar = l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        if (e() && System.currentTimeMillis() - this.h >= l2.longValue()) {
            this.f4499a.Q();
            if (p.a()) {
                this.f4499a.Q().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.g.set(false);
        }
    }

    public Object a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final Object obj) {
        final Long l2;
        if (a4.a(obj) || !this.b.compareAndSet(false, true)) {
            return;
        }
        this.i = obj;
        this.c = System.currentTimeMillis();
        this.f4499a.Q();
        if (p.a()) {
            this.f4499a.Q().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.c);
        }
        ActivityManager.MemoryInfo a2 = t7.a((ActivityManager) l.p().getSystemService("activity"));
        if (a2 != null) {
            long j = this.e;
            if (j > 0) {
                this.d = Long.valueOf(j - a2.availMem);
                this.e = 0L;
                AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
                l2 = (Long) this.f4499a.a(c5.P1);
                if (l2.longValue() < 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.this.a(l2, obj);
                        }
                    }, l2.longValue());
                    return;
                }
                return;
            }
        }
        this.d = null;
        AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
        l2 = (Long) this.f4499a.a(c5.P1);
        if (l2.longValue() < 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2, Object obj) {
        if (this.b.get() && System.currentTimeMillis() - this.c >= l2.longValue()) {
            this.f4499a.Q();
            if (p.a()) {
                this.f4499a.Q().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            HashMap hashMap = new HashMap();
            if (obj instanceof com.applovin.impl.sdk.ad.b) {
                hashMap.putAll(j2.a((AppLovinAdImpl) obj));
            } else if (obj instanceof c3) {
                hashMap.putAll(j2.a((c3) obj));
            }
            this.f4499a.E().a(h2.m1, "fullscreenAdDisplayStateTimeout", hashMap);
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.k) {
            this.j.remove(str);
        }
    }
}
