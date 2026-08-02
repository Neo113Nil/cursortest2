package com.google.maps.android.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/google/maps/android/compose/MapType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;II)V", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "NONE", "NORMAL", "SATELLITE", "TERRAIN", "HYBRID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.google.maps.android.compose.MapType[] $VALUES;
    private final int value;
    public static final com.google.maps.android.compose.MapType NONE = new com.google.maps.android.compose.MapType("NONE", 0, 0);
    public static final com.google.maps.android.compose.MapType NORMAL = new com.google.maps.android.compose.MapType("NORMAL", 1, 1);
    public static final com.google.maps.android.compose.MapType SATELLITE = new com.google.maps.android.compose.MapType("SATELLITE", 2, 2);
    public static final com.google.maps.android.compose.MapType TERRAIN = new com.google.maps.android.compose.MapType("TERRAIN", 3, 3);
    public static final com.google.maps.android.compose.MapType HYBRID = new com.google.maps.android.compose.MapType("HYBRID", 4, 4);

    private MapType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.google.maps.android.compose.MapType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.google.maps.android.compose.MapType[] values() {
        return (com.google.maps.android.compose.MapType[]) $VALUES.clone();
    }

    public static com.google.maps.android.compose.MapType valueOf(java.lang.String str) {
        return (com.google.maps.android.compose.MapType) java.lang.Enum.valueOf(com.google.maps.android.compose.MapType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.google.maps.android.compose.MapType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.google.maps.android.compose.MapType[] $values() {
        return new com.google.maps.android.compose.MapType[]{NONE, NORMAL, SATELLITE, TERRAIN, HYBRID};
    }
}
