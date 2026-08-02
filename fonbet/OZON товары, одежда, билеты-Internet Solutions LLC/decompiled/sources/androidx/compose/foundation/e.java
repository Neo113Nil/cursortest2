package androidx.compose.foundation;

import androidx.compose.ui.platform.C5236c1;
import l1.AbstractC7799Q;
import l1.J0;
import l1.y0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {
    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC7799Q abstractC7799Q, J0 j02, int i11) {
        if ((i11 & 2) != 0) {
            j02 = y0.a();
        }
        return eVar.l0(new BackgroundElement(0L, abstractC7799Q, (i11 & 4) != 0 ? 1.0f : 0.2f, j02, C5236c1.a(), 1));
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, long j11, @NotNull J0 j02) {
        return eVar.l0(new BackgroundElement(j11, null, 1.0f, j02, C5236c1.a(), 2));
    }
}
