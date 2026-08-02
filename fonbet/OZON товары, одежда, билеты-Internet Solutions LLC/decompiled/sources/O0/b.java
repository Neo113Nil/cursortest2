package O0;

import D1.J;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.V0;
import S0.n1;
import Sc.InterfaceC3999a;
import android.view.ViewGroup;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7845v;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;
import t0.s;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class b extends androidx.compose.material.ripple.b implements V0, p {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19730c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19731d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0 f19732e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0 f19733f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ViewGroup f19734g;

    /* renamed from: h, reason: collision with root package name */
    private o f19735h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f19736i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f19737j;

    /* renamed from: k, reason: collision with root package name */
    private long f19738k;

    /* renamed from: l, reason: collision with root package name */
    private int f19739l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f19740m;

    private b() {
        throw null;
    }

    public b(boolean z11, float f7, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, ViewGroup viewGroup) {
        super(interfaceC3978p02, z11);
        C3991w0 f11;
        C3991w0 f12;
        this.f19730c = z11;
        this.f19731d = f7;
        this.f19732e = interfaceC3978p0;
        this.f19733f = interfaceC3978p02;
        this.f19734g = viewGroup;
        f11 = n1.f(null, D1.f25195a);
        this.f19736i = f11;
        f12 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f19737j = f12;
        this.f19738k = 0L;
        this.f19739l = -1;
        this.f19740m = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean i(b bVar) {
        return ((Boolean) bVar.f19737j.getValue()).booleanValue();
    }

    public static final void j(b bVar, boolean z11) {
        bVar.f19737j.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.InterfaceC8368I
    public final void a(@NotNull J j11) {
        this.f19738k = j11.i();
        float f7 = this.f19731d;
        this.f19739l = Float.isNaN(f7) ? C6915b.c(n.a(j11, this.f19730c, j11.i())) : j11.Y0(f7);
        long w11 = ((C7807Z) this.f19732e.getValue()).w();
        float d11 = ((i) this.f19733f.getValue()).d();
        j11.F0();
        f(j11, f7, w11);
        InterfaceC7802U a11 = j11.w0().a();
        ((Boolean) this.f19737j.getValue()).getClass();
        r rVar = (r) this.f19736i.getValue();
        if (rVar != null) {
            rVar.e(j11.i(), w11, d11);
            rVar.draw(C7845v.b(a11));
        }
    }

    @Override // S0.V0
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.ripple.b
    public final void c(@NotNull s.b bVar) {
        o oVar = this.f19735h;
        if (oVar == null) {
            oVar = v.a(this.f19734g);
            this.f19735h = oVar;
            Intrinsics.f(oVar);
        }
        r b11 = oVar.b(this);
        b11.b(bVar, this.f19730c, this.f19738k, this.f19739l, ((C7807Z) this.f19732e.getValue()).w(), ((i) this.f19733f.getValue()).d(), this.f19740m);
        this.f19736i.setValue(b11);
    }

    @Override // S0.V0
    public final void d() {
        o oVar = this.f19735h;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    @Override // S0.V0
    public final void e() {
        o oVar = this.f19735h;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.ripple.b
    public final void g(@NotNull s.b bVar) {
        r rVar = (r) this.f19736i.getValue();
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // O0.p
    public final void o1() {
        this.f19736i.setValue(null);
    }
}
