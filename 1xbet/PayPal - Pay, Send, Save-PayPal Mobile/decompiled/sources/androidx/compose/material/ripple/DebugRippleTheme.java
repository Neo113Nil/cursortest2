package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "defaultColor", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DebugRippleTheme implements androidx.compose.material.ripple.RippleTheme {
    public static final androidx.compose.material.ripple.DebugRippleTheme INSTANCE = new androidx.compose.material.ripple.DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @kotlin.Deprecated(message = "Super method is deprecated")
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public final long mo2852defaultColorWaAFU9c(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(2042140174);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2042140174, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long m2866defaultRippleColor5vOe2sY = androidx.compose.material.ripple.RippleTheme.INSTANCE.m2866defaultRippleColor5vOe2sY(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), true);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m2866defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @kotlin.Deprecated(message = "Super method is deprecated")
    public final androidx.compose.material.ripple.RippleAlpha rippleAlpha(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1629816343);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1629816343, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        androidx.compose.material.ripple.RippleAlpha m2865defaultRippleAlphaDxMtmZc = androidx.compose.material.ripple.RippleTheme.INSTANCE.m2865defaultRippleAlphaDxMtmZc(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), true);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m2865defaultRippleAlphaDxMtmZc;
    }
}
