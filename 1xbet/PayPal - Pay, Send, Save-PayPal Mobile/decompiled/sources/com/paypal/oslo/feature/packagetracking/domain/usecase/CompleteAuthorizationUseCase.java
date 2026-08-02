package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/CompleteAuthorizationUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "packageRepository", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "authorizationCode", "state", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/AuthorizationResult;", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompleteAuthorizationUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CompleteAuthorizationUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = packageRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.usecase.AuthorizationResult>> continuation) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase$invoke$1 completeAuthorizationUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase$invoke$1) {
            completeAuthorizationUseCase$invoke$1 = (com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase$invoke$1) continuation;
            if ((completeAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                completeAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = completeAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = completeAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    completeAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = emailProvider;
                    completeAuthorizationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    completeAuthorizationUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    completeAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRepository.authorizePackageTracking(emailProvider, str, str2, completeAuthorizationUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    emailProvider = (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) completeAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return either;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue()) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.packagetracking.domain.usecase.LinkingComplete(emailProvider));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError("Authorization failed", null, null, 6, null));
            }
        }
        completeAuthorizationUseCase$invoke$1 = new com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = completeAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = completeAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }
}
