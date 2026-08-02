package com.paypal.oslo.feature.xoom.data.encoder;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/encoder/AndroidBase64Encoder;", "Lcom/paypal/oslo/feature/xoom/domain/encoder/Base64Encoder;", "<init>", "()V", "", "input", "encodeUrlSafe", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidBase64Encoder implements com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AndroidBase64Encoder() {
    }

    @Override // com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder
    public final java.lang.String encodeUrlSafe(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        byte[] bytes = input.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 11);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }
}
