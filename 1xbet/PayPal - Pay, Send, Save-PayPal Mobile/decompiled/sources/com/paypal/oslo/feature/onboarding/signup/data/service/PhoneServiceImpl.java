package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/service/PhoneServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;", "confirmationMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;)V", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "phone", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "signupCountryCode", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;", "phoneConfirmationDetails", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "initiate-AttygxE", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.ACTION, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirm", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneServiceImpl implements com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PhoneServiceImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl confirmationMapperImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationMapperImpl, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoSizes = confirmationMapperImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c0 A[Catch: all -> 0x01d7, RaiseCancellationException -> 0x01e0, TryCatch #2 {RaiseCancellationException -> 0x01e0, all -> 0x01d7, blocks: (B:11:0x004f, B:12:0x0120, B:17:0x012a, B:19:0x013a, B:21:0x0140, B:22:0x01a0, B:25:0x0157, B:26:0x0166, B:29:0x016b, B:31:0x0184, B:33:0x018a, B:34:0x01ab, B:35:0x01b9, B:36:0x01ba, B:37:0x01bf, B:38:0x01c0, B:39:0x01d6, B:43:0x0065), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService
    /* renamed from: initiate-AttygxE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16285initiateAttygxE(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails phoneConfirmationDetails, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$initiate$1 phoneServiceImpl$initiate$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.RequestOnboardingPhoneConfirmationCode requestOnboardingPhoneConfirmationCode;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$initiate$1) {
                phoneServiceImpl$initiate$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$initiate$1) continuation;
                if ((phoneServiceImpl$initiate$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    phoneServiceImpl$initiate$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = phoneServiceImpl$initiate$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = phoneServiceImpl$initiate$1.getOutputStallDurationlomOqCM;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.RequestOnboardingPhoneConfirmationCodeInput requestOnboardingPhoneConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.RequestOnboardingPhoneConfirmationCodeInput(new com.paypal.oslo.api.graphql.schema.type.PhoneInput(java.lang.String.valueOf(phone.m16398getInternationalDialingCodeWKAk_us()), phone.m16399getPhoneNumbervCycbc(), null, 4, null), str, phone.m16397getCountryCodeALGuh4w(), com.paypal.oslo.api.graphql.schema.type.OnboardingPhoneConfirmationType.valueOf(phoneConfirmationDetails.getPhoneConfirmationType().name()), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.OnboardingPhoneAutoFillType.valueOf(phoneConfirmationDetails.getPhoneAutoFillType().name())));
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation(requestOnboardingPhoneConfirmationCodeInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getPhoneConfirmationInitiate(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_phone_request_code", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, null);
                        phoneServiceImpl$initiate$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phone);
                        phoneServiceImpl$initiate$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneServiceImpl$initiate$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneConfirmationDetails);
                        phoneServiceImpl$initiate$1.getInputSizeshNQ4ISI = defaultRaise;
                        phoneServiceImpl$initiate$1.getOutputMinFrameDuration = defaultRaise2;
                        phoneServiceImpl$initiate$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestOnboardingPhoneConfirmationCodeInput);
                        phoneServiceImpl$initiate$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        phoneServiceImpl$initiate$1.Camera2StreamConfigurationMap = 0;
                        phoneServiceImpl$initiate$1.getHighSpeedVideoFpsRanges = 0;
                        phoneServiceImpl$initiate$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        phoneServiceImpl$initiate$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneServiceImpl$initiate$1.getOutputStallDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, phoneServiceImpl$initiate$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = phoneServiceImpl$initiate$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = phoneServiceImpl$initiate$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = phoneServiceImpl$initiate$1.getHighSpeedVideoFpsRanges;
                        int i4 = phoneServiceImpl$initiate$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) phoneServiceImpl$initiate$1.getOutputMinFrameDuration;
                        defaultRaise = (arrow.core.raise.DefaultRaise) phoneServiceImpl$initiate$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        requestOnboardingPhoneConfirmationCode = data != null ? data.getRequestOnboardingPhoneConfirmationCode() : null;
                        if (requestOnboardingPhoneConfirmationCode == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("initiate: No phone confirmation data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(requestOnboardingPhoneConfirmationCode))));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        requestOnboardingPhoneConfirmationCode = data2 != null ? data2.getRequestOnboardingPhoneConfirmationCode() : null;
                        if (requestOnboardingPhoneConfirmationCode == null) {
                            raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(requestOnboardingPhoneConfirmationCode))));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(validationResponse);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        phoneServiceImpl$initiate$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$initiate$1(this, continuation);
        java.lang.Object obj2 = phoneServiceImpl$initiate$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = phoneServiceImpl$initiate$1.getOutputStallDurationlomOqCM;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158 A[Catch: all -> 0x0044, RaiseCancellationException -> 0x0047, TryCatch #4 {RaiseCancellationException -> 0x0047, all -> 0x0044, blocks: (B:11:0x003f, B:12:0x00b8, B:17:0x00c2, B:19:0x00d2, B:21:0x00d8, B:22:0x0138, B:25:0x00ef, B:26:0x00fe, B:29:0x0103, B:31:0x011c, B:33:0x0122, B:34:0x0143, B:35:0x0151, B:36:0x0152, B:37:0x0157, B:38:0x0158, B:39:0x016e), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resend(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$resend$1 phoneServiceImpl$resend$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.ResendOnboardingPhoneConfirmationCode resendOnboardingPhoneConfirmationCode;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$resend$1) {
            phoneServiceImpl$resend$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$resend$1) continuation;
            if ((phoneServiceImpl$resend$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                phoneServiceImpl$resend$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = phoneServiceImpl$resend$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneServiceImpl$resend$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation()).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getPhoneConfirmationResend(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_phone_resend_code", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, null);
                        phoneServiceImpl$resend$1.getHighResolutionOutputSizeshNQ4ISI = defaultRaise2;
                        phoneServiceImpl$resend$1.getOutputMinFrameDuration = defaultRaise3;
                        phoneServiceImpl$resend$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        phoneServiceImpl$resend$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneServiceImpl$resend$1.getHighSpeedVideoFpsRanges = 0;
                        phoneServiceImpl$resend$1.getHighSpeedVideoSizes = 0;
                        phoneServiceImpl$resend$1.Camera2StreamConfigurationMap = 0;
                        phoneServiceImpl$resend$1.getInputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, phoneServiceImpl$resend$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise = defaultRaise2;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = phoneServiceImpl$resend$1.Camera2StreamConfigurationMap;
                    int i3 = phoneServiceImpl$resend$1.getHighSpeedVideoSizes;
                    int i4 = phoneServiceImpl$resend$1.getHighSpeedVideoFpsRanges;
                    int i5 = phoneServiceImpl$resend$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) phoneServiceImpl$resend$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) phoneServiceImpl$resend$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    resendOnboardingPhoneConfirmationCode = data != null ? data.getResendOnboardingPhoneConfirmationCode() : null;
                    if (resendOnboardingPhoneConfirmationCode == null) {
                        raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("resend: No phone confirmation data returned"));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(resendOnboardingPhoneConfirmationCode))));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                    com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                    resendOnboardingPhoneConfirmationCode = data2 != null ? data2.getResendOnboardingPhoneConfirmationCode() : null;
                    if (resendOnboardingPhoneConfirmationCode == null) {
                        raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError(callError));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(resendOnboardingPhoneConfirmationCode))));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(validationResponse);
            }
        }
        phoneServiceImpl$resend$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$resend$1(this, continuation);
        java.lang.Object obj2 = phoneServiceImpl$resend$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneServiceImpl$resend$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170 A[Catch: all -> 0x0187, RaiseCancellationException -> 0x0190, TryCatch #2 {RaiseCancellationException -> 0x0190, all -> 0x0187, blocks: (B:11:0x0047, B:12:0x00d0, B:17:0x00da, B:19:0x00ea, B:21:0x00f0, B:22:0x0150, B:25:0x0107, B:26:0x0116, B:29:0x011b, B:31:0x0134, B:33:0x013a, B:34:0x015b, B:35:0x0169, B:36:0x016a, B:37:0x016f, B:38:0x0170, B:39:0x0186, B:43:0x005d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService
    /* renamed from: confirm-LcHNf2w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16284confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$confirm$1 phoneServiceImpl$confirm$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.ConfirmOnboardingPhoneConfirmationCode confirmOnboardingPhoneConfirmationCode;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$confirm$1) {
                phoneServiceImpl$confirm$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$confirm$1) continuation;
                if ((phoneServiceImpl$confirm$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    phoneServiceImpl$confirm$1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj = phoneServiceImpl$confirm$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = phoneServiceImpl$confirm$1.getHighSpeedVideoSizesFor;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.ConfirmOnboardingPhoneConfirmationCodeInput confirmOnboardingPhoneConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmOnboardingPhoneConfirmationCodeInput(str);
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation(confirmOnboardingPhoneConfirmationCodeInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getPhoneConfirmationConfirm(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_phone_confirm_code", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, null);
                        phoneServiceImpl$confirm$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneServiceImpl$confirm$1.getInputSizeshNQ4ISI = defaultRaise;
                        phoneServiceImpl$confirm$1.getOutputFormats = defaultRaise2;
                        phoneServiceImpl$confirm$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmOnboardingPhoneConfirmationCodeInput);
                        phoneServiceImpl$confirm$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        phoneServiceImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        phoneServiceImpl$confirm$1.getHighSpeedVideoFpsRanges = 0;
                        phoneServiceImpl$confirm$1.Camera2StreamConfigurationMap = 0;
                        phoneServiceImpl$confirm$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneServiceImpl$confirm$1.getHighSpeedVideoSizesFor = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, phoneServiceImpl$confirm$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = phoneServiceImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = phoneServiceImpl$confirm$1.Camera2StreamConfigurationMap;
                        int i3 = phoneServiceImpl$confirm$1.getHighSpeedVideoFpsRanges;
                        int i4 = phoneServiceImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) phoneServiceImpl$confirm$1.getOutputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) phoneServiceImpl$confirm$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        confirmOnboardingPhoneConfirmationCode = data != null ? data.getConfirmOnboardingPhoneConfirmationCode() : null;
                        if (confirmOnboardingPhoneConfirmationCode == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("confirm: No confirmation data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(confirmOnboardingPhoneConfirmationCode))));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        confirmOnboardingPhoneConfirmationCode = data2 != null ? data2.getConfirmOnboardingPhoneConfirmationCode() : null;
                        if (confirmOnboardingPhoneConfirmationCode == null) {
                            raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighSpeedVideoSizes.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(confirmOnboardingPhoneConfirmationCode))));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(validationResponse);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        phoneServiceImpl$confirm$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$confirm$1(this, continuation);
        java.lang.Object obj2 = phoneServiceImpl$confirm$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = phoneServiceImpl$confirm$1.getHighSpeedVideoSizesFor;
    }
}
