package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class u implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object systemService = context.getSystemService("keyguard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) systemService;
        boolean isDeviceSecure = keyguardManager.isDeviceSecure();
        boolean isKeyguardSecure = keyguardManager.isKeyguardSecure();
        linkedHashMap.put("TZ", java.util.TimeZone.getDefault().getID());
        linkedHashMap.put("LANG", java.util.Locale.getDefault().toString());
        linkedHashMap.put("CURR", java.util.Currency.getInstance(java.util.Locale.getDefault()).getCurrencyCode());
        if (isDeviceSecure) {
            linkedHashMap.put("DEVAUTH", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES);
            return linkedHashMap;
        }
        if (isKeyguardSecure) {
            linkedHashMap.put("DEVAUTHSIM", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES);
            linkedHashMap.put("DEVAUTH", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);
            return linkedHashMap;
        }
        linkedHashMap.put("DEVAUTH", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);
        linkedHashMap.put("DEVAUTHSIM", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "5f1fa4";
    }

    public static java.lang.String a(android.content.Context context, android.net.Uri uri) {
        try {
            android.media.Ringtone ringtone = android.media.RingtoneManager.getRingtone(context, uri);
            java.lang.String title = ringtone != null ? ringtone.getTitle(context) : null;
            if (title == null || kotlin.text.StringsKt.startsWith$default(title, "Default ringtone (", false, 2, (java.lang.Object) null)) {
                if (title != null) {
                    title = title.substring(18, title.length() - 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(title, "");
                } else {
                    title = null;
                }
            }
            if (ringtone != null) {
                ringtone.stop();
            }
            return title;
        } catch (java.lang.NullPointerException | java.lang.Exception unused) {
            return null;
        }
    }
}
