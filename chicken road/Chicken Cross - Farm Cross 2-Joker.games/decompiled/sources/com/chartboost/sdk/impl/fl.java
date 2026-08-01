package com.chartboost.sdk.impl;

import androidx.webkit.ProxyConfig;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class fl {
    public static final boolean a(String str, String str2, String str3) {
        return Intrinsics.areEqual(str, "about") || (str == null || str.length() == 0) || ((Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTP) || Intrinsics.areEqual(str, "https")) && (str2 == null || str2.length() == 0)) || (str3 != null && str3.length() != 0 && StringsKt.equals(str3, str2, true) && a(str3));
    }

    public static final boolean a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.areEqual(lowerCase, "chartboost.com") || StringsKt.endsWith$default(lowerCase, ".chartboost.com", false, 2, (Object) null);
    }
}
