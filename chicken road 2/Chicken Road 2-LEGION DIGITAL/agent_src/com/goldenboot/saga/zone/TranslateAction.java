package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/goldenboot/saga/zone/TranslateAction;", "", "", "value", "flushSample", "(I)I", "", "drawField", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "I", "growPayload", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TranslateAction {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int value;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int injectMetric = flushSample(1);
    private static final int detachStream = flushSample(2);
    private static final int releaseHeader = flushSample(3);
    private static final int clipOrigin = flushSample(4);
    private static final int flushSample = flushSample(5);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/TranslateAction$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/TranslateAction;", "Clip", "I", "evictLayout", "()I", "growPayload", "Ellipsis", "injectMetric", "detachStream", "Visible", "applyTask", "popBlueprint", "StartEllipsis", "flushSample", "updateTimer", "MiddleEllipsis", "releaseHeader", "clipOrigin", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.TranslateAction$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int applyTask() {
            return TranslateAction.releaseHeader;
        }

        public final int evictLayout() {
            return TranslateAction.injectMetric;
        }

        public final int flushSample() {
            return TranslateAction.clipOrigin;
        }

        public final int injectMetric() {
            return TranslateAction.detachStream;
        }

        public final int releaseHeader() {
            return TranslateAction.flushSample;
        }

        private Companion() {
        }

        public static /* synthetic */ void clipOrigin() {
        }

        public static /* synthetic */ void detachStream() {
        }

        public static /* synthetic */ void growPayload() {
        }

        public static /* synthetic */ void popBlueprint() {
        }

        public static /* synthetic */ void updateTimer() {
        }
    }

    private /* synthetic */ TranslateAction(int i) {
        this.value = i;
    }

    public static final boolean applyTask(int i, int i2) {
        return i == i2;
    }

    public static final /* synthetic */ TranslateAction clipOrigin(int i) {
        return new TranslateAction(i);
    }

    public static String drawField(int i) {
        return applyTask(i, injectMetric) ? "Clip" : applyTask(i, detachStream) ? "Ellipsis" : applyTask(i, flushSample) ? "MiddleEllipsis" : applyTask(i, releaseHeader) ? "Visible" : applyTask(i, clipOrigin) ? "StartEllipsis" : "Invalid";
    }

    public static int popBlueprint(int i) {
        return Integer.hashCode(i);
    }

    public static boolean updateTimer(int i, Object obj) {
        return (obj instanceof TranslateAction) && i == ((TranslateAction) obj).getValue();
    }

    /* renamed from: connectJob, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return updateTimer(this.value, other);
    }

    public int hashCode() {
        return popBlueprint(this.value);
    }

    public String toString() {
        return drawField(this.value);
    }

    public static int flushSample(int i) {
        return i;
    }
}
