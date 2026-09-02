package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/DimenGraph;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "attachConfig", "resetDelta", "inflateAdapter", "purgeNode", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DimenGraph {
    private static final /* synthetic */ DimenGraph[] drawRequest;
    private static final /* synthetic */ ItemProcessor gatherAdapter;
    public static final DimenGraph reduceScope = new DimenGraph("Paragraph", 0);
    public static final DimenGraph notifyMessage = new DimenGraph("Span", 1);
    public static final DimenGraph connectPatch = new DimenGraph("VerbatimTts", 2);
    public static final DimenGraph attachConfig = new DimenGraph("Url", 3);
    public static final DimenGraph resetDelta = new DimenGraph("Link", 4);
    public static final DimenGraph inflateAdapter = new DimenGraph("Clickable", 5);
    public static final DimenGraph purgeNode = new DimenGraph("String", 6);

    static {
        DimenGraph[] evictLayout = evictLayout();
        drawRequest = evictLayout;
        gatherAdapter = TranslateConductor.evictLayout(evictLayout);
    }

    private DimenGraph(String str, int i) {
    }

    private static final /* synthetic */ DimenGraph[] evictLayout() {
        return new DimenGraph[]{reduceScope, notifyMessage, connectPatch, attachConfig, resetDelta, inflateAdapter, purgeNode};
    }

    public static ItemProcessor releaseHeader() {
        return gatherAdapter;
    }

    public static DimenGraph valueOf(String str) {
        return (DimenGraph) Enum.valueOf(DimenGraph.class, str);
    }

    public static DimenGraph[] values() {
        return (DimenGraph[]) drawRequest.clone();
    }
}
