package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/goldenboot/saga/zone/ProgressLock;", "", "", "value", "connectJob", "(I)I", "", "notifyMessage", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "I", "growPayload", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressLock {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int value;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int injectMetric = connectJob(0);
    private static final int detachStream = connectJob(1);
    private static final int releaseHeader = connectJob(2);
    private static final int clipOrigin = connectJob(3);
    private static final int flushSample = connectJob(4);
    private static final int updateTimer = connectJob(5);
    private static final int applyTask = connectJob(6);
    private static final int popBlueprint = connectJob(7);
    private static final int drawField = connectJob(8);
    private static final int connectJob = connectJob(9);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006%"}, d2 = {"Lcom/goldenboot/saga/zone/ProgressLock$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/ProgressLock;", "Unspecified", "I", "connectPatch", "()I", "attachConfig", "Text", "reduceScope", "notifyMessage", "Ascii", "evictLayout", "growPayload", "Number", "flushSample", "updateTimer", "Phone", "peekRevision", "serializeOffset", "Uri", "resetDelta", "inflateAdapter", "Email", "releaseHeader", "clipOrigin", "Password", "drawField", "connectJob", "NumberPassword", "applyTask", "popBlueprint", "Decimal", "injectMetric", "detachStream", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ProgressLock$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int applyTask() {
            return ProgressLock.drawField;
        }

        public final int connectPatch() {
            return ProgressLock.injectMetric;
        }

        public final int drawField() {
            return ProgressLock.popBlueprint;
        }

        public final int evictLayout() {
            return ProgressLock.releaseHeader;
        }

        public final int flushSample() {
            return ProgressLock.clipOrigin;
        }

        public final int injectMetric() {
            return ProgressLock.connectJob;
        }

        public final int peekRevision() {
            return ProgressLock.flushSample;
        }

        public final int reduceScope() {
            return ProgressLock.detachStream;
        }

        public final int releaseHeader() {
            return ProgressLock.applyTask;
        }

        public final int resetDelta() {
            return ProgressLock.updateTimer;
        }

        private Companion() {
        }

        public static /* synthetic */ void attachConfig() {
        }

        public static /* synthetic */ void clipOrigin() {
        }

        public static /* synthetic */ void connectJob() {
        }

        public static /* synthetic */ void detachStream() {
        }

        public static /* synthetic */ void growPayload() {
        }

        public static /* synthetic */ void inflateAdapter() {
        }

        public static /* synthetic */ void notifyMessage() {
        }

        public static /* synthetic */ void popBlueprint() {
        }

        public static /* synthetic */ void serializeOffset() {
        }

        public static /* synthetic */ void updateTimer() {
        }
    }

    private /* synthetic */ ProgressLock(int i) {
        this.value = i;
    }

    public static final /* synthetic */ ProgressLock drawField(int i) {
        return new ProgressLock(i);
    }

    public static String notifyMessage(int i) {
        return serializeOffset(i, injectMetric) ? "Unspecified" : serializeOffset(i, detachStream) ? "Text" : serializeOffset(i, releaseHeader) ? "Ascii" : serializeOffset(i, clipOrigin) ? "Number" : serializeOffset(i, flushSample) ? "Phone" : serializeOffset(i, updateTimer) ? "Uri" : serializeOffset(i, applyTask) ? "Email" : serializeOffset(i, popBlueprint) ? "Password" : serializeOffset(i, drawField) ? "NumberPassword" : serializeOffset(i, connectJob) ? "Decimal" : "Invalid";
    }

    public static boolean peekRevision(int i, Object obj) {
        return (obj instanceof ProgressLock) && i == ((ProgressLock) obj).getValue();
    }

    public static int reduceScope(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean serializeOffset(int i, int i2) {
        return i == i2;
    }

    /* renamed from: connectPatch, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return peekRevision(this.value, other);
    }

    public int hashCode() {
        return reduceScope(this.value);
    }

    public String toString() {
        return notifyMessage(this.value);
    }

    private static int connectJob(int i) {
        return i;
    }
}
