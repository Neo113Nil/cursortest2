package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\b\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\b"}, d2 = {"", "isLoadingBankDetails", "", "bankName", "shouldShowBankInfoCard", "(ZLjava/lang/String;)Z", "regex", "shouldFilterToNumericOnly", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "maximumLength", "filterInputValue", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", "fieldName", "isFieldNameAccountNumber", "isFieldNameIssuerName", "isFieldNameBeneficiaryNameAsInIssuer"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankManualInfoScreenHelpersKt {
    public static final boolean shouldShowBankInfoCard(boolean z, java.lang.String str) {
        return z || str != null;
    }

    public static final boolean shouldFilterToNumericOnly(java.lang.String str) {
        return str != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\\d", false, 2, (java.lang.Object) null);
    }

    public static final java.lang.String filterInputValue(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > i || !shouldFilterToNumericOnly(str2)) {
            return str;
        }
        java.lang.String str3 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str3.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final boolean isFieldNameAccountNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.equals(str, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, true);
    }

    public static final boolean isFieldNameIssuerName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.equals(str, "issuerName", true);
    }

    public static final boolean isFieldNameBeneficiaryNameAsInIssuer(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.equals(str, "Beneficiary Name As In Issuer", true) || kotlin.text.StringsKt.equals(str, "beneficiaryNameAsInIssuer", true);
    }
}
