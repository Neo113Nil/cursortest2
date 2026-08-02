package com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/domain/error/OtpErrorClassifier;", "", "<init>", "()V", "", "errorCode", "errorMessage", "", "isExpiredError", "(Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpErrorClassifier {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.error.OtpErrorClassifier INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.error.OtpErrorClassifier();

    private OtpErrorClassifier() {
    }

    public static /* synthetic */ boolean isExpiredError$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.error.OtpErrorClassifier otpErrorClassifier, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return otpErrorClassifier.isExpiredError(str, str2);
    }

    public final boolean isExpiredError(java.lang.String errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(errorCode, "EXPIRED") && (errorCode == null || !kotlin.text.StringsKt.contains((java.lang.CharSequence) errorCode, (java.lang.CharSequence) "EXPIRED", true))) {
            java.lang.String str = errorMessage;
            if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_EXPIRED, true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "timed out", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "no longer valid", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "session expired", true)) {
                return false;
            }
        }
        return true;
    }
}
