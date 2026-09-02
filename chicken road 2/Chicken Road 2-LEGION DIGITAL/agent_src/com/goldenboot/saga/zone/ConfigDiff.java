package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ConfigDiff {
    public final int evictLayout;

    public /* synthetic */ ConfigDiff(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int evictLayout() {
        return this.evictLayout;
    }

    public ConfigDiff(int i) {
        this.evictLayout = i;
    }
}
