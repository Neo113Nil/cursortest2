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
import org.betup.ui.dialogs.ServerMaintenanceDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: ServerMaintenanceDialogFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0014\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/ServerMaintenanceDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "title", "", "message", "onDismissListener", "Lkotlin/Function0;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "setOnDismissListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServerMaintenanceDialogFragment extends DialogFragment {
    private static final String ARG_MESSAGE = "arg_message";
    private static final String ARG_TITLE = "arg_title";
    private static final String TAG = "ServerMaintenanceDialog";
    private Function0<Unit> onDismissListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private String title = "";
    private String message = "";

    @JvmStatic
    public static final ServerMaintenanceDialogFragment showDialog(Activity activity, String str, String str2, Runnable runnable) {
        return INSTANCE.showDialog(activity, str, str2, runnable);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ARG_TITLE, "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.title = string;
            String string2 = arguments.getString(ARG_MESSAGE, "");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.message = string2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1261378695, true, new ServerMaintenanceDialogFragment$onCreateView$1$1(this)));
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

    public final void setOnDismissListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDismissListener = listener;
    }

    /* compiled from: ServerMaintenanceDialogFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/ServerMaintenanceDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_TITLE", "ARG_MESSAGE", "showDialog", "Lorg/betup/ui/dialogs/ServerMaintenanceDialogFragment;", "activity", "Landroid/app/Activity;", "title", "message", "onDismiss", "Ljava/lang/Runnable;", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ServerMaintenanceDialogFragment showDialog(Activity activity, String title, String message, final Runnable onDismiss) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
            ServerMaintenanceDialogFragment newInstance = newInstance(title, message);
            newInstance.setOnDismissListener(new Function0() { // from class: org.betup.ui.dialogs.ServerMaintenanceDialogFragment$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit showDialog$lambda$1$lambda$0;
                    showDialog$lambda$1$lambda$0 = ServerMaintenanceDialogFragment.Companion.showDialog$lambda$1$lambda$0(onDismiss);
                    return showDialog$lambda$1$lambda$0;
                }
            });
            try {
            } catch (Exception e) {
                Log.e(ServerMaintenanceDialogFragment.TAG, "Failed to show dialog", e);
            }
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
                newInstance.show(supportFragmentManager, ServerMaintenanceDialogFragment.TAG);
                return newInstance;
            }
            Log.e(ServerMaintenanceDialogFragment.TAG, "Activity is not a FragmentActivity");
            return newInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit showDialog$lambda$1$lambda$0(Runnable runnable) {
            runnable.run();
            return Unit.INSTANCE;
        }

        public final ServerMaintenanceDialogFragment newInstance(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            ServerMaintenanceDialogFragment serverMaintenanceDialogFragment = new ServerMaintenanceDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ServerMaintenanceDialogFragment.ARG_TITLE, title);
            bundle.putString(ServerMaintenanceDialogFragment.ARG_MESSAGE, message);
            serverMaintenanceDialogFragment.setArguments(bundle);
            return serverMaintenanceDialogFragment;
        }
    }
}
