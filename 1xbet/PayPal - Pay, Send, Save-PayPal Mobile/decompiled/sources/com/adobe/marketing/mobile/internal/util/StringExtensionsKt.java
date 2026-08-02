package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "fnv1a32", "(Ljava/lang/String;)J"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class StringExtensionsKt {
    public static final long fnv1a32(java.lang.String str) {
        int i = 0;
        if (str != null) {
            int i2 = kotlin.text.StringsKt.trim(str).toString().length() == 0 ? 0 : -2128831035;
            byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            int length = bytes.length;
            while (i < length) {
                i2 = (i2 ^ (bytes[i] & 255)) * 16777619;
                i++;
            }
            i = i2;
        }
        return kotlin.UInt.m23470constructorimpl(i) & 4294967295L;
    }
}
