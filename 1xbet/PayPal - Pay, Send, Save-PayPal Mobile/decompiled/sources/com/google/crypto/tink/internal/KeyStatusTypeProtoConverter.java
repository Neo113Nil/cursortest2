package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class KeyStatusTypeProtoConverter {
    public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType fromProto(com.google.crypto.tink.proto.KeyStatusType keyStatusType) {
        int i = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[keyStatusType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED;
        }
        if (i == 2) {
            return com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED;
        }
        if (i == 3) {
            return com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED;
        }
        throw new java.lang.IllegalArgumentException("Unknown key status type.");
    }

    /* renamed from: com.google.crypto.tink.internal.KeyStatusTypeProtoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType;

        static {
            int[] iArr = new int[com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = iArr;
            try {
                iArr[com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static com.google.crypto.tink.proto.KeyStatusType toProto(com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType keyStatusType) {
        int i = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[keyStatusType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.proto.KeyStatusType.ENABLED;
        }
        if (i == 2) {
            return com.google.crypto.tink.proto.KeyStatusType.DISABLED;
        }
        if (i == 3) {
            return com.google.crypto.tink.proto.KeyStatusType.DESTROYED;
        }
        throw new java.lang.IllegalArgumentException("Unknown key status type.");
    }

    private KeyStatusTypeProtoConverter() {
    }
}
