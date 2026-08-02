package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0011J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0012J\r\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0011J'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u001f\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "", "p0", "<init>", "(I)V", "getHighSpeedVideoFpsRangesFor", "(I)I", "", "getHighSpeedVideoFpsRanges", "([I)[I", "p1", "p2", "p3", "", "Camera2StreamConfigurationMap", "(IIII)V", "(III)V", "()I", "", "()Z", "getHighSpeedVideoSizes", "()V", "getHighResolutionOutputSizeshNQ4ISI", "(III)I", "(II)V", "(II)Z", "[I", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IntStack {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public IntStack(int i) {
        this.getHighSpeedVideoFpsRangesFor = new int[i];
    }

    public final int getHighSpeedVideoFpsRangesFor(int p0) {
        return this.getHighSpeedVideoFpsRangesFor[p0];
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private final int[] getHighSpeedVideoFpsRanges(int[] p0) {
        int[] copyOf = java.util.Arrays.copyOf(p0, p0.length * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.getHighSpeedVideoFpsRangesFor = copyOf;
        return copyOf;
    }

    public final void Camera2StreamConfigurationMap(int p0, int p1, int p2, int p3) {
        int i = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i + 4;
        if (i2 >= iArr.length) {
            iArr = getHighSpeedVideoFpsRanges(iArr);
        }
        iArr[i] = p0;
        iArr[i + 1] = p1;
        iArr[i + 2] = p2;
        iArr[i + 3] = p3;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public final void getHighSpeedVideoFpsRanges(int p0, int p1, int p2) {
        int i = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i + 3;
        if (i2 >= iArr.length) {
            iArr = getHighSpeedVideoFpsRanges(iArr);
        }
        iArr[i] = p0 + p2;
        iArr[i + 1] = p1 + p2;
        iArr[i + 2] = p2;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public final int getHighSpeedVideoFpsRanges() {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges - 1;
        this.getHighSpeedVideoFpsRanges = i;
        return iArr[i];
    }

    public final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges != 0;
    }

    public final void getHighSpeedVideoSizes() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i % 3 != 0) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i > 3) {
            getHighResolutionOutputSizeshNQ4ISI(0, i - 3, 3);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1, int p2) {
        while (p0 < p1) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0, p1, p2);
            getHighResolutionOutputSizeshNQ4ISI(p0, Camera2StreamConfigurationMap - p2, p2);
            p0 = Camera2StreamConfigurationMap + p2;
        }
    }

    private final int Camera2StreamConfigurationMap(int p0, int p1, int p2) {
        int i = p0 - p2;
        while (p0 < p1) {
            if (Camera2StreamConfigurationMap(p0, p1)) {
                i += p2;
                getHighSpeedVideoSizes(i, p0);
            }
            p0 += p2;
        }
        int i2 = i + p2;
        getHighSpeedVideoSizes(i2, p1);
        return i2;
    }

    private final void getHighSpeedVideoSizes(int p0, int p1) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.ui.node.MyersDiffKt.getHighSpeedVideoSizes(iArr, p0, p1);
        androidx.compose.ui.node.MyersDiffKt.getHighSpeedVideoSizes(iArr, p0 + 1, p1 + 1);
        androidx.compose.ui.node.MyersDiffKt.getHighSpeedVideoSizes(iArr, p0 + 2, p1 + 2);
    }

    private final boolean Camera2StreamConfigurationMap(int p0, int p1) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i = iArr[p0];
        int i2 = iArr[p1];
        return i < i2 || (i == i2 && iArr[p0 + 1] <= iArr[p1 + 1]);
    }
}
