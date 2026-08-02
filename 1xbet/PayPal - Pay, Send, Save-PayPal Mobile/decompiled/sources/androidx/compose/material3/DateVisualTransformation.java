package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\n\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/material3/internal/DateInputFormat;", "p0", "<init>", "(Landroidx/compose/material3/internal/DateInputFormat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/internal/DateInputFormat;", "getHighSpeedVideoSizes", "", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateVisualTransformation implements androidx.compose.ui.text.input.VisualTransformation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.input.OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public final int originalToTransformed(int offset) {
            int i;
            int i2;
            int i3;
            int i4;
            i = androidx.compose.material3.DateVisualTransformation.this.getHighResolutionOutputSizeshNQ4ISI;
            if (offset < i) {
                return offset;
            }
            i2 = androidx.compose.material3.DateVisualTransformation.this.Camera2StreamConfigurationMap;
            if (offset < i2) {
                return offset + 1;
            }
            i3 = androidx.compose.material3.DateVisualTransformation.this.getHighSpeedVideoFpsRanges;
            if (offset <= i3) {
                return offset + 2;
            }
            i4 = androidx.compose.material3.DateVisualTransformation.this.getHighSpeedVideoFpsRanges;
            return i4 + 2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public final int transformedToOriginal(int offset) {
            int i;
            int i2;
            int i3;
            int i4;
            i = androidx.compose.material3.DateVisualTransformation.this.getHighResolutionOutputSizeshNQ4ISI;
            if (offset <= i - 1) {
                return offset;
            }
            i2 = androidx.compose.material3.DateVisualTransformation.this.Camera2StreamConfigurationMap;
            if (offset <= i2 - 1) {
                return offset - 1;
            }
            i3 = androidx.compose.material3.DateVisualTransformation.this.getHighSpeedVideoFpsRanges;
            if (offset <= i3 + 1) {
                return offset - 2;
            }
            i4 = androidx.compose.material3.DateVisualTransformation.this.getHighSpeedVideoFpsRanges;
            return i4;
        }
    };

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.DateInputFormat getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(androidx.compose.material3.internal.DateInputFormat dateInputFormat) {
        this.getHighSpeedVideoSizes = dateInputFormat;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (java.lang.Object) null);
        this.Camera2StreamConfigurationMap = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRanges = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString p0) {
        java.lang.String text;
        int i = 0;
        if (p0.getText().length() > this.getHighSpeedVideoFpsRanges) {
            text = kotlin.text.StringsKt.substring(p0.getText(), kotlin.ranges.RangesKt.until(0, this.getHighSpeedVideoFpsRanges));
        } else {
            text = p0.getText();
        }
        java.lang.String str = text;
        java.lang.String str2 = "";
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(charAt);
            str2 = sb.toString();
            if (i3 == this.getHighResolutionOutputSizeshNQ4ISI || i2 + 2 == this.Camera2StreamConfigurationMap) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(this.getHighSpeedVideoSizes.getDelimiter());
                str2 = sb2.toString();
            }
            i++;
            i2 = i3;
        }
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(str2, null, 2, null), this.getHighSpeedVideoFpsRangesFor);
    }
}
