package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "Landroidx/compose/ui/unit/DpSize;", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalMinimumInteractiveComponentEnforcement;
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalMinimumTouchTargetEnforcement;
    private static final long getHighSpeedVideoFpsRanges;

    public static /* synthetic */ boolean $r8$lambda$Z81ObxG4CNEGunDPbn8gOo_nPZ4() {
        return true;
    }

    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @kotlin.ReplaceWith(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    public static final androidx.compose.ui.Modifier minimumInteractiveComponentSize(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.material.MinimumInteractiveModifier.INSTANCE);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    static {
        androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> staticCompositionLocalOf = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.InteractiveComponentSizeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.material.InteractiveComponentSizeKt.$r8$lambda$Z81ObxG4CNEGunDPbn8gOo_nPZ4());
            }
        });
        LocalMinimumInteractiveComponentEnforcement = staticCompositionLocalOf;
        LocalMinimumTouchTargetEnforcement = staticCompositionLocalOf;
        getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.DpKt.m8623DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f));
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }
}
