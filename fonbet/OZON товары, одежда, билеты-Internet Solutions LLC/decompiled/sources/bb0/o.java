package bb0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.island.OziIslandKt;

/* loaded from: classes3.dex */
public final class o {
    public static final void a(@NotNull String title, androidx.compose.ui.e eVar, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(476132356);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(content) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            OziIslandKt.m3103OziIslandgNPyAyM(a0.e(eVar, 1.0f), false, null, null, 0.0f, null, null, null, a1.c.c(-1941961308, new m(title, content), u11), u11, 100663296, 254);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new n(title, eVar, content, i11));
        }
    }
}
