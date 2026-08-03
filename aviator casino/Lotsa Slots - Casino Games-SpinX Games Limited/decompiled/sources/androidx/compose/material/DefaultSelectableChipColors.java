package androidx.compose.material;

/* compiled from: Chip.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\fJ&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultSelectableChipColors implements androidx.compose.material.SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    private DefaultSelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.leadingIconColor = j3;
        this.disabledBackgroundColor = j4;
        this.disabledContentColor = j5;
        this.disabledLeadingIconColor = j6;
        this.selectedBackgroundColor = j7;
        this.selectedContentColor = j8;
        this.selectedLeadingIconColor = j9;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> backgroundColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-403836585);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(backgroundColor)659@28929L28:Chip.kt#jmzs0o");
        if (!z) {
            j = this.disabledBackgroundColor;
        } else if (!z2) {
            j = this.backgroundColor;
        } else {
            j = this.selectedBackgroundColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> contentColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(2025240134);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(contentColor)669@29241L28:Chip.kt#jmzs0o");
        if (!z) {
            j = this.disabledContentColor;
        } else if (!z2) {
            j = this.contentColor;
        } else {
            j = this.selectedContentColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(189838188);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(leadingIconColor)679@29569L28:Chip.kt#jmzs0o");
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (!z2) {
            j = this.leadingIconColor;
        } else {
            j = this.selectedLeadingIconColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j), composer, 0);
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
        androidx.compose.material.DefaultSelectableChipColors defaultSelectableChipColors = (androidx.compose.material.DefaultSelectableChipColors) other;
        return androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.backgroundColor) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.contentColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.leadingIconColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledBackgroundColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledContentColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledLeadingIconColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.selectedBackgroundColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.selectedContentColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.selectedLeadingIconColor);
    }
}
