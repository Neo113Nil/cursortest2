package org.betup.ui.dialogs;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.support.compose.SupportCallbacks;
import org.betup.ui.fragment.support.controller.SupportController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: SupportTicketDetailDialogFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/SupportTicketDetailDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/support/controller/SupportController;", "callbacks", "Lorg/betup/ui/fragment/support/compose/SupportCallbacks;", "onDismissed", "Lkotlin/Function0;", "", "getOnDismissed", "()Lkotlin/jvm/functions/Function0;", "setOnDismissed", "(Lkotlin/jvm/functions/Function0;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "setController", "setCallbacks", VastTagName.COMPANION, "app_release", "uiState", "Lorg/betup/ui/fragment/support/compose/SupportUiState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SupportTicketDetailDialogFragment extends DialogFragment {
    private static final String TAG = "SupportTicketDetailDialog";
    private SupportCallbacks callbacks;
    private SupportController controller;
    private Function0<Unit> onDismissed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final Function0<Unit> getOnDismissed() {
        return this.onDismissed;
    }

    public final void setOnDismissed(Function0<Unit> function0) {
        this.onDismissed = function0;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.Theme.Black.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1363911409, true, new SupportTicketDetailDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Function0<Unit> function0 = this.onDismissed;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(org.betup.R.drawable.main_app_bg);
        window.setLayout(-1, -1);
        WindowCompat.setDecorFitsSystemWindows(window, true);
        window.clearFlags(67110400);
        window.setStatusBarColor(0);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.show(WindowInsetsCompat.Type.statusBars());
            }
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        WindowInsetsControllerCompat insetsController2 = WindowCompat.getInsetsController(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController2, "getInsetsController(...)");
        insetsController2.setAppearanceLightStatusBars(false);
        insetsController2.show(WindowInsetsCompat.Type.statusBars());
    }

    public final void setController(SupportController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public final void setCallbacks(SupportCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    /* compiled from: SupportTicketDetailDialogFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/SupportTicketDetailDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/SupportTicketDetailDialogFragment;", "controller", "Lorg/betup/ui/fragment/support/controller/SupportController;", "callbacks", "Lorg/betup/ui/fragment/support/compose/SupportCallbacks;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SupportTicketDetailDialogFragment newInstance(SupportController controller, SupportCallbacks callbacks) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            SupportTicketDetailDialogFragment supportTicketDetailDialogFragment = new SupportTicketDetailDialogFragment();
            supportTicketDetailDialogFragment.controller = controller;
            supportTicketDetailDialogFragment.callbacks = callbacks;
            return supportTicketDetailDialogFragment;
        }
    }
}
