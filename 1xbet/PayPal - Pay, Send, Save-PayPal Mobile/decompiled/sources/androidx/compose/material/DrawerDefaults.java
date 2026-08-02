package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/TweenSpec;", "", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "Landroidx/compose/ui/unit/Dp;", "Elevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getElevation-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "getScrimColor", "scrimColor", "ScrimOpacity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final float ScrimOpacity = 0.32f;
    public static final androidx.compose.material.DrawerDefaults INSTANCE = new androidx.compose.material.DrawerDefaults();
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> AnimationSpec = new androidx.compose.animation.core.TweenSpec<>(256, 0, null, 6, null);
    private static final float Elevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);

    private DrawerDefaults() {
    }

    public final androidx.compose.animation.core.TweenSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }

    public final long getBackgroundColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-788676020, i, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:704)");
        }
        long m2566getSurface0d7_KjU = androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2566getSurface0d7_KjU;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2603getElevationD9Ej5fM() {
        return Elevation;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2041803618, i, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:711)");
        }
        androidx.compose.foundation.shape.CornerBasedShape large = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return large;
    }

    public final long getScrimColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(617225966, i, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:715)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }
}
