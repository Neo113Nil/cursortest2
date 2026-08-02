package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\n*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b\"\u0015\u0010\b\u001a\u00020\r*\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000e\"\u0015\u0010\b\u001a\u00020\u0010*\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0011\"\u0015\u0010\b\u001a\u00020\u0013*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0014\"\u0015\u0010\b\u001a\u00020\u0016*\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0017\"\u0015\u0010\b\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u001a\"\u0015\u0010\b\u001a\u00020\u0000*\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u001c\"4\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "", "VisibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final java.util.Map<androidx.compose.animation.core.TwoWayConverter<?, ?>, java.lang.Float> VisibilityThresholdMap;
    private static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor;

    public static final int getVisibilityThreshold(kotlin.jvm.internal.IntCompanionObject intCompanionObject) {
        return 1;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.DpOffset.Companion companion) {
        float visibilityThreshold = getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE);
        float visibilityThreshold2 = getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE);
        return androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(visibilityThreshold) << 32) | (java.lang.Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    public static final androidx.compose.ui.geometry.Rect getVisibilityThreshold(androidx.compose.ui.geometry.Rect.Companion companion) {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final java.util.Map<androidx.compose.animation.core.TwoWayConverter<?, ?>, java.lang.Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    static {
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.geometry.Rect(1.0f, 1.0f, 1.0f, 1.0f);
        kotlin.Pair pair = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), valueOf);
        kotlin.Pair pair2 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), valueOf);
        kotlin.Pair pair3 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), valueOf);
        kotlin.Pair pair4 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(0.01f));
        kotlin.Pair pair5 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), valueOf);
        kotlin.Pair pair6 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), valueOf);
        kotlin.Pair pair7 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), valueOf);
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(0.4f);
        VisibilityThresholdMap = kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, kotlin.TuplesKt.to(vectorConverter, valueOf2), kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.DpOffset.INSTANCE), valueOf2));
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.Companion companion) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32);
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.geometry.Offset.Companion companion) {
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(androidx.compose.ui.unit.Dp.Companion companion) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(0.4f);
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.geometry.Size.Companion companion) {
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.IntSize.Companion companion) {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32);
    }
}
