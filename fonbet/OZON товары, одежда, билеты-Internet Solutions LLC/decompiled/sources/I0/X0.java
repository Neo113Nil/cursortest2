package I0;

import B0.EnumC2526y0;
import B0.InterfaceC2477h1;
import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X0 {

    static final class a implements InterfaceC3214w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W0 f11418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11419b;

        a(W0 w02, boolean z11) {
            this.f11418a = w02;
            this.f11419b = z11;
        }

        @Override // I0.InterfaceC3214w
        public final long a() {
            return this.f11418a.C(this.f11419b);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", f = "TextFieldSelectionManager.kt", l = {1012}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f11420d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f11421e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f11422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f11422f = interfaceC2477h1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f11422f, dVar);
            bVar.f11421e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f11420d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f11421e;
                this.f11420d = 1;
                if (B0.Y0.a(f7, this.f11422f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V1.g f11424c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ W0 f11425d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11426e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, V1.g gVar, W0 w02, int i11) {
            super(2);
            this.f11423b = z11;
            this.f11424c = gVar;
            this.f11425d = w02;
            this.f11426e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f11426e | 1);
            W0 w02 = this.f11425d;
            X0.a(this.f11423b, this.f11424c, w02, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11427a;

        static {
            int[] iArr = new int[EnumC2526y0.values().length];
            try {
                iArr[EnumC2526y0.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2526y0.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2526y0.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11427a = iArr;
        }
    }

    public static final void a(boolean z11, @NotNull V1.g gVar, @NotNull W0 w02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        V1.g gVar2;
        C3969l u11 = interfaceC3967k.u(-1344558920);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(gVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(w02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            z12 = z11;
            gVar2 = gVar;
        } else {
            int i13 = i12 & 14;
            boolean n11 = (i13 == 4) | u11.n(w02);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V0(w02, z11);
                u11.x(C11);
            }
            InterfaceC2477h1 interfaceC2477h1 = (InterfaceC2477h1) C11;
            boolean F11 = u11.F(w02) | (i13 == 4);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new a(w02, z11);
                u11.x(C12);
            }
            InterfaceC3214w interfaceC3214w = (InterfaceC3214w) C12;
            boolean i14 = K1.Q.i(w02.K().e());
            e.a aVar = androidx.compose.ui.e.f40358c0;
            boolean F12 = u11.F(interfaceC2477h1);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(interfaceC2477h1, null);
                u11.x(C13);
            }
            z12 = z11;
            gVar2 = gVar;
            C3181f.b(interfaceC3214w, z12, gVar2, i14, 0L, x1.L.b(aVar, interfaceC2477h1, (Function2) C13), u11, (i12 << 3) & 1008, 16);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(z12, gVar2, w02, i11));
        }
    }

    public static final boolean b(@NotNull W0 w02, boolean z11) {
        B1.B i11;
        B0.O0 H11 = w02.H();
        if (H11 == null || (i11 = H11.i()) == null) {
            return false;
        }
        return B0.c(w02.C(z11), B0.f(i11));
    }
}
