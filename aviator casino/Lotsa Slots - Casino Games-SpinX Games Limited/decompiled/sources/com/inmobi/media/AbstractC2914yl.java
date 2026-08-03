package com.inmobi.media;

/* renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2914yl {
    public static final com.inmobi.media.D5 a(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() != 2 ? new com.inmobi.media.D5(0, 0) : new com.inmobi.media.D5(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
    }

    public static final java.lang.String a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return java.net.URLEncoder.encode(url, java.nio.charset.Charset.defaultCharset());
        }
        return java.net.URLEncoder.encode(url);
    }
}
