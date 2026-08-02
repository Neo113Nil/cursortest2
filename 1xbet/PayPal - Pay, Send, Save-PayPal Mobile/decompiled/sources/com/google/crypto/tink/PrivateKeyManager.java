package com.google.crypto.tink;

/* loaded from: classes9.dex */
public interface PrivateKeyManager<P> extends com.google.crypto.tink.KeyManager<P> {
    com.google.crypto.tink.proto.KeyData getPublicKeyData(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException;
}
