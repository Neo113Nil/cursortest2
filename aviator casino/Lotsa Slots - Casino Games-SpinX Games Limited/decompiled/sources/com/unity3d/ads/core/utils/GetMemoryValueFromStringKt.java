package com.unity3d.ads.core.utils;

/* compiled from: GetMemoryValueFromString.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getMemoryValueFromString", "", "memVal", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(java.lang.String str) {
        java.lang.Long longOrNull;
        if (str == null) {
            return -1L;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)").matcher(str);
        java.lang.String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str2)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
