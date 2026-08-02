package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "formatFullName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NameFormattingKt {
    public static final java.lang.String formatFullName(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = str;
        if ((str4 == null || str4.length() == 0) && ((str3 = str2) == null || str3.length() == 0)) {
            return null;
        }
        if (str4 == null || str4.length() == 0) {
            return str2;
        }
        java.lang.String str5 = str2;
        if (str5 == null || str5.length() == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }
}
