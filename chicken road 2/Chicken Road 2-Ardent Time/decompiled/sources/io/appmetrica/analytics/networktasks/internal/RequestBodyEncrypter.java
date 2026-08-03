package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode getEncryptionMode();
}
