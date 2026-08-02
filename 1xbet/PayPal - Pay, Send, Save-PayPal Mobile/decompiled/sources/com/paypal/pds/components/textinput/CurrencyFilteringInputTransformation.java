package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/pds/components/textinput/CurrencyFilteringInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "config", "<init>", "(Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CurrencyFilteringInputTransformation implements androidx.compose.foundation.text.input.InputTransformation {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.pds.components.textinput.CurrencyFormattingConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    public CurrencyFilteringInputTransformation(com.paypal.pds.components.textinput.CurrencyFormattingConfig currencyFormattingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormattingConfig, "");
        this.getHighSpeedVideoSizes = currencyFormattingConfig;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final /* bridge */ void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        super.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    /* renamed from: getKeyboardOptions */
    public final /* bridge */ androidx.compose.foundation.text.KeyboardOptions getGetHighResolutionOutputSizeshNQ4ISI() {
        return super.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    @Override // androidx.compose.foundation.text.input.InputTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        boolean z;
        java.lang.String str;
        int length;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldBuffer, "");
        java.lang.String obj = textFieldBuffer.asCharSequence().toString();
        java.lang.String str2 = obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj2 = sb.toString();
        boolean z2 = obj.length() < this.Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoSizes.getNumberOfDecimals() > 0 && obj2.length() == this.getHighSpeedVideoSizes.getNumberOfDecimals()) {
            java.lang.String str3 = obj2;
            for (int i3 = 0; i3 < str3.length(); i3++) {
                if (str3.charAt(i3) == this.getHighSpeedVideoSizes.getZeroDigit()) {
                }
            }
            z = true;
            if (!z2 && z) {
                textFieldBuffer.replace(0, textFieldBuffer.getLength(), "");
                androidx.compose.foundation.text.input.TextFieldBufferKt.placeCursorAtEnd(textFieldBuffer);
                this.Camera2StreamConfigurationMap = 0;
                return;
            }
            str = obj2;
            if (str.length() != 0 && obj2.length() != 1 && kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str, this.getHighSpeedVideoSizes.getZeroDigit(), false, 2, (java.lang.Object) null)) {
                length = str.length();
                i = 0;
                while (true) {
                    if (i < length) {
                        i = -1;
                        break;
                    } else if (str.charAt(i) != this.getHighSpeedVideoSizes.getZeroDigit()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    obj2 = java.lang.String.valueOf(this.getHighSpeedVideoSizes.getZeroDigit());
                } else {
                    obj2 = obj2.substring(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                }
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
                textFieldBuffer.replace(0, textFieldBuffer.getLength(), obj2);
                androidx.compose.foundation.text.input.TextFieldBufferKt.placeCursorAtEnd(textFieldBuffer);
            }
            this.Camera2StreamConfigurationMap = textFieldBuffer.getLength();
        }
        z = false;
        if (!z2) {
        }
        str = obj2;
        if (str.length() != 0) {
            length = str.length();
            i = 0;
            while (true) {
                if (i < length) {
                }
                i++;
            }
            if (i != -1) {
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
        }
        this.Camera2StreamConfigurationMap = textFieldBuffer.getLength();
    }
}
