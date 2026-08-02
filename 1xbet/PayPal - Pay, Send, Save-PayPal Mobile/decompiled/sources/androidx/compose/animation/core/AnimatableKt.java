package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0007\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\b\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u000b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Animatable", "(FF)Landroidx/compose/animation/core/Animatable;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/AnimationVector2D;", "getOutputMinFrameDuration", "Landroidx/compose/animation/core/AnimationVector2D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/AnimationVector3D;", "getInputSizeshNQ4ISI", "Landroidx/compose/animation/core/AnimationVector3D;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/AnimationVector4D;", "getOutputFormats", "Landroidx/compose/animation/core/AnimationVector4D;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatableKt {
    private static final androidx.compose.animation.core.AnimationVector1D Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector2D getOutputMinFrameDuration = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector3D getInputSizeshNQ4ISI = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector4D getOutputFormats = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector1D getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector3D getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final androidx.compose.animation.core.AnimationVector4D getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static /* synthetic */ androidx.compose.animation.core.Animatable Animatable$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return Animatable(f, f2);
    }

    public static final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Animatable(float f, float f2) {
        return new androidx.compose.animation.core.Animatable<>(java.lang.Float.valueOf(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(f2), null, 8, null);
    }
}
