package org.betup.ui.fragment.flashbet;

import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.TicketDialogWindowKt;

/* compiled from: FlashBetDialogWindow.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"applyFlashBetDialogWindow", "", "Landroidx/fragment/app/DialogFragment;", "width", "", "height", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetDialogWindowKt {
    public static /* synthetic */ void applyFlashBetDialogWindow$default(DialogFragment dialogFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        applyFlashBetDialogWindow(dialogFragment, i, i2);
    }

    public static final void applyFlashBetDialogWindow(DialogFragment dialogFragment, int i, int i2) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        TicketDialogWindowKt.applyTicketDialogWindow(dialogFragment, i, i2);
    }
}
