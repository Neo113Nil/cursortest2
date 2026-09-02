package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/goldenboot/saga/zone/DimenNegotiator;", "", "Lcom/goldenboot/saga/zone/WidgetFacilitator;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Lcom/goldenboot/saga/zone/WidgetFacilitator;II)V", "evictLayout", "()Lcom/goldenboot/saga/zone/WidgetFacilitator;", "growPayload", "()I", "injectMetric", "detachStream", "(Lcom/goldenboot/saga/zone/WidgetFacilitator;II)Lcom/goldenboot/saga/zone/DimenNegotiator;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/goldenboot/saga/zone/WidgetFacilitator;", "flushSample", "I", "updateTimer", "clipOrigin", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.DimenNegotiator, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class ParagraphIntrinsicInfo {
    public static final int detachStream = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final WidgetFacilitator intrinsics;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int startIndex;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int endIndex;

    public ParagraphIntrinsicInfo(WidgetFacilitator widgetFacilitator, int i, int i2) {
        this.intrinsics = widgetFacilitator;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo releaseHeader(ParagraphIntrinsicInfo paragraphIntrinsicInfo, WidgetFacilitator widgetFacilitator, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            widgetFacilitator = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.detachStream(widgetFacilitator, i, i2);
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsicInfo detachStream(WidgetFacilitator intrinsics, int startIndex, int endIndex) {
        return new ParagraphIntrinsicInfo(intrinsics, startIndex, endIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) other;
        return Intrinsics.areEqual(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final WidgetFacilitator getIntrinsics() {
        return this.intrinsics;
    }

    public final WidgetFacilitator flushSample() {
        return this.intrinsics;
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex);
    }

    public final int injectMetric() {
        return this.endIndex;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }

    public final int updateTimer() {
        return this.startIndex;
    }
}
