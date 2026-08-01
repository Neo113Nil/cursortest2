package com.inmobi.media;

import android.os.Build;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Li {
    public static final Map a(Map map) {
        if (!Ki.f6675a) {
            return map == null ? MapsKt.emptyMap() : map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("X-Build-Id", Build.ID), TuplesKt.to("X-Android-Version", Build.VERSION.RELEASE), TuplesKt.to("X-Build-Model", Build.MODEL));
        String b = Ki.b();
        if (b != null) {
            if (StringsKt.isBlank(b)) {
                b = null;
            }
            if (b != null) {
                mutableMapOf.put("X-WebView-Version", b);
            }
        }
        for (Map.Entry entry : mutableMapOf.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, str2);
            }
        }
        return linkedHashMap;
    }

    public static final void a(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        if (Ki.f6675a) {
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("d-build-v", Build.ID), TuplesKt.to("os-v", Build.VERSION.RELEASE), TuplesKt.to("d-build-model", Build.MODEL));
            String b = Ki.b();
            if (b != null) {
                if (StringsKt.isBlank(b)) {
                    b = null;
                }
                if (b != null) {
                    mutableMapOf.put("d-wv-v", b);
                }
            }
            for (Map.Entry entry : mutableMapOf.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, str2);
                }
            }
        }
    }
}
