package com.moloco.sdk.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/moloco/sdk/publisher/Initialization;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Initialization {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.moloco.sdk.publisher.Initialization[] $VALUES;
    public static final com.moloco.sdk.publisher.Initialization SUCCESS = new com.moloco.sdk.publisher.Initialization("SUCCESS", 0);
    public static final com.moloco.sdk.publisher.Initialization FAILURE = new com.moloco.sdk.publisher.Initialization("FAILURE", 1);

    private static final /* synthetic */ com.moloco.sdk.publisher.Initialization[] $values() {
        return new com.moloco.sdk.publisher.Initialization[]{SUCCESS, FAILURE};
    }

    static {
        com.moloco.sdk.publisher.Initialization[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private Initialization(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.publisher.Initialization> getEntries() {
        return $ENTRIES;
    }

    public static com.moloco.sdk.publisher.Initialization valueOf(java.lang.String str) {
        return (com.moloco.sdk.publisher.Initialization) java.lang.Enum.valueOf(com.moloco.sdk.publisher.Initialization.class, str);
    }

    public static com.moloco.sdk.publisher.Initialization[] values() {
        return (com.moloco.sdk.publisher.Initialization[]) $VALUES.clone();
    }
}
