package com.paypal.oslo.feature.merchantbanking.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "isMaskOn", "isAccountComponent", "maskFirstFourDigits", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "", "indice", "formatWithSpacesInPlace", "(Ljava/lang/String;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtensionsKt {
    public static /* synthetic */ java.lang.String maskFirstFourDigits$default(java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return maskFirstFourDigits(str, z, z2);
    }

    public static final java.lang.String maskFirstFourDigits(java.lang.String str, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(str, " ", "", false, 4, (java.lang.Object) null);
        if (str.length() == 0 || replace$default.length() < 9) {
            return str;
        }
        if (z) {
            return com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Masking.BULLET_MASK_PREFIX.concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(replace$default, 4)));
        }
        if (z2) {
            return formatWithSpacesInPlace(replace$default, 4);
        }
        return formatWithSpacesInPlace(replace$default, 3);
    }

    public static final java.lang.String formatWithSpacesInPlace(java.lang.String str, int i) {
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0 || i <= 0 || kotlin.text.StringsKt.replace$default(str, " ", "", false, 4, (java.lang.Object) null).length() == 0) {
            return "";
        }
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(str, " ", "", false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(replace$default.length() + (replace$default.length() / i));
        int length = replace$default.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0 && i2 % i == 0) {
                sb.append(" ");
            }
            sb.append(replace$default.charAt(i2));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
