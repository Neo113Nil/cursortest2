package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0011\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0013\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n"}, d2 = {"Landroidx/compose/material3/SnackbarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Color;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "getContentColor", "contentColor", "getActionColor", "actionColor", "getActionContentColor", "actionContentColor", "getDismissActionContentColor", "dismissActionContentColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.SnackbarDefaults INSTANCE = new androidx.compose.material3.SnackbarDefaults();

    private SnackbarDefaults() {
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-551629101, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:413)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(987938253, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:417)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1021310823, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:421)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getActionColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(743425465, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:425)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getActionContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1313141593, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:429)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getDismissActionContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-528602817, i, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:433)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.getIconColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }
}
