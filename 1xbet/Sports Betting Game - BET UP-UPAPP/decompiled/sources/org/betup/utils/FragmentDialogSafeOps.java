package org.betup.utils;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FragmentDialogSafeOps.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lorg/betup/utils/FragmentDialogSafeOps;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "cancelPendingInput", "", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/DialogFragment;", "dismissAllowingStateLoss", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FragmentDialogSafeOps {
    public static final int $stable = 0;
    public static final FragmentDialogSafeOps INSTANCE = new FragmentDialogSafeOps();

    private FragmentDialogSafeOps() {
    }

    public final void cancelPendingInput(DialogFragment fragment) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Dialog dialog = fragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.cancelPendingInputEvents();
        }
        View view = fragment.getView();
        if (view != null) {
            view.cancelPendingInputEvents();
        }
    }

    public final void dismissAllowingStateLoss(DialogFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        cancelPendingInput(fragment);
        fragment.dismissAllowingStateLoss();
    }
}
