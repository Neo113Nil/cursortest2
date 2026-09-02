package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.StylusEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020 *\u00020 2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010-JV\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010(J\u001a\u00106\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b;\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b<\u0010(R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010:\u001a\u0004\b=\u0010(\"\u0004\b>\u0010?R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010:\u001a\u0004\b@\u0010(\"\u0004\bA\u0010?R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010B\u001a\u0004\bC\u0010-\"\u0004\bD\u0010ER\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010B\u001a\u0004\bF\u0010-\"\u0004\bG\u0010ER\u0011\u0010I\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bH\u0010(¨\u0006J"}, d2 = {"Lcom/goldenboot/saga/zone/FeatureThread;", "", "Lcom/goldenboot/saga/zone/StylusTrigger;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Lcom/goldenboot/saga/zone/StylusTrigger;IIIIFF)V", "injectConstraint", "(I)I", "expandArgs", "storeCharset", "findTask", "mergeLocale", "(F)F", "filterPayload", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "flattenPackage", "(J)J", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "gatherAdapter", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)Lcom/goldenboot/saga/zone/ChipSnapshot;", "syncScope", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "drawRequest", "(Lcom/goldenboot/saga/zone/ServiceFetcher;)Lcom/goldenboot/saga/zone/ServiceFetcher;", "Lcom/goldenboot/saga/zone/StylusEvent;", "", "treatZeroAsNull", "decodePath", "(JZ)J", "evictLayout", "()Lcom/goldenboot/saga/zone/StylusTrigger;", "growPayload", "()I", "injectMetric", "detachStream", "releaseHeader", "clipOrigin", "()F", "flushSample", "updateTimer", "(Lcom/goldenboot/saga/zone/StylusTrigger;IIIIFF)Lcom/goldenboot/saga/zone/FeatureThread;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/goldenboot/saga/zone/StylusTrigger;", "serializeOffset", "I", "reduceScope", "drawField", "notifyMessage", "inflateAdapter", "(I)V", "connectJob", "resetDelta", "F", "connectPatch", "purgeNode", "(F)V", "popBlueprint", "attachConfig", "peekRevision", "length", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.FeatureThread, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class ParagraphInfo {
    public static final int updateTimer = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
    private float top;

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private int startLineIndex;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final StylusTrigger paragraph;

    /* renamed from: flushSample, reason: from kotlin metadata and from toString */
    private float bottom;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int startIndex;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int endIndex;

    /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
    private int endLineIndex;

    public ParagraphInfo(StylusTrigger stylusTrigger, int i, int i2, int i3, int i4, float f, float f2) {
        this.paragraph = stylusTrigger;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public static /* synthetic */ ParagraphInfo applyTask(ParagraphInfo paragraphInfo, StylusTrigger stylusTrigger, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            stylusTrigger = paragraphInfo.paragraph;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.startIndex;
        }
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.endIndex;
        }
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.startLineIndex;
        }
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.endLineIndex;
        }
        if ((i5 & 32) != 0) {
            f = paragraphInfo.top;
        }
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.bottom;
        }
        float f3 = f;
        float f4 = f2;
        int i6 = i4;
        int i7 = i2;
        return paragraphInfo.updateTimer(stylusTrigger, i, i7, i3, i6, f3, f4);
    }

    public static /* synthetic */ long drawScope(ParagraphInfo paragraphInfo, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return paragraphInfo.decodePath(j, z);
    }

    public final void attachConfig(float f) {
        this.bottom = f;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: connectJob, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final float connectPatch() {
        return this.top;
    }

    public final long decodePath(long j, boolean z) {
        if (z) {
            StylusEvent.Companion companion = StylusEvent.INSTANCE;
            if (StylusEvent.flushSample(j, companion.evictLayout())) {
                return companion.evictLayout();
            }
        }
        return ContextDelta.growPayload(expandArgs(StylusEvent.serializeOffset(j)), expandArgs(StylusEvent.applyTask(j)));
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* renamed from: drawField, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ServiceFetcher drawRequest(ServiceFetcher serviceFetcher) {
        float f = this.top;
        serviceFetcher.resumeSignature(RuntimeHeap.flushSample((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
        return serviceFetcher;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final StylusTrigger getParagraph() {
        return this.paragraph;
    }

    public final int expandArgs(int i) {
        return i + this.startIndex;
    }

    public final float filterPayload(float f) {
        return f - this.top;
    }

    public final int findTask(int i) {
        return i + this.startLineIndex;
    }

    public final long flattenPackage(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - this.top;
        return RuntimeHeap.flushSample((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: flushSample, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final ChipSnapshot gatherAdapter(ChipSnapshot chipSnapshot) {
        float f = this.top;
        return chipSnapshot.startResource(RuntimeHeap.flushSample((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void inflateAdapter(int i) {
        this.startLineIndex = i;
    }

    public final int injectConstraint(int i) {
        return CellEntry.peekRevision(i, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int injectMetric() {
        return this.endIndex;
    }

    public final float mergeLocale(float f) {
        return f + this.top;
    }

    public final int notifyMessage() {
        return this.startLineIndex;
    }

    public final int peekRevision() {
        return this.endIndex - this.startIndex;
    }

    public final float popBlueprint() {
        return this.bottom;
    }

    public final void purgeNode(float f) {
        this.top = f;
    }

    public final int reduceScope() {
        return this.startIndex;
    }

    public final int releaseHeader() {
        return this.endLineIndex;
    }

    public final void resetDelta(int i) {
        this.endLineIndex = i;
    }

    public final StylusTrigger serializeOffset() {
        return this.paragraph;
    }

    public final int storeCharset(int i) {
        return i - this.startLineIndex;
    }

    public final ChipSnapshot syncScope(ChipSnapshot chipSnapshot) {
        float f = -this.top;
        return chipSnapshot.startResource(RuntimeHeap.flushSample((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public final ParagraphInfo updateTimer(StylusTrigger paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        return new ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
    }

    public /* synthetic */ ParagraphInfo(StylusTrigger stylusTrigger, int i, int i2, int i3, int i4, float f, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(stylusTrigger, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
