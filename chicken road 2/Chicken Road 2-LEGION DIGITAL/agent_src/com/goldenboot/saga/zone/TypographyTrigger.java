package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/goldenboot/saga/zone/TypographyTrigger;", "", "", "value", "releaseHeader", "(I)I", "", "applyTask", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "I", "growPayload", "ActivityMutator", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyTrigger {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int value;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int injectMetric = releaseHeader(0);
    private static final int detachStream = releaseHeader(1);
    private static final int releaseHeader = releaseHeader(2);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/TypographyTrigger$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/TypographyTrigger;", "Points", "I", "growPayload", "()I", "Lines", "evictLayout", "Polygon", "injectMetric", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.TypographyTrigger$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int evictLayout() {
            return TypographyTrigger.detachStream;
        }

        public final int growPayload() {
            return TypographyTrigger.injectMetric;
        }

        public final int injectMetric() {
            return TypographyTrigger.releaseHeader;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TypographyTrigger(int i) {
        this.value = i;
    }

    public static String applyTask(int i) {
        return flushSample(i, injectMetric) ? "Points" : flushSample(i, detachStream) ? "Lines" : flushSample(i, releaseHeader) ? "Polygon" : "Unknown";
    }

    public static boolean clipOrigin(int i, Object obj) {
        return (obj instanceof TypographyTrigger) && i == ((TypographyTrigger) obj).getValue();
    }

    public static final /* synthetic */ TypographyTrigger detachStream(int i) {
        return new TypographyTrigger(i);
    }

    public static final boolean flushSample(int i, int i2) {
        return i == i2;
    }

    public static int updateTimer(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return clipOrigin(this.value, other);
    }

    public int hashCode() {
        return updateTimer(this.value);
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return applyTask(this.value);
    }

    public static int releaseHeader(int i) {
        return i;
    }
}
