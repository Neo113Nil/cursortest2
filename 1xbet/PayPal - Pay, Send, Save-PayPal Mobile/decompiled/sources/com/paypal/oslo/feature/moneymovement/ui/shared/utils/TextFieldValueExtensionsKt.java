package com.paypal.oslo.feature.moneymovement.ui.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "newText", "withSyncedText", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;)Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextFieldValueExtensionsKt {
    public static final androidx.compose.ui.text.input.TextFieldValue withSyncedText(androidx.compose.ui.text.input.TextFieldValue textFieldValue, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(textFieldValue.getText(), str)) {
            return textFieldValue;
        }
        return new androidx.compose.ui.text.input.TextFieldValue(str, androidx.compose.ui.text.TextRangeKt.TextRange(kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldValue.getSelection()) + (str.length() - textFieldValue.getText().length()), 0, str.length())), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
