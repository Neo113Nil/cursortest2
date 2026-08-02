package com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/model/MastercardConnectError;", "", "toDisplayMessage", "(Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/model/MastercardConnectError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MastercardConnectErrorKt {
    public static final java.lang.String toDisplayMessage(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError mastercardConnectError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mastercardConnectError, "");
        if (mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.SdkInitialization) {
            return "Failed to launch bank connection. Please try again.";
        }
        if (mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.UserCancelled) {
            return "Connection cancelled.";
        }
        if (mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.ConnectionFailed) {
            java.lang.String message = ((com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.ConnectionFailed) mastercardConnectError).getMessage();
            if (message.length() == 0) {
                message = "Bank connection failed. Please try again.";
            }
            return message;
        }
        if (mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Timeout) {
            return "Connection timed out. Please try again.";
        }
        if (mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Network) {
            return "Network error. Please check your connection and try again.";
        }
        if (!(mastercardConnectError instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message2 = ((com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Unknown) mastercardConnectError).getMessage();
        if (message2.length() == 0) {
            message2 = "An unexpected error occurred. Please try again.";
        }
        return message2;
    }
}
