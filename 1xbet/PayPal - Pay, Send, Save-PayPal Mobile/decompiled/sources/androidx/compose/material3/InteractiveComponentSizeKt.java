package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "MinimumInteractiveTopAlignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getMinimumInteractiveTopAlignmentLine", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "MinimumInteractiveLeftAlignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "getMinimumInteractiveLeftAlignmentLine", "()Landroidx/compose/ui/layout/VerticalAlignmentLine;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "Landroidx/compose/ui/unit/Dp;", "LocalMinimumInteractiveComponentSize", "getLocalMinimumInteractiveComponentSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {
    private static final androidx.compose.ui.layout.HorizontalAlignmentLine MinimumInteractiveTopAlignmentLine = new androidx.compose.ui.layout.HorizontalAlignmentLine(androidx.compose.material3.InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1.Camera2StreamConfigurationMap);
    private static final androidx.compose.ui.layout.VerticalAlignmentLine MinimumInteractiveLeftAlignmentLine = new androidx.compose.ui.layout.VerticalAlignmentLine(androidx.compose.material3.InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1.getHighSpeedVideoFpsRangesFor);
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalMinimumInteractiveComponentEnforcement = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(androidx.compose.material3.InteractiveComponentSizeKt.$r8$lambda$RYgBva4Km0PUhDIA6QfXS4sl98w());
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> LocalMinimumInteractiveComponentSize = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.ui.unit.Dp highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.material3.InteractiveComponentSizeKt.getHighSpeedVideoFpsRanges();
            return highSpeedVideoFpsRanges;
        }
    });

    public static /* synthetic */ boolean $r8$lambda$RYgBva4Km0PUhDIA6QfXS4sl98w() {
        return true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentSize with 0.dp to turn off enforcement instead.", replaceWith = @kotlin.ReplaceWith(expression = "LocalMinimumInteractiveComponentSize", imports = {}))
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    public static final androidx.compose.ui.Modifier minimumInteractiveComponentSize(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.material3.MinimumInteractiveModifier.INSTANCE);
    }

    public static final androidx.compose.ui.layout.HorizontalAlignmentLine getMinimumInteractiveTopAlignmentLine() {
        return MinimumInteractiveTopAlignmentLine;
    }

    public static final androidx.compose.ui.layout.VerticalAlignmentLine getMinimumInteractiveLeftAlignmentLine() {
        return MinimumInteractiveLeftAlignmentLine;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> getLocalMinimumInteractiveComponentSize() {
        return LocalMinimumInteractiveComponentSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.Dp getHighSpeedVideoFpsRanges() {
        return androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f));
    }
}
