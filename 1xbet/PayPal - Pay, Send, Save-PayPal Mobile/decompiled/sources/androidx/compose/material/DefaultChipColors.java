package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/runtime/State;", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "leadingIconContentColor", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultChipColors implements androidx.compose.material.ChipColors {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    private DefaultChipColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoFpsRangesFor = j3;
        this.getHighResolutionOutputSizeshNQ4ISI = j4;
        this.getHighSpeedVideoFpsRanges = j5;
        this.getOutputMinFrameDuration = j6;
    }

    @Override // androidx.compose.material.ChipColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> backgroundColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1593588247);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1593588247, i, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:576)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(z ? this.getHighSpeedVideoSizes : this.getHighResolutionOutputSizeshNQ4ISI), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> contentColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(483145880);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(483145880, i, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:581)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(z ? this.Camera2StreamConfigurationMap : this.getHighSpeedVideoFpsRanges), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconContentColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(1955749013);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1955749013, i, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:586)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(z ? this.getHighSpeedVideoFpsRangesFor : this.getOutputMinFrameDuration), composer, 0);
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
        androidx.compose.material.DefaultChipColors defaultChipColors = (androidx.compose.material.DefaultChipColors) p0;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizes, defaultChipColors.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.Camera2StreamConfigurationMap, defaultChipColors.Camera2StreamConfigurationMap) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRangesFor, defaultChipColors.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, defaultChipColors.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRanges, defaultChipColors.getHighSpeedVideoFpsRanges) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputMinFrameDuration, defaultChipColors.getOutputMinFrameDuration);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizes);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.Camera2StreamConfigurationMap);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        return (((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputMinFrameDuration);
    }

    public /* synthetic */ DefaultChipColors(long j, long j2, long j3, long j4, long j5, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }
}
