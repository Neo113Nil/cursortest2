package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/statsig/androidsdk/InitializeFailReason;", "", "<init>", "(Ljava/lang/String;I)V", "CoroutineTimeout", "NetworkTimeout", "NetworkError", "InternalError"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InitializeFailReason {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.InitializeFailReason[] $VALUES;
    public static final com.statsig.androidsdk.InitializeFailReason CoroutineTimeout = new com.statsig.androidsdk.InitializeFailReason("CoroutineTimeout", 0);
    public static final com.statsig.androidsdk.InitializeFailReason NetworkTimeout = new com.statsig.androidsdk.InitializeFailReason("NetworkTimeout", 1);
    public static final com.statsig.androidsdk.InitializeFailReason NetworkError = new com.statsig.androidsdk.InitializeFailReason("NetworkError", 2);
    public static final com.statsig.androidsdk.InitializeFailReason InternalError = new com.statsig.androidsdk.InitializeFailReason("InternalError", 3);

    private InitializeFailReason(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.InitializeFailReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.InitializeFailReason[] values() {
        return (com.statsig.androidsdk.InitializeFailReason[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.InitializeFailReason valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.InitializeFailReason) java.lang.Enum.valueOf(com.statsig.androidsdk.InitializeFailReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.InitializeFailReason> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.InitializeFailReason[] $values() {
        return new com.statsig.androidsdk.InitializeFailReason[]{CoroutineTimeout, NetworkTimeout, NetworkError, InternalError};
    }
}
