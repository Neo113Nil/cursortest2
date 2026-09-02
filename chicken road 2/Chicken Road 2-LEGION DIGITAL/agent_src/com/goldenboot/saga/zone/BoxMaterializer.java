package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/BoxMaterializer;", "", "", "multiplier", "releaseHeader", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "F", "updateTimer", "()F", "growPayload", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxMaterializer {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final float multiplier;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float injectMetric = releaseHeader(0.5f);
    private static final float detachStream = releaseHeader(-0.5f);
    private static final float releaseHeader = releaseHeader(0.0f);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/goldenboot/saga/zone/BoxMaterializer$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/BoxMaterializer;", "Superscript", "F", "releaseHeader", "()F", "clipOrigin", "Subscript", "injectMetric", "detachStream", "None", "evictLayout", "growPayload", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.BoxMaterializer$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float evictLayout() {
            return BoxMaterializer.releaseHeader;
        }

        public final float injectMetric() {
            return BoxMaterializer.detachStream;
        }

        public final float releaseHeader() {
            return BoxMaterializer.injectMetric;
        }

        private Companion() {
        }

        public static /* synthetic */ void clipOrigin() {
        }

        public static /* synthetic */ void detachStream() {
        }

        public static /* synthetic */ void growPayload() {
        }
    }

    private /* synthetic */ BoxMaterializer(float f) {
        this.multiplier = f;
    }

    public static int applyTask(float f) {
        return Float.hashCode(f);
    }

    public static boolean clipOrigin(float f, Object obj) {
        return (obj instanceof BoxMaterializer) && Float.compare(f, ((BoxMaterializer) obj).getMultiplier()) == 0;
    }

    public static final /* synthetic */ BoxMaterializer detachStream(float f) {
        return new BoxMaterializer(f);
    }

    public static final boolean flushSample(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String popBlueprint(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    /* renamed from: drawField, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public boolean equals(Object other) {
        return clipOrigin(this.multiplier, other);
    }

    public int hashCode() {
        return applyTask(this.multiplier);
    }

    public String toString() {
        return popBlueprint(this.multiplier);
    }

    public final float updateTimer() {
        return this.multiplier;
    }

    public static float releaseHeader(float f) {
        return f;
    }
}
