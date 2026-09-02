package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/goldenboot/saga/zone/AttrThread;", "", "", "value", "releaseHeader", "(F)F", "", "applyTask", "(F)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "F", "growPayload", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AttrThread {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final float value;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float injectMetric = releaseHeader(Float.NaN);
    private static final float detachStream = releaseHeader(-3.0f);
    private static final float releaseHeader = releaseHeader(-4.0f);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/AttrThread$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/AttrThread;", "Default", "F", "evictLayout", "()F", "Normal", "injectMetric", "High", "growPayload", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.AttrThread$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float evictLayout() {
            return AttrThread.injectMetric;
        }

        public final float growPayload() {
            return AttrThread.releaseHeader;
        }

        public final float injectMetric() {
            return AttrThread.detachStream;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AttrThread(float f) {
        this.value = f;
    }

    public static String applyTask(float f) {
        return f == -3.0f ? "Normal" : f == -4.0f ? "High" : "Default";
    }

    public static boolean clipOrigin(float f, Object obj) {
        return (obj instanceof AttrThread) && Float.compare(f, ((AttrThread) obj).getValue()) == 0;
    }

    public static final /* synthetic */ AttrThread detachStream(float f) {
        return new AttrThread(f);
    }

    public static final boolean flushSample(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int updateTimer(float f) {
        return Float.hashCode(f);
    }

    public boolean equals(Object other) {
        return clipOrigin(this.value, other);
    }

    public int hashCode() {
        return updateTimer(this.value);
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public String toString() {
        return applyTask(this.value);
    }

    private static float releaseHeader(float f) {
        return f;
    }
}
