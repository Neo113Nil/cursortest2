package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/statsig/androidsdk/HashAlgorithm;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SHA256", "DJB2", "NONE"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HashAlgorithm {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.HashAlgorithm[] $VALUES;
    private final java.lang.String value;

    @com.google.gson.annotations.SerializedName("sha256")
    public static final com.statsig.androidsdk.HashAlgorithm SHA256 = new com.statsig.androidsdk.HashAlgorithm("SHA256", 0, "sha256");

    @com.google.gson.annotations.SerializedName("djb2")
    public static final com.statsig.androidsdk.HashAlgorithm DJB2 = new com.statsig.androidsdk.HashAlgorithm("DJB2", 1, "djb2");

    @com.google.gson.annotations.SerializedName("none")
    public static final com.statsig.androidsdk.HashAlgorithm NONE = new com.statsig.androidsdk.HashAlgorithm("NONE", 2, "none");

    private HashAlgorithm(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.statsig.androidsdk.HashAlgorithm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.HashAlgorithm[] values() {
        return (com.statsig.androidsdk.HashAlgorithm[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.HashAlgorithm valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.HashAlgorithm) java.lang.Enum.valueOf(com.statsig.androidsdk.HashAlgorithm.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.HashAlgorithm> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.HashAlgorithm[] $values() {
        return new com.statsig.androidsdk.HashAlgorithm[]{SHA256, DJB2, NONE};
    }
}
