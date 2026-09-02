package com.goldenboot.saga.zone;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class TooltipProbe extends TypographyShard {
    public static final Set clipOrigin(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : TypographyShard.injectMetric(set.iterator().next()) : releaseHeader();
    }

    public static Set releaseHeader() {
        return RegionExecutor.reduceScope;
    }
}
