package D0;

import E0.I;
import K1.Q;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import c1.AbstractC5715f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G0.e<G0.d> f5200a = new G0.e<>(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f5201b;

    public g(int i11) {
        C3991w0 f7;
        f7 = n1.f(null, D1.f25195a);
        this.f5201b = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        C3991w0 c3991w0 = this.f5201b;
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            G0.d dVar = (G0.d) c3991w0.getValue();
            if (dVar != null) {
                this.f5200a.d(dVar);
            }
            c3991w0.setValue(null);
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }

    public final void a() {
        this.f5201b.setValue(null);
        this.f5200a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull G0.d dVar) {
        G0.d dVar2;
        C3991w0 c3991w0 = this.f5201b;
        AbstractC5715f a11 = AbstractC5715f.a.a();
        G0.d dVar3 = null;
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            G0.d dVar4 = (G0.d) c3991w0.getValue();
            if (dVar4 == null) {
                c3991w0.setValue(dVar);
                return;
            }
            if (dVar4.a() && dVar.a() && dVar.i() >= dVar4.i() && dVar.i() - dVar4.i() < 5000 && !Intrinsics.d(dVar4.e(), "\n") && !Intrinsics.d(dVar4.e(), "\r\n") && !Intrinsics.d(dVar.e(), "\n") && !Intrinsics.d(dVar.e(), "\r\n") && dVar4.h() == dVar.h()) {
                if (dVar4.h() == G0.b.Insert) {
                    if (dVar4.e().length() + dVar4.c() == dVar.c()) {
                        dVar2 = new G0.d(dVar4.c(), "", dVar4.e() + dVar.e(), dVar4.f(), dVar.d(), dVar4.i(), false, 64);
                        dVar3 = dVar2;
                    }
                }
                if (dVar4.h() == G0.b.Delete && dVar4.b() == dVar.b() && (dVar4.b() == G0.a.Start || dVar4.b() == G0.a.End)) {
                    if (dVar4.c() == dVar.g().length() + dVar.c()) {
                        dVar2 = new G0.d(dVar.c(), dVar.g() + dVar4.g(), "", dVar4.f(), dVar.d(), dVar4.i(), false, 64);
                    } else if (dVar4.c() == dVar.c()) {
                        dVar2 = new G0.d(dVar4.c(), dVar4.g() + dVar.g(), "", dVar4.f(), dVar.d(), dVar4.i(), false, 64);
                    }
                    dVar3 = dVar2;
                }
            }
            if (dVar3 != null) {
                c3991w0.setValue(dVar3);
            } else {
                b();
                c3991w0.setValue(dVar);
            }
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@NotNull e eVar) {
        G0.e<G0.d> eVar2 = this.f5200a;
        if (eVar2.b() && ((G0.d) this.f5201b.getValue()) == null) {
            G0.d e11 = eVar2.e();
            eVar.d().f().b();
            I d11 = eVar.d();
            d11.q(e11.c(), e11.g().length() + e11.c(), e11.e());
            long d12 = e11.d();
            int i11 = Q.f15010c;
            d11.t((int) (d12 >> 32), (int) (e11.d() & 4294967295L));
            eVar.j(eVar.h(), new a(eVar.d().toString(), eVar.d().m(), eVar.d().g(), 8), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull e eVar) {
        G0.e<G0.d> eVar2 = this.f5200a;
        if (eVar2.c() || ((G0.d) this.f5201b.getValue()) != null) {
            b();
            G0.d f7 = eVar2.f();
            eVar.d().f().b();
            I d11 = eVar.d();
            d11.q(f7.c(), f7.e().length() + f7.c(), f7.g());
            long f11 = f7.f();
            int i11 = Q.f15010c;
            d11.t((int) (f11 >> 32), (int) (f7.f() & 4294967295L));
            eVar.j(eVar.h(), new a(eVar.d().toString(), eVar.d().m(), eVar.d().g(), 8), true);
        }
    }
}
