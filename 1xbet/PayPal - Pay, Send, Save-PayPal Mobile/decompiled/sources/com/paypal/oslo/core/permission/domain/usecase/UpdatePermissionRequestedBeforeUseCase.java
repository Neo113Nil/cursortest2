package com.paypal.oslo.core.permission.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/usecase/UpdatePermissionRequestedBeforeUseCase;", "", "Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;)V", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "wasGranted", "", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdatePermissionRequestedBeforeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.permission.domain.repository.PermissionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UpdatePermissionRequestedBeforeUseCase(com.paypal.oslo.core.permission.domain.repository.PermissionRepository permissionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRepository, "");
        this.getHighSpeedVideoFpsRanges = permissionRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (z) {
            java.lang.Object clearPermissionRequestHistory = this.getHighSpeedVideoFpsRanges.clearPermissionRequestHistory(str, continuation);
            return clearPermissionRequestHistory == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearPermissionRequestHistory : kotlin.Unit.INSTANCE;
        }
        java.lang.Object markPermissionAsRequested = this.getHighSpeedVideoFpsRanges.markPermissionAsRequested(str, continuation);
        return markPermissionAsRequested == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? markPermissionAsRequested : kotlin.Unit.INSTANCE;
    }
}
