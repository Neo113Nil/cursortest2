package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/runtime/State;", "radioColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultRadioButtonColors implements androidx.compose.material.RadioButtonColors {
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    private DefaultRadioButtonColors(long j, long j2, long j3) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoFpsRangesFor = j3;
    }

    @Override // androidx.compose.material.RadioButtonColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState;
        composer.startReplaceGroup(1243421834);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
        }
        if (!z) {
            j = this.getHighSpeedVideoFpsRangesFor;
        } else if (!z2) {
            j = this.Camera2StreamConfigurationMap;
        } else {
            j = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceGroup(-1312667467);
            rememberUpdatedState = androidx.compose.animation.SingleValueAnimationKt.m1150animateColorAsStateeuL9pac(j2, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1312564764);
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        androidx.compose.material.DefaultRadioButtonColors defaultRadioButtonColors = (androidx.compose.material.DefaultRadioButtonColors) p0;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, defaultRadioButtonColors.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.Camera2StreamConfigurationMap, defaultRadioButtonColors.Camera2StreamConfigurationMap) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRangesFor, defaultRadioButtonColors.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ DefaultRadioButtonColors(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
