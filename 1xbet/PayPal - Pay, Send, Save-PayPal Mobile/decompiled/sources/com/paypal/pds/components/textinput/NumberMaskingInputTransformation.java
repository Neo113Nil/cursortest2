package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/pds/components/textinput/NumberMaskingInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NumberMaskingInputTransformation implements androidx.compose.foundation.text.input.InputTransformation {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public NumberMaskingInputTransformation(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == '0') {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            if (str2.charAt(i4) == '^') {
                i3++;
            }
        }
        this.getHighSpeedVideoSizes = i + i3;
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

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldBuffer, "");
        java.lang.String obj = textFieldBuffer.asCharSequence().toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence asCharSequence = textFieldBuffer.asCharSequence();
        int i = 0;
        for (int i2 = 0; i2 < asCharSequence.length(); i2++) {
            char charAt = asCharSequence.charAt(i2);
            if (java.lang.Character.isDigit(charAt) && i < this.getHighSpeedVideoSizes) {
                sb.append(charAt);
                i++;
            }
        }
        java.lang.String obj2 = sb.toString();
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
            return;
        }
        textFieldBuffer.replace(0, textFieldBuffer.getLength(), obj2);
    }
}
