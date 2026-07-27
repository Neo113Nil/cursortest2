package com.inmobi.media;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P1 {

    /* renamed from: a, reason: collision with root package name */
    public final B1 f6772a;
    public final LinkedHashMap b;
    public final Set c;
    public volatile Map d;

    public P1(B1 stateStore) {
        Intrinsics.checkNotNullParameter(stateStore, "stateStore");
        this.f6772a = stateStore;
        this.b = new LinkedHashMap();
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        this.c = newSetFromMap;
        this.d = MapsKt.emptyMap();
    }
}
