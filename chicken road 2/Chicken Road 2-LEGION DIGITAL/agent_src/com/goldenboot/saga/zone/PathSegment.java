package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/goldenboot/saga/zone/LayerPatch;", "", "Lcom/goldenboot/saga/zone/LayerPatch$ActivityMutator;", "type", "", "points", "", "weight", "<init>", "(Lcom/goldenboot/saga/zone/LayerPatch$ActivityMutator;[FF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "evictLayout", "Lcom/goldenboot/saga/zone/LayerPatch$ActivityMutator;", "growPayload", "()Lcom/goldenboot/saga/zone/LayerPatch$ActivityMutator;", "[F", "()[F", "injectMetric", "F", "()F", "ActivityMutator", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.LayerPatch, reason: from toString */
/* loaded from: classes.dex */
public final class PathSegment {

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final ActivityMutator type;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final float[] points;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/LayerPatch$ActivityMutator;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "attachConfig", "resetDelta", "inflateAdapter", "purgeNode", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.LayerPatch$ActivityMutator */
    public static final class ActivityMutator {
        private static final /* synthetic */ ActivityMutator[] drawRequest;
        private static final /* synthetic */ ItemProcessor gatherAdapter;
        public static final ActivityMutator reduceScope = new ActivityMutator("Move", 0);
        public static final ActivityMutator notifyMessage = new ActivityMutator("Line", 1);
        public static final ActivityMutator connectPatch = new ActivityMutator("Quadratic", 2);
        public static final ActivityMutator attachConfig = new ActivityMutator("Conic", 3);
        public static final ActivityMutator resetDelta = new ActivityMutator("Cubic", 4);
        public static final ActivityMutator inflateAdapter = new ActivityMutator("Close", 5);
        public static final ActivityMutator purgeNode = new ActivityMutator("Done", 6);

        static {
            ActivityMutator[] evictLayout = evictLayout();
            drawRequest = evictLayout;
            gatherAdapter = TranslateConductor.evictLayout(evictLayout);
        }

        private ActivityMutator(String str, int i) {
        }

        private static final /* synthetic */ ActivityMutator[] evictLayout() {
            return new ActivityMutator[]{reduceScope, notifyMessage, connectPatch, attachConfig, resetDelta, inflateAdapter, purgeNode};
        }

        public static ItemProcessor releaseHeader() {
            return gatherAdapter;
        }

        public static ActivityMutator valueOf(String str) {
            return (ActivityMutator) Enum.valueOf(ActivityMutator.class, str);
        }

        public static ActivityMutator[] values() {
            return (ActivityMutator[]) drawRequest.clone();
        }
    }

    public PathSegment(ActivityMutator activityMutator, float[] fArr, float f) {
        this.type = activityMutator;
        this.points = fArr;
        this.weight = f;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && PathSegment.class == other.getClass()) {
            PathSegment pathSegment = (PathSegment) other;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    /* renamed from: growPayload, reason: from getter */
    public final ActivityMutator getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        String arrays = Arrays.toString(this.points);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
