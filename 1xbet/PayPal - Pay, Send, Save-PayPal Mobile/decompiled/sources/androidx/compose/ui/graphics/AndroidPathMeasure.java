package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "getSegment", "(FFLandroidx/compose/ui/graphics/Path;Z)Z", "path", "forceClosed", "", "setPath", "(Landroidx/compose/ui/graphics/Path;Z)V", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/PathMeasure;", "Camera2StreamConfigurationMap", "getLength", "()F", "length", "", "getHighSpeedVideoFpsRanges", "[F", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPathMeasure implements androidx.compose.ui.graphics.PathMeasure {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.PathMeasure Camera2StreamConfigurationMap;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.Camera2StreamConfigurationMap = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final float getLength() {
        return this.Camera2StreamConfigurationMap.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final boolean getSegment(float startDistance, float stopDistance, androidx.compose.ui.graphics.Path destination, boolean startWithMoveTo) {
        android.graphics.PathMeasure pathMeasure = this.Camera2StreamConfigurationMap;
        if (destination instanceof androidx.compose.ui.graphics.AndroidPath) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((androidx.compose.ui.graphics.AndroidPath) destination).getInternalPath(), startWithMoveTo);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final void setPath(androidx.compose.ui.graphics.Path path, boolean forceClosed) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.Camera2StreamConfigurationMap;
        if (path == null) {
            path2 = null;
        } else if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            path2 = ((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath();
        } else {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path2, forceClosed);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public final long mo5892getPositiontuRUvjQ(float distance) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new float[2];
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new float[2];
        }
        if (this.Camera2StreamConfigurationMap.getPosTan(distance, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor)) {
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(fArr);
            float f = fArr[0];
            float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(fArr2);
            float f2 = fArr2[1];
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public final long mo5893getTangenttuRUvjQ(float distance) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new float[2];
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new float[2];
        }
        if (this.Camera2StreamConfigurationMap.getPosTan(distance, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor)) {
            float[] fArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(fArr);
            float f = fArr[0];
            float[] fArr2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(fArr2);
            float f2 = fArr2[1];
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }
}
