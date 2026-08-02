package org.betup.ui.base;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SnackbarHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SnackbarDialogFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/base/SnackbarDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onStart", "", "showSnackbar", "message", "", "durationMs", "", "(Ljava/lang/CharSequence;Ljava/lang/Long;)V", "stringResId", "", "styleSnackbar", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SnackbarDialogFragment extends DialogFragment {
    public static final int $stable = 8;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog;
        Window window;
        View decorView;
        super.onStart();
        final SnackbarHelper.TransferredMessage takeActiveMessageForTransfer = SnackbarHelper.takeActiveMessageForTransfer();
        if (takeActiveMessageForTransfer == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: org.betup.ui.base.SnackbarDialogFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SnackbarDialogFragment.onStart$lambda$0(SnackbarDialogFragment.this, takeActiveMessageForTransfer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$0(SnackbarDialogFragment snackbarDialogFragment, SnackbarHelper.TransferredMessage transferredMessage) {
        snackbarDialogFragment.showSnackbar(transferredMessage.getMessage(), Long.valueOf(transferredMessage.getRemainingMs()));
    }

    public static /* synthetic */ void showSnackbar$default(SnackbarDialogFragment snackbarDialogFragment, CharSequence charSequence, Long l, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
        }
        if ((i & 2) != 0) {
            l = null;
        }
        snackbarDialogFragment.showSnackbar(charSequence, l);
    }

    public final void showSnackbar(CharSequence message, Long durationMs) {
        Context context;
        View view;
        Window window;
        Intrinsics.checkNotNullParameter(message, "message");
        if (isAdded() && (context = getContext()) != null && SharedPrefs.areInAppMessagesEnabled(context)) {
            Dialog dialog = getDialog();
            if ((dialog == null || (window = dialog.getWindow()) == null || (view = window.getDecorView()) == null) && (view = getView()) == null) {
                return;
            }
            long longValue = durationMs != null ? durationMs.longValue() : SnackbarHelper.getDefaultDurationMs();
            SnackbarHelper.registerActiveMessage(message, longValue);
            Snackbar make = Snackbar.make(view, message, RangesKt.coerceIn((int) longValue, 500, Integer.MAX_VALUE));
            Intrinsics.checkNotNullExpressionValue(make, "make(...)");
            styleSnackbar(make);
            make.show();
        }
    }

    public final void showSnackbar(int stringResId) {
        if (stringResId == 0 || !isAdded()) {
            return;
        }
        String string = getString(stringResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showSnackbar$default(this, string, null, 2, null);
    }

    private final void styleSnackbar(Snackbar snackbar) {
        Context context = getContext();
        if (context != null) {
            SnackbarHelper.INSTANCE.styleSnackbar$app_release(context, snackbar);
            Typeface font = ResourcesCompat.getFont(context, R.font.open_sans_medium);
            TextView textView = (TextView) snackbar.getView().findViewById(R.id.snackbar_text);
            if (textView != null) {
                textView.setMaxLines(8);
                textView.setGravity(1);
                textView.setTextAlignment(4);
                textView.setTypeface(font);
                textView.setTextSize(2, 14.0f);
                textView.setTextColor(ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.White.INSTANCE.getColor()));
            }
        }
    }
}
