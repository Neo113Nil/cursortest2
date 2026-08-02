package com.google.crypto.tink.signature;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class Ed25519PrivateKey extends com.google.crypto.tink.signature.SignaturePrivateKey {
    private final com.google.crypto.tink.util.SecretBytes privateKeyBytes;
    private final com.google.crypto.tink.signature.Ed25519PublicKey publicKey;

    private Ed25519PrivateKey(com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.publicKey = ed25519PublicKey;
        this.privateKeyBytes = secretBytes;
    }

    public static com.google.crypto.tink.signature.Ed25519PrivateKey create(com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (ed25519PublicKey == null) {
            throw new java.security.GeneralSecurityException("Ed25519 key cannot be constructed without an Ed25519 public key");
        }
        if (secretBytes.size() != 32) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb.append(secretBytes.size());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (!java.util.Arrays.equals(ed25519PublicKey.getPublicKeyBytes().toByteArray(), com.google.crypto.tink.internal.Ed25519.scalarMultWithBaseToBytes(com.google.crypto.tink.internal.Ed25519.getHashedScalar(secretBytes.toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()))))) {
            throw new java.security.GeneralSecurityException("Ed25519 keys mismatch");
        }
        return new com.google.crypto.tink.signature.Ed25519PrivateKey(ed25519PublicKey, secretBytes);
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.Ed25519Parameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.signature.Ed25519PublicKey getPublicKey() {
        return this.publicKey;
    }

    public final com.google.crypto.tink.util.SecretBytes getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.Ed25519PrivateKey)) {
            return false;
        }
        com.google.crypto.tink.signature.Ed25519PrivateKey ed25519PrivateKey = (com.google.crypto.tink.signature.Ed25519PrivateKey) key;
        return ed25519PrivateKey.publicKey.equalsKey(this.publicKey) && this.privateKeyBytes.equalsSecretBytes(ed25519PrivateKey.privateKeyBytes);
    }
}
