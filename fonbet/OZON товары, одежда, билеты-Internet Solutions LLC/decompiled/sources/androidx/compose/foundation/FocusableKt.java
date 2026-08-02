package androidx.compose.foundation;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5236c1;
import androidx.core.view.C5330m0;
import n0.C8400u;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class FocusableKt {
    static {
        int i11 = C5236c1.f40825b;
        new AbstractC2794c0<C8400u>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // D1.AbstractC2794c0
            public final C8400u create() {
                return new C8400u();
            }

            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return C5330m0.b(this);
            }

            @Override // D1.AbstractC2794c0
            public final /* bridge */ /* synthetic */ void update(C8400u c8400u) {
            }
        };
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, boolean z11, t0.q qVar) {
        return eVar.l0(z11 ? new FocusableElement(qVar) : androidx.compose.ui.e.f40358c0);
    }
}
