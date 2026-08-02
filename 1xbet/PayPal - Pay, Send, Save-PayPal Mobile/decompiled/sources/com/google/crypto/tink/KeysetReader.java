package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface KeysetReader {
    com.google.crypto.tink.proto.Keyset read() throws java.io.IOException;

    com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException;
}
