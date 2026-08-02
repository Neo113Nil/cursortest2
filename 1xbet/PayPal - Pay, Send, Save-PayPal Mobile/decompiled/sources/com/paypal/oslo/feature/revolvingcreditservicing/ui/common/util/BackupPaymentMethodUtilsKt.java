package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "accountType", "lastNChars", "buildBankAccountDetails", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BackupPaymentMethodUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String buildBankAccountDetails(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (str != null) {
            str3 = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
            if (str3 != null) {
                if (str3.length() > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.String valueOf = java.lang.String.valueOf(str3.charAt(0));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                    java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    sb.append((java.lang.Object) upperCase);
                    java.lang.String substring = str3.substring(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    sb.append(substring);
                    str3 = sb.toString();
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str3);
                sb2.append(" ••");
                sb2.append(str2);
                return sb2.toString();
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (str2 == null) {
        }
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
        sb22.append(str3);
        sb22.append(" ••");
        sb22.append(str2);
        return sb22.toString();
    }
}
