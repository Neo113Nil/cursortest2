package androidx.compose.material;

/* compiled from: FloatingActionButton.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.FloatingActionButtonDefaults INSTANCE = new androidx.compose.material.FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ androidx.compose.material.FloatingActionButtonElevation m1407elevationixp7dh8(float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-654132828);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,1:c#ui.unit.Dp)219@9593L134:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(6);
        }
        float f3 = f;
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
        }
        float f4 = 8;
        androidx.compose.material.FloatingActionButtonElevation m1408elevationxZ9QkE = m1408elevationxZ9QkE(f3, f2, androidx.compose.ui.unit.Dp.m4478constructorimpl(f4), androidx.compose.ui.unit.Dp.m4478constructorimpl(f4), composer, (i & 14) | 3456 | (i & 112) | (57344 & (i << 6)), 0);
        composer.endReplaceableGroup();
        return m1408elevationxZ9QkE;
    }

    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final androidx.compose.material.FloatingActionButtonElevation m1408elevationxZ9QkE(float f, float f2, float f3, float f4, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(380403812);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)247@10589L367:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(6);
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
        }
        float f8 = f4;
        java.lang.Object[] objArr = {androidx.compose.ui.unit.Dp.m4476boximpl(f5), androidx.compose.ui.unit.Dp.m4476boximpl(f6), androidx.compose.ui.unit.Dp.m4476boximpl(f7), androidx.compose.ui.unit.Dp.m4476boximpl(f8)};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.DefaultFloatingActionButtonElevation(f5, f6, f7, f8, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (androidx.compose.material.DefaultFloatingActionButtonElevation) rememberedValue;
    }
}
