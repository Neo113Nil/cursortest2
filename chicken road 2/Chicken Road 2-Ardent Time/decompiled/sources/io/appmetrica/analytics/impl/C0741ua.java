package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741ua implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) obj).getValue();
        java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) obj2).getValue();
        int utf8BytesLength = io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength(str);
        int utf8BytesLength2 = io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength(str2);
        if (utf8BytesLength < utf8BytesLength2) {
            return -1;
        }
        return utf8BytesLength == utf8BytesLength2 ? 0 : 1;
    }
}
