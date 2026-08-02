package com.izettle.android.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/izettle/android/auth/OAuthUriType;", "", "", "prompt", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getPrompt", "()Ljava/lang/String;", "LOGIN", "VERIFY", "SIGNUP"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthUriType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.izettle.android.auth.OAuthUriType[] $VALUES;
    private final java.lang.String prompt;
    public static final com.izettle.android.auth.OAuthUriType LOGIN = new com.izettle.android.auth.OAuthUriType("LOGIN", 0, "login");
    public static final com.izettle.android.auth.OAuthUriType VERIFY = new com.izettle.android.auth.OAuthUriType("VERIFY", 1, "verify");
    public static final com.izettle.android.auth.OAuthUriType SIGNUP = new com.izettle.android.auth.OAuthUriType("SIGNUP", 2, "signup");

    private OAuthUriType(java.lang.String str, int i, java.lang.String str2) {
        this.prompt = str2;
    }

    public final java.lang.String getPrompt() {
        return this.prompt;
    }

    static {
        com.izettle.android.auth.OAuthUriType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.izettle.android.auth.OAuthUriType[] values() {
        return (com.izettle.android.auth.OAuthUriType[]) $VALUES.clone();
    }

    public static com.izettle.android.auth.OAuthUriType valueOf(java.lang.String str) {
        return (com.izettle.android.auth.OAuthUriType) java.lang.Enum.valueOf(com.izettle.android.auth.OAuthUriType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.auth.OAuthUriType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.izettle.android.auth.OAuthUriType[] $values() {
        return new com.izettle.android.auth.OAuthUriType[]{LOGIN, VERIFY, SIGNUP};
    }
}
