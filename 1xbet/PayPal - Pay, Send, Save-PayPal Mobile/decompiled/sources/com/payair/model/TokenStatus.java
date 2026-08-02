package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/payair/model/TokenStatus;", "", "", "statusName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getStatusName", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "SUSPENDED", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "DECLINED", com.payair.model.TokenStatusKt.TOKEN_DELETED, "UNKNOWN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.TokenStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.model.TokenStatus.Companion INSTANCE;
    private final java.lang.String statusName;
    public static final com.payair.model.TokenStatus ACTIVE = new com.payair.model.TokenStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
    public static final com.payair.model.TokenStatus INACTIVE = new com.payair.model.TokenStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 1, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
    public static final com.payair.model.TokenStatus SUSPENDED = new com.payair.model.TokenStatus("SUSPENDED", 2, "SUSPENDED");
    public static final com.payair.model.TokenStatus DEACTIVATED = new com.payair.model.TokenStatus(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 3, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED);
    public static final com.payair.model.TokenStatus DECLINED = new com.payair.model.TokenStatus("DECLINED", 4, "DECLINED");
    public static final com.payair.model.TokenStatus DELETED = new com.payair.model.TokenStatus(com.payair.model.TokenStatusKt.TOKEN_DELETED, 5, com.payair.model.TokenStatusKt.TOKEN_DELETED);
    public static final com.payair.model.TokenStatus UNKNOWN = new com.payair.model.TokenStatus("UNKNOWN", 6, "UNKNOWN");

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/model/TokenStatus$Companion;", "", "<init>", "()V", "", "statusName", "Lcom/payair/model/TokenStatus;", "fromStatusName", "(Ljava/lang/String;)Lcom/payair/model/TokenStatus;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.payair.model.TokenStatus fromStatusName(java.lang.String statusName) {
            com.payair.model.TokenStatus tokenStatus;
            com.payair.model.TokenStatus[] values = com.payair.model.TokenStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tokenStatus = null;
                    break;
                }
                tokenStatus = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(tokenStatus.getStatusName(), statusName)) {
                    break;
                }
                i++;
            }
            return tokenStatus == null ? com.payair.model.TokenStatus.UNKNOWN : tokenStatus;
        }

        private Companion() {
        }
    }

    static {
        com.payair.model.TokenStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.payair.model.TokenStatus.Companion(null);
    }

    private TokenStatus(java.lang.String str, int i, java.lang.String str2) {
        this.statusName = str2;
    }

    public final java.lang.String getStatusName() {
        return this.statusName;
    }

    public static com.payair.model.TokenStatus[] values() {
        return (com.payair.model.TokenStatus[]) $VALUES.clone();
    }

    public static com.payair.model.TokenStatus valueOf(java.lang.String str) {
        return (com.payair.model.TokenStatus) java.lang.Enum.valueOf(com.payair.model.TokenStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.TokenStatus> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.TokenStatus[] $values() {
        return new com.payair.model.TokenStatus[]{ACTIVE, INACTIVE, SUSPENDED, DEACTIVATED, DECLINED, DELETED, UNKNOWN};
    }
}
