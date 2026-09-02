package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/goldenboot/saga/zone/FooterNormalizer;", "", "", "value", "growPayload", "(I)I", "", "clipOrigin", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "I", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FooterNormalizer {

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int value;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010\"\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\t¨\u0006#"}, d2 = {"Lcom/goldenboot/saga/zone/FooterNormalizer$ActivityMutator;", "", "<init>", "()V", "", "Lcom/goldenboot/saga/zone/FooterNormalizer;", "serializeOffset", "()Ljava/util/List;", "evictLayout", "()I", "Confirm", "growPayload", "ContextClick", "injectMetric", "GestureEnd", "detachStream", "GestureThresholdActivate", "releaseHeader", "KeyboardTap", "clipOrigin", "LongPress", "flushSample", "Reject", "updateTimer", "SegmentFrequentTick", "applyTask", "SegmentTick", "popBlueprint", "TextHandleMove", "drawField", "ToggleOff", "connectJob", "ToggleOn", "peekRevision", "VirtualKey", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.FooterNormalizer$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int applyTask() {
            return SectionNode.evictLayout.applyTask();
        }

        public final int clipOrigin() {
            return SectionNode.evictLayout.clipOrigin();
        }

        public final int connectJob() {
            return SectionNode.evictLayout.connectJob();
        }

        public final int detachStream() {
            return SectionNode.evictLayout.detachStream();
        }

        public final int drawField() {
            return SectionNode.evictLayout.drawField();
        }

        public final int evictLayout() {
            return SectionNode.evictLayout.evictLayout();
        }

        public final int flushSample() {
            return SectionNode.evictLayout.flushSample();
        }

        public final int growPayload() {
            return SectionNode.evictLayout.growPayload();
        }

        public final int injectMetric() {
            return SectionNode.evictLayout.injectMetric();
        }

        public final int peekRevision() {
            return SectionNode.evictLayout.peekRevision();
        }

        public final int popBlueprint() {
            return SectionNode.evictLayout.popBlueprint();
        }

        public final int releaseHeader() {
            return SectionNode.evictLayout.releaseHeader();
        }

        public final List<FooterNormalizer> serializeOffset() {
            return CursorBuilder.notifyMessage(FooterNormalizer.evictLayout(evictLayout()), FooterNormalizer.evictLayout(growPayload()), FooterNormalizer.evictLayout(injectMetric()), FooterNormalizer.evictLayout(detachStream()), FooterNormalizer.evictLayout(releaseHeader()), FooterNormalizer.evictLayout(clipOrigin()), FooterNormalizer.evictLayout(flushSample()), FooterNormalizer.evictLayout(updateTimer()), FooterNormalizer.evictLayout(applyTask()), FooterNormalizer.evictLayout(popBlueprint()), FooterNormalizer.evictLayout(drawField()), FooterNormalizer.evictLayout(connectJob()), FooterNormalizer.evictLayout(peekRevision()));
        }

        public final int updateTimer() {
            return SectionNode.evictLayout.updateTimer();
        }

        private Companion() {
        }
    }

    private /* synthetic */ FooterNormalizer(int i) {
        this.value = i;
    }

    public static String clipOrigin(int i) {
        Companion companion = INSTANCE;
        return detachStream(i, companion.evictLayout()) ? "Confirm" : detachStream(i, companion.growPayload()) ? "ContextClick" : detachStream(i, companion.injectMetric()) ? "GestureEnd" : detachStream(i, companion.detachStream()) ? "GestureThresholdActivate" : detachStream(i, companion.releaseHeader()) ? "KeyboardTap" : detachStream(i, companion.clipOrigin()) ? "LongPress" : detachStream(i, companion.flushSample()) ? "Reject" : detachStream(i, companion.updateTimer()) ? "SegmentFrequentTick" : detachStream(i, companion.applyTask()) ? "SegmentTick" : detachStream(i, companion.popBlueprint()) ? "TextHandleMove" : detachStream(i, companion.drawField()) ? "ToggleOff" : detachStream(i, companion.connectJob()) ? "ToggleOn" : detachStream(i, companion.peekRevision()) ? "VirtualKey" : "Invalid";
    }

    public static final boolean detachStream(int i, int i2) {
        return i == i2;
    }

    public static final /* synthetic */ FooterNormalizer evictLayout(int i) {
        return new FooterNormalizer(i);
    }

    public static boolean injectMetric(int i, Object obj) {
        return (obj instanceof FooterNormalizer) && i == ((FooterNormalizer) obj).getValue();
    }

    public static int releaseHeader(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return injectMetric(this.value, other);
    }

    /* renamed from: flushSample, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return releaseHeader(this.value);
    }

    public String toString() {
        return clipOrigin(this.value);
    }

    public static int growPayload(int i) {
        return i;
    }
}
