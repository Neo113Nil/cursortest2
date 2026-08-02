package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/RuntimePermissionHelper;", "", "Landroidx/activity/result/ActivityResultLauncher;", "", "permissionLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "Lkotlin/Function1;", "", "", "onResult", "requestPermission", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isGranted", "onPermissionResult$identity_prodRelease", "(Z)V", "Landroidx/activity/result/ActivityResultLauncher;", "getPermissionLauncher$identity_prodRelease", "()Landroidx/activity/result/ActivityResultLauncher;", "setPermissionLauncher$identity_prodRelease", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RuntimePermissionHelper {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.view.result.ActivityResultLauncher<java.lang.String> permissionLauncher;

    public RuntimePermissionHelper(androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher) {
        this.permissionLauncher = activityResultLauncher;
    }

    public /* synthetic */ RuntimePermissionHelper(androidx.view.result.ActivityResultLauncher activityResultLauncher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activityResultLauncher);
    }

    public final androidx.view.result.ActivityResultLauncher<java.lang.String> getPermissionLauncher$identity_prodRelease() {
        return this.permissionLauncher;
    }

    public final void setPermissionLauncher$identity_prodRelease(androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher) {
        this.permissionLauncher = activityResultLauncher;
    }

    public final void requestPermission(java.lang.String permission, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher = this.permissionLauncher;
        if (activityResultLauncher != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = onResult;
            activityResultLauncher.launch(permission);
        } else {
            onResult.invoke(java.lang.Boolean.FALSE);
        }
    }

    public final void onPermissionResult$identity_prodRelease(boolean isGranted) {
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(isGranted));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimePermissionHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
