package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/statsig/androidsdk/ContextType;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZE", "UPDATE_USER"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContextType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.ContextType[] $VALUES;

    @com.google.gson.annotations.SerializedName("initialize")
    public static final com.statsig.androidsdk.ContextType INITIALIZE = new com.statsig.androidsdk.ContextType("INITIALIZE", 0);

    @com.google.gson.annotations.SerializedName("update_user")
    public static final com.statsig.androidsdk.ContextType UPDATE_USER = new com.statsig.androidsdk.ContextType("UPDATE_USER", 1);

    private ContextType(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.ContextType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.ContextType[] values() {
        return (com.statsig.androidsdk.ContextType[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.ContextType valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.ContextType) java.lang.Enum.valueOf(com.statsig.androidsdk.ContextType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.ContextType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.ContextType[] $values() {
        return new com.statsig.androidsdk.ContextType[]{INITIALIZE, UPDATE_USER};
    }
}
