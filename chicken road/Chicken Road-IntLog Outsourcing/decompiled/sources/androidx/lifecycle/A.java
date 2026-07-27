package androidx.lifecycle;

import android.os.Looper;
import b2.AbstractC0279e;
import java.util.Map;
import m.C1263a;

/* loaded from: classes.dex */
public class A {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f4511i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4512a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n.f f4513b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f4514c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f4515d;

    /* renamed from: e, reason: collision with root package name */
    public int f4516e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4517f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4518g;

    /* renamed from: h, reason: collision with root package name */
    public final B.a f4519h;

    public A() {
        Object obj = f4511i;
        this.f4515d = obj;
        this.f4519h = new B.a(13, this);
        this.f4514c = obj;
        this.f4516e = -1;
    }

    public final void a(AbstractC0255z abstractC0255z) {
        abstractC0255z.getClass();
    }

    public final void b(Object obj) {
        C1263a.U().f11083g.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0279e.f("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.f4516e++;
        this.f4514c = obj;
        if (this.f4517f) {
            this.f4518g = true;
            return;
        }
        this.f4517f = true;
        do {
            this.f4518g = false;
            n.f fVar = this.f4513b;
            fVar.getClass();
            n.d dVar = new n.d(fVar);
            fVar.f11275c.put(dVar, Boolean.FALSE);
            while (dVar.hasNext()) {
                a((AbstractC0255z) ((Map.Entry) dVar.next()).getValue());
                if (this.f4518g) {
                    break;
                }
            }
        } while (this.f4518g);
        this.f4517f = false;
    }
}
