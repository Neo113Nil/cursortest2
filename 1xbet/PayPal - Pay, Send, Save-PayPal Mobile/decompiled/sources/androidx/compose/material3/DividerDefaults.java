package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/DividerDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Thickness", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getThickness-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Color;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DividerDefaults INSTANCE = new androidx.compose.material3.DividerDefaults();
    private static final float Thickness = androidx.compose.material3.tokens.DividerTokens.INSTANCE.m4625getThicknessD9Ej5fM();

    private DividerDefaults() {
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m3240getThicknessD9Ej5fM() {
        return Thickness;
    }

    public final long getColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(77461041, i, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:116)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DividerTokens.INSTANCE.getColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }
}
