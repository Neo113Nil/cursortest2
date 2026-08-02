package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;", "", "", "initialText", "<init>", "(Ljava/lang/String;)V", "newText", "", "syncFromExternal", "Landroidx/compose/ui/text/input/TextFieldValue;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "update", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<set-?>", "textFieldValue$delegate", "Landroidx/compose/runtime/MutableState;", "getTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue", "textFieldValue", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountFieldState {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: textFieldValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textFieldValue;

    public AmountFieldState(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.textFieldValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
        this.getHighSpeedVideoFpsRanges = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.text.input.TextFieldValue getTextFieldValue() {
        return (androidx.compose.ui.text.input.TextFieldValue) this.textFieldValue.getValue();
    }

    public final void setTextFieldValue(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        this.textFieldValue.setValue(textFieldValue);
    }

    public final void syncFromExternal(java.lang.String newText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newText, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(newText, this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = newText;
        setTextFieldValue(com.paypal.oslo.feature.moneymovement.ui.shared.utils.TextFieldValueExtensionsKt.withSyncedText(getTextFieldValue(), newText));
    }

    public final void update(androidx.compose.ui.text.input.TextFieldValue newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "");
        setTextFieldValue(newValue);
    }
}
