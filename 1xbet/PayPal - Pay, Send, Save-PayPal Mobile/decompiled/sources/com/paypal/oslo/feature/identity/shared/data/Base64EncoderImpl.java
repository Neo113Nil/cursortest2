package com.paypal.oslo.feature.identity.shared.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/Base64EncoderImpl;", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "<init>", "()V", "", "input", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "encodeUrlSafe", "([B)Ljava/lang/String;", "decodeUrlSafe", "(Ljava/lang/String;)[B", "encodeStandard", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Base64EncoderImpl implements com.paypal.oslo.feature.identity.shared.domain.Base64Encoder {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl.Companion Companion = new com.paypal.oslo.feature.identity.shared.data.Base64EncoderImpl.Companion(null);

    @javax.inject.Inject
    public Base64EncoderImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.Base64Encoder
    public final java.lang.String encode(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        byte[] bytes = input.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.Base64Encoder
    public final java.lang.String decode(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        byte[] decode = android.util.Base64.decode(input, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return new java.lang.String(decode, kotlin.text.Charsets.UTF_8);
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.Base64Encoder
    public final java.lang.String encodeUrlSafe(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        byte[] encode = android.util.Base64.encode(data, 11);
        kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
        return new java.lang.String(encode, kotlin.text.Charsets.UTF_8);
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.Base64Encoder
    public final byte[] decodeUrlSafe(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        byte[] decode = android.util.Base64.decode(input, 11);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return decode;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.Base64Encoder
    public final java.lang.String encodeStandard(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(data, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/Base64EncoderImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
