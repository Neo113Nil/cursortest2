package com.paypal.oslo.feature.packagetracking.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a'\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "countryCode", "locale", "appendUrlLocale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "withDeviceLocale", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UrlExtensionsKt {
    public static final java.lang.String appendUrlLocale(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '#', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default >= 0) {
            java.lang.String substring = str.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String substring2 = str.substring(indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            pair = kotlin.TuplesKt.to(substring, substring2);
        } else {
            pair = kotlin.TuplesKt.to(str, null);
        }
        java.lang.String str4 = (java.lang.String) pair.component1();
        java.lang.String str5 = (java.lang.String) pair.component2();
        java.lang.String str6 = com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, false, 2, (java.lang.Object) null)) {
            str6 = "&";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str4);
        sb.append(str6);
        sb.append("country.x=");
        sb.append(str2);
        sb.append("&locale.x=");
        sb.append(str3);
        if (str5 != null) {
            sb.append(str5);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final java.lang.String withDeviceLocale(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        return appendUrlLocale(str, locale.getCountry(), locale.toString());
    }
}
