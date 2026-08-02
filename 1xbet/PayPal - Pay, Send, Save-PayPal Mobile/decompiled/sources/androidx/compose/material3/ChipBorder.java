package androidx.compose.material3;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/material3/ChipBorder;", "", "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipBorder {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;

    private ChipBorder(long j, long j2, float f) {
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public final androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> borderStroke$material3(boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1899621712, i, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2915)");
        }
        androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.foundation.BorderStrokeKt.m1312BorderStrokecXLIe8U(this.getHighSpeedVideoFpsRangesFor, z ? this.getHighSpeedVideoSizes : this.Camera2StreamConfigurationMap), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.ChipBorder)) {
            return false;
        }
        androidx.compose.material3.ChipBorder chipBorder = (androidx.compose.material3.ChipBorder) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizes, chipBorder.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.Camera2StreamConfigurationMap, chipBorder.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, chipBorder.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizes) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ ChipBorder(long j, long j2, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }
}
