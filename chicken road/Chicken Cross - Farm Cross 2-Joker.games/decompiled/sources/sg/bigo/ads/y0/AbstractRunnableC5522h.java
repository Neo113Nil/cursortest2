package sg.bigo.ads.y0;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.Executor;
import sg.bigo.ads.R0.j;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.AbstractC5503c;

/* renamed from: sg.bigo.ads.y0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC5522h implements Runnable {
    public static final HashMap d = new HashMap();
    public static j e;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13420a;
    public final sg.bigo.ads.B0.c b;
    public final AbstractC5503c c;

    public AbstractRunnableC5522h(Executor executor, sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        this.f13420a = executor == null ? b() : executor;
        this.b = cVar;
        this.c = abstractC5503c;
    }

    public static C5447k a() {
        int i;
        boolean z;
        j jVar = e;
        if (jVar != null) {
            i = jVar.c;
            z = jVar.a(10);
        } else {
            i = 12;
            z = false;
        }
        return a("AdNet", i, z);
    }

    public static C5447k b() {
        j jVar = e;
        return a("DefaultNet", 5, jVar != null ? jVar.a(13) : false);
    }

    public abstract void a(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c);

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5503c abstractC5503c = this.c;
        if (abstractC5503c != null) {
            abstractC5503c.a(this.b);
        }
        a(this.b, this.c);
    }

    public static synchronized C5447k a(String str, int i, boolean z) {
        C5447k c5447k;
        synchronized (AbstractRunnableC5522h.class) {
            if (TextUtils.isEmpty(str)) {
                str = "DefaultNet";
            }
            HashMap hashMap = d;
            c5447k = (C5447k) hashMap.get(str);
            if (c5447k == null) {
                c5447k = new C5447k(str, i, z);
                hashMap.put(str, c5447k);
            }
        }
        return c5447k;
    }
}
