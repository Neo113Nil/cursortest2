package com.goldenboot.saga.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FlexProbe {
    public static final /* synthetic */ FlexProbe[] attachConfig;
    public static final /* synthetic */ ItemProcessor resetDelta;
    public static final FlexProbe reduceScope = new FlexProbe("WARNING", 0);
    public static final FlexProbe notifyMessage = new FlexProbe("ERROR", 1);
    public static final FlexProbe connectPatch = new FlexProbe("HIDDEN", 2);

    static {
        FlexProbe[] evictLayout = evictLayout();
        attachConfig = evictLayout;
        resetDelta = TranslateConductor.evictLayout(evictLayout);
    }

    public FlexProbe(String str, int i) {
    }

    public static final /* synthetic */ FlexProbe[] evictLayout() {
        return new FlexProbe[]{reduceScope, notifyMessage, connectPatch};
    }

    public static FlexProbe valueOf(String str) {
        return (FlexProbe) Enum.valueOf(FlexProbe.class, str);
    }

    public static FlexProbe[] values() {
        return (FlexProbe[]) attachConfig.clone();
    }
}
