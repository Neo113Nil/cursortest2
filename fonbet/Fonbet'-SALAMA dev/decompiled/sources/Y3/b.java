package Y3;

import D6.Z;
import W5.AbstractC0486a1;
import g4.C1144q;
import g4.C1145r;
import g4.InterfaceC1131d;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class b implements InterfaceC1131d {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7649b = new b(1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f7650c = new b(2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f7651d = new b(3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f7652e = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7653a;

    public /* synthetic */ b(int i7) {
        this.f7653a = i7;
    }

    public static final void a(int i7, long j) {
        if (i7 < 0 || i7 >= 1000000000) {
            throw new IllegalArgumentException(e1.k.d(i7, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j || j >= 253402300800L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("Timestamp seconds out of range: ", j).toString());
        }
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        switch (this.f7653a) {
            case 1:
                Object f7 = c1145r.f(new C1144q(Z3.a.class, Executor.class));
                t6.h.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f7);
            case 2:
                Object f8 = c1145r.f(new C1144q(Z3.c.class, Executor.class));
                t6.h.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f8);
            case 3:
                Object f9 = c1145r.f(new C1144q(Z3.b.class, Executor.class));
                t6.h.d(f9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f9);
            default:
                Object f10 = c1145r.f(new C1144q(Z3.d.class, Executor.class));
                t6.h.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f10);
        }
    }
}
