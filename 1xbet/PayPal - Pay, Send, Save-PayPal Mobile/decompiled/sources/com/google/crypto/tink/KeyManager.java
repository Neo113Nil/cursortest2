package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface KeyManager<P> {
    java.lang.String getKeyType();

    P getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException;

    java.lang.Class<P> getPrimitiveClass();

    com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException;

    @java.lang.Deprecated
    default P getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    default com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    default com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    default boolean doesSupport(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    default int getVersion() {
        throw new java.lang.UnsupportedOperationException();
    }
}
