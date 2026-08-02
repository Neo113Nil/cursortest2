package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/material/ModalBottomSheetDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Elevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getElevation-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "Landroidx/compose/animation/core/AnimationSpec;", "", "AnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetDefaults {
    public static final androidx.compose.material.ModalBottomSheetDefaults INSTANCE = new androidx.compose.material.ModalBottomSheetDefaults();
    private static final float Elevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> AnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private ModalBottomSheetDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2658getElevationD9Ej5fM() {
        return Elevation;
    }

    public final long getScrimColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-112572414, i, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
