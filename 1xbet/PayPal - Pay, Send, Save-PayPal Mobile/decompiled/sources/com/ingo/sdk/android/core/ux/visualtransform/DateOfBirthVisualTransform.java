package com.ingo.sdk.android.core.ux.visualtransform;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/android/core/ux/visualtransform/DateOfBirthVisualTransform;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "delimiter", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "it", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "Camera2StreamConfigurationMap", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DateOfBirthVisualTransform implements androidx.compose.ui.text.input.VisualTransformation {
    private final java.lang.String Camera2StreamConfigurationMap;

    public DateOfBirthVisualTransform(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString it) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        int length = it.getText().length();
        java.lang.String text = it.getText();
        if (length >= 8) {
            text = kotlin.text.StringsKt.substring(text, new kotlin.ranges.IntRange(0, 7));
        }
        int length2 = text.length();
        for (int i = 0; i < length2; i++) {
            char charAt = text.charAt(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(charAt);
            str = sb.toString();
            if (i % 2 == 1 && i < 4) {
                java.lang.String str2 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(str, null, 2, null), new androidx.compose.ui.text.input.OffsetMapping() { // from class: com.ingo.sdk.android.core.ux.visualtransform.DateOfBirthVisualTransform$filter$numberOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int offset) {
                if (offset <= 1) {
                    return offset;
                }
                if (offset <= 3) {
                    return offset + 1;
                }
                if (offset <= 8) {
                    return offset + 2;
                }
                return 10;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int offset) {
                if (offset <= 2) {
                    return offset;
                }
                if (offset <= 5) {
                    return offset - 1;
                }
                if (offset <= 10) {
                    return offset - 2;
                }
                return 8;
            }
        });
    }
}
