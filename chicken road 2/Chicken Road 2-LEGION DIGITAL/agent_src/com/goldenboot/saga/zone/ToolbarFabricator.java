package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ToolbarFabricator {
    public static final ArrayList evictLayout(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
