package com.ingo.sdk.android.core.ux.visualtransform;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/android/core/ux/visualtransform/CardExpirationVisualTransform;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "delimiter", "<init>", "(C)V", "Landroidx/compose/ui/text/AnnotatedString;", "it", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CardExpirationVisualTransform implements androidx.compose.ui.text.input.VisualTransformation {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final char getHighResolutionOutputSizeshNQ4ISI;

    public CardExpirationVisualTransform(char c) {
        this.getHighResolutionOutputSizeshNQ4ISI = c;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        int length = it.getText().length();
        java.lang.String text = it.getText();
        if (length >= 5) {
            text = kotlin.text.StringsKt.substring(text, new kotlin.ranges.IntRange(0, 4));
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.chunked(text, 2), java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), null, null, 0, null, null, 62, null);
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(joinToString$default, null, 2, null), new androidx.compose.ui.text.input.OffsetMapping() { // from class: com.ingo.sdk.android.core.ux.visualtransform.CardExpirationVisualTransform$filter$numberOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int offset) {
                return offset <= 2 ? offset : offset + 1;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int offset) {
                return offset <= 2 ? offset : offset - 1;
            }
        });
    }
}
