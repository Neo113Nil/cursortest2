package com.paypal.oslo.downloads.impl.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "extractBaseMimeType", "(Ljava/lang/String;)Ljava/lang/String;", "actual", "expected", "", "mimeTypesMatch", "(Ljava/lang/String;Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MimeTypeUtilsKt {
    public static final java.lang.String extractBaseMimeType(java.lang.String str) {
        java.lang.String substringBefore$default;
        java.lang.String obj;
        if (str == null || (substringBefore$default = kotlin.text.StringsKt.substringBefore$default(str, ';', (java.lang.String) null, 2, (java.lang.Object) null)) == null || (obj = kotlin.text.StringsKt.trim(substringBefore$default).toString()) == null || obj.length() <= 0) {
            return null;
        }
        return obj;
    }

    public static final boolean mimeTypesMatch(java.lang.String str, java.lang.String str2) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String extractBaseMimeType = extractBaseMimeType(str);
        java.lang.String extractBaseMimeType2 = extractBaseMimeType(str2);
        if (extractBaseMimeType == null || extractBaseMimeType2 == null) {
            return false;
        }
        boolean equals = kotlin.text.StringsKt.equals(extractBaseMimeType, extractBaseMimeType2, true);
        if (kotlin.text.StringsKt.endsWith$default(extractBaseMimeType2, "/*", false, 2, (java.lang.Object) null)) {
            java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(extractBaseMimeType2, "/*", (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) extractBaseMimeType, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 2, 2, (java.lang.Object) null);
            if (split$default.size() == 2 && kotlin.text.StringsKt.equals((java.lang.String) split$default.get(0), substringBefore$default, true) && ((java.lang.CharSequence) split$default.get(1)).length() > 0) {
                z = true;
                return !equals || z;
            }
        }
        z = false;
        if (equals) {
        }
    }
}
