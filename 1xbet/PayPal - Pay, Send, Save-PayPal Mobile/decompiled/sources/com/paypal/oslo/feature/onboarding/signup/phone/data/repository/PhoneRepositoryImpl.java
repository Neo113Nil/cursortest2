package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010\u001b\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/PhoneRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;", "phoneService", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;)V", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "phone", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "signupCountryCode", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;", "phoneConfirmationDetails", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "requestCode-AttygxE", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCode", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirm", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PhoneRepositoryImpl(com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService phoneService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneService, "");
        this.getHighSpeedVideoSizes = phoneService;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository
    /* renamed from: requestCode-AttygxE, reason: not valid java name */
    public final java.lang.Object mo16390requestCodeAttygxE(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone r18, java.lang.String r19, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails r20, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> r21) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl.mo16390requestCodeAttygxE(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone, java.lang.String, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails, kotlin.coroutines.Continuation):java.lang.Object");
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
    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository
    /* renamed from: confirm-LcHNf2w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16389confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1 phoneRepositoryImpl$confirm$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String str2;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1 phoneRepositoryImpl$confirm$12;
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
                    if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1) {
                        phoneRepositoryImpl$confirm$1 = (com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1) continuation;
                        if ((phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                            phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM -= 2147483648;
                            obj = phoneRepositoryImpl$confirm$1.getOutputStallDuration;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM;
                            defaultRaise = 1;
                            defaultRaise2 = 1;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                                arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise3;
                                mutex = this.Camera2StreamConfigurationMap;
                                str2 = str;
                                phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = str2;
                                phoneRepositoryImpl$confirm$1.getOutputFormats = defaultRaise3;
                                phoneRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = defaultRaise5;
                                phoneRepositoryImpl$confirm$1.getOutputMinFrameDuration = mutex;
                                phoneRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneRepositoryImpl$confirm$1);
                                phoneRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                phoneRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = 0;
                                phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = 0;
                                phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizes = 0;
                                phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = 0;
                                phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM = 1;
                                if (mutex.lock(null, phoneRepositoryImpl$confirm$1) != coroutine_suspended) {
                                    raise = defaultRaise5;
                                    phoneRepositoryImpl$confirm$12 = phoneRepositoryImpl$confirm$1;
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
                                int i7 = phoneRepositoryImpl$confirm$1.getInputFormats;
                                int i8 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges;
                                int i9 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizes;
                                int i10 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                                int i11 = phoneRepositoryImpl$confirm$1.Camera2StreamConfigurationMap;
                                int i12 = phoneRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                                raise2 = (arrow.core.raise.Raise) phoneRepositoryImpl$confirm$1.getOutputSizes;
                                mutex = (kotlinx.coroutines.sync.Mutex) phoneRepositoryImpl$confirm$1.getOutputMinFrameDuration;
                                raise3 = (arrow.core.raise.Raise) phoneRepositoryImpl$confirm$1.getInputSizeshNQ4ISI;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$confirm$1.getOutputFormats;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj)));
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
                            int i13 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges;
                            int i14 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizes;
                            int i15 = phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                            int i16 = phoneRepositoryImpl$confirm$1.Camera2StreamConfigurationMap;
                            int i17 = phoneRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1 phoneRepositoryImpl$confirm$13 = (com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1) phoneRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM;
                            kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) phoneRepositoryImpl$confirm$1.getOutputMinFrameDuration;
                            raise = (arrow.core.raise.Raise) phoneRepositoryImpl$confirm$1.getInputSizeshNQ4ISI;
                            defaultRaise3 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$confirm$1.getOutputFormats;
                            str2 = (java.lang.String) phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            i2 = i13;
                            mutex = mutex2;
                            phoneRepositoryImpl$confirm$12 = phoneRepositoryImpl$confirm$13;
                            i6 = i17;
                            i5 = i16;
                            i4 = i15;
                            i3 = i14;
                            defaultRaise4 = defaultRaise3;
                            com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService phoneService = this.getHighSpeedVideoSizes;
                            phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            phoneRepositoryImpl$confirm$1.getOutputFormats = defaultRaise4;
                            phoneRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = raise;
                            phoneRepositoryImpl$confirm$1.getOutputMinFrameDuration = mutex;
                            phoneRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneRepositoryImpl$confirm$12);
                            phoneRepositoryImpl$confirm$1.getOutputSizes = raise;
                            phoneRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                            phoneRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = i5;
                            phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = i4;
                            phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizes = i3;
                            phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = i2;
                            phoneRepositoryImpl$confirm$1.getInputFormats = 0;
                            phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM = 2;
                            obj = phoneService.mo16284confirmLcHNf2w(str2, phoneRepositoryImpl$confirm$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise2 = raise;
                            raise3 = raise2;
                            com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState confirmationState2 = (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState) raise3.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise2.bind((arrow.core.Either) obj)));
                            mutex.unlock(null);
                            defaultRaise4.complete();
                            return new arrow.core.Either.Right(confirmationState2);
                        }
                    }
                    com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService phoneService2 = this.getHighSpeedVideoSizes;
                    phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    phoneRepositoryImpl$confirm$1.getOutputFormats = defaultRaise4;
                    phoneRepositoryImpl$confirm$1.getInputSizeshNQ4ISI = raise;
                    phoneRepositoryImpl$confirm$1.getOutputMinFrameDuration = mutex;
                    phoneRepositoryImpl$confirm$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneRepositoryImpl$confirm$12);
                    phoneRepositoryImpl$confirm$1.getOutputSizes = raise;
                    phoneRepositoryImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                    phoneRepositoryImpl$confirm$1.Camera2StreamConfigurationMap = i5;
                    phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRangesFor = i4;
                    phoneRepositoryImpl$confirm$1.getHighSpeedVideoSizes = i3;
                    phoneRepositoryImpl$confirm$1.getHighSpeedVideoFpsRanges = i2;
                    phoneRepositoryImpl$confirm$1.getInputFormats = 0;
                    phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM = 2;
                    obj = phoneService2.mo16284confirmLcHNf2w(str2, phoneRepositoryImpl$confirm$1);
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
        phoneRepositoryImpl$confirm$1 = new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1(this, continuation);
        obj = phoneRepositoryImpl$confirm$1.getOutputStallDuration;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$confirm$1.getOutputStallDurationlomOqCM;
        defaultRaise = 1;
        defaultRaise2 = 1;
    }

    private final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse p0) {
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState.Initiated initiated;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (p0.getSuccess()) {
                int i = com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[p0.getStatus().ordinal()];
                if (i == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
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
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("Phone confirmation operation failed"));
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
