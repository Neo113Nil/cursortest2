package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface KeysetWriter {
    void write(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) throws java.io.IOException;

    void write(com.google.crypto.tink.proto.Keyset keyset) throws java.io.IOException;
}
