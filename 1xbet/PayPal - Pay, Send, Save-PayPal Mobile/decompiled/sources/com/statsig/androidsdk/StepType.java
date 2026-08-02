package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/statsig/androidsdk/StepType;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESS", "NETWORK_REQUEST", "LOAD_CACHE"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StepType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.StepType[] $VALUES;

    @com.google.gson.annotations.SerializedName("process")
    public static final com.statsig.androidsdk.StepType PROCESS = new com.statsig.androidsdk.StepType("PROCESS", 0);

    @com.google.gson.annotations.SerializedName("network_request")
    public static final com.statsig.androidsdk.StepType NETWORK_REQUEST = new com.statsig.androidsdk.StepType("NETWORK_REQUEST", 1);

    @com.google.gson.annotations.SerializedName("load_cache")
    public static final com.statsig.androidsdk.StepType LOAD_CACHE = new com.statsig.androidsdk.StepType("LOAD_CACHE", 2);

    private StepType(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.StepType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.StepType[] values() {
        return (com.statsig.androidsdk.StepType[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.StepType valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.StepType) java.lang.Enum.valueOf(com.statsig.androidsdk.StepType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.StepType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.StepType[] $values() {
        return new com.statsig.androidsdk.StepType[]{PROCESS, NETWORK_REQUEST, LOAD_CACHE};
    }
}
