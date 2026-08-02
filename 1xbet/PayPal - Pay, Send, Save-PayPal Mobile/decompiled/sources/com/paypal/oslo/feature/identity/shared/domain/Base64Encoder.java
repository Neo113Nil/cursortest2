package com.paypal.oslo.feature.identity.shared.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "", "", "input", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "encodeUrlSafe", "([B)Ljava/lang/String;", "decodeUrlSafe", "(Ljava/lang/String;)[B", "encodeStandard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Base64Encoder {
    java.lang.String decode(java.lang.String input);

    byte[] decodeUrlSafe(java.lang.String input);

    java.lang.String encode(java.lang.String input);

    java.lang.String encodeStandard(byte[] data);

    java.lang.String encodeUrlSafe(byte[] data);
}
