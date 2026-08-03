package androidx.compose.animation.core;

/* compiled from: VisibilityThresholds.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010\"\u0015\u0010\n\u001a\u00020\u0011*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013\"\u0015\u0010\n\u001a\u00020\u0014*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016\"\u0015\u0010\n\u001a\u00020\u0017*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019\"\u0015\u0010\n\u001a\u00020\u001a*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c\"\u0015\u0010\n\u001a\u00020\u001d*\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001f\"\u0015\u0010\n\u001a\u00020 *\u00020!8F¢\u0006\u0006\u001a\u0004\b\r\u0010\"¨\u0006#"}, d2 = {"DpVisibilityThreshold", "", "PxVisibilityThreshold", "rectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "visibilityThresholdMap", "", "Landroidx/compose/animation/core/TwoWayConverter;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVisibilityThreshold", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final androidx.compose.ui.geometry.Rect rectVisibilityThreshold;
    private static final java.util.Map<androidx.compose.animation.core.TwoWayConverter<?, ?>, java.lang.Float> visibilityThresholdMap;

    public static final int getVisibilityThreshold(kotlin.jvm.internal.IntCompanionObject intCompanionObject) {
        return 1;
    }

    static {
        java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
        rectVisibilityThreshold = new androidx.compose.ui.geometry.Rect(0.5f, 0.5f, 0.5f, 0.5f);
        androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        kotlin.Pair pair = kotlin.TuplesKt.to(vectorConverter, valueOf2);
        kotlin.Pair pair2 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), valueOf2);
        kotlin.Pair pair3 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), valueOf2);
        kotlin.Pair pair4 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), java.lang.Float.valueOf(0.01f));
        kotlin.Pair pair5 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), valueOf);
        kotlin.Pair pair6 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), valueOf);
        kotlin.Pair pair7 = kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), valueOf);
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(0.1f);
        visibilityThresholdMap = kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, kotlin.TuplesKt.to(vectorConverter2, valueOf3), kotlin.TuplesKt.to(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.DpOffset.INSTANCE), valueOf3));
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.Companion companion) {
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.geometry.Offset.Companion companion) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.DpOffset.Companion companion) {
        return androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE), getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE));
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.geometry.Size.Companion companion) {
        return androidx.compose.ui.geometry.SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(androidx.compose.ui.unit.IntSize.Companion companion) {
        return androidx.compose.ui.unit.IntSizeKt.IntSize(1, 1);
    }

    public static final androidx.compose.ui.geometry.Rect getVisibilityThreshold(androidx.compose.ui.geometry.Rect.Companion companion) {
        return rectVisibilityThreshold;
    }

    public static final java.util.Map<androidx.compose.animation.core.TwoWayConverter<?, ?>, java.lang.Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final float getVisibilityThreshold(androidx.compose.ui.unit.Dp.Companion companion) {
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(0.1f);
    }
}
