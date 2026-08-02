package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/DefaultColorStringFormatter;", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "<init>", "()V", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "alpha", "", "formatColorAndAlphaAsHexString", "(II)Ljava/lang/String;", "formatColorAsHexString", "(I)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultColorStringFormatter implements com.datadog.android.sessionreplay.utils.ColorStringFormatter {
    public static final com.datadog.android.sessionreplay.utils.DefaultColorStringFormatter INSTANCE = new com.datadog.android.sessionreplay.utils.DefaultColorStringFormatter();

    private DefaultColorStringFormatter() {
    }

    @Override // com.datadog.android.sessionreplay.utils.ColorStringFormatter
    public final java.lang.String formatColorAsHexString(int color) {
        long j = color;
        return "#".concat(java.lang.String.valueOf(kotlin.text.StringsKt.padStart(com.datadog.android.internal.utils.NumberExtKt.toHexString((((j & com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA) >> 24) | (j << 8)) & 4294967295L), 8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
    }

    @Override // com.datadog.android.sessionreplay.utils.ColorStringFormatter
    public final java.lang.String formatColorAndAlphaAsHexString(int color, int alpha) {
        return "#".concat(java.lang.String.valueOf(kotlin.text.StringsKt.padStart(com.datadog.android.internal.utils.NumberExtKt.toHexString((alpha | (color << 8)) & 4294967295L), 8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
    }
}
