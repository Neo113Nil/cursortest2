package com.izettle.android.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/izettle/android/auth/GrantType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue$auth_release", "()Ljava/lang/String;", com.zettle.sdk.commons.network.JsonKt.KEY_AUTHORIZATION_CODE, "TOKEN", "PASSWORD", "ONE_TIME_TOKEN", "ADMIN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GrantType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.izettle.android.auth.GrantType[] $VALUES;
    private final java.lang.String value;
    public static final com.izettle.android.auth.GrantType AUTHORIZATION_CODE = new com.izettle.android.auth.GrantType(com.zettle.sdk.commons.network.JsonKt.KEY_AUTHORIZATION_CODE, 0, "authorization_code");
    public static final com.izettle.android.auth.GrantType TOKEN = new com.izettle.android.auth.GrantType("TOKEN", 1, com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY);
    public static final com.izettle.android.auth.GrantType PASSWORD = new com.izettle.android.auth.GrantType("PASSWORD", 2, "password");
    public static final com.izettle.android.auth.GrantType ONE_TIME_TOKEN = new com.izettle.android.auth.GrantType("ONE_TIME_TOKEN", 3, "one_time_token");
    public static final com.izettle.android.auth.GrantType ADMIN = new com.izettle.android.auth.GrantType("ADMIN", 4, "admin");

    private GrantType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    /* renamed from: getValue$auth_release, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.izettle.android.auth.GrantType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.izettle.android.auth.GrantType[] values() {
        return (com.izettle.android.auth.GrantType[]) $VALUES.clone();
    }

    public static com.izettle.android.auth.GrantType valueOf(java.lang.String str) {
        return (com.izettle.android.auth.GrantType) java.lang.Enum.valueOf(com.izettle.android.auth.GrantType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.auth.GrantType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.izettle.android.auth.GrantType[] $values() {
        return new com.izettle.android.auth.GrantType[]{AUTHORIZATION_CODE, TOKEN, PASSWORD, ONE_TIME_TOKEN, ADMIN};
    }
}
