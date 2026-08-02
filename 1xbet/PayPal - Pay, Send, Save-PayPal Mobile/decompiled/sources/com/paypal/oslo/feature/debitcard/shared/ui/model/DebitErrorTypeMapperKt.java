package com.paypal.oslo.feature.debitcard.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "errorMessage", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "determineErrorType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorTypeMapperKt {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType determineErrorType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str2 = lowerCase;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "network", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "connection", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "customer service", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "contact", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE;
        }
        return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL;
    }
}
