package com.google.crypto.tink.daead;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class DeterministicAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_SIV = createAesSivKeyTemplate(64);

    public static com.google.crypto.tink.proto.KeyTemplate createAesSivKeyTemplate(int i) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesSivKeyFormat.newBuilder().setKeySize(i).build().toByteString()).setTypeUrl(com.google.crypto.tink.daead.AesSivKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    private DeterministicAeadKeyTemplates() {
    }
}
