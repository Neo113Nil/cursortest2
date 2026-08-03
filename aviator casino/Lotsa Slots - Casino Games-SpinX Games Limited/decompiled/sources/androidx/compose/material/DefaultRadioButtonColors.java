package androidx.compose.material;

/* compiled from: RadioButton.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "radioColor", "Landroidx/compose/runtime/State;", "enabled", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultRadioButtonColors implements androidx.compose.material.RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private DefaultRadioButtonColors(long j, long j2, long j3) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledColor = j3;
    }

    @Override // androidx.compose.material.RadioButtonColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(radioColor):RadioButton.kt#jmzs0o");
        if (!z) {
            j = this.disabledColor;
        } else if (!z2) {
            j = this.unselectedColor;
        } else {
            j = this.selectedColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1052799218);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "191@7600L75");
            rememberUpdatedState = androidx.compose.animation.SingleValueAnimationKt.m104animateColorAsStateKTwxG1Y(j2, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799113);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "193@7705L28");
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        androidx.compose.material.DefaultRadioButtonColors defaultRadioButtonColors = (androidx.compose.material.DefaultRadioButtonColors) other;
        return androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.selectedColor) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.unselectedColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledColor);
    }
}
