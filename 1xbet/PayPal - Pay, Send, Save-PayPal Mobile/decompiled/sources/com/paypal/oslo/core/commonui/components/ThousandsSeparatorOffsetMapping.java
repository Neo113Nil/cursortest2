package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ThousandsSeparatorOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "", "p0", "p1", "Ljava/util/Locale;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)V", "", "originalToTransformed", "(I)I", "transformedToOriginal", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ThousandsSeparatorOffsetMapping implements androidx.compose.ui.text.input.OffsetMapping {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final char getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public ThousandsSeparatorOffsetMapping(java.lang.String str, java.lang.String str2, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = java.text.DecimalFormatSymbols.getInstance(locale).getGroupingSeparator();
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int p0) {
        int i = 0;
        int i2 = 0;
        while (i2 < p0 && i < this.Camera2StreamConfigurationMap.length()) {
            if (this.Camera2StreamConfigurationMap.charAt(i) != this.getHighSpeedVideoSizes) {
                i2++;
            }
            i++;
        }
        while (i < this.Camera2StreamConfigurationMap.length() && this.Camera2StreamConfigurationMap.charAt(i) == this.getHighSpeedVideoSizes) {
            i++;
        }
        return kotlin.ranges.RangesKt.coerceIn(i, 0, this.Camera2StreamConfigurationMap.length());
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int p0) {
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(p0, this.Camera2StreamConfigurationMap.length());
        int i = 0;
        for (int i2 = 0; i2 < coerceAtMost; i2++) {
            if (this.Camera2StreamConfigurationMap.charAt(i2) != this.getHighSpeedVideoSizes) {
                i++;
            }
        }
        return kotlin.ranges.RangesKt.coerceIn(i, 0, this.getHighResolutionOutputSizeshNQ4ISI.length());
    }
}
