package com.paypal.android.threeds.ui.customviews;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/android/threeds/ui/customviews/ProgressDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProgressDialog extends android.app.Dialog {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgressDialog(android.content.Context context) {
        super(context, android.R.style.Theme.DeviceDefault.Dialog);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.view.View inflate = android.view.View.inflate(context, com.paypal.android.threeds.R.layout.compose_view, null);
        setContentView(inflate);
        androidx.compose.ui.platform.ComposeView composeView = (androidx.compose.ui.platform.ComposeView) inflate.findViewById(com.paypal.android.threeds.R.id.compose_view);
        composeView.setViewCompositionStrategy(androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        composeView.setContent(com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt.INSTANCE.m11003getLambda$1073606837$three_ds_release());
        setCancelable(false);
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
            androidx.view.C0276ViewTreeLifecycleOwner.set(decorView, (androidx.view.LifecycleOwner) context);
            android.view.View decorView2 = window.getDecorView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView2, "");
            androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(decorView2, (androidx.view.SavedStateRegistryOwner) context);
            window.addFlags(262144);
            window.getDecorView().setBackgroundColor(0);
        }
    }
}
