package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/textinput/NumberMaskingOutputTransformation;", "Landroidx/compose/foundation/text/input/OutputTransformation;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformOutput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "", "maxLength", com.visa.cbp.getEncExpo.warmup, "getMaxLength", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public class NumberMaskingOutputTransformation implements androidx.compose.foundation.text.input.OutputTransformation {
    public static final int $stable = 0;
    private final java.lang.String mask;
    private final int maxLength;

    public NumberMaskingOutputTransformation(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.mask = str;
        java.lang.String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == '0') {
                i++;
            }
        }
        java.lang.String str3 = this.mask;
        int i3 = 0;
        for (int i4 = 0; i4 < str3.length(); i4++) {
            if (str3.charAt(i4) == '^') {
                i3++;
            }
        }
        this.maxLength = i + i3;
    }

    public final java.lang.String getMask() {
        return this.mask;
    }

    protected final int getMaxLength() {
        return this.maxLength;
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public void transformOutput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldBuffer, "");
        if (textFieldBuffer.getLength() != 0) {
            int i = 0;
            for (int i2 = 0; i < this.mask.length() && i2 < textFieldBuffer.getLength(); i2++) {
                char charAt = this.mask.charAt(i);
                if (charAt == '^') {
                    textFieldBuffer.replace(i, i + 1, "*");
                } else if (charAt != '0') {
                    androidx.compose.foundation.text.input.TextFieldBufferKt.insert(textFieldBuffer, i, java.lang.String.valueOf(this.mask.charAt(i)));
                }
                i++;
            }
        }
    }
}
