package Q4;

import D6.Z;
import Z3.b;
import Z3.c;
import java.util.concurrent.Executor;
import p048g4.d;
import p048g4.q;
import p048g4.r;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5838b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5839c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5840d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5841e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5842a;

    public /* synthetic */ a(int i7) {
        this.f5842a = i7;
    }

    @Override // p048g4.d
    public final Object e(r rVar) {
        switch (this.f5842a) {
            case 0:
                Object objF = rVar.f(new q(Z3.a.class, Executor.class));
                h.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF);
            case 1:
                Object objF2 = rVar.f(new q(c.class, Executor.class));
                h.d(objF2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF2);
            case 2:
                Object objF3 = rVar.f(new q(b.class, Executor.class));
                h.d(objF3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF3);
            default:
                Object objF4 = rVar.f(new q(Z3.d.class, Executor.class));
                h.d(objF4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) objF4);
        }
    }
}
