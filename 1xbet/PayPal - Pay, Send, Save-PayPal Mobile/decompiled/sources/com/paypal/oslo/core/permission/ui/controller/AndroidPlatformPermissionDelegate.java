package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJB\u0010\u0012\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u001a\u0010\u0011\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/permission/ui/controller/AndroidPlatformPermissionDelegate;", "Lcom/paypal/oslo/core/permission/ui/controller/PlatformPermissionDelegate;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "isPermissionGranted", "(Landroid/app/Activity;Ljava/lang/String;)Z", "shouldShowRationale", "Landroidx/activity/result/ActivityResultLauncher;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "setPendingContinuation", "launchPermissionRequest", "(Landroidx/activity/result/ActivityResultLauncher;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidPlatformPermissionDelegate implements com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate
    public final boolean isPermissionGranted(android.app.Activity activity, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return androidx.core.content.ContextCompat.checkSelfPermission(activity, permission) == 0;
    }

    @Override // com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate
    public final boolean shouldShowRationale(android.app.Activity activity, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }

    @Override // com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate
    public final java.lang.Object launchPermissionRequest(androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> function1, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2(function1, activityResultLauncher, str, null), continuation);
    }
}
