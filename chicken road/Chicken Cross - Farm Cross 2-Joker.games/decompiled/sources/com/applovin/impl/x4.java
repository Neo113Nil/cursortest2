package com.applovin.impl;

import androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class x4 {
    public static final Executor i = new Executor() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };
    public static final Executor j = new DefaultDownloaderFactory$$ExternalSyntheticLambda0();
    private final String b;
    private volatile Object g;
    private volatile Object h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f4554a = new Object();
    private final List c = new ArrayList();
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile boolean f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z, Object obj, Object obj2);
    }

    public x4(String str) {
        this.b = str;
    }

    public static x4 a(String str, Object obj) {
        return new x4(str).b(obj);
    }

    public x4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public x4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.d && !this.e;
    }

    public String toString() {
        return "Promise(" + c() + ": " + (!this.d ? "Waiting" : this.e ? "Success -> " + this.g : "Failed -> " + this.h) + ")";
    }

    public x4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        m1.a(e());
        return this.h;
    }

    public String c() {
        String str = this.b;
        return str != null ? str : super.toString();
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                x4.this.b(executor, bVar);
            }
        };
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.x4.b
            public final void a(boolean z, Object obj, Object obj2) {
                x4.a(runnable, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    x4.this.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda4
            @Override // com.applovin.impl.x4.b
            public final void a(boolean z, Object obj, Object obj2) {
                x4.a(x4.a.this, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable c = c(executor, bVar);
        synchronized (this.f4554a) {
            if (!this.d) {
                this.c.add(c);
            } else {
                c.run();
            }
        }
    }

    public boolean a() {
        return this.d && this.f;
    }

    private void a(boolean z, Object obj, Object obj2, boolean z2) {
        synchronized (this.f4554a) {
            if (this.d) {
                return;
            }
            this.g = obj;
            this.h = obj2;
            this.e = z;
            this.f = z2;
            this.d = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.e, this.g, this.h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        m1.a(th);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            lVar.E().a("Promise", "PromiseCallback: " + c(), th);
        }
    }
}
