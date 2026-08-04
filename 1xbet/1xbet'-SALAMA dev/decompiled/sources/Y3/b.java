package Y3;

import D6.Z;
import W5.AbstractC0486a1;
import java.util.concurrent.Executor;
import p048g4.q;
import p048g4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p048g4.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7649b = new b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7650c = new b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7651d = new b(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7652e = new b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7653a;

    public /* synthetic */ b(int i7) {
        this.f7653a = i7;
    }

    public static final void a(int i7, long j) {
        if (i7 < 0 || i7 >= 1000000000) {
            throw new IllegalArgumentException(p031e1.k.d(i7, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j || j >= 253402300800L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("Timestamp seconds out of range: ", j).toString());
        }
    }

    @Override // p048g4.d
    public Object e(r rVar) {
        switch (this.f7653a) {
            case 1:
                Object objF = rVar.f(new q(Z3.a.class, Executor.class));
                t6.h.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF);
            case 2:
                Object objF2 = rVar.f(new q(Z3.c.class, Executor.class));
                t6.h.d(objF2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF2);
            case 3:
                Object objF3 = rVar.f(new q(Z3.b.class, Executor.class));
                t6.h.d(objF3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF3);
            default:
                Object objF4 = rVar.f(new q(Z3.d.class, Executor.class));
                t6.h.d(objF4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF4);
        }
    }
}
