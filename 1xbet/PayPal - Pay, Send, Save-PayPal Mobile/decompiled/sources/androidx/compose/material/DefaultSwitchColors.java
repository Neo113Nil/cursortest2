package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019"}, d2 = {"Landroidx/compose/material/DefaultSwitchColors;", "Landroidx/compose/material/SwitchColors;", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/runtime/State;", "thumbColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultSwitchColors implements androidx.compose.material.SwitchColors {
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private final long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    private DefaultSwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoSizes = j3;
        this.getHighSpeedVideoFpsRanges = j4;
        this.getHighResolutionOutputSizeshNQ4ISI = j5;
        this.getInputSizeshNQ4ISI = j6;
        this.getOutputMinFrameDuration = j7;
        this.getOutputFormats = j8;
    }

    @Override // androidx.compose.material.SwitchColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> thumbColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceGroup(-66424183);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-66424183, i, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        if (z) {
            j = z2 ? this.getHighSpeedVideoFpsRangesFor : this.getHighSpeedVideoSizes;
        } else {
            j = z2 ? this.getHighResolutionOutputSizeshNQ4ISI : this.getOutputMinFrameDuration;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        composer.startReplaceGroup(-1176343362);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1176343362, i, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        if (z) {
            j = z2 ? this.Camera2StreamConfigurationMap : this.getHighSpeedVideoFpsRanges;
        } else {
            j = z2 ? this.getInputSizeshNQ4ISI : this.getOutputFormats;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j), composer, 0);
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
        androidx.compose.material.DefaultSwitchColors defaultSwitchColors = (androidx.compose.material.DefaultSwitchColors) p0;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRangesFor, defaultSwitchColors.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.Camera2StreamConfigurationMap, defaultSwitchColors.Camera2StreamConfigurationMap) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizes, defaultSwitchColors.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRanges, defaultSwitchColors.getHighSpeedVideoFpsRanges) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, defaultSwitchColors.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getInputSizeshNQ4ISI, defaultSwitchColors.getInputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputMinFrameDuration, defaultSwitchColors.getOutputMinFrameDuration) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputFormats, defaultSwitchColors.getOutputFormats);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.Camera2StreamConfigurationMap);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizes);
        int m6003hashCodeimpl4 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        int m6003hashCodeimpl5 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        return (((((((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + m6003hashCodeimpl4) * 31) + m6003hashCodeimpl5) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getInputSizeshNQ4ISI)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputMinFrameDuration)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputFormats);
    }

    public /* synthetic */ DefaultSwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }
}
