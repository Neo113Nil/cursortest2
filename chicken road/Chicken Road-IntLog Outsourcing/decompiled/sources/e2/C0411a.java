package e2;

import D4.Q;
import M1.b;
import M1.c;
import N1.d;
import N1.q;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0411a f5523b = new C0411a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0411a f5524c = new C0411a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0411a f5525d = new C0411a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0411a f5526e = new C0411a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5527a;

    public /* synthetic */ C0411a(int i2) {
        this.f5527a = i2;
    }

    @Override // N1.d
    public final Object d(B.d dVar) {
        switch (this.f5527a) {
            case 0:
                Object f3 = dVar.f(new q(M1.a.class, Executor.class));
                i.d(f3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f3);
            case 1:
                Object f6 = dVar.f(new q(c.class, Executor.class));
                i.d(f6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f6);
            case 2:
                Object f7 = dVar.f(new q(b.class, Executor.class));
                i.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f7);
            default:
                Object f8 = dVar.f(new q(M1.d.class, Executor.class));
                i.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f8);
        }
    }
}
