package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/ui/text/input/OffsetMapping;II)V", "originalToTransformed", "(I)I", "transformedToOriginal", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/input/OffsetMapping;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ValidatingOffsetMapping implements androidx.compose.ui.text.input.OffsetMapping {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.OffsetMapping getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public ValidatingOffsetMapping(androidx.compose.ui.text.input.OffsetMapping offsetMapping, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = offsetMapping;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int p0) {
        int originalToTransformed = this.getHighResolutionOutputSizeshNQ4ISI.originalToTransformed(p0);
        if (p0 >= 0 && p0 <= this.getHighSpeedVideoFpsRangesFor) {
            androidx.compose.foundation.text.ValidatingOffsetMappingKt.Camera2StreamConfigurationMap(originalToTransformed, this.getHighSpeedVideoSizes, p0);
        }
        return originalToTransformed;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int p0) {
        int transformedToOriginal = this.getHighResolutionOutputSizeshNQ4ISI.transformedToOriginal(p0);
        if (p0 >= 0 && p0 <= this.getHighSpeedVideoSizes) {
            androidx.compose.foundation.text.ValidatingOffsetMappingKt.getHighSpeedVideoSizes(transformedToOriginal, this.getHighSpeedVideoFpsRangesFor, p0);
        }
        return transformedToOriginal;
    }
}
