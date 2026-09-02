package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/goldenboot/saga/zone/LayoutHeap;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutHeap {
    private static final /* synthetic */ LayoutHeap[] attachConfig;
    private static final /* synthetic */ ItemProcessor resetDelta;
    public static final LayoutHeap reduceScope = new LayoutHeap("Inherit", 0);
    public static final LayoutHeap notifyMessage = new LayoutHeap("SecureOn", 1);
    public static final LayoutHeap connectPatch = new LayoutHeap("SecureOff", 2);

    static {
        LayoutHeap[] evictLayout = evictLayout();
        attachConfig = evictLayout;
        resetDelta = TranslateConductor.evictLayout(evictLayout);
    }

    private LayoutHeap(String str, int i) {
    }

    private static final /* synthetic */ LayoutHeap[] evictLayout() {
        return new LayoutHeap[]{reduceScope, notifyMessage, connectPatch};
    }

    public static ItemProcessor releaseHeader() {
        return resetDelta;
    }

    public static LayoutHeap valueOf(String str) {
        return (LayoutHeap) Enum.valueOf(LayoutHeap.class, str);
    }

    public static LayoutHeap[] values() {
        return (LayoutHeap[]) attachConfig.clone();
    }
}
