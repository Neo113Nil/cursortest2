package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018"}, d2 = {"Landroidx/compose/material3/internal/MapDraggableAnchors;", "T", "Landroidx/compose/material3/internal/DraggableAnchors;", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "positionOf", "(Ljava/lang/Object;)F", "", "hasAnchorFor", "(Ljava/lang/Object;)Z", "closestAnchor", "(F)Ljava/lang/Object;", "p1", "(FZ)Ljava/lang/Object;", "minAnchor", "()F", "maxAnchor", "", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "getSize", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MapDraggableAnchors<T> implements androidx.compose.material3.internal.DraggableAnchors<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<T, java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    public MapDraggableAnchors(java.util.Map<T, java.lang.Float> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float positionOf(T p0) {
        java.lang.Float f = this.getHighResolutionOutputSizeshNQ4ISI.get(p0);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final boolean hasAnchorFor(T p0) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(p0);
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final T closestAnchor(float p0) {
        T next;
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = java.lang.Math.abs(p0 - ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = java.lang.Math.abs(p0 - ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).floatValue());
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final T closestAnchor(float p0, boolean p1) {
        T next;
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).floatValue();
                float f = p1 ? floatValue - p0 : p0 - floatValue;
                if (f < 0.0f) {
                    f = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).floatValue();
                    float f2 = p1 ? floatValue2 - p0 : p0 - floatValue2;
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    if (java.lang.Float.compare(f, f2) > 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float minAnchor() {
        java.lang.Float minOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) this.getHighResolutionOutputSizeshNQ4ISI.values());
        if (minOrNull != null) {
            return minOrNull.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float maxAnchor() {
        java.lang.Float maxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) this.getHighResolutionOutputSizeshNQ4ISI.values());
        if (maxOrNull != null) {
            return maxOrNull.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof androidx.compose.material3.internal.MapDraggableAnchors) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.material3.internal.MapDraggableAnchors) p0).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapDraggableAnchors(");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }
}
