package Sf0;

import Bl0.C2652m;
import J0.D3;
import J0.E3;
import J0.u3;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f26202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f26201b = str;
            this.f26202c = eVar;
            this.f26203d = i11;
            this.f26204e = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f26203d | 1);
            e.a(this.f26201b, this.f26202c, interfaceC3967k, e11, this.f26204e);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull String text, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        C3969l c3969l;
        androidx.compose.ui.e eVar3;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(-943337610);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
            eVar2 = eVar;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 = i11 | (u11.n(eVar2) ? 32 : 16);
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
            eVar3 = eVar2;
        } else {
            c3969l = u11;
            eVar3 = i14 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
            u3.b(text, eVar3, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((D3) u11.m(E3.c())).e(), c3969l, i13 & 126, 0, 65532);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new a(text, eVar3, i11, i12));
        }
    }
}
