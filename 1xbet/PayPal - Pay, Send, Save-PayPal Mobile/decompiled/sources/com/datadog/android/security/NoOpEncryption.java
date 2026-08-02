package com.datadog.android.security;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/datadog/android/security/NoOpEncryption;", "Lcom/datadog/android/security/Encryption;", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "decrypt", "([B)[B", "encrypt"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpEncryption implements com.datadog.android.security.Encryption {
    @Override // com.datadog.android.security.Encryption
    public final byte[] encrypt(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data;
    }

    @Override // com.datadog.android.security.Encryption
    public final byte[] decrypt(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data;
    }
}
