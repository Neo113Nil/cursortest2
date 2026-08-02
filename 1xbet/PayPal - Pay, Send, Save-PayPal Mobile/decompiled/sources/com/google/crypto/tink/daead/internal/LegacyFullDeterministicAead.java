package com.google.crypto.tink.daead.internal;

/* loaded from: classes4.dex */
public class LegacyFullDeterministicAead implements com.google.crypto.tink.DeterministicAead {
    private final byte[] identifier;
    private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
    private final com.google.crypto.tink.DeterministicAead rawDaead;

    public static com.google.crypto.tink.DeterministicAead create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        byte[] byteArray;
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        com.google.crypto.tink.DeterministicAead deterministicAead = (com.google.crypto.tink.DeterministicAead) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.DeterministicAead.class).getPrimitive(serialization.getValue());
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = serialization.getOutputPrefixType();
        int i = com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        } else if (i == 2 || i == 3) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else if (i == 4) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown output prefix type ");
            sb.append(outputPrefixType.getNumber());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return new com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead(deterministicAead, outputPrefixType, byteArray);
    }

    /* renamed from: com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private LegacyFullDeterministicAead(com.google.crypto.tink.DeterministicAead deterministicAead, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, byte[] bArr) {
        this.rawDaead = deterministicAead;
        this.outputPrefixType = outputPrefixType;
        this.identifier = bArr;
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (this.outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.RAW) {
            return this.rawDaead.encryptDeterministically(bArr, bArr2);
        }
        return com.google.crypto.tink.subtle.Bytes.concat(this.identifier, this.rawDaead.encryptDeterministically(bArr, bArr2));
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (this.outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.RAW) {
            return this.rawDaead.decryptDeterministically(bArr, bArr2);
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(this.identifier, bArr)) {
            throw new java.security.GeneralSecurityException("wrong prefix");
        }
        return this.rawDaead.decryptDeterministically(java.util.Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
