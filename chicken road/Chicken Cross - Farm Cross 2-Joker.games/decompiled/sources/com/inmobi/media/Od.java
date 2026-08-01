package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Od {
    public static final String a(String str, Md nativeBeaconModel, Map extraMacros) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(nativeBeaconModel, "nativeBeaconModel");
        Intrinsics.checkNotNullParameter(extraMacros, "extraMacros");
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, (Object) null), "$LTS", String.valueOf(nativeBeaconModel.f6716a.g), false, 4, (Object) null), "$STS", String.valueOf(nativeBeaconModel.f6716a.d), false, 4, (Object) null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String replace$default2 = StringsKt.replace$default(replace$default, "[CACHEBUSTING]", sb2, false, 4, (Object) null);
        String str2 = nativeBeaconModel.b;
        if (str2 != null) {
            replace$default2 = StringsKt.replace$default(replace$default2, "[UNIVERSALADID]", str2, false, 4, (Object) null);
        }
        String str3 = replace$default2;
        String str4 = nativeBeaconModel.c;
        if (str4 != null) {
            str3 = StringsKt.replace$default(str3, "[ADSERVINGID]", str4, false, 4, (Object) null);
        }
        String str5 = str3;
        String str6 = nativeBeaconModel.d;
        if (str6 != null) {
            str5 = StringsKt.replace$default(str5, "[ASSETURI]", str6, false, 4, (Object) null);
        }
        int i3 = nativeBeaconModel.e;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i3;
        String format = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j))), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j))), Long.valueOf(j - (timeUnit.toSeconds(j) * 1000))}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String replace$default3 = StringsKt.replace$default(str5, "[CONTENTPLAYHEAD]", format, false, 4, (Object) null);
        String str7 = replace$default3;
        for (Map.Entry entry : extraMacros.entrySet()) {
            str7 = StringsKt.replace$default(str7, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
        }
        return str7;
    }

    public static final boolean a(C3639d0 c3639d0) {
        Intrinsics.checkNotNullParameter(c3639d0, "<this>");
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return !((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getNative().getInteraction().getBlockBeaconsOnExpiry() || c3639d0.h <= 0 || System.currentTimeMillis() < c3639d0.h;
    }
}
