package androidx.compose.ui.draw;

import D1.C2809k;
import D1.C2820u;
import D1.r0;
import D1.s0;
import Z1.r;
import Z1.s;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6987g;
import i1.C6992l;
import i1.InterfaceC6985e;
import i1.InterfaceC6986f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7823h0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class a extends e.c implements InterfaceC6986f, r0, InterfaceC6985e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6987g f40347a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40348b;

    /* renamed from: c, reason: collision with root package name */
    private f f40349c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super C6987g, C6992l> f40350d;

    /* renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    static final class C0744a extends AbstractC7737t implements Function0<InterfaceC7823h0> {
        C0744a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC7823h0 invoke() {
            return a.this.J1();
        }
    }

    public a(@NotNull C6987g c6987g, @NotNull Function1<? super C6987g, C6992l> function1) {
        this.f40347a = c6987g;
        this.f40350d = function1;
        c6987g.u(this);
        c6987g.w(new C0744a());
    }

    @NotNull
    public final Function1<C6987g, C6992l> I1() {
        return this.f40350d;
    }

    @NotNull
    public final InterfaceC7823h0 J1() {
        f fVar = this.f40349c;
        if (fVar == null) {
            fVar = new f();
            this.f40349c = fVar;
        }
        if (fVar.c() == null) {
            fVar.e(((AndroidComposeView) C2809k.g(this)).getF40553q());
        }
        return fVar;
    }

    public final void K1(@NotNull Function1<? super C6987g, C6992l> function1) {
        this.f40350d = function1;
        c1();
    }

    @Override // i1.InterfaceC6986f
    public final void c1() {
        f fVar = this.f40349c;
        if (fVar != null) {
            fVar.d();
        }
        this.f40348b = false;
        this.f40347a.v();
        C2820u.a(this);
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        boolean z11 = this.f40348b;
        C6987g c6987g = this.f40347a;
        if (!z11) {
            c6987g.v();
            c6987g.getClass();
            s0.a(this, new b(this, c6987g));
            if (c6987g.m() == null) {
                A1.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f40348b = true;
        }
        C6992l m11 = c6987g.m();
        Intrinsics.f(m11);
        m11.a().invoke(interfaceC8410c);
    }

    @Override // i1.InterfaceC6985e
    @NotNull
    public final Z1.d g() {
        return C2809k.f(this).E();
    }

    @Override // i1.InterfaceC6985e
    @NotNull
    public final s getLayoutDirection() {
        return C2809k.f(this).O();
    }

    @Override // i1.InterfaceC6985e
    public final long i() {
        return r.b(C2809k.d(this, UserVerificationMethods.USER_VERIFY_PATTERN).a());
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        super.onDetach();
        f fVar = this.f40349c;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        c1();
    }

    @Override // D1.InterfaceC2819t
    public final void u0() {
        c1();
    }
}
