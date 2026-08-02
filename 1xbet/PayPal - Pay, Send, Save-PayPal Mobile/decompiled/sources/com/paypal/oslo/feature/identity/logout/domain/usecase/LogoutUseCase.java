package com.paypal.oslo.feature.identity.logout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/logout/domain/usecase/LogoutUseCase;", "", "Lcom/paypal/oslo/feature/identity/logout/domain/repository/LogoutRepository;", "repository", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "deviceRegistrationWriter", "<init>", "(Lcom/paypal/oslo/feature/identity/logout/domain/repository/LogoutRepository;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;)V", "", "unbindDevice", "", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/logout/domain/repository/LogoutRepository;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogoutUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LogoutUseCase(com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository logoutRepository, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationWriter, "");
        this.getHighSpeedVideoSizes = logoutRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationWriter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r7.clearDeviceRegistrationState(r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r7.logout(r6, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase$invoke$1 logoutUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase$invoke$1) {
            logoutUseCase$invoke$1 = (com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase$invoke$1) continuation;
            if ((logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = logoutUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository logoutRepository = this.getHighSpeedVideoSizes;
                    logoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = z;
                    logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = logoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    z = logoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (z) {
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter = this.getHighResolutionOutputSizeshNQ4ISI;
                logoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = z;
                logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        logoutUseCase$invoke$1 = new com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = logoutUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (z) {
        }
    }
}
