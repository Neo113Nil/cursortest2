package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TermsPrivacyDialogFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/dialogs/TermsPrivacyDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onAcceptClick", "Lkotlin/Function0;", "", "onAcceptCallback", "Lorg/betup/ui/dialogs/TermsPrivacyDialogCallback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TermsPrivacyDialogFragment extends DialogFragment {
    private static final String TAG = "TermsPrivacyDialog";
    private TermsPrivacyDialogCallback onAcceptCallback;
    private Function0<Unit> onAcceptClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TermsPrivacyDialogFragment showDialog(Activity activity, Function0<Unit> function0) {
        return INSTANCE.showDialog(activity, function0);
    }

    @JvmStatic
    public static final TermsPrivacyDialogFragment showDialog(Activity activity, TermsPrivacyDialogCallback termsPrivacyDialogCallback) {
        return INSTANCE.showDialog(activity, termsPrivacyDialogCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-648629575, true, new TermsPrivacyDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(null);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setDimAmount(0.6f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
    }

    /* compiled from: TermsPrivacyDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/TermsPrivacyDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "showDialog", "Lorg/betup/ui/dialogs/TermsPrivacyDialogFragment;", "activity", "Landroid/app/Activity;", "onAccept", "Lkotlin/Function0;", "", "callback", "Lorg/betup/ui/dialogs/TermsPrivacyDialogCallback;", "showDialogInternal", Request.JsonKeys.FRAGMENT, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TermsPrivacyDialogFragment showDialog(Activity activity, Function0<Unit> onAccept) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onAccept, "onAccept");
            TermsPrivacyDialogFragment termsPrivacyDialogFragment = new TermsPrivacyDialogFragment();
            termsPrivacyDialogFragment.onAcceptClick = onAccept;
            return showDialogInternal(activity, termsPrivacyDialogFragment);
        }

        @JvmStatic
        public final TermsPrivacyDialogFragment showDialog(Activity activity, TermsPrivacyDialogCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            TermsPrivacyDialogFragment termsPrivacyDialogFragment = new TermsPrivacyDialogFragment();
            termsPrivacyDialogFragment.onAcceptCallback = callback;
            return showDialogInternal(activity, termsPrivacyDialogFragment);
        }

        private final TermsPrivacyDialogFragment showDialogInternal(Activity activity, TermsPrivacyDialogFragment fragment) {
            Dialog dialog;
            try {
                if (activity instanceof FragmentActivity) {
                    FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                    Intrinsics.checkNotNull(supportFragmentManager);
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(TermsPrivacyDialogFragment.TAG);
                    TermsPrivacyDialogFragment termsPrivacyDialogFragment = findFragmentByTag instanceof TermsPrivacyDialogFragment ? (TermsPrivacyDialogFragment) findFragmentByTag : null;
                    if (termsPrivacyDialogFragment != null && termsPrivacyDialogFragment.isAdded() && (dialog = termsPrivacyDialogFragment.getDialog()) != null && dialog.isShowing()) {
                        return null;
                    }
                    if (DialogManager.showDialogSafely(fragment, supportFragmentManager, TermsPrivacyDialogFragment.TAG)) {
                        return fragment;
                    }
                    return null;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }
}
