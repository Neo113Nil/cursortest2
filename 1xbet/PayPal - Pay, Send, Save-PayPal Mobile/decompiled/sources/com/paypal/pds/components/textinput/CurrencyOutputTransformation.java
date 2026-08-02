package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/pds/components/textinput/CurrencyOutputTransformation;", "Landroidx/compose/foundation/text/input/OutputTransformation;", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "config", "<init>", "(Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformOutput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "getConfig", "()Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CurrencyOutputTransformation implements androidx.compose.foundation.text.input.OutputTransformation {
    public static final int $stable = 0;
    private final com.paypal.pds.components.textinput.CurrencyFormattingConfig config;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public CurrencyOutputTransformation(com.paypal.pds.components.textinput.CurrencyFormattingConfig currencyFormattingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormattingConfig, "");
        this.config = currencyFormattingConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormattingConfig.getNumberOfDecimals();
    }

    public final com.paypal.pds.components.textinput.CurrencyFormattingConfig getConfig() {
        return this.config;
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public final void transformOutput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        int length;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldBuffer, "");
        if (textFieldBuffer.getLength() != 0) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 > 0 && textFieldBuffer.getLength() < (i = i2 + 1)) {
                androidx.compose.foundation.text.input.TextFieldBufferKt.insert(textFieldBuffer, 0, kotlin.text.StringsKt.repeat(java.lang.String.valueOf(this.config.getZeroDigit()), i - textFieldBuffer.getLength()));
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI > 0 && textFieldBuffer.getLength() > this.getHighResolutionOutputSizeshNQ4ISI) {
                length = textFieldBuffer.getLength() - this.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                length = textFieldBuffer.getLength();
            }
            int i3 = 3;
            if (length > 3) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (true) {
                    int i4 = length - i3;
                    if (i4 <= 0) {
                        break;
                    }
                    arrayList.add(java.lang.Integer.valueOf(i4));
                    i3 += 3;
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.compose.foundation.text.input.TextFieldBufferKt.insert(textFieldBuffer, ((java.lang.Number) it.next()).intValue(), java.lang.String.valueOf(this.config.getGroupingSeparator()));
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI <= 0 || textFieldBuffer.getLength() <= this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            androidx.compose.foundation.text.input.TextFieldBufferKt.insert(textFieldBuffer, textFieldBuffer.getLength() - this.getHighResolutionOutputSizeshNQ4ISI, java.lang.String.valueOf(this.config.getDecimalSeparator()));
        }
    }
}
