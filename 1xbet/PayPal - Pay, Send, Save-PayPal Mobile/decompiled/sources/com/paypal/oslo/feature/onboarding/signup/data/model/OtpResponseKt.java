package com.paypal.oslo.feature.onboarding.signup.data.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0005\u0010\t\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\nj\u0002`\u000b¢\u0006\u0004\b\u0005\u0010\f\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0005\u0010\u000f\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0005\u0010\u0012\u001a%\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002*\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0005\u0010\u0015*\f\b\u0000\u0010\u0016\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0017\"\u00020\u00072\u00020\u0007*\f\b\u0000\u0010\u0018\"\u00020\n2\u00020\n*\f\b\u0000\u0010\u0019\"\u00020\r2\u00020\r*\f\b\u0000\u0010\u001a\"\u00020\u00102\u00020\u0010*\f\b\u0000\u0010\u001b\"\u00020\u00132\u00020\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingPhoneConfirmationCodeMutation$RequestOnboardingPhoneConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/RequestPhoneResponse;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "asOtpResponse", "(Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingPhoneConfirmationCodeMutation$RequestOnboardingPhoneConfirmationCode;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingPhoneConfirmationCodeMutation$ResendOnboardingPhoneConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/ResendPhoneResponse;", "(Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingPhoneConfirmationCodeMutation$ResendOnboardingPhoneConfirmationCode;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/graphql/ConfirmOnboardingPhoneConfirmationCodeMutation$ConfirmOnboardingPhoneConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/ConfirmPhoneResponse;", "(Lcom/paypal/oslo/feature/onboarding/graphql/ConfirmOnboardingPhoneConfirmationCodeMutation$ConfirmOnboardingPhoneConfirmationCode;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/RequestEmailResponse;", "(Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/ResendEmailResponse;", "(Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/graphql/ConfirmOnboardingEmailConfirmationCodeMutation$ConfirmOnboardingEmailConfirmationCode;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/ConfirmEmailResponse;", "(Lcom/paypal/oslo/feature/onboarding/graphql/ConfirmOnboardingEmailConfirmationCodeMutation$ConfirmOnboardingEmailConfirmationCode;)Larrow/core/Either;", "RequestPhoneResponse", "ResendPhoneResponse", "ConfirmPhoneResponse", "RequestEmailResponse", "ResendEmailResponse", "ConfirmEmailResponse"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtpResponseKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingPhoneConfirmationCodeMutation.RequestOnboardingPhoneConfirmationCode requestOnboardingPhoneConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnboardingPhoneConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (requestOnboardingPhoneConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request request = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request(requestOnboardingPhoneConfirmationCode.getStatus(), requestOnboardingPhoneConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(request);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("RequestOnboardingPhoneConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingPhoneConfirmationCodeMutation.ResendOnboardingPhoneConfirmationCode resendOnboardingPhoneConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resendOnboardingPhoneConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (resendOnboardingPhoneConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend resend = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend(resendOnboardingPhoneConfirmationCode.getStatus(), resendOnboardingPhoneConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(resend);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("ResendOnboardingPhoneConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingPhoneConfirmationCodeMutation.ConfirmOnboardingPhoneConfirmationCode confirmOnboardingPhoneConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmOnboardingPhoneConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (confirmOnboardingPhoneConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm confirm = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm(confirmOnboardingPhoneConfirmationCode.getStatus(), confirmOnboardingPhoneConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(confirm);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("ConfirmOnboardingPhoneConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnboardingEmailConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (requestOnboardingEmailConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request request = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request(requestOnboardingEmailConfirmationCode.getStatus(), requestOnboardingEmailConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(request);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("RequestOnboardingEmailConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resendOnboardingEmailConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (resendOnboardingEmailConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend resend = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend(resendOnboardingEmailConfirmationCode.getStatus(), resendOnboardingEmailConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(resend);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("ResendOnboardingEmailConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>> asOtpResponse(com.paypal.oslo.feature.onboarding.graphql.ConfirmOnboardingEmailConfirmationCodeMutation.ConfirmOnboardingEmailConfirmationCode confirmOnboardingEmailConfirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmOnboardingEmailConfirmationCode, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (confirmOnboardingEmailConfirmationCode.getStatus() != null) {
                com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm confirm = new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm(confirmOnboardingEmailConfirmationCode.getStatus(), confirmOnboardingEmailConfirmationCode.getSuccess());
                defaultRaise.complete();
                return new arrow.core.Either.Right(confirm);
            }
            defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData("ConfirmOnboardingEmailConfirmationCode response has null status"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
