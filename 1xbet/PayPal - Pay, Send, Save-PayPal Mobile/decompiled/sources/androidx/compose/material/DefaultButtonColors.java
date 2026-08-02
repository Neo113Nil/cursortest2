package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/compose/material/DefaultButtonColors;", "Landroidx/compose/material/ButtonColors;", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/runtime/State;", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultButtonColors implements androidx.compose.material.ButtonColors {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoSizes;

    private DefaultButtonColors(long j, long j2, long j3, long j4) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getHighSpeedVideoFpsRanges = j3;
        this.getHighResolutionOutputSizeshNQ4ISI = j4;
    }

    @Override // androidx.compose.material.ButtonColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> backgroundColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-655254499);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(z ? this.getHighSpeedVideoSizes : this.getHighSpeedVideoFpsRanges), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> contentColor(boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-2133647540);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(z ? this.getHighSpeedVideoFpsRangesFor : this.getHighResolutionOutputSizeshNQ4ISI), composer, 0);
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
        androidx.compose.material.DefaultButtonColors defaultButtonColors = (androidx.compose.material.DefaultButtonColors) p0;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizes, defaultButtonColors.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRangesFor, defaultButtonColors.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRanges, defaultButtonColors.getHighSpeedVideoFpsRanges) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, defaultButtonColors.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizes);
        return (((((m6003hashCodeimpl * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRangesFor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ DefaultButtonColors(long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }
}
