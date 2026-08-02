package com.paypal.oslo.feature.onboarding.signup.email.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\fJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/data/repository/EmailRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "emailService", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "requestCode-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCode", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "confirm", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public EmailRepositoryImpl(com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailService, "");
        this.getHighResolutionOutputSizeshNQ4ISI = emailService;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[Catch: all -> 0x0180, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:45:0x00e9, B:47:0x0129), top: B:44:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository
    /* renamed from: requestCode-E4ilnuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16341requestCodeE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1 emailRepositoryImpl$requestCode$1;
        ?? r4;
        ?? r5;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String str2;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1 emailRepositoryImpl$requestCode$12;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.Raise raise3;
        arrow.core.raise.Raise raise4;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        try {
            try {
                try {
                    if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1) {
                        emailRepositoryImpl$requestCode$1 = (com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1) continuation;
                        if ((emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                            emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                            java.lang.Object obj2 = emailRepositoryImpl$requestCode$1.getOutputStallDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            r4 = emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM;
                            r5 = 3;
                            r5 = 3;
                            if (r4 != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                                arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                                kotlinx.coroutines.sync.Mutex mutex3 = this.getHighSpeedVideoFpsRangesFor;
                                str2 = str;
                                emailRepositoryImpl$requestCode$1.getOutputFormats = str2;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor = defaultRaise3;
                                emailRepositoryImpl$requestCode$1.getInputFormats = defaultRaise4;
                                emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI = mutex3;
                                emailRepositoryImpl$requestCode$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$requestCode$1);
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges = 0;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor = 0;
                                emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap = 0;
                                emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes = 0;
                                emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM = 1;
                                if (mutex3.lock(null, emailRepositoryImpl$requestCode$1) != coroutine_suspended) {
                                    raise = defaultRaise4;
                                    emailRepositoryImpl$requestCode$12 = emailRepositoryImpl$requestCode$1;
                                    i = 0;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                    r4 = mutex3;
                                    defaultRaise2 = defaultRaise3;
                                }
                                return coroutine_suspended;
                            }
                            if (r4 != 1) {
                                if (r4 == 2) {
                                    int i6 = emailRepositoryImpl$requestCode$1.getOutputMinFrameDuration;
                                    int i7 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes;
                                    int i8 = emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI;
                                    int i9 = emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap;
                                    int i10 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor;
                                    int i11 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges;
                                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$requestCode$1.getOutputSizes;
                                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI;
                                    raise3 = (arrow.core.raise.Raise) emailRepositoryImpl$requestCode$1.getInputFormats;
                                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    mutex2 = mutex4;
                                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj2);
                                    r4 = mutex2;
                                    com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap(validationResponse));
                                    r4.unlock(null);
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Right(confirmationState);
                                }
                                if (r4 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i12 = emailRepositoryImpl$requestCode$1.getOutputMinFrameDuration;
                                int i13 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes;
                                int i14 = emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i15 = emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap;
                                int i16 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor;
                                int i17 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges;
                                raise4 = (arrow.core.raise.Raise) emailRepositoryImpl$requestCode$1.getOutputSizes;
                                kotlinx.coroutines.sync.Mutex mutex5 = (kotlinx.coroutines.sync.Mutex) emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI;
                                raise3 = (arrow.core.raise.Raise) emailRepositoryImpl$requestCode$1.getInputFormats;
                                defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                r4 = mutex5;
                                try {
                                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise4.bind((arrow.core.Either) obj2);
                                    r4 = r4;
                                    com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState2 = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap(validationResponse));
                                    try {
                                        r4.unlock(null);
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Right(confirmationState2);
                                    } catch (arrow.core.raise.RaiseCancellationException e) {
                                        e = e;
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    defaultRaise2 = defaultRaise;
                                    obj = null;
                                    mutex = r4;
                                    r5 = defaultRaise2;
                                    mutex.unlock(obj);
                                    throw th;
                                }
                            }
                            int i18 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes;
                            i2 = emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI;
                            i3 = emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap;
                            i4 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor;
                            i5 = emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges;
                            emailRepositoryImpl$requestCode$12 = (com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1) emailRepositoryImpl$requestCode$1.getOutputSizeshNQ4ISI;
                            kotlinx.coroutines.sync.Mutex mutex6 = (kotlinx.coroutines.sync.Mutex) emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI;
                            raise = (arrow.core.raise.Raise) emailRepositoryImpl$requestCode$1.getInputFormats;
                            arrow.core.raise.DefaultRaise defaultRaise5 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor;
                            str2 = (java.lang.String) emailRepositoryImpl$requestCode$1.getOutputFormats;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            i = i18;
                            r4 = mutex6;
                            defaultRaise2 = defaultRaise5;
                            if (!this.Camera2StreamConfigurationMap) {
                                try {
                                    com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService = this.getHighResolutionOutputSizeshNQ4ISI;
                                    emailRepositoryImpl$requestCode$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor = defaultRaise2;
                                    emailRepositoryImpl$requestCode$1.getInputFormats = raise;
                                    emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI = r4;
                                    emailRepositoryImpl$requestCode$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$requestCode$12);
                                    emailRepositoryImpl$requestCode$1.getOutputSizes = raise;
                                    emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges = i5;
                                    emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor = i4;
                                    emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap = i3;
                                    emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes = i;
                                    emailRepositoryImpl$requestCode$1.getOutputMinFrameDuration = 0;
                                    emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM = 2;
                                    obj2 = emailService.resend(emailRepositoryImpl$requestCode$1);
                                    if (obj2 != coroutine_suspended) {
                                        defaultRaise = defaultRaise2;
                                        raise2 = raise;
                                        raise3 = raise2;
                                        mutex2 = r4;
                                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj2);
                                        r4 = mutex2;
                                        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState22 = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap(validationResponse));
                                        r4.unlock(null);
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Right(confirmationState22);
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    obj = null;
                                    mutex = r4;
                                    r5 = defaultRaise2;
                                    mutex.unlock(obj);
                                    throw th;
                                }
                            } else {
                                com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                emailRepositoryImpl$requestCode$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizesFor = defaultRaise2;
                                emailRepositoryImpl$requestCode$1.getInputFormats = raise;
                                emailRepositoryImpl$requestCode$1.getInputSizeshNQ4ISI = r4;
                                emailRepositoryImpl$requestCode$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$requestCode$12);
                                emailRepositoryImpl$requestCode$1.getOutputSizes = raise;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRanges = i5;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoFpsRangesFor = i4;
                                emailRepositoryImpl$requestCode$1.Camera2StreamConfigurationMap = i3;
                                emailRepositoryImpl$requestCode$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                emailRepositoryImpl$requestCode$1.getHighSpeedVideoSizes = i;
                                emailRepositoryImpl$requestCode$1.getOutputMinFrameDuration = 0;
                                emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM = 3;
                                obj2 = emailService2.mo16282initiateE4ilnuY(str2, emailRepositoryImpl$requestCode$1);
                                if (obj2 != coroutine_suspended) {
                                    defaultRaise = defaultRaise2;
                                    raise4 = raise;
                                    raise3 = raise4;
                                    r4 = r4;
                                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise4.bind((arrow.core.Either) obj2);
                                    r4 = r4;
                                    com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState222 = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap(validationResponse));
                                    r4.unlock(null);
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Right(confirmationState222);
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    if (!this.Camera2StreamConfigurationMap) {
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    obj = null;
                    mutex = r4;
                    r5 = defaultRaise2;
                    mutex.unlock(obj);
                    throw th;
                }
                if (r4 != 0) {
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                defaultRaise2 = 2;
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = r5;
        } catch (java.lang.Throwable th6) {
            th = th6;
            defaultRaise = r5;
        }
        emailRepositoryImpl$requestCode$1 = new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1(this, continuation);
        java.lang.Object obj22 = emailRepositoryImpl$requestCode$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = emailRepositoryImpl$requestCode$1.getOutputMinFrameDurationlomOqCM;
        r5 = 3;
        r5 = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository
    /* renamed from: confirm-LcHNf2w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16340confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1 emailRepositoryImpl$confirm$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String str2;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1 emailRepositoryImpl$confirm$12;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.Raise raise3;
        java.lang.Object obj2;
        java.lang.Throwable th;
        try {
            try {
                try {
                    if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1) {
                        emailRepositoryImpl$confirm$1 = (com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1) continuation;
                        if ((emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                            emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                            obj = emailRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM;
                            defaultRaise = 1;
                            defaultRaise2 = 1;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                                arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise3;
                                mutex = this.getHighSpeedVideoFpsRangesFor;
                                str2 = str;
                                emailRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = str2;
                                emailRepositoryImpl$confirm$1.getOutputFormats = defaultRaise3;
                                emailRepositoryImpl$confirm$1.getInputFormats = defaultRaise5;
                                emailRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = mutex;
                                emailRepositoryImpl$confirm$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$confirm$1);
                                emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = 0;
                                emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = 0;
                                emailRepositoryImpl$confirm$1.getHighSpeedVideoSizes = 0;
                                emailRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                emailRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = 0;
                                emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = 1;
                                if (mutex.lock(null, emailRepositoryImpl$confirm$1) != coroutine_suspended) {
                                    raise = defaultRaise5;
                                    emailRepositoryImpl$confirm$12 = emailRepositoryImpl$confirm$1;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                    i6 = 0;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i7 = emailRepositoryImpl$confirm$1.getOutputMinFrameDuration;
                                int i8 = emailRepositoryImpl$confirm$1.Camera2StreamConfigurationMap;
                                int i9 = emailRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i10 = emailRepositoryImpl$confirm$1.getHighSpeedVideoSizes;
                                int i11 = emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges;
                                int i12 = emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                                raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$confirm$1.getOutputStallDuration;
                                mutex = (kotlinx.coroutines.sync.Mutex) emailRepositoryImpl$confirm$1.getInputSizeshNQ4ISI;
                                raise3 = (arrow.core.raise.Raise) emailRepositoryImpl$confirm$1.getInputFormats;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$confirm$1.getOutputFormats;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj)));
                                    mutex.unlock(null);
                                    defaultRaise4.complete();
                                    return new arrow.core.Either.Right(confirmationState);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    mutex.unlock(obj2);
                                    throw th;
                                }
                            }
                            int i13 = emailRepositoryImpl$confirm$1.Camera2StreamConfigurationMap;
                            int i14 = emailRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i15 = emailRepositoryImpl$confirm$1.getHighSpeedVideoSizes;
                            int i16 = emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges;
                            int i17 = emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                            com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1 emailRepositoryImpl$confirm$13 = (com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1) emailRepositoryImpl$confirm$1.getOutputSizeshNQ4ISI;
                            kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) emailRepositoryImpl$confirm$1.getInputSizeshNQ4ISI;
                            raise = (arrow.core.raise.Raise) emailRepositoryImpl$confirm$1.getInputFormats;
                            defaultRaise3 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$confirm$1.getOutputFormats;
                            str2 = (java.lang.String) emailRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            i2 = i13;
                            mutex = mutex2;
                            emailRepositoryImpl$confirm$12 = emailRepositoryImpl$confirm$13;
                            i6 = i17;
                            i5 = i16;
                            i4 = i15;
                            i3 = i14;
                            defaultRaise4 = defaultRaise3;
                            com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService = this.getHighResolutionOutputSizeshNQ4ISI;
                            emailRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            emailRepositoryImpl$confirm$1.getOutputFormats = defaultRaise4;
                            emailRepositoryImpl$confirm$1.getInputFormats = raise;
                            emailRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = mutex;
                            emailRepositoryImpl$confirm$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$confirm$12);
                            emailRepositoryImpl$confirm$1.getOutputStallDuration = raise;
                            emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = i6;
                            emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = i5;
                            emailRepositoryImpl$confirm$1.getHighSpeedVideoSizes = i4;
                            emailRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                            emailRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = i2;
                            emailRepositoryImpl$confirm$1.getOutputMinFrameDuration = 0;
                            emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = 2;
                            obj = emailService.mo16281confirmLcHNf2w(str2, emailRepositoryImpl$confirm$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise2 = raise;
                            raise3 = raise2;
                            com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState2 = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj)));
                            mutex.unlock(null);
                            defaultRaise4.complete();
                            return new arrow.core.Either.Right(confirmationState2);
                        }
                    }
                    com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    emailRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    emailRepositoryImpl$confirm$1.getOutputFormats = defaultRaise4;
                    emailRepositoryImpl$confirm$1.getInputFormats = raise;
                    emailRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = mutex;
                    emailRepositoryImpl$confirm$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRepositoryImpl$confirm$12);
                    emailRepositoryImpl$confirm$1.getOutputStallDuration = raise;
                    emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = i6;
                    emailRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = i5;
                    emailRepositoryImpl$confirm$1.getHighSpeedVideoSizes = i4;
                    emailRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    emailRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = i2;
                    emailRepositoryImpl$confirm$1.getOutputMinFrameDuration = 0;
                    emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = 2;
                    obj = emailService2.mo16281confirmLcHNf2w(str2, emailRepositoryImpl$confirm$1);
                    if (obj != coroutine_suspended) {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    obj2 = null;
                    mutex.unlock(obj2);
                    throw th;
                }
                if (i != 0) {
                }
                defaultRaise4 = defaultRaise3;
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise2.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
            } catch (java.lang.Throwable th4) {
                th = th4;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise2 = defaultRaise3;
            defaultRaise2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
        } catch (java.lang.Throwable th5) {
            th = th5;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        emailRepositoryImpl$confirm$1 = new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1(this, continuation);
        obj = emailRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM;
        defaultRaise = 1;
        defaultRaise2 = 1;
    }

    private final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState> Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse p0) {
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated initiated;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (p0.getSuccess()) {
                int i = com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[p0.getStatus().ordinal()];
                if (i == 1) {
                    this.Camera2StreamConfigurationMap = true;
                    initiated = com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated.INSTANCE;
                } else {
                    if (i != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    initiated = com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Confirmed.INSTANCE;
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(initiated);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("Email confirmation operation failed"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.INITIATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.CONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
