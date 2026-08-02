package com.paypal.oslo.core.i18n.data.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "region", "convertToISOCountryCode", "(Ljava/lang/String;)Ljava/lang/String;", "formatLocaleString", "Ljava/util/Locale;", "parseFormatLocale", "(Ljava/lang/String;)Ljava/util/Locale;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonUtilKt {
    public static final java.lang.String convertToISOCountryCode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = (java.lang.String) kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("C2", "CN"), kotlin.TuplesKt.to("UK", "GB")).get(str);
        return str2 == null ? str : str2;
    }

    public static final java.util.Locale parseFormatLocale(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
        int size = split$default.size();
        if (size == 1) {
            java.util.Locale build = new java.util.Locale.Builder().setLanguage((java.lang.String) split$default.get(0)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }
        if (size != 2) {
            if (size == 3) {
                java.util.Locale build2 = new java.util.Locale.Builder().setLanguage((java.lang.String) split$default.get(0)).setScript((java.lang.String) split$default.get(1)).setRegion((java.lang.String) split$default.get(2)).build();
                kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
                return build2;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Unexpected formatLocale format: ".concat(java.lang.String.valueOf(str)), null, null, null, 14, null);
            java.util.Locale build3 = new java.util.Locale.Builder().setLanguage((java.lang.String) split$default.get(0)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build3);
            return build3;
        }
        java.lang.String str2 = (java.lang.String) split$default.get(0);
        java.lang.String str3 = (java.lang.String) split$default.get(1);
        java.util.Locale.Builder language = new java.util.Locale.Builder().setLanguage(str2);
        if (new kotlin.text.Regex("[A-Z][a-z]{3}").matches(str3)) {
            language.setScript(str3);
        } else {
            language.setRegion(str3);
        }
        java.util.Locale build4 = language.build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build4);
        return build4;
    }
}
