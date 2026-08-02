package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/statsig/androidsdk/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.ActionType[] $VALUES;

    @com.google.gson.annotations.SerializedName(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)
    public static final com.statsig.androidsdk.ActionType START = new com.statsig.androidsdk.ActionType("START", 0);

    @com.google.gson.annotations.SerializedName("end")
    public static final com.statsig.androidsdk.ActionType END = new com.statsig.androidsdk.ActionType("END", 1);

    private ActionType(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.ActionType[] values() {
        return (com.statsig.androidsdk.ActionType[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.ActionType valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.ActionType) java.lang.Enum.valueOf(com.statsig.androidsdk.ActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.ActionType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.ActionType[] $values() {
        return new com.statsig.androidsdk.ActionType[]{START, END};
    }
}
