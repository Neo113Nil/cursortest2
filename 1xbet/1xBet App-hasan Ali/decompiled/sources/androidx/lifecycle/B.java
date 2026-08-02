package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import o.C2191a;
import p.C2238d;
import p.C2240f;

/* loaded from: classes.dex */
public class B {
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f6996a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C2240f f6997b = new C2240f();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f6998c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f6999d;

    /* renamed from: e, reason: collision with root package name */
    public int f7000e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7001g;

    /* renamed from: h, reason: collision with root package name */
    public final z f7002h;

    public B() {
        Object obj = i;
        this.f6999d = obj;
        this.f7002h = new z(this);
        this.f6998c = obj;
        this.f7000e = -1;
    }

    public final void a(A a5) {
        a5.getClass();
    }

    public final void b(Object obj) {
        C2191a.Q().f18496n.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(L1.a.n("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.f7000e++;
        this.f6998c = obj;
        if (this.f) {
            this.f7001g = true;
            return;
        }
        this.f = true;
        do {
            this.f7001g = false;
            C2240f c2240f = this.f6997b;
            c2240f.getClass();
            C2238d c2238d = new C2238d(c2240f);
            c2240f.f18686m.put(c2238d, Boolean.FALSE);
            while (c2238d.hasNext()) {
                a((A) ((Map.Entry) c2238d.next()).getValue());
                if (this.f7001g) {
                    break;
                }
            }
        } while (this.f7001g);
        this.f = false;
    }
}
