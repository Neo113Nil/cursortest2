package com.paypal.oslo.feature.onboarding.signup.email;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckerImpl;", "Lcom/paypal/oslo/feature/onboarding/api/EmailChecker;", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailValidationService;", "emailValidationService", "Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckSuccessMapper;", "successMapper", "Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckSuccessMapper;Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckErrorMapper;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckSuccess;", "checkEmail-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmail", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckSuccessMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailCheckerImpl implements com.paypal.oslo.feature.onboarding.api.EmailChecker {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public EmailCheckerImpl(dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> lazy, com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper emailCheckSuccessMapper, com.paypal.oslo.feature.onboarding.signup.email.EmailCheckErrorMapper emailCheckErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailCheckSuccessMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailCheckErrorMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoSizes = emailCheckSuccessMapper;
        this.Camera2StreamConfigurationMap = emailCheckErrorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0101, RaiseCancellationException -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x010a, all -> 0x0101, blocks: (B:11:0x003f, B:13:0x007c, B:16:0x0082, B:17:0x00de, B:22:0x00d1, B:23:0x00fb, B:24:0x0100, B:28:0x0057), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v17, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r2v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.onboarding.api.EmailChecker
    /* renamed from: checkEmail-E4ilnuY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo15856checkEmailE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError, ? extends com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl$checkEmail$1 emailCheckerImpl$checkEmail$1;
        ?? r2;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object mo16283checkEmailE4ilnuY;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl$checkEmail$1) {
                emailCheckerImpl$checkEmail$1 = (com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl$checkEmail$1) continuation;
                if ((emailCheckerImpl$checkEmail$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    emailCheckerImpl$checkEmail$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = emailCheckerImpl$checkEmail$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = emailCheckerImpl$checkEmail$1.getInputSizeshNQ4ISI;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService emailValidationService = this.getHighResolutionOutputSizeshNQ4ISI.get();
                        emailCheckerImpl$checkEmail$1.getHighSpeedVideoFpsRanges = str;
                        emailCheckerImpl$checkEmail$1.getInputFormats = defaultRaise;
                        emailCheckerImpl$checkEmail$1.getOutputMinFrameDuration = defaultRaise2;
                        emailCheckerImpl$checkEmail$1.getOutputFormats = defaultRaise2;
                        emailCheckerImpl$checkEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailCheckerImpl$checkEmail$1.Camera2StreamConfigurationMap = 0;
                        emailCheckerImpl$checkEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailCheckerImpl$checkEmail$1.getHighSpeedVideoSizes = 0;
                        emailCheckerImpl$checkEmail$1.getInputSizeshNQ4ISI = 1;
                        mo16283checkEmailE4ilnuY = emailValidationService.mo16283checkEmailE4ilnuY(str, emailCheckerImpl$checkEmail$1);
                        if (mo16283checkEmailE4ilnuY == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = emailCheckerImpl$checkEmail$1.getHighSpeedVideoSizes;
                        int i2 = emailCheckerImpl$checkEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = emailCheckerImpl$checkEmail$1.Camera2StreamConfigurationMap;
                        int i4 = emailCheckerImpl$checkEmail$1.getHighSpeedVideoFpsRangesFor;
                        ?? r13 = (arrow.core.raise.Raise) emailCheckerImpl$checkEmail$1.getOutputFormats;
                        raise = (arrow.core.raise.Raise) emailCheckerImpl$checkEmail$1.getOutputMinFrameDuration;
                        defaultRaise = (arrow.core.raise.DefaultRaise) emailCheckerImpl$checkEmail$1.getInputFormats;
                        java.lang.String str2 = (java.lang.String) emailCheckerImpl$checkEmail$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r13;
                        str = str2;
                        mo16283checkEmailE4ilnuY = obj;
                    }
                    either = (arrow.core.Either) mo16283checkEmailE4ilnuY;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError map = this.Camera2StreamConfigurationMap.map((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue());
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Email check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("email_domain", kotlin.text.StringsKt.substringAfter(str, "@", "unknown")), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(map.getClass()).getSimpleName())), null, 4, null);
                        right = new arrow.core.Either.Left(map);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess emailCheckSuccess = (com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess) raise.bind(this.getHighSpeedVideoSizes.m16337mapTNt61W4((com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult) defaultRaise2.bind(right), str));
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(emailCheckSuccess);
                }
            }
            if (r2 != 0) {
            }
            either = (arrow.core.Either) mo16283checkEmailE4ilnuY;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess emailCheckSuccess2 = (com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess) raise.bind(this.getHighSpeedVideoSizes.m16337mapTNt61W4((com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult) defaultRaise2.bind(right), str));
            defaultRaise.complete();
            return new arrow.core.Either.Right(emailCheckSuccess2);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r2));
        } catch (java.lang.Throwable th) {
            r2.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        emailCheckerImpl$checkEmail$1 = new com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl$checkEmail$1(this, continuation);
        java.lang.Object obj2 = emailCheckerImpl$checkEmail$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = emailCheckerImpl$checkEmail$1.getInputSizeshNQ4ISI;
    }
}
