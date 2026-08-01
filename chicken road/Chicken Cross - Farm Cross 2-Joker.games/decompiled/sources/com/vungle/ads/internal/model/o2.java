package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public enum o2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);

    public static final LinkedHashMap b;

    /* renamed from: a, reason: collision with root package name */
    public final int f12000a;

    static {
        o2[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (o2 o2Var : values) {
            linkedHashMap.put(Integer.valueOf(o2Var.f12000a), o2Var);
        }
        b = linkedHashMap;
    }

    o2(int i) {
        this.f12000a = i;
    }
}
