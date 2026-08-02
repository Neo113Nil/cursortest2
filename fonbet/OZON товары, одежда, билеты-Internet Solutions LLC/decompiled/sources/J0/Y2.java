package J0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import u0.C9915y;

/* loaded from: classes8.dex */
final class Y2 extends AbstractC7737t implements fd.q<Float, C7807Z, C7807Z, Float, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13093b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13094c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f13095d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T2 f13096e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f13097f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f13098g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ t0.o f13099h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C4912a f13100i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ A0.a f13101j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ t3 f13102k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f13103l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f13104m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ C9915y f13105n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f13106o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C4912a f13107p;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13108a;

        static {
            int[] iArr = new int[t3.values().length];
            try {
                iArr[t3.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t3.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13108a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y2(C4912a c4912a, C4912a c4912a2, String str, T2 t2, boolean z11, boolean z12, t0.o oVar, C4912a c4912a3, A0.a aVar, t3 t3Var, Function2 function2, boolean z13, C9915y c9915y, boolean z14, C4912a c4912a4) {
        super(6);
        this.f13093b = c4912a;
        this.f13094c = c4912a2;
        this.f13095d = str;
        this.f13096e = t2;
        this.f13097f = z11;
        this.f13098g = z12;
        this.f13099h = oVar;
        this.f13100i = c4912a3;
        this.f13101j = aVar;
        this.f13102k = t3Var;
        this.f13103l = function2;
        this.f13104m = z13;
        this.f13105n = c9915y;
        this.f13106o = z14;
        this.f13107p = c4912a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.q
    public final Unit invoke(Float f7, C7807Z c7807z, C7807Z c7807z2, Float f11, InterfaceC3967k interfaceC3967k, Integer num) {
        int i11;
        C4912a c4912a;
        C4912a c4912a2;
        C4912a c4912a3;
        float floatValue = f7.floatValue();
        long w11 = c7807z.w();
        long w12 = c7807z2.w();
        float floatValue2 = f11.floatValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i11 = (interfaceC3967k2.q(floatValue) ? 4 : 2) | intValue;
        } else {
            i11 = intValue;
        }
        if ((intValue & 48) == 0) {
            i11 |= interfaceC3967k2.s(w11) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i11 |= interfaceC3967k2.s(w12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((intValue & 3072) == 0) {
            i11 |= interfaceC3967k2.q(floatValue2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C4912a c4912a4 = this.f13093b;
            if (c4912a4 == null) {
                interfaceC3967k2.o(-1572365903);
                interfaceC3967k2.k();
                c4912a = null;
            } else {
                interfaceC3967k2.o(-1572365902);
                Z2 z22 = new Z2(floatValue, w12, c4912a4, this.f13106o, w11);
                floatValue = floatValue;
                C4912a c11 = a1.c.c(-1865025495, z22, interfaceC3967k2);
                interfaceC3967k2.k();
                c4912a = c11;
            }
            T2 t2 = this.f13096e;
            boolean z11 = this.f13097f;
            C4912a c4912a5 = this.f13094c;
            if (c4912a5 == null || this.f13095d.length() != 0 || floatValue2 <= 0.0f) {
                interfaceC3967k2.o(-1571160716);
                interfaceC3967k2.k();
                c4912a2 = null;
            } else {
                interfaceC3967k2.o(-1571586748);
                C4912a c12 = a1.c.c(-413527723, new C3267a3(floatValue2, t2, z11, c4912a5), interfaceC3967k2);
                interfaceC3967k2.k();
                c4912a2 = c12;
            }
            boolean z12 = this.f13098g;
            ((C7807Z) t2.a(z11, z12, interfaceC3967k2).getValue()).getClass();
            interfaceC3967k2.o(-1570983241);
            interfaceC3967k2.k();
            long w13 = ((C7807Z) t2.b(z11, z12, interfaceC3967k2).getValue()).w();
            C4912a c4912a6 = this.f13100i;
            if (c4912a6 == null) {
                interfaceC3967k2.o(-1570681642);
                interfaceC3967k2.k();
                c4912a3 = null;
            } else {
                interfaceC3967k2.o(-1570681641);
                C4912a c13 = a1.c.c(1694126319, new C3272b3(w13, c4912a6), interfaceC3967k2);
                interfaceC3967k2.k();
                c4912a3 = c13;
            }
            androidx.compose.ui.e b11 = androidx.compose.foundation.e.b(androidx.compose.ui.e.f40358c0, ((C7807Z) t2.f(interfaceC3967k2).getValue()).w(), this.f13101j);
            int i13 = a.f13108a[this.f13102k.ordinal()];
            if (i13 == 1) {
                interfaceC3967k2.o(-1570370153);
                l3.a(b11, this.f13103l, c4912a, c4912a2, null, c4912a3, this.f13104m, floatValue, this.f13105n, interfaceC3967k2, (i12 << 21) & 29360128);
                interfaceC3967k2.k();
            } else if (i13 != 2) {
                interfaceC3967k2.o(-1568365383);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-1569791817);
                Object C11 = interfaceC3967k2.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = S0.n1.f(C7464j.a(0L), S0.D1.f25195a);
                    interfaceC3967k2.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                C4912a c14 = a1.c.c(-1212965554, new C3277c3(interfaceC3978p0, this.f13105n, this.f13107p), interfaceC3967k2);
                boolean z13 = (i12 & 14) == 4;
                Object C12 = interfaceC3967k2.C();
                if (z13 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new X2(interfaceC3978p0, floatValue);
                    interfaceC3967k2.x(C12);
                }
                F1.c(b11, this.f13103l, c4912a2, c4912a, null, c4912a3, this.f13104m, floatValue, (Function1) C12, c14, this.f13105n, interfaceC3967k2, ((i12 << 21) & 29360128) | 805306368);
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
