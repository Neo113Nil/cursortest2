package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\"R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010#\u001a\u00020\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "T", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "", "p0", "", "p1", "<init>", "(Ljava/util/List;[F)V", "", "positionOf", "(Ljava/lang/Object;)F", "", "hasPositionFor", "(Ljava/lang/Object;)Z", "closestAnchor", "(F)Ljava/lang/Object;", "(FZ)Ljava/lang/Object;", "minPosition", "()F", "maxPosition", "", "anchorAt", "(I)Ljava/lang/Object;", "positionAt", "(I)F", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "([F)F", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes", "[F", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements androidx.compose.foundation.gestures.DraggableAnchors<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<T> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float[] Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(java.util.List<? extends T> list, float[] fArr) {
        this.getHighSpeedVideoFpsRangesFor = list;
        this.Camera2StreamConfigurationMap = fArr;
        if (list.size() != fArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
            sb.append(list);
            sb.append(" | Anchors: ");
            sb.append(kotlin.collections.ArraysKt.toList(fArr));
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float positionOf(T p0) {
        kotlin.jvm.functions.Function1 function1;
        int indexOf = this.getHighSpeedVideoFpsRangesFor.indexOf(p0);
        float[] fArr = this.Camera2StreamConfigurationMap;
        function1 = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRanges;
        return (indexOf < 0 || indexOf >= fArr.length) ? ((java.lang.Number) function1.invoke(java.lang.Integer.valueOf(indexOf))).floatValue() : fArr[indexOf];
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final boolean hasPositionFor(T p0) {
        return this.getHighSpeedVideoFpsRangesFor.indexOf(p0) != -1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final T closestAnchor(float p0) {
        float[] fArr = this.Camera2StreamConfigurationMap;
        int length = fArr.length;
        float f = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            float abs = java.lang.Math.abs(p0 - fArr[i]);
            if (abs <= f) {
                i3 = i2;
                f = abs;
            }
            i++;
            i2++;
        }
        if (i3 == -1) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.get(i3);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final T closestAnchor(float p0, boolean p1) {
        float[] fArr = this.Camera2StreamConfigurationMap;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        float f = Float.POSITIVE_INFINITY;
        while (i < length) {
            float f2 = fArr[i];
            float f3 = p1 ? f2 - p0 : p0 - f2;
            if (f3 < 0.0f) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (f3 <= f) {
                i3 = i2;
                f = f3;
            }
            i++;
            i2++;
        }
        if (i3 == -1) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.get(i3);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float minPosition() {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float maxPosition() {
        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    /* renamed from: getSize, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final T anchorAt(int p0) {
        return (T) kotlin.collections.CollectionsKt.getOrNull(this.getHighSpeedVideoFpsRangesFor, p0);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float positionAt(int p0) {
        kotlin.jvm.functions.Function1 function1;
        float[] fArr = this.Camera2StreamConfigurationMap;
        function1 = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRanges;
        return (p0 < 0 || p0 >= fArr.length) ? ((java.lang.Number) function1.invoke(java.lang.Integer.valueOf(p0))).floatValue() : fArr[p0];
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.gestures.DefaultDraggableAnchors)) {
            return false;
        }
        androidx.compose.foundation.gestures.DefaultDraggableAnchors defaultDraggableAnchors = (androidx.compose.foundation.gestures.DefaultDraggableAnchors) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, defaultDraggableAnchors.getHighSpeedVideoFpsRangesFor) && java.util.Arrays.equals(this.Camera2StreamConfigurationMap, defaultDraggableAnchors.Camera2StreamConfigurationMap) && getGetHighResolutionOutputSizeshNQ4ISI() == defaultDraggableAnchors.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap)) * 31) + getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DraggableAnchors(anchors={");
        int getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < getHighResolutionOutputSizeshNQ4ISI; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(anchorAt(i));
            sb2.append('=');
            sb2.append(positionAt(i));
            sb.append(sb2.toString());
            if (i < getGetHighResolutionOutputSizeshNQ4ISI() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private static float getHighSpeedVideoFpsRangesFor(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(fArr);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                f = java.lang.Math.min(f, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    private static float getHighResolutionOutputSizeshNQ4ISI(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(fArr);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                f = java.lang.Math.max(f, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return f;
    }
}
