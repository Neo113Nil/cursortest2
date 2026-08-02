package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "<init>", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.FloatingActionButtonDefaults INSTANCE = new androidx.compose.material.FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ androidx.compose.material.FloatingActionButtonElevation m2638elevationixp7dh8(float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f);
        }
        float f3 = f;
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f);
        }
        float f4 = f2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-654132828, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:215)");
        }
        androidx.compose.material.FloatingActionButtonElevation m2639elevationxZ9QkE = m2639elevationxZ9QkE(f3, f4, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), composer, (i & 14) | 3456 | (i & 112) | ((i << 6) & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2639elevationxZ9QkE;
    }

    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final androidx.compose.material.FloatingActionButtonElevation m2639elevationxZ9QkE(float f, float f2, float f3, float f4, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f);
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f);
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
        }
        float f8 = f4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(380403812, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(f5)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(f6)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ 384) > 256 && composer.changed(f7)) || (i & 384) == 256;
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && composer.changed(f8)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.DefaultFloatingActionButtonElevation(f5, f6, f7, f8, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (androidx.compose.material.DefaultFloatingActionButtonElevation) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultFloatingActionButtonElevation;
    }
}
