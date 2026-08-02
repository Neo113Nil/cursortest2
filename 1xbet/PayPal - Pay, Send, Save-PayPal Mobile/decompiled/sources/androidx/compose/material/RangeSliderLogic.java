package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R)\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u00058\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p0", "p1", "Landroidx/compose/runtime/State;", "", "p2", "p3", "Lkotlin/Function2;", "", "", "p4", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RangeSliderLogic {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final androidx.compose.runtime.State<java.lang.Float> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.compose.runtime.State<java.lang.Float> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.runtime.State<java.lang.Float> state2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state3) {
        this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource2;
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = state2;
        this.getHighSpeedVideoSizes = state3;
    }
}
