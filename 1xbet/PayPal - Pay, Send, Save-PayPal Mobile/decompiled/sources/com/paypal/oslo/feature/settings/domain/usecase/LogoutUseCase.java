package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "", "Lcom/paypal/oslo/core/session/LogoutCoordinator;", "logoutCoordinator", "<init>", "(Lcom/paypal/oslo/core/session/LogoutCoordinator;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/session/LogoutCoordinator;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogoutUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.LogoutCoordinator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public LogoutUseCase(com.paypal.oslo.core.session.LogoutCoordinator logoutCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutCoordinator, "");
        this.Camera2StreamConfigurationMap = logoutCoordinator;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase$invoke$1 logoutUseCase$invoke$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase$invoke$1) {
                logoutUseCase$invoke$1 = (com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase$invoke$1) continuation;
                if ((logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = logoutUseCase$invoke$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.session.LogoutCoordinator logoutCoordinator = this.Camera2StreamConfigurationMap;
                        logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (logoutCoordinator.logout(logoutUseCase$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
            }
            if (i != 0) {
            }
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError(e.getMessage()));
        }
        logoutUseCase$invoke$1 = new com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = logoutUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = logoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
    }
}
