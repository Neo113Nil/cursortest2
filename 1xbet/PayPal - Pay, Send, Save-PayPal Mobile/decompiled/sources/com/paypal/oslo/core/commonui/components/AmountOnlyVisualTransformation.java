package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AmountOnlyVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "p0", "Ljava/util/Locale;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/Locale;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Locale;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AmountOnlyVisualTransformation implements androidx.compose.ui.text.input.VisualTransformation {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Locale Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public AmountOnlyVisualTransformation(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = locale;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString p0) {
        java.lang.String highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.String text = p0.getText();
        java.lang.String str = text;
        if (str.length() == 0) {
            str = "0";
        }
        highSpeedVideoSizes = com.paypal.oslo.core.commonui.components.AmountDisplayKt.getHighSpeedVideoSizes(str, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(highSpeedVideoSizes, null, 2, null), new com.paypal.oslo.core.commonui.components.ThousandsSeparatorOffsetMapping(text, highSpeedVideoSizes, this.Camera2StreamConfigurationMap));
    }
}
