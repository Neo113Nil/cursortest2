package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class c implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("BBSC", "Android");
        try {
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            str = java.lang.String.format(java.util.Locale.ENGLISH, "%04d-%02d-%02dT%02d:%02d:%02d.%03dZ", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), java.lang.Integer.valueOf(calendar.get(11)), java.lang.Integer.valueOf(calendar.get(12)), java.lang.Integer.valueOf(calendar.get(13)), java.lang.Integer.valueOf(calendar.get(14))}, 7));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        linkedHashMap.put("CLIENT_TIME", str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(com.iovation.deviceprint.lib.DevicePrint.R.string.ff_sdk_ver);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        linkedHashMap.put("SDKVER", string);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string2 = context.getString(com.iovation.deviceprint.lib.DevicePrint.R.string.ff_sdk_b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        linkedHashMap.put("SDKBN", string2);
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "c6c31d";
    }
}
