package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b \u0010\u001eJ5\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "<init>", "()V", "LargeIconSize", "Landroidx/compose/ui/unit/Dp;", "getLargeIconSize-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "smallShape", "getSmallShape", "largeShape", "getLargeShape", "extendedFabShape", "getExtendedFabShape", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "loweredElevation", "loweredElevation-xZ9-QkE", "bottomAppBarFabElevation", "bottomAppBarFabElevation-a9UjIt4", "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.FloatingActionButtonDefaults INSTANCE = new androidx.compose.material3.FloatingActionButtonDefaults();
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f);

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3315getLargeIconSizeD9Ej5fM() {
        return Camera2StreamConfigurationMap;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-53247565, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:513)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.FabBaselineTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.ui.graphics.Shape getSmallShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(394933381, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:517)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.FabSmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.ui.graphics.Shape getLargeShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1835912187, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:521)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.FabLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.ui.graphics.Shape getExtendedFabShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-536021915, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:525)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1855656391, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:529)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.FabPrimaryContainerTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final androidx.compose.material3.FloatingActionButtonElevation m3314elevationxZ9QkE(float f, float f2, float f3, float f4, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = androidx.compose.material3.tokens.FabPrimaryContainerTokens.INSTANCE.m4705getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.material3.tokens.FabPrimaryContainerTokens.INSTANCE.m4708getPressedContainerElevationD9Ej5fM();
        }
        float f5 = f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.material3.tokens.FabPrimaryContainerTokens.INSTANCE.m4706getFocusedContainerElevationD9Ej5fM();
        }
        float f6 = f3;
        if ((i2 & 8) != 0) {
            f4 = androidx.compose.material3.tokens.FabPrimaryContainerTokens.INSTANCE.m4707getHoveredContainerElevationD9Ej5fM();
        }
        float f7 = f4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-241106249, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:549)");
        }
        androidx.compose.material3.FloatingActionButtonElevation floatingActionButtonElevation = new androidx.compose.material3.FloatingActionButtonElevation(f, f5, f6, f7, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }

    /* renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final androidx.compose.material3.FloatingActionButtonElevation m3316loweredElevationxZ9QkE(float f, float f2, float f3, float f4, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4654getLevel1D9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4654getLevel1D9Ej5fM();
        }
        float f5 = f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4654getLevel1D9Ej5fM();
        }
        float f6 = f3;
        if ((i2 & 8) != 0) {
            f4 = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4655getLevel2D9Ej5fM();
        }
        float f7 = f4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-285065125, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:573)");
        }
        androidx.compose.material3.FloatingActionButtonElevation floatingActionButtonElevation = new androidx.compose.material3.FloatingActionButtonElevation(f, f5, f6, f7, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final androidx.compose.material3.FloatingActionButtonElevation m3313bottomAppBarFabElevationa9UjIt4(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        return new androidx.compose.material3.FloatingActionButtonElevation(defaultElevation, pressedElevation, focusedElevation, hoveredElevation, null);
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.FloatingActionButtonElevation m3312bottomAppBarFabElevationa9UjIt4$default(androidx.compose.material3.FloatingActionButtonDefaults floatingActionButtonDefaults, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return floatingActionButtonDefaults.m3313bottomAppBarFabElevationa9UjIt4(f, f2, f3, f4);
    }
}
