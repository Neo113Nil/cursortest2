package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/service/EmailServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;", "confirmationMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "initiate-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.ACTION, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "confirm", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailServiceImpl implements com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EmailServiceImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl confirmationMapperImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationMapperImpl, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = confirmationMapperImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0178 A[Catch: all -> 0x018f, RaiseCancellationException -> 0x0198, TryCatch #2 {RaiseCancellationException -> 0x0198, all -> 0x018f, blocks: (B:11:0x0047, B:12:0x00d8, B:17:0x00e2, B:19:0x00f2, B:21:0x00f8, B:22:0x0158, B:25:0x010f, B:26:0x011e, B:29:0x0123, B:31:0x013c, B:33:0x0142, B:34:0x0163, B:35:0x0171, B:36:0x0172, B:37:0x0177, B:38:0x0178, B:39:0x018e, B:43:0x005d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService
    /* renamed from: initiate-E4ilnuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16282initiateE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$initiate$1 emailServiceImpl$initiate$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$initiate$1) {
                emailServiceImpl$initiate$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$initiate$1) continuation;
                if ((emailServiceImpl$initiate$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    emailServiceImpl$initiate$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj = emailServiceImpl$initiate$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = emailServiceImpl$initiate$1.getOutputMinFrameDuration;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput requestOnboardingEmailConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str));
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation(requestOnboardingEmailConfirmationCodeInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getEmailConfirmationInitiate(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_email_verification", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        emailServiceImpl$initiate$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailServiceImpl$initiate$1.getOutputFormats = defaultRaise;
                        emailServiceImpl$initiate$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        emailServiceImpl$initiate$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestOnboardingEmailConfirmationCodeInput);
                        emailServiceImpl$initiate$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        emailServiceImpl$initiate$1.getHighSpeedVideoSizes = 0;
                        emailServiceImpl$initiate$1.Camera2StreamConfigurationMap = 0;
                        emailServiceImpl$initiate$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailServiceImpl$initiate$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailServiceImpl$initiate$1.getOutputMinFrameDuration = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, emailServiceImpl$initiate$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = emailServiceImpl$initiate$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = emailServiceImpl$initiate$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = emailServiceImpl$initiate$1.Camera2StreamConfigurationMap;
                        int i4 = emailServiceImpl$initiate$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) emailServiceImpl$initiate$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) emailServiceImpl$initiate$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode = data != null ? data.getRequestOnboardingEmailConfirmationCode() : null;
                        if (requestOnboardingEmailConfirmationCode == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("initiate: No email confirmation data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(requestOnboardingEmailConfirmationCode))));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        r6 = data2 != null ? data2.getRequestOnboardingEmailConfirmationCode() : 0;
                        if (r6 == 0) {
                            raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(r6))));
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
        emailServiceImpl$initiate$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$initiate$1(this, continuation);
        java.lang.Object obj2 = emailServiceImpl$initiate$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = emailServiceImpl$initiate$1.getOutputMinFrameDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158 A[Catch: all -> 0x0044, RaiseCancellationException -> 0x0047, TryCatch #4 {RaiseCancellationException -> 0x0047, all -> 0x0044, blocks: (B:11:0x003f, B:12:0x00b8, B:17:0x00c2, B:19:0x00d2, B:21:0x00d8, B:22:0x0138, B:25:0x00ef, B:26:0x00fe, B:29:0x0103, B:31:0x011c, B:33:0x0122, B:34:0x0143, B:35:0x0151, B:36:0x0152, B:37:0x0157, B:38:0x0158, B:39:0x016e), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resend(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$resend$1 emailServiceImpl$resend$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$resend$1) {
            emailServiceImpl$resend$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$resend$1) continuation;
            if ((emailServiceImpl$resend$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                emailServiceImpl$resend$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = emailServiceImpl$resend$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailServiceImpl$resend$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation()).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getEmailConfirmationResend(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_email_verification", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        emailServiceImpl$resend$1.getHighSpeedVideoSizes = defaultRaise2;
                        emailServiceImpl$resend$1.getOutputMinFrameDuration = defaultRaise3;
                        emailServiceImpl$resend$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        emailServiceImpl$resend$1.getHighSpeedVideoFpsRanges = 0;
                        emailServiceImpl$resend$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailServiceImpl$resend$1.Camera2StreamConfigurationMap = 0;
                        emailServiceImpl$resend$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailServiceImpl$resend$1.getOutputFormats = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, emailServiceImpl$resend$1);
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
                    int i2 = emailServiceImpl$resend$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = emailServiceImpl$resend$1.Camera2StreamConfigurationMap;
                    int i4 = emailServiceImpl$resend$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = emailServiceImpl$resend$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) emailServiceImpl$resend$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailServiceImpl$resend$1.getHighSpeedVideoSizes;
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
                    raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode = data != null ? data.getResendOnboardingEmailConfirmationCode() : null;
                    if (resendOnboardingEmailConfirmationCode == null) {
                        raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("resend: No email confirmation data returned"));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(resendOnboardingEmailConfirmationCode))));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                    com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                    r6 = data2 != null ? data2.getResendOnboardingEmailConfirmationCode() : 0;
                    if (r6 == 0) {
                        raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError(callError));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(r6))));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(validationResponse);
            }
        }
        emailServiceImpl$resend$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$resend$1(this, continuation);
        java.lang.Object obj2 = emailServiceImpl$resend$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailServiceImpl$resend$1.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170 A[Catch: all -> 0x0187, RaiseCancellationException -> 0x0190, TryCatch #2 {RaiseCancellationException -> 0x0190, all -> 0x0187, blocks: (B:11:0x0047, B:12:0x00d0, B:17:0x00da, B:19:0x00ea, B:21:0x00f0, B:22:0x0150, B:25:0x0107, B:26:0x0116, B:29:0x011b, B:31:0x0134, B:33:0x013a, B:34:0x015b, B:35:0x0169, B:36:0x016a, B:37:0x016f, B:38:0x0170, B:39:0x0186, B:43:0x005d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService
    /* renamed from: confirm-LcHNf2w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16281confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$confirm$1 emailServiceImpl$confirm$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$confirm$1) {
                emailServiceImpl$confirm$1 = (com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$confirm$1) continuation;
                if ((emailServiceImpl$confirm$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    emailServiceImpl$confirm$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = emailServiceImpl$confirm$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = emailServiceImpl$confirm$1.getInputSizeshNQ4ISI;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.ConfirmOnboardingEmailConfirmationCodeInput confirmOnboardingEmailConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmOnboardingEmailConfirmationCodeInput(str);
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation(confirmOnboardingEmailConfirmationCodeInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding.INSTANCE.getEmailConfirmationConfirm(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_email_verification", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        emailServiceImpl$confirm$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailServiceImpl$confirm$1.getOutputFormats = defaultRaise;
                        emailServiceImpl$confirm$1.getInputFormats = defaultRaise2;
                        emailServiceImpl$confirm$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmOnboardingEmailConfirmationCodeInput);
                        emailServiceImpl$confirm$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        emailServiceImpl$confirm$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailServiceImpl$confirm$1.getHighSpeedVideoSizes = 0;
                        emailServiceImpl$confirm$1.getHighSpeedVideoFpsRanges = 0;
                        emailServiceImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailServiceImpl$confirm$1.getInputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, emailServiceImpl$confirm$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = emailServiceImpl$confirm$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = emailServiceImpl$confirm$1.getHighSpeedVideoFpsRanges;
                        int i3 = emailServiceImpl$confirm$1.getHighSpeedVideoSizes;
                        int i4 = emailServiceImpl$confirm$1.getHighSpeedVideoFpsRangesFor;
                        raise = (arrow.core.raise.Raise) emailServiceImpl$confirm$1.getInputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) emailServiceImpl$confirm$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.ConfirmOnboardingEmailConfirmationCode confirmOnboardingEmailConfirmationCode = data != null ? data.getConfirmOnboardingEmailConfirmationCode() : null;
                        if (confirmOnboardingEmailConfirmationCode == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("confirm: No confirmation data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(confirmOnboardingEmailConfirmationCode))));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        r6 = data2 != null ? data2.getConfirmOnboardingEmailConfirmationCode() : 0;
                        if (r6 == 0) {
                            raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        validationResponse = (com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse((com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>) raise.bind(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponseKt.asOtpResponse(r6))));
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
        emailServiceImpl$confirm$1 = new com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$confirm$1(this, continuation);
        java.lang.Object obj2 = emailServiceImpl$confirm$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = emailServiceImpl$confirm$1.getInputSizeshNQ4ISI;
    }
}
