package Q4;

import D6.Z;
import Z3.b;
import Z3.c;
import Z3.d;
import g4.C1144q;
import g4.C1145r;
import g4.InterfaceC1131d;
import java.util.concurrent.Executor;
import t6.h;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1131d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5838b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f5839c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f5840d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f5841e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5842a;

    public /* synthetic */ a(int i7) {
        this.f5842a = i7;
    }

    @Override // g4.InterfaceC1131d
    public final Object e(C1145r c1145r) {
        switch (this.f5842a) {
            case 0:
                Object f7 = c1145r.f(new C1144q(Z3.a.class, Executor.class));
                h.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f7);
            case 1:
                Object f8 = c1145r.f(new C1144q(c.class, Executor.class));
                h.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f8);
            case 2:
                Object f9 = c1145r.f(new C1144q(b.class, Executor.class));
                h.d(f9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f9);
            default:
                Object f10 = c1145r.f(new C1144q(d.class, Executor.class));
                h.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Z((Executor) f10);
        }
    }
}
