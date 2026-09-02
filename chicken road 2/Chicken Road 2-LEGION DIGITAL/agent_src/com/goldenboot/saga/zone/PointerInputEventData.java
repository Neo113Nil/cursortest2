package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0084\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b3\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b4\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b5\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b7\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010!R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b<\u0010\u001dR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b \u0010=\u001a\u0004\b>\u0010$R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b?\u0010\u0018R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b@\u0010\u0018¨\u0006A"}, d2 = {"Lcom/goldenboot/saga/zone/BridgePhase;", "", "Lcom/goldenboot/saga/zone/WatcherAnalyzer;", "id", "", "uptime", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "positionOnScreen", "position", "", "down", "", "pressure", "Lcom/goldenboot/saga/zone/ServerSnapshot;", "type", "activeHover", "", "Lcom/goldenboot/saga/zone/WatcherQueue;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "evictLayout", "()J", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "()Z", "updateTimer", "()F", "applyTask", "()I", "popBlueprint", "drawField", "()Ljava/util/List;", "growPayload", "injectMetric", "connectJob", "(JJJJZFIZLjava/util/List;JJ)Lcom/goldenboot/saga/zone/BridgePhase;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "connectPatch", "decodePath", "inflateAdapter", "resetDelta", "Z", "reduceScope", "F", "purgeNode", "I", "gatherAdapter", "serializeOffset", "Ljava/util/List;", "notifyMessage", "drawRequest", "attachConfig", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.BridgePhase, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class PointerInputEventData {
    public static final int connectJob = 8;

    /* renamed from: applyTask, reason: from kotlin metadata and from toString */
    private final List<HistoricalChange> historical;

    /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
    private final float pressure;

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final long position;

    /* renamed from: drawField, reason: from kotlin metadata and from toString */
    private final long originalEventPosition;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final long id;

    /* renamed from: flushSample, reason: from kotlin metadata and from toString */
    private final int type;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final long uptime;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* renamed from: popBlueprint, reason: from kotlin metadata and from toString */
    private final long scrollDelta;

    /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
    private final boolean down;

    /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
    private final boolean activeHover;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, j6);
    }

    public static /* synthetic */ PointerInputEventData peekRevision(PointerInputEventData pointerInputEventData, long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11 = (i2 & 1) != 0 ? pointerInputEventData.id : j;
        long j12 = (i2 & 2) != 0 ? pointerInputEventData.uptime : j2;
        long j13 = (i2 & 4) != 0 ? pointerInputEventData.positionOnScreen : j3;
        long j14 = (i2 & 8) != 0 ? pointerInputEventData.position : j4;
        boolean z3 = (i2 & 16) != 0 ? pointerInputEventData.down : z;
        float f2 = (i2 & 32) != 0 ? pointerInputEventData.pressure : f;
        int i3 = (i2 & 64) != 0 ? pointerInputEventData.type : i;
        boolean z4 = (i2 & ContentOperation.SpotShadowColor) != 0 ? pointerInputEventData.activeHover : z2;
        List list2 = (i2 & ContentOperation.RotationX) != 0 ? pointerInputEventData.historical : list;
        if ((i2 & ContentOperation.RotationY) != 0) {
            j7 = j11;
            j8 = pointerInputEventData.scrollDelta;
        } else {
            j7 = j11;
            j8 = j5;
        }
        if ((i2 & ContentOperation.RotationZ) != 0) {
            j10 = j8;
            j9 = pointerInputEventData.originalEventPosition;
        } else {
            j9 = j6;
            j10 = j8;
        }
        return pointerInputEventData.connectJob(j7, j12, j13, j14, z3, f2, i3, z4, list2, j10, j9);
    }

    /* renamed from: applyTask, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: attachConfig, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public final PointerInputEventData connectJob(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean activeHover, List<HistoricalChange> historical, long scrollDelta, long originalEventPosition) {
        return new PointerInputEventData(id, uptime, positionOnScreen, position, down, pressure, type, activeHover, historical, scrollDelta, originalEventPosition, null);
    }

    /* renamed from: connectPatch, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: decodePath, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    public final long detachStream() {
        return this.uptime;
    }

    public final List<HistoricalChange> drawField() {
        return this.historical;
    }

    /* renamed from: drawRequest, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return WatcherAnalyzer.detachStream(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && RuntimeHeap.connectJob(this.positionOnScreen, pointerInputEventData.positionOnScreen) && RuntimeHeap.connectJob(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && ServerSnapshot.applyTask(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && RuntimeHeap.connectJob(this.scrollDelta, pointerInputEventData.scrollDelta) && RuntimeHeap.connectJob(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final long evictLayout() {
        return this.id;
    }

    /* renamed from: flushSample, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    public final int gatherAdapter() {
        return this.type;
    }

    public final long growPayload() {
        return this.scrollDelta;
    }

    public int hashCode() {
        return (((((((((((((((((((WatcherAnalyzer.clipOrigin(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + RuntimeHeap.inflateAdapter(this.positionOnScreen)) * 31) + RuntimeHeap.inflateAdapter(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + ServerSnapshot.popBlueprint(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + RuntimeHeap.inflateAdapter(this.scrollDelta)) * 31) + RuntimeHeap.inflateAdapter(this.originalEventPosition);
    }

    /* renamed from: inflateAdapter, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    public final long injectMetric() {
        return this.originalEventPosition;
    }

    public final List<HistoricalChange> notifyMessage() {
        return this.historical;
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* renamed from: purgeNode, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public final boolean reduceScope() {
        return this.down;
    }

    public final long releaseHeader() {
        return this.positionOnScreen;
    }

    public final long resetDelta() {
        return this.position;
    }

    public final boolean serializeOffset() {
        return this.activeHover;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) WatcherAnalyzer.flushSample(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) RuntimeHeap.expandArgs(this.positionOnScreen)) + ", position=" + ((Object) RuntimeHeap.expandArgs(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) ServerSnapshot.drawField(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) RuntimeHeap.expandArgs(this.scrollDelta)) + ", originalEventPosition=" + ((Object) RuntimeHeap.expandArgs(this.originalEventPosition)) + ')';
    }

    public final float updateTimer() {
        return this.pressure;
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, long j6) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.originalEventPosition = j6;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, (i2 & ContentOperation.SpotShadowColor) != 0 ? false : z2, (i2 & ContentOperation.RotationX) != 0 ? new ArrayList() : list, (i2 & ContentOperation.RotationY) != 0 ? RuntimeHeap.INSTANCE.releaseHeader() : j5, (i2 & ContentOperation.RotationZ) != 0 ? RuntimeHeap.INSTANCE.releaseHeader() : j6, null);
    }
}
