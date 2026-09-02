package com.goldenboot.saga.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class WavePage {
    public static final /* synthetic */ WavePage[] attachConfig;
    public static final /* synthetic */ ItemProcessor resetDelta;
    public static final WavePage reduceScope = new WavePage("INVARIANT", 0);
    public static final WavePage notifyMessage = new WavePage("IN", 1);
    public static final WavePage connectPatch = new WavePage("OUT", 2);

    static {
        WavePage[] evictLayout = evictLayout();
        attachConfig = evictLayout;
        resetDelta = TranslateConductor.evictLayout(evictLayout);
    }

    public WavePage(String str, int i) {
    }

    public static final /* synthetic */ WavePage[] evictLayout() {
        return new WavePage[]{reduceScope, notifyMessage, connectPatch};
    }

    public static WavePage valueOf(String str) {
        return (WavePage) Enum.valueOf(WavePage.class, str);
    }

    public static WavePage[] values() {
        return (WavePage[]) attachConfig.clone();
    }
}
