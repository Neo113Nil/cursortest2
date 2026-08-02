package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RadioButtonColors;", "copy", "", "enabled", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "Landroidx/compose/runtime/State;", "radioColor$material3", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedColor-0d7_KjU", "()J", "getUnselectedColor-0d7_KjU", "getDisabledSelectedColor-0d7_KjU", "getDisabledUnselectedColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    private RadioButtonColors(long j, long j2, long j3, long j4) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledSelectedColor = j3;
        this.disabledUnselectedColor = j4;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedColor() {
        return this.unselectedColor;
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedColor() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUnselectedColor() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final androidx.compose.material3.RadioButtonColors m3627copyjRlVdoo(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        return new androidx.compose.material3.RadioButtonColors(selectedColor == 16 ? this.selectedColor : selectedColor, unselectedColor == 16 ? this.unselectedColor : unselectedColor, disabledSelectedColor == 16 ? this.disabledSelectedColor : disabledSelectedColor, disabledUnselectedColor == 16 ? this.disabledUnselectedColor : disabledUnselectedColor, null);
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor$material3(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1840145292, i, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:223)");
        }
        if (z && z2) {
            j = this.selectedColor;
        } else if (z && !z2) {
            j = this.unselectedColor;
        } else if (!z && z2) {
            j = this.disabledSelectedColor;
        } else {
            j = this.disabledUnselectedColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceGroup(1194696477);
            rememberUpdatedState = androidx.compose.animation.SingleValueAnimationKt.m1150animateColorAsStateeuL9pac(j2, androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1194874138);
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.RadioButtonColors)) {
            return false;
        }
        androidx.compose.material3.RadioButtonColors radioButtonColors = (androidx.compose.material3.RadioButtonColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.selectedColor);
        return (((((m6003hashCodeimpl * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.unselectedColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledSelectedColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledUnselectedColor);
    }

    public /* synthetic */ RadioButtonColors(long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }
}
