package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "Landroidx/compose/runtime/State;", "enabled", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tickColor", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultSliderColors implements androidx.compose.material.SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    private DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.disabledThumbColor = j2;
        this.activeTrackColor = j3;
        this.inactiveTrackColor = j4;
        this.disabledActiveTrackColor = j5;
        this.disabledInactiveTrackColor = j6;
        this.activeTickColor = j7;
        this.inactiveTickColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTickColor = j10;
    }

    @Override // androidx.compose.material.SliderColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> thumbColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1733795637);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(thumbColor)1061@41697L69:Slider.kt#jmzs0o");
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(z ? this.thumbColor : this.disabledThumbColor), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1575395620);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(trackColor)P(1)1066@41884L247:Slider.kt#jmzs0o");
        if (z) {
            j = z2 ? this.activeTrackColor : this.inactiveTrackColor;
        } else {
            j = z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1491563694);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(tickColor)P(1)1077@42248L243:Slider.kt#jmzs0o");
        if (z) {
            j = z2 ? this.activeTickColor : this.inactiveTickColor;
        } else {
            j = z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
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
        androidx.compose.material.DefaultSliderColors defaultSliderColors = (androidx.compose.material.DefaultSliderColors) other;
        return androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.thumbColor) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledThumbColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.activeTrackColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.inactiveTrackColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledActiveTrackColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.activeTickColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.inactiveTickColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledActiveTickColor)) * 31) + androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.disabledInactiveTickColor);
    }
}
