package org.betup.ui.common.compose;

import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDialogWindow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TICKET_DIALOG_DIM_AMOUNT", "", "applyTicketDialogWindow", "", "Landroidx/fragment/app/DialogFragment;", "width", "", "height", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TicketDialogWindowKt {
    public static final float TICKET_DIALOG_DIM_AMOUNT = 0.82f;

    public static /* synthetic */ void applyTicketDialogWindow$default(DialogFragment dialogFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        applyTicketDialogWindow(dialogFragment, i, i2);
    }

    public static final void applyTicketDialogWindow(DialogFragment dialogFragment, int i, int i2) {
        Window window;
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(i, i2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.82f);
    }
}
