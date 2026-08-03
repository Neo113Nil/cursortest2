package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Wc {
    public static final java.lang.String a(java.lang.String str, com.inmobi.media.Uc nativeBeaconModel, java.util.Map extraMacros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconModel, "nativeBeaconModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraMacros, "extraMacros");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "$TS", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false, 4, (java.lang.Object) null), "$LTS", java.lang.String.valueOf(nativeBeaconModel.f4995a.g), false, 4, (java.lang.Object) null), "$STS", java.lang.String.valueOf(nativeBeaconModel.f4995a.d), false, 4, (java.lang.Object) null);
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        java.lang.String replace$default2 = kotlin.text.StringsKt.replace$default(replace$default, "[CACHEBUSTING]", sb2, false, 4, (java.lang.Object) null);
        java.lang.String str2 = nativeBeaconModel.b;
        if (str2 != null) {
            replace$default2 = kotlin.text.StringsKt.replace$default(replace$default2, "[UNIVERSALADID]", str2, false, 4, (java.lang.Object) null);
        }
        java.lang.String str3 = replace$default2;
        java.lang.String str4 = nativeBeaconModel.c;
        if (str4 != null) {
            str3 = kotlin.text.StringsKt.replace$default(str3, "[ADSERVINGID]", str4, false, 4, (java.lang.Object) null);
        }
        java.lang.String str5 = str3;
        java.lang.String str6 = nativeBeaconModel.d;
        if (str6 != null) {
            str5 = kotlin.text.StringsKt.replace$default(str5, "[ASSETURI]", str6, false, 4, (java.lang.Object) null);
        }
        int i3 = nativeBeaconModel.e;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.util.Locale locale = java.util.Locale.US;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = i3;
        java.lang.String format = java.lang.String.format(locale, "%02d:%02d:%02d.%03d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(timeUnit.toHours(j)), java.lang.Long.valueOf(timeUnit.toMinutes(j) - java.util.concurrent.TimeUnit.HOURS.toMinutes(timeUnit.toHours(j))), java.lang.Long.valueOf(timeUnit.toSeconds(j) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j))), java.lang.Long.valueOf(j - (timeUnit.toSeconds(j) * 1000))}, 4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        java.lang.String replace$default3 = kotlin.text.StringsKt.replace$default(str5, "[CONTENTPLAYHEAD]", format, false, 4, (java.lang.Object) null);
        java.lang.String str7 = replace$default3;
        for (java.util.Map.Entry entry : extraMacros.entrySet()) {
            str7 = kotlin.text.StringsKt.replace$default(str7, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
        }
        return str7;
    }

    public static final boolean a(com.inmobi.media.C2313c0 c2313c0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2313c0, "<this>");
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return !((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getNative().getInteraction().getBlockBeaconsOnExpiry() || c2313c0.h <= 0 || java.lang.System.currentTimeMillis() < c2313c0.h;
    }
}
