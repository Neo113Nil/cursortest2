package com.ingo.sdk.android.core.ux.visualtransform;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/android/core/ux/visualtransform/SsnVisualTransform;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "delimiter", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "it", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SsnVisualTransform implements androidx.compose.ui.text.input.VisualTransformation {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public SsnVisualTransform(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString it) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        int length = it.getText().length();
        java.lang.String text = it.getText();
        if (length >= 9) {
            text = kotlin.text.StringsKt.substring(text, new kotlin.ranges.IntRange(0, 8));
        }
        int length2 = text.length();
        for (int i = 0; i < length2; i++) {
            char charAt = text.charAt(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(charAt);
            str = sb.toString();
            if (i == 2 || i == 4) {
                java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(str, null, 2, null), new androidx.compose.ui.text.input.OffsetMapping() { // from class: com.ingo.sdk.android.core.ux.visualtransform.SsnVisualTransform$filter$numberOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int offset) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("originalToTransformed(");
                sb3.append(offset);
                sb3.append(")");
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb3.toString(), null, 2, null);
                if (offset <= 2) {
                    return offset;
                }
                if (offset <= 5) {
                    return offset + 1;
                }
                if (offset <= 9) {
                    return offset + 2;
                }
                return 11;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int offset) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("transformedToOriginal(");
                sb3.append(offset);
                sb3.append(")");
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb3.toString(), null, 2, null);
                if (offset <= 3) {
                    return offset;
                }
                if (offset <= 6) {
                    return offset - 1;
                }
                if (offset <= 11) {
                    return offset - 2;
                }
                return 9;
            }
        });
    }
}
