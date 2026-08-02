package com.amplitude.core.platform.intercept;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIdentifyInterceptStorageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentifyInterceptStorageHandler.kt\ncom/amplitude/core/platform/intercept/IdentifyInterceptorUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,53:1\n1855#2,2:54\n494#3,7:56\n*S KotlinDebug\n*F\n+ 1 IdentifyInterceptStorageHandler.kt\ncom/amplitude/core/platform/intercept/IdentifyInterceptorUtil\n*L\n41#1:54,2\n50#1:56,7\n*E\n"})
/* loaded from: classes3.dex */
public final class i {
    public static Map a(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }
}
