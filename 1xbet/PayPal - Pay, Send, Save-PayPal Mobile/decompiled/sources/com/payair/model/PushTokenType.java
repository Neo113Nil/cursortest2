package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/payair/model/PushTokenType;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/payair/hce/TokenType;", "toHceType$core_release", "()Lcom/payair/hce/TokenType;", "PAYAIR", "MDES"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PushTokenType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.PushTokenType[] $VALUES;
    public static final com.payair.model.PushTokenType PAYAIR = new com.payair.model.PushTokenType("PAYAIR", 0);
    public static final com.payair.model.PushTokenType MDES = new com.payair.model.PushTokenType("MDES", 1);

    static {
        com.payair.model.PushTokenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private PushTokenType(java.lang.String str, int i) {
    }

    public final com.payair.hce.TokenType toHceType$core_release() {
        int i = com.payair.model.PushTokenType.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.payair.hce.TokenType.PAYAIR;
        }
        if (i == 2) {
            return com.payair.hce.TokenType.MDES;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static com.payair.model.PushTokenType[] values() {
        return (com.payair.model.PushTokenType[]) $VALUES.clone();
    }

    public static com.payair.model.PushTokenType valueOf(java.lang.String str) {
        return (com.payair.model.PushTokenType) java.lang.Enum.valueOf(com.payair.model.PushTokenType.class, str);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.PushTokenType.values().length];
            try {
                iArr[com.payair.model.PushTokenType.PAYAIR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.PushTokenType.MDES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static kotlin.enums.EnumEntries<com.payair.model.PushTokenType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.PushTokenType[] $values() {
        return new com.payair.model.PushTokenType[]{PAYAIR, MDES};
    }
}
