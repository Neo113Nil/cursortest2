package com.paypal.oslo.feature.onboarding.signup.swg.data;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/swg/data/GoogleTokenCheckerImpl;", "Lcom/paypal/oslo/feature/onboarding/api/swg/GoogleTokenChecker;", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/repository/SwgCredentialRepository;", "swgCredentialRepository", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckSuccessMapper;", "successMapper", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckSuccessMapper;Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckErrorMapper;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "checkToken-_dMVy3A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToken", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckSuccessMapper;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoogleTokenCheckerImpl implements com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper getHighSpeedVideoFpsRanges;
    private final dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GoogleTokenCheckerImpl(dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> lazy, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper googleTokenCheckSuccessMapper, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper googleTokenCheckErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleTokenCheckSuccessMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleTokenCheckErrorMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoFpsRanges = googleTokenCheckSuccessMapper;
        this.getHighSpeedVideoFpsRangesFor = googleTokenCheckErrorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0101, RaiseCancellationException -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x010a, all -> 0x0101, blocks: (B:11:0x003f, B:13:0x007c, B:16:0x0082, B:17:0x00de, B:22:0x00d1, B:23:0x00fb, B:24:0x0100, B:28:0x0057), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v30, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r2v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker
    /* renamed from: checkToken-_dMVy3A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16038checkToken_dMVy3A(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError, ? extends com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl$checkToken$1 googleTokenCheckerImpl$checkToken$1;
        ?? r2;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object mo16427checkToken_dMVy3A;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl$checkToken$1) {
                googleTokenCheckerImpl$checkToken$1 = (com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl$checkToken$1) continuation;
                if ((googleTokenCheckerImpl$checkToken$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    googleTokenCheckerImpl$checkToken$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = googleTokenCheckerImpl$checkToken$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = googleTokenCheckerImpl$checkToken$1.getOutputFormats;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository swgCredentialRepository = this.getHighResolutionOutputSizeshNQ4ISI.get();
                        googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoFpsRanges = str;
                        googleTokenCheckerImpl$checkToken$1.getOutputMinFrameDuration = defaultRaise;
                        googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        googleTokenCheckerImpl$checkToken$1.getInputFormats = defaultRaise2;
                        googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoFpsRangesFor = 0;
                        googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoSizes = 0;
                        googleTokenCheckerImpl$checkToken$1.Camera2StreamConfigurationMap = 0;
                        googleTokenCheckerImpl$checkToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        googleTokenCheckerImpl$checkToken$1.getOutputFormats = 1;
                        mo16427checkToken_dMVy3A = swgCredentialRepository.mo16427checkToken_dMVy3A(str, googleTokenCheckerImpl$checkToken$1);
                        if (mo16427checkToken_dMVy3A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = googleTokenCheckerImpl$checkToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = googleTokenCheckerImpl$checkToken$1.Camera2StreamConfigurationMap;
                        int i3 = googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoSizes;
                        int i4 = googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoFpsRangesFor;
                        ?? r13 = (arrow.core.raise.Raise) googleTokenCheckerImpl$checkToken$1.getInputFormats;
                        raise = (arrow.core.raise.Raise) googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) googleTokenCheckerImpl$checkToken$1.getOutputMinFrameDuration;
                        java.lang.String str2 = (java.lang.String) googleTokenCheckerImpl$checkToken$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r13;
                        str = str2;
                        mo16427checkToken_dMVy3A = obj;
                    }
                    either = (arrow.core.Either) mo16427checkToken_dMVy3A;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError map = this.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue());
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Google token check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("token_length", java.lang.String.valueOf(str.length())), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(map.getClass()).getSimpleName())), null, 4, null);
                        right = new arrow.core.Either.Left(map);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess googleTokenCheckSuccess = (com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess) raise.bind(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult) defaultRaise2.bind(right)));
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(googleTokenCheckSuccess);
                }
            }
            if (r2 != 0) {
            }
            either = (arrow.core.Either) mo16427checkToken_dMVy3A;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess googleTokenCheckSuccess2 = (com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess) raise.bind(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult) defaultRaise2.bind(right)));
            defaultRaise.complete();
            return new arrow.core.Either.Right(googleTokenCheckSuccess2);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r2));
        } catch (java.lang.Throwable th) {
            r2.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        googleTokenCheckerImpl$checkToken$1 = new com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl$checkToken$1(this, continuation);
        java.lang.Object obj2 = googleTokenCheckerImpl$checkToken$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = googleTokenCheckerImpl$checkToken$1.getOutputFormats;
    }
}
