package com.paypal.oslo.core.permission.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/permission/ui/viewmodel/PermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/permission/domain/usecase/CheckPermissionRequestedBeforeUseCase;", "checkPermissionRequestedBeforeUseCase", "Lcom/paypal/oslo/core/permission/domain/usecase/UpdatePermissionRequestedBeforeUseCase;", "updatePermissionRequestedBeforeUseCase", "<init>", "(Lcom/paypal/oslo/core/permission/domain/usecase/CheckPermissionRequestedBeforeUseCase;Lcom/paypal/oslo/core/permission/domain/usecase/UpdatePermissionRequestedBeforeUseCase;)V", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "hasPermissionBeenRequested", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wasGranted", "", "updatePermissionRequestedState", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isGranted", "hasRationaleAfter", "hasRequestedBefore", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "evaluatePermissionStatus", "(ZZZ)Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/permission/domain/usecase/CheckPermissionRequestedBeforeUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/permission/domain/usecase/UpdatePermissionRequestedBeforeUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PermissionViewModel(com.paypal.oslo.core.permission.domain.usecase.CheckPermissionRequestedBeforeUseCase checkPermissionRequestedBeforeUseCase, com.paypal.oslo.core.permission.domain.usecase.UpdatePermissionRequestedBeforeUseCase updatePermissionRequestedBeforeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkPermissionRequestedBeforeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePermissionRequestedBeforeUseCase, "");
        this.Camera2StreamConfigurationMap = checkPermissionRequestedBeforeUseCase;
        this.getHighSpeedVideoFpsRanges = updatePermissionRequestedBeforeUseCase;
    }

    public final java.lang.Object hasPermissionBeenRequested(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.Camera2StreamConfigurationMap.invoke(str, continuation);
    }

    public final java.lang.Object updatePermissionRequestedState(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object invoke = this.getHighSpeedVideoFpsRanges.invoke(str, z, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    public final com.paypal.oslo.core.permission.domain.model.PermissionStatus evaluatePermissionStatus(boolean isGranted, boolean hasRationaleAfter, boolean hasRequestedBefore) {
        if (isGranted) {
            return com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE;
        }
        if (!hasRationaleAfter && hasRequestedBefore) {
            return com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied.INSTANCE;
        }
        return com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale.INSTANCE;
    }
}
