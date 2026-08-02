package com.paypal.oslo.feature.identity.phoneconfirmation.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/util/PhoneConfirmationErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Landroid/content/Context;", "context", "", "toDisplayMessage", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;Landroid/content/Context;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationErrorMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.util.PhoneConfirmationErrorMapper INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.util.PhoneConfirmationErrorMapper();

    private PhoneConfirmationErrorMapper() {
    }

    public final java.lang.String toDisplayMessage(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError, android.content.Context context) {
        int i;
        java.lang.String string;
        int i2;
        java.lang.String string2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!(phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api)) {
            if (!(phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation)) {
                if (!(phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business)) {
                    if (phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized) {
                        java.lang.String string3 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_unauthorized);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string3);
                        return string3;
                    }
                    if (phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) {
                        java.lang.String string4 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_server, java.lang.Integer.valueOf(((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) phoneConfirmationError).getStatusCode()));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string4);
                        return string4;
                    }
                    if (!(phoneConfirmationError instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.String message = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown) phoneConfirmationError).getMessage();
                    if (message != null) {
                        return message;
                    }
                    java.lang.String string5 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_unknown);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                    return string5;
                }
                com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business business = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business) phoneConfirmationError;
                if (business instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired) {
                    java.lang.String string6 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_code_expired);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string6);
                    return string6;
                }
                if (business instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) {
                    java.lang.Long retryAfter = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) business).getRetryAfter();
                    if (retryAfter != null) {
                        long longValue = retryAfter.longValue() / 1000;
                        if (longValue < 60) {
                            if (longValue == 1) {
                                i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_seconds_one;
                            } else {
                                i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_seconds_other;
                            }
                            string = context.getString(i2, java.lang.Integer.valueOf((int) longValue));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                        } else {
                            long j = longValue / 60;
                            if (j == 1) {
                                i = com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_minutes_one;
                            } else {
                                i = com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_minutes_other;
                            }
                            string = context.getString(i, java.lang.Integer.valueOf((int) j));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                        }
                        java.lang.String string7 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_too_many_attempts_with_retry, string);
                        if (string7 != null) {
                            return string7;
                        }
                    }
                    java.lang.String string8 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_too_many_attempts);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
                    return string8;
                }
                if (business instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked) {
                    java.lang.String string9 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_phone_blocked);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string9);
                    return string9;
                }
                if (!(business instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String string10 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_invalid_code);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string10);
                return string10;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation validation = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation) phoneConfirmationError;
            if (validation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) {
                java.lang.String string11 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_invalid_phone, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) validation).getReason());
                kotlin.jvm.internal.Intrinsics.checkNotNull(string11);
                return string11;
            }
            if (validation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) {
                java.lang.String string12 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_invalid_otp, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) validation).getExpected());
                kotlin.jvm.internal.Intrinsics.checkNotNull(string12);
                return string12;
            }
            if (!(validation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String string13 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_invalid_device);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string13);
            return string13;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.ApiError error = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) phoneConfirmationError).getError();
        if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) {
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError httpError = (com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) error;
            java.lang.String body = httpError.getBody();
            if (body == null || (string2 = kotlin.text.StringsKt.take(body, 100)) == null) {
                string2 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_unknown);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            }
            java.lang.String string14 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_api_http, java.lang.Integer.valueOf(httpError.getCode()), string2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string14);
            return string14;
        }
        if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError) {
            java.lang.String string15 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_network);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string15);
            return string15;
        }
        if (!(error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String string16 = context.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_confirmation_error_api_unknown);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string16);
        return string16;
    }
}
