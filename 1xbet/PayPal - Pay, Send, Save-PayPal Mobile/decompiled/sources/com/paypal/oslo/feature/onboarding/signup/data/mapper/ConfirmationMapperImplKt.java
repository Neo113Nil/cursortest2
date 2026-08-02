package com.paypal.oslo.feature.onboarding.signup.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "mapToResponse", "(Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;)Larrow/core/Either;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/OnboardingConfirmationStatus;", "status", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationStatus;", "mapConfirmationStatus", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmationMapperImplKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse> mapToResponse(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?> otpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpResponse, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse validationResponse = new com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse((com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus) defaultRaise.bind(mapConfirmationStatus(otpResponse.getStatus())), otpResponse.getSuccess());
            defaultRaise.complete();
            return new arrow.core.Either.Right(validationResponse);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus> mapConfirmationStatus(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus) {
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus confirmationStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingConfirmationStatus, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            int i = com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImplKt.WhenMappings.$EnumSwitchMapping$0[onboardingConfirmationStatus.ordinal()];
            if (i == 1) {
                confirmationStatus = com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.INITIATED;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Received unknown confirmation status: ");
                    sb.append(onboardingConfirmationStatus);
                    defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData(sb.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                confirmationStatus = com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.CONFIRMED;
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(confirmationStatus);
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
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus.INITIATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus.CONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
