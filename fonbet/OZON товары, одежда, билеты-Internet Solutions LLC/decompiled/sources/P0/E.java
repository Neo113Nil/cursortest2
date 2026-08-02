package P0;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r1.C9156d;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f20611a = androidx.compose.foundation.layout.a0.n(androidx.compose.ui.e.f40358c0, R0.g.a());

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9156d f20612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20613c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f20614d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f20615e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f20616f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f20617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9156d c9156d, String str, androidx.compose.ui.e eVar, long j11, int i11, int i12) {
            super(2);
            this.f20612b = c9156d;
            this.f20613c = str;
            this.f20614d = eVar;
            this.f20615e = j11;
            this.f20616f = i11;
            this.f20617g = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f20616f | 1);
            C9156d c9156d = this.f20612b;
            String str = this.f20613c;
            E.b(c9156d, str, this.f20614d, this.f20615e, interfaceC3967k, e11, this.f20617g);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull AbstractC8972b abstractC8972b, String str, androidx.compose.ui.e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3;
        C3969l u11 = interfaceC3967k.u(-2142239481);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            boolean z11 = (((i12 & 7168) ^ 3072) > 2048 && u11.s(j11)) || (i12 & 3072) == 2048;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                j12 = C7807Z.f72259m;
                C11 = C7807Z.p(j11, j12) ? null : C7809a0.a.a(5, j11);
                u11.x(C11);
            }
            C7809a0 c7809a0 = (C7809a0) C11;
            u11.o(-2144891392);
            if (str != null) {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean z12 = (i12 & 112) == 32;
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new G(str);
                    u11.x(C12);
                }
                eVar2 = I1.o.c(aVar, false, (Function1) C12);
            } else {
                eVar2 = androidx.compose.ui.e.f40358c0;
            }
            u11.k();
            int i13 = C5236c1.f40825b;
            if (!C7464j.c(abstractC8972b.getF40457d(), 9205357640488583168L)) {
                long f40457d = abstractC8972b.getF40457d();
                if (!Float.isInfinite(C7464j.f(f40457d)) || !Float.isInfinite(C7464j.d(f40457d))) {
                    eVar3 = androidx.compose.ui.e.f40358c0;
                    C5185h.a(androidx.compose.ui.draw.e.a(eVar.l0(eVar3), abstractC8972b, null, InterfaceC2547p.a.d(), 0.0f, c7809a0, 22).l0(eVar2), u11, 0);
                }
            }
            eVar3 = f20611a;
            C5185h.a(androidx.compose.ui.draw.e.a(eVar.l0(eVar3), abstractC8972b, null, InterfaceC2547p.a.d(), 0.0f, c7809a0, 22).l0(eVar2), u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new F(abstractC8972b, str, eVar, j11, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if ((r15 & 8) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull C9156d c9156d, String str, androidx.compose.ui.e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        String str2;
        androidx.compose.ui.e eVar2;
        long j12;
        C3969l u11 = interfaceC3967k.u(-126890956);
        int i13 = (u11.n(c9156d) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i13 | (((i12 & 8) == 0 && u11.s(j11)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i15 & 1171) == 1170 && u11.b()) {
            u11.j();
            j12 = j11;
            eVar2 = eVar;
            str2 = str;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                if (i14 != 0) {
                    eVar = androidx.compose.ui.e.f40358c0;
                }
                if ((i12 & 8) != 0) {
                    j11 = ((C7807Z) u11.m(C3776u.a())).w();
                    i15 &= -7169;
                }
                androidx.compose.ui.e eVar3 = eVar;
                long j13 = j11;
                u11.j0();
                a(r1.o.b(c9156d, u11), str, eVar3, j13, u11, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168));
                str2 = str;
                eVar2 = eVar3;
                j12 = j13;
            } else {
                u11.j();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(c9156d, str2, eVar2, j12, i11, i12));
        }
    }
}
