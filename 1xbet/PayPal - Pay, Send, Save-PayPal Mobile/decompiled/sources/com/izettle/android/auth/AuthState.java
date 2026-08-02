package com.izettle.android.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/izettle/android/auth/AuthState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZING", "LOGGED_OUT", "LOGGING_OUT", "LOGGING_IN", "LOGGED_IN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.izettle.android.auth.AuthState[] $VALUES;
    public static final com.izettle.android.auth.AuthState INITIALIZING = new com.izettle.android.auth.AuthState("INITIALIZING", 0);
    public static final com.izettle.android.auth.AuthState LOGGED_OUT = new com.izettle.android.auth.AuthState("LOGGED_OUT", 1);
    public static final com.izettle.android.auth.AuthState LOGGING_OUT = new com.izettle.android.auth.AuthState("LOGGING_OUT", 2);
    public static final com.izettle.android.auth.AuthState LOGGING_IN = new com.izettle.android.auth.AuthState("LOGGING_IN", 3);
    public static final com.izettle.android.auth.AuthState LOGGED_IN = new com.izettle.android.auth.AuthState("LOGGED_IN", 4);

    private AuthState(java.lang.String str, int i) {
    }

    static {
        com.izettle.android.auth.AuthState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.izettle.android.auth.AuthState[] values() {
        return (com.izettle.android.auth.AuthState[]) $VALUES.clone();
    }

    public static com.izettle.android.auth.AuthState valueOf(java.lang.String str) {
        return (com.izettle.android.auth.AuthState) java.lang.Enum.valueOf(com.izettle.android.auth.AuthState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.auth.AuthState> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.izettle.android.auth.AuthState[] $values() {
        return new com.izettle.android.auth.AuthState[]{INITIALIZING, LOGGED_OUT, LOGGING_OUT, LOGGING_IN, LOGGED_IN};
    }
}
