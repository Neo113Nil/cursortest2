package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a5\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"", "", "", "prefix", "", "flattening", "([Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;", "", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ListExtensionsKt {
    public static /* synthetic */ java.util.Map flattening$default(java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return flattening(list, str);
    }

    public static final /* synthetic */ java.util.Map flattening(java.util.List list, java.lang.String str) {
        java.lang.String valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            if (str.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(i);
                valueOf = sb.toString();
            } else {
                valueOf = java.lang.String.valueOf(i);
            }
            if (obj instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj;
                if (com.adobe.marketing.mobile.internal.util.SetExtensionsKt.isAllString(map.keySet())) {
                    linkedHashMap.putAll(com.adobe.marketing.mobile.internal.util.MapExtensionsKt.flattening$default(map, valueOf, false, 2, null));
                    i++;
                }
            }
            if (obj instanceof java.util.List) {
                linkedHashMap.putAll(flattening((java.util.List) obj, valueOf));
            } else if (obj instanceof java.lang.Object[]) {
                linkedHashMap.putAll(flattening((java.lang.Object[]) obj, valueOf));
            } else {
                linkedHashMap.put(valueOf, obj);
            }
            i++;
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ java.util.Map flattening(java.lang.Object[] objArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return flattening(kotlin.collections.ArraysKt.toList(objArr), str);
    }

    public static /* synthetic */ java.util.Map flattening$default(java.lang.Object[] objArr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return flattening(objArr, str);
    }
}
