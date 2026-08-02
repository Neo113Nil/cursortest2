package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.NoInternetDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NoInternetDialogFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/NoInternetDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onCloseListener", "Lkotlin/Function0;", "", "onTryAgainListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDestroyView", "setOnCloseListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTryAgainListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoInternetDialogFragment extends DialogFragment {
    private static final String TAG = "NoInternetDialog";
    private Function0<Unit> onCloseListener;
    private Function0<Unit> onTryAgainListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NoInternetDialogFragment showDialog(Activity activity, Runnable runnable, Runnable runnable2) {
        return INSTANCE.showDialog(activity, runnable, runnable2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(227048153, true, new NoInternetDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.onCloseListener = null;
        this.onTryAgainListener = null;
        super.onDestroyView();
    }

    public final void setOnCloseListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCloseListener = listener;
    }

    public final void setOnTryAgainListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTryAgainListener = listener;
    }

    /* compiled from: NoInternetDialogFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/dialogs/NoInternetDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "showDialog", "Lorg/betup/ui/dialogs/NoInternetDialogFragment;", "activity", "Landroid/app/Activity;", "onClose", "Ljava/lang/Runnable;", "onTryAgain", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NoInternetDialogFragment showDialog(Activity activity, final Runnable onClose, final Runnable onTryAgain) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onClose, "onClose");
            Intrinsics.checkNotNullParameter(onTryAgain, "onTryAgain");
            NoInternetDialogFragment noInternetDialogFragment = new NoInternetDialogFragment();
            noInternetDialogFragment.setOnCloseListener(new Function0() { // from class: org.betup.ui.dialogs.NoInternetDialogFragment$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit showDialog$lambda$2$lambda$0;
                    showDialog$lambda$2$lambda$0 = NoInternetDialogFragment.Companion.showDialog$lambda$2$lambda$0(onClose);
                    return showDialog$lambda$2$lambda$0;
                }
            });
            noInternetDialogFragment.setOnTryAgainListener(new Function0() { // from class: org.betup.ui.dialogs.NoInternetDialogFragment$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit showDialog$lambda$2$lambda$1;
                    showDialog$lambda$2$lambda$1 = NoInternetDialogFragment.Companion.showDialog$lambda$2$lambda$1(onTryAgain);
                    return showDialog$lambda$2$lambda$1;
                }
            });
            try {
            } catch (Exception e) {
                Log.e(NoInternetDialogFragment.TAG, "Failed to show dialog", e);
            }
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
                noInternetDialogFragment.show(supportFragmentManager, NoInternetDialogFragment.TAG);
                return noInternetDialogFragment;
            }
            Log.e(NoInternetDialogFragment.TAG, "Activity is not a FragmentActivity");
            return noInternetDialogFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit showDialog$lambda$2$lambda$0(Runnable runnable) {
            runnable.run();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit showDialog$lambda$2$lambda$1(Runnable runnable) {
            runnable.run();
            return Unit.INSTANCE;
        }
    }
}
