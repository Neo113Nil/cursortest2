package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class CleartextKeysetHandle {
    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.KeysetHandle.fromKeyset(com.google.crypto.tink.proto.Keyset.parseFrom(bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("invalid keyset");
        }
    }

    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader keysetReader) throws java.security.GeneralSecurityException, java.io.IOException {
        return com.google.crypto.tink.KeysetHandle.fromKeyset(keysetReader.read());
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader keysetReader, java.util.Map<java.lang.String, java.lang.String> map) throws java.security.GeneralSecurityException, java.io.IOException {
        return com.google.crypto.tink.KeysetHandle.fromKeysetAndAnnotations(keysetReader.read(), com.google.crypto.tink.internal.MonitoringAnnotations.newBuilder().addAll(map).build());
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.Keyset getKeyset(com.google.crypto.tink.KeysetHandle keysetHandle) {
        return keysetHandle.getKeyset();
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetHandle fromKeyset(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.KeysetHandle.fromKeyset(keyset);
    }

    public static void write(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.KeysetWriter keysetWriter) throws java.io.IOException {
        keysetWriter.write(keysetHandle.getKeyset());
    }

    private CleartextKeysetHandle() {
    }
}
