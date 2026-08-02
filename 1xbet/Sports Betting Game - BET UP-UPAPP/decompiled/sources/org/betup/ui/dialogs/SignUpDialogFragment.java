package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.LoginActivity;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: SignUpDialogFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/SignUpDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onSignUpClick", "Lkotlin/Function0;", "", "onDismiss", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "dialog", "Landroid/content/DialogInterface;", "navigateToLogin", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SignUpDialogFragment extends DialogFragment {
    private static final String TAG = "SignUpDialog";
    private static volatile boolean isDialogShowing;
    private Function0<Unit> onDismiss;
    private Function0<Unit> onSignUpClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final void resetDialogState() {
        INSTANCE.resetDialogState();
    }

    @JvmStatic
    public static final SignUpDialogFragment showDialog(Activity activity, Function0<Unit> function0) {
        return INSTANCE.showDialog(activity, function0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-752456423, true, new SignUpDialogFragment$onCreateView$1$1(this)));
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
        synchronized (INSTANCE) {
            isDialogShowing = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        synchronized (INSTANCE) {
            isDialogShowing = false;
            Unit unit = Unit.INSTANCE;
        }
        DialogManager.onDialogDismissed(TAG);
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToLogin() {
        try {
            Intent intent = new Intent(requireContext(), (Class<?>) LoginActivity.class);
            intent.putExtra("open_to_sign_up", true);
            startActivity(intent);
        } catch (Exception e) {
            Log.e(TAG, "Failed to navigate to LoginActivity", e);
        }
    }

    /* compiled from: SignUpDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J*\u0010\u0010\u001a\u00020\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/SignUpDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "isDialogShowing", "", "showDialog", "Lorg/betup/ui/dialogs/SignUpDialogFragment;", "activity", "Landroid/app/Activity;", "onDismiss", "Lkotlin/Function0;", "", "resetDialogState", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "onSignUpClick", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SignUpDialogFragment showDialog$default(Companion companion, Activity activity, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return companion.showDialog(activity, function0);
        }

        @JvmStatic
        public final SignUpDialogFragment showDialog(Activity activity, Function0<Unit> onDismiss) {
            Dialog dialog;
            Intrinsics.checkNotNullParameter(activity, "activity");
            synchronized (this) {
                if (SignUpDialogFragment.isDialogShowing) {
                    Log.d(SignUpDialogFragment.TAG, "Dialog is already showing, skipping duplicate request");
                    return null;
                }
                Unit unit = Unit.INSTANCE;
                SignUpDialogFragment signUpDialogFragment = new SignUpDialogFragment();
                signUpDialogFragment.onDismiss = onDismiss;
                try {
                    if (activity instanceof FragmentActivity) {
                        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                        Intrinsics.checkNotNull(supportFragmentManager);
                        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(SignUpDialogFragment.TAG);
                        SignUpDialogFragment signUpDialogFragment2 = findFragmentByTag instanceof SignUpDialogFragment ? (SignUpDialogFragment) findFragmentByTag : null;
                        if (signUpDialogFragment2 != null && signUpDialogFragment2.isAdded() && (dialog = signUpDialogFragment2.getDialog()) != null && dialog.isShowing()) {
                            Log.d(SignUpDialogFragment.TAG, "Dialog already exists in fragment manager, skipping");
                            return null;
                        }
                        synchronized (this) {
                            if (SignUpDialogFragment.isDialogShowing) {
                                Log.d(SignUpDialogFragment.TAG, "Dialog started showing between checks, skipping");
                                return null;
                            }
                            Companion companion = SignUpDialogFragment.INSTANCE;
                            SignUpDialogFragment.isDialogShowing = true;
                            Unit unit2 = Unit.INSTANCE;
                            if (DialogManager.showDialogSafely(signUpDialogFragment, supportFragmentManager, SignUpDialogFragment.TAG)) {
                                return signUpDialogFragment;
                            }
                            Log.d(SignUpDialogFragment.TAG, "Dialog already showing, skipping");
                            return null;
                        }
                    }
                    Log.e(SignUpDialogFragment.TAG, "Activity is not a FragmentActivity");
                    return null;
                } catch (Exception e) {
                    Log.e(SignUpDialogFragment.TAG, "Failed to show dialog", e);
                    synchronized (this) {
                        Companion companion2 = SignUpDialogFragment.INSTANCE;
                        SignUpDialogFragment.isDialogShowing = false;
                        Unit unit3 = Unit.INSTANCE;
                        return null;
                    }
                }
            }
        }

        @JvmStatic
        public final void resetDialogState() {
            synchronized (this) {
                Companion companion = SignUpDialogFragment.INSTANCE;
                SignUpDialogFragment.isDialogShowing = false;
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SignUpDialogFragment newInstance$default(Companion companion, Function0 function0, Function0 function02, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return companion.newInstance(function0, function02);
        }

        public final SignUpDialogFragment newInstance(Function0<Unit> onSignUpClick, Function0<Unit> onDismiss) {
            SignUpDialogFragment signUpDialogFragment = new SignUpDialogFragment();
            signUpDialogFragment.onSignUpClick = onSignUpClick;
            signUpDialogFragment.onDismiss = onDismiss;
            return signUpDialogFragment;
        }
    }
}
