package com.izettle.android.auth.tasks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/izettle/android/auth/tasks/AuthTaskType;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "VERIFY"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthTaskType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.izettle.android.auth.tasks.AuthTaskType[] $VALUES;
    public static final com.izettle.android.auth.tasks.AuthTaskType LOGIN = new com.izettle.android.auth.tasks.AuthTaskType("LOGIN", 0);
    public static final com.izettle.android.auth.tasks.AuthTaskType VERIFY = new com.izettle.android.auth.tasks.AuthTaskType("VERIFY", 1);

    private AuthTaskType(java.lang.String str, int i) {
    }

    static {
        com.izettle.android.auth.tasks.AuthTaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.izettle.android.auth.tasks.AuthTaskType[] values() {
        return (com.izettle.android.auth.tasks.AuthTaskType[]) $VALUES.clone();
    }

    public static com.izettle.android.auth.tasks.AuthTaskType valueOf(java.lang.String str) {
        return (com.izettle.android.auth.tasks.AuthTaskType) java.lang.Enum.valueOf(com.izettle.android.auth.tasks.AuthTaskType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.auth.tasks.AuthTaskType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.izettle.android.auth.tasks.AuthTaskType[] $values() {
        return new com.izettle.android.auth.tasks.AuthTaskType[]{LOGIN, VERIFY};
    }
}
