package com.zettle.sdk.common.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/common/ui/text/RelativeShiftSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "p0", "<init>", "(F)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class RelativeShiftSpan extends android.text.style.MetricAffectingSpan {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    public RelativeShiftSpan(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.baselineShift += (int) (p0.ascent() * this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.baselineShift += (int) (p0.ascent() * this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
