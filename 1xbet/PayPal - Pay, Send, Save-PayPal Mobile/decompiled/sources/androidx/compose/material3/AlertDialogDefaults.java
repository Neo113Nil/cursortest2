package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0011\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/material3/AlertDialogDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getIconContentColor", "iconContentColor", "getTitleContentColor", "titleContentColor", "getTextContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "TonalElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTonalElevation-D9Ej5fM", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlertDialogDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.AlertDialogDefaults INSTANCE = new androidx.compose.material3.AlertDialogDefaults();
    private static final float TonalElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);

    private AlertDialogDefaults() {
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-952504159, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:221)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(616766901, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:225)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getIconContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1646653461, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:229)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getIconColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getTitleContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(247083549, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:233)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getHeadlineColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getTextContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1729845653, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:237)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2868getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }
}
