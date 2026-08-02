package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/material/BackdropScaffoldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "PeekHeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPeekHeight-D9Ej5fM", "()F", "HeaderHeight", "getHeaderHeight-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getFrontLayerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "FrontLayerElevation", "getFrontLayerElevation-D9Ej5fM", "Landroidx/compose/ui/graphics/Color;", "getFrontLayerScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "frontLayerScrimColor", "Landroidx/compose/animation/core/AnimationSpec;", "", "AnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldDefaults {
    public static final androidx.compose.material.BackdropScaffoldDefaults INSTANCE = new androidx.compose.material.BackdropScaffoldDefaults();
    private static final float PeekHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float HeaderHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f);
    private static final float FrontLayerElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> AnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private BackdropScaffoldDefaults() {
    }

    /* renamed from: getPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m2489getPeekHeightD9Ej5fM() {
        return PeekHeight;
    }

    /* renamed from: getHeaderHeight-D9Ej5fM, reason: not valid java name */
    public final float m2488getHeaderHeightD9Ej5fM() {
        return HeaderHeight;
    }

    public final androidx.compose.ui.graphics.Shape getFrontLayerShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1580588700, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:618)");
        }
        androidx.compose.foundation.shape.CornerBasedShape copy$default = androidx.compose.foundation.shape.CornerBasedShape.copy$default(androidx.compose.material.MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge(), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), null, null, 12, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getFrontLayerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2487getFrontLayerElevationD9Ej5fM() {
        return FrontLayerElevation;
    }

    public final long getFrontLayerScrimColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1806270648, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:628)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
