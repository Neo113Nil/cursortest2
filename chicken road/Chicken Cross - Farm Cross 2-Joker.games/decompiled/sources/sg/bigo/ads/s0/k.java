package sg.bigo.ads.s0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import com.ironsource.InterfaceC4394ee;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class k {
    public C5123a c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13292a = new ConcurrentHashMap();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public long d = -1;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final byte[] f = new byte[0];

    public static Pair c(String str, Context context) {
        String valueOf = TextUtils.isEmpty(null) ? String.valueOf(str.hashCode()) : null;
        StringBuilder sb = new StringBuilder();
        StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
        String str2 = File.separator;
        String sb2 = sg.bigo.ads.U.p.a(append, str2, "image", sb, str2).append(valueOf).toString();
        return new Pair(Boolean.valueOf(AbstractC4964v.a(sb2)), sb2);
    }

    public abstract int a();

    public abstract sg.bigo.ads.U.c a(String str, Context context);

    public final synchronized void a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d > 3600000) {
            this.d = currentTimeMillis;
            AbstractC5446j.a(0, new RunnableC5466f(this, context));
        }
    }

    public abstract void a(Context context, String str, sg.bigo.ads.U.c cVar);

    public abstract String b();

    public abstract String b(Context context);

    public abstract String b(String str, Context context);

    public abstract void d(String str, Context context);

    public final void a(Context context, Executor executor, String str, boolean z, z zVar) {
        String valueOf = !TextUtils.isEmpty(null) ? null : String.valueOf(str.hashCode());
        sg.bigo.ads.U.c a2 = a(valueOf, context);
        if (a2 != null) {
            if (!a2.f12561a.isRecycled()) {
                this.e.post(new RunnableC5461a(zVar, a2, str));
                return;
            }
            d(valueOf, context);
        }
        if (!AbstractC4964v.a(b(valueOf, context))) {
            a(context, executor, str, null, z, zVar);
        } else {
            String valueOf2 = TextUtils.isEmpty(null) ? String.valueOf(str.hashCode()) : null;
            AbstractC5446j.a(1, null, new RunnableC5463c(this, b(valueOf2, context), context, valueOf2, zVar, str, executor, z), 0L);
        }
    }

    public final synchronized void c(Context context) {
        if (this.b.isEmpty()) {
            return;
        }
        while (this.f13292a.size() < this.c.f12796a) {
            if (this.b.isEmpty()) {
                return;
            }
            C5470j c5470j = (C5470j) this.b.remove(0);
            this.f13292a.put(c5470j.f13291a, c5470j);
            AbstractC5446j.a(1, null, new RunnableC5465e(c5470j, context), 0L);
        }
        this.b.size();
    }

    public final void a(Context context, Executor executor, String str, String str2, boolean z, z zVar) {
        if (!URLUtil.isNetworkUrl(str)) {
            zVar.a(InterfaceC4394ee.c.e, "Unknown scheme.", null);
            return;
        }
        if (this.c.f12796a <= 0) {
            zVar.a(1302, "Unable to download image.", null);
            return;
        }
        synchronized (this.f) {
            if (this.f13292a.containsKey(str)) {
                C5470j c5470j = (C5470j) this.f13292a.get(str);
                if (c5470j != null) {
                    C5470j.a(c5470j, zVar);
                }
            } else {
                C5470j c5470j2 = new C5470j(this, str, str2, z, zVar);
                int indexOf = this.b.indexOf(c5470j2);
                if (indexOf >= 0) {
                    C5470j c5470j3 = (C5470j) this.b.get(indexOf);
                    C5470j.a(c5470j3, zVar);
                    if (executor != null) {
                        this.b.remove(c5470j3);
                        a(context, executor, c5470j3);
                    }
                } else if (executor != null) {
                    a(context, executor, c5470j2);
                } else {
                    this.b.add(c5470j2);
                    c(context);
                }
            }
        }
    }

    public final synchronized void a(Context context, Executor executor, C5470j c5470j) {
        if (executor != null) {
            this.f13292a.put(c5470j.f13291a, c5470j);
            AbstractC5446j.a(1, null, new RunnableC5464d(context, executor, c5470j), 0L);
        }
    }
}
