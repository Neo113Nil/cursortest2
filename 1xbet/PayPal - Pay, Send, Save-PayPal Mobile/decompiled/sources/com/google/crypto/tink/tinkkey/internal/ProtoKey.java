package com.google.crypto.tink.tinkkey.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class ProtoKey implements com.google.crypto.tink.tinkkey.TinkKey {
    private final boolean hasSecret;
    private final com.google.crypto.tink.proto.KeyData keyData;
    private final com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType;

    public ProtoKey(com.google.crypto.tink.proto.KeyData keyData, com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType) {
        this.hasSecret = isSecret(keyData);
        this.keyData = keyData;
        this.outputPrefixType = outputPrefixType;
    }

    private static boolean isSecret(com.google.crypto.tink.proto.KeyData keyData) {
        return keyData.getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || keyData.getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC || keyData.getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    public final com.google.crypto.tink.proto.KeyData getProtoKey() {
        return this.keyData;
    }

    public final com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType() {
        return this.outputPrefixType;
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public final boolean hasSecret() {
        return this.hasSecret;
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public final com.google.crypto.tink.KeyTemplate getKeyTemplate() {
        throw new java.lang.UnsupportedOperationException();
    }
}
