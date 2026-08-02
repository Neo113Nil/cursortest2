package com.payair.logic.jwt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@com.google.gson.annotations.JsonAdapter(com.payair.logic.jwt.ScopesEnumAdapter.class)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/payair/logic/jwt/ScopeType;", "", "", "parentScope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getParentScope", "()Ljava/lang/String;", "Companion", "CONTACTLESS_REGISTER", "CONTACTLESS_PROVISION", "CONTACTLESS_UPDATE_UNLOCK_KEYS"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScopeType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.logic.jwt.ScopeType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.jwt.ScopeType.Companion INSTANCE;
    private final java.lang.String parentScope;
    public static final com.payair.logic.jwt.ScopeType CONTACTLESS_REGISTER = new com.payair.logic.jwt.ScopeType("CONTACTLESS_REGISTER", 0, com.payair.logic.jwt.JWTKt.SCOPE_REGISTER);
    public static final com.payair.logic.jwt.ScopeType CONTACTLESS_PROVISION = new com.payair.logic.jwt.ScopeType("CONTACTLESS_PROVISION", 1, com.payair.logic.jwt.JWTKt.SCOPE_PROVISION);
    public static final com.payair.logic.jwt.ScopeType CONTACTLESS_UPDATE_UNLOCK_KEYS = new com.payair.logic.jwt.ScopeType("CONTACTLESS_UPDATE_UNLOCK_KEYS", 2, com.payair.logic.jwt.JWTKt.SCOPE_UPDATE_UNLOCK_KEYS);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/jwt/ScopeType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/logic/jwt/ScopeType;", "enumByValue", "(Ljava/lang/String;)Lcom/payair/logic/jwt/ScopeType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.payair.logic.jwt.ScopeType enumByValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            for (com.payair.logic.jwt.ScopeType scopeType : com.payair.logic.jwt.ScopeType.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(scopeType.getParentScope(), value)) {
                    return scopeType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    static {
        com.payair.logic.jwt.ScopeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.payair.logic.jwt.ScopeType.Companion(null);
    }

    private ScopeType(java.lang.String str, int i, java.lang.String str2) {
        this.parentScope = str2;
    }

    public final java.lang.String getParentScope() {
        return this.parentScope;
    }

    public static com.payair.logic.jwt.ScopeType[] values() {
        return (com.payair.logic.jwt.ScopeType[]) $VALUES.clone();
    }

    public static com.payair.logic.jwt.ScopeType valueOf(java.lang.String str) {
        return (com.payair.logic.jwt.ScopeType) java.lang.Enum.valueOf(com.payair.logic.jwt.ScopeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.jwt.ScopeType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.logic.jwt.ScopeType[] $values() {
        return new com.payair.logic.jwt.ScopeType[]{CONTACTLESS_REGISTER, CONTACTLESS_PROVISION, CONTACTLESS_UPDATE_UNLOCK_KEYS};
    }
}
