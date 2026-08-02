package com.google.crypto.tink;

/* loaded from: classes4.dex */
final class Util {
    public static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");

    public static com.google.crypto.tink.proto.KeysetInfo getKeysetInfo(com.google.crypto.tink.proto.Keyset keyset) {
        com.google.crypto.tink.proto.KeysetInfo.Builder primaryKeyId = com.google.crypto.tink.proto.KeysetInfo.newBuilder().setPrimaryKeyId(keyset.getPrimaryKeyId());
        java.util.Iterator<com.google.crypto.tink.proto.Keyset.Key> it = keyset.getKeyList().iterator();
        while (it.hasNext()) {
            primaryKeyId.addKeyInfo(getKeyInfo(it.next()));
        }
        return primaryKeyId.build();
    }

    public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(com.google.crypto.tink.proto.Keyset.Key key) {
        return com.google.crypto.tink.proto.KeysetInfo.KeyInfo.newBuilder().setTypeUrl(key.getKeyData().getTypeUrl()).setStatus(key.getStatus()).setOutputPrefixType(key.getOutputPrefixType()).setKeyId(key.getKeyId()).build();
    }

    public static void validateKey(com.google.crypto.tink.proto.Keyset.Key key) throws java.security.GeneralSecurityException {
        if (!key.hasKeyData()) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has no key data", java.lang.Integer.valueOf(key.getKeyId())));
        }
        if (key.getOutputPrefixType() == com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown prefix", java.lang.Integer.valueOf(key.getKeyId())));
        }
        if (key.getStatus() == com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown status", java.lang.Integer.valueOf(key.getKeyId())));
        }
    }

    public static void validateKeyset(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        int primaryKeyId = keyset.getPrimaryKeyId();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (com.google.crypto.tink.proto.Keyset.Key key : keyset.getKeyList()) {
            if (key.getStatus() == com.google.crypto.tink.proto.KeyStatusType.ENABLED) {
                validateKey(key);
                if (key.getKeyId() == primaryKeyId) {
                    if (z) {
                        throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (key.getKeyData().getKeyMaterialType() != com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static byte[] readAll(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private Util() {
    }
}
