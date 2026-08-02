package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a7\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "map", "", "masks", "", "convertMapToFnv1aHash", "(Ljava/util/Map;[Ljava/lang/String;)J"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MapUtilsKt {
    public static final long convertMapToFnv1aHash(java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String[] strArr) {
        if (map != null) {
            return com.adobe.marketing.mobile.internal.util.MapExtensionsKt.fnv1a32(map, strArr);
        }
        return 0L;
    }
}
