package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetAuthorizationUrlUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "packageRepository", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/AuthorizationResult;", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetAuthorizationUrlUseCase {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public GetAuthorizationUrlUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = packageRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.usecase.AuthorizationResult>> continuation) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase$invoke$1 getAuthorizationUrlUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization requiresAuthorization;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase$invoke$1) {
            getAuthorizationUrlUseCase$invoke$1 = (com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase$invoke$1) continuation;
            if ((getAuthorizationUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getAuthorizationUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getAuthorizationUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAuthorizationUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getAuthorizationUrlUseCase$invoke$1.Camera2StreamConfigurationMap = emailProvider;
                    getAuthorizationUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = packageRepository.getAuthorizationUrl(emailProvider, getAuthorizationUrlUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    emailProvider = (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) getAuthorizationUrlUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String str = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                    if (kotlin.text.StringsKt.startsWith$default(str, "mock://", false, 2, (java.lang.Object) null)) {
                        requiresAuthorization = new com.paypal.oslo.feature.packagetracking.domain.usecase.LinkingComplete(emailProvider);
                    } else {
                        requiresAuthorization = new com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization(str, emailProvider);
                    }
                    return new arrow.core.Either.Right(requiresAuthorization);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAuthorizationUrlUseCase$invoke$1 = new com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAuthorizationUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAuthorizationUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
