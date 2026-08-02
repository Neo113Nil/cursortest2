package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0019\u0088\u0001\u001b\u0092\u0001\u00020\u0016"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OpArray;", "", "", "p0", "getHighSpeedVideoFpsRangesFor", "()[I", "p1", "p2", "p3", "", "getHighResolutionOutputSizeshNQ4ISI", "([IIIII)V", "Camera2StreamConfigurationMap", "([II)[I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", "[I", "([I)I", "getHighSpeedVideoSizes", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class OpArray {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int[] Camera2StreamConfigurationMap;

    public static int[] getHighSpeedVideoFpsRangesFor() {
        return new int[30];
    }

    public static final int Camera2StreamConfigurationMap(int[] iArr) {
        return iArr.length / 3;
    }

    public static final void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i * 3;
        iArr[i5] = i2;
        iArr[i5 + 1] = i3;
        iArr[i5 + 2] = i4;
    }

    public static final int[] Camera2StreamConfigurationMap(int[] iArr, int i) {
        int[] copyOf = java.util.Arrays.copyOf(iArr, i * 3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.foundation.text.input.internal.OpArray) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.foundation.text.input.internal.OpArray) p0).Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        int[] iArr = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpArray(Camera2StreamConfigurationMap=");
        sb.append(java.util.Arrays.toString(iArr));
        sb.append(')');
        return sb.toString();
    }
}
