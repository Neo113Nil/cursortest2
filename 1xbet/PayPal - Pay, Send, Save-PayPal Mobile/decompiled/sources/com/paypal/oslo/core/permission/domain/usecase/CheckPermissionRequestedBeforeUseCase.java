package com.paypal.oslo.core.permission.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/usecase/CheckPermissionRequestedBeforeUseCase;", "", "Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;)V", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CheckPermissionRequestedBeforeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.permission.domain.repository.PermissionRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckPermissionRequestedBeforeUseCase(com.paypal.oslo.core.permission.domain.repository.PermissionRepository permissionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRepository, "");
        this.Camera2StreamConfigurationMap = permissionRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.Camera2StreamConfigurationMap.wasPermissionRequestedBefore(str, continuation);
    }
}
