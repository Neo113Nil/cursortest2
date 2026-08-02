package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "offset", "length", "", "toHexString", "([BII)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuffersKt {
    public static final java.lang.String toHexString(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.take(kotlin.collections.ArraysKt.drop(bArr, i), i2), "", null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Byte, java.lang.CharSequence>() { // from class: com.zettle.sdk.io.BuffersKt$toHexString$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.CharSequence invoke(java.lang.Byte b) {
                return getHighResolutionOutputSizeshNQ4ISI(b.byteValue());
            }

            public final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(byte b) {
                java.lang.String num = java.lang.Integer.toString(b & 255, kotlin.text.CharsKt.checkRadix(16));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
                return kotlin.text.StringsKt.padStart(num, 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
        }, 30, null);
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = joinToString$default.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return toHexString(bArr, i, i2);
    }
}
