package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/statsig/androidsdk/Endpoint;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Rgstr", "Initialize"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Endpoint {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.Endpoint[] $VALUES;
    private final java.lang.String value;

    @com.google.gson.annotations.SerializedName("log_event")
    public static final com.statsig.androidsdk.Endpoint Rgstr = new com.statsig.androidsdk.Endpoint("Rgstr", 0, "log_event");

    @com.google.gson.annotations.SerializedName("initialize")
    public static final com.statsig.androidsdk.Endpoint Initialize = new com.statsig.androidsdk.Endpoint("Initialize", 1, "initialize");

    private Endpoint(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.statsig.androidsdk.Endpoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.value;
    }

    public static com.statsig.androidsdk.Endpoint[] values() {
        return (com.statsig.androidsdk.Endpoint[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.Endpoint valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.Endpoint) java.lang.Enum.valueOf(com.statsig.androidsdk.Endpoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.Endpoint> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.Endpoint[] $values() {
        return new com.statsig.androidsdk.Endpoint[]{Rgstr, Initialize};
    }
}
