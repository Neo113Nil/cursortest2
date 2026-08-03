package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter f7415a;

    public NetworkTaskForSendingDataParamsAppender(io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter) {
        this.f7415a = requestBodyEncrypter;
    }

    public void appendEncryptedData(android.net.Uri.Builder builder) {
        if (this.f7415a.getEncryptionMode() == io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
