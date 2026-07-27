package com.onesignal.otel.attributes;

import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelFieldsTopLevelKt {
    public static final <K, V> Map<K, V> putIfValueNotNull(Map<K, V> map, K k3, V v4) {
        i.e(map, "<this>");
        if (v4 != null) {
            map.put(k3, v4);
        }
        return map;
    }
}
