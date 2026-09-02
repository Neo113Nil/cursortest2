package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ScrollHandler {
    public final String evictLayout;
    public final ScrollBuilder growPayload;

    public ScrollHandler(String name, ScrollBuilder argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.evictLayout = name;
        this.growPayload = argument;
    }

    public final String evictLayout() {
        return this.evictLayout;
    }

    public final ScrollBuilder growPayload() {
        return this.growPayload;
    }
}
