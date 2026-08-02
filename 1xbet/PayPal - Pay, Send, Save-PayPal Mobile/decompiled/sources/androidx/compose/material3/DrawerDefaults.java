package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/material3/DrawerDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "ModalDrawerElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getModalDrawerElevation-D9Ej5fM", "()F", "PermanentDrawerElevation", "getPermanentDrawerElevation-D9Ej5fM", "DismissibleDrawerElevation", "getDismissibleDrawerElevation-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "getContainerColor", "getContainerColor$annotations", "containerColor", "getStandardContainerColor", "standardContainerColor", "getModalContainerColor", "modalContainerColor", "MaximumDrawerWidth", "getMaximumDrawerWidth-D9Ej5fM", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DrawerDefaults INSTANCE = new androidx.compose.material3.DrawerDefaults();
    private static final float ModalDrawerElevation = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4653getLevel0D9Ej5fM();
    private static final float PermanentDrawerElevation = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.m4845getStandardContainerElevationD9Ej5fM();
    private static final float DismissibleDrawerElevation = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.m4845getStandardContainerElevationD9Ej5fM();
    private static final float MaximumDrawerWidth = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.m4842getContainerWidthD9Ej5fM();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Please use standardContainerColor or modalContainerColor instead.", replaceWith = @kotlin.ReplaceWith(expression = "standardContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    private DrawerDefaults() {
    }

    /* renamed from: getModalDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3259getModalDrawerElevationD9Ej5fM() {
        return ModalDrawerElevation;
    }

    /* renamed from: getPermanentDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3260getPermanentDrawerElevationD9Ej5fM() {
        return PermanentDrawerElevation;
    }

    /* renamed from: getDismissibleDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3257getDismissibleDrawerElevationD9Ej5fM() {
        return DismissibleDrawerElevation;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(928378975, i, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:1008)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getScrimColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1055074989, i, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:1012)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1797317261, i, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:1021)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getStandardContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-125949421, i, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:1027)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getModalContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(706424321, i, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:1031)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMaximumDrawerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3258getMaximumDrawerWidthD9Ej5fM() {
        return MaximumDrawerWidth;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-909973510, i, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:1040)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1778getVerticalJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1776getStartJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }
}
