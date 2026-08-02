package D1;

import androidx.compose.ui.e;

/* loaded from: classes.dex */
public final class o0 {
    public static final e.c a(InterfaceC2807j interfaceC2807j, int i11) {
        e.c child$ui_release = interfaceC2807j.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i11) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & 2) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i11) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
