package com.google.maps.android.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;II)V", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraMoveStartedReason {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.google.maps.android.compose.CameraMoveStartedReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.maps.android.compose.CameraMoveStartedReason.Companion INSTANCE;
    private final int value;
    public static final com.google.maps.android.compose.CameraMoveStartedReason UNKNOWN = new com.google.maps.android.compose.CameraMoveStartedReason("UNKNOWN", 0, -2);
    public static final com.google.maps.android.compose.CameraMoveStartedReason NO_MOVEMENT_YET = new com.google.maps.android.compose.CameraMoveStartedReason("NO_MOVEMENT_YET", 1, -1);
    public static final com.google.maps.android.compose.CameraMoveStartedReason GESTURE = new com.google.maps.android.compose.CameraMoveStartedReason("GESTURE", 2, 1);
    public static final com.google.maps.android.compose.CameraMoveStartedReason API_ANIMATION = new com.google.maps.android.compose.CameraMoveStartedReason("API_ANIMATION", 3, 2);
    public static final com.google.maps.android.compose.CameraMoveStartedReason DEVELOPER_ANIMATION = new com.google.maps.android.compose.CameraMoveStartedReason("DEVELOPER_ANIMATION", 4, 3);

    private CameraMoveStartedReason(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.google.maps.android.compose.CameraMoveStartedReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.google.maps.android.compose.CameraMoveStartedReason.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "fromInt", "(I)Lcom/google/maps/android/compose/CameraMoveStartedReason;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.google.maps.android.compose.CameraMoveStartedReason fromInt(int value) {
            com.google.maps.android.compose.CameraMoveStartedReason cameraMoveStartedReason;
            com.google.maps.android.compose.CameraMoveStartedReason[] values = com.google.maps.android.compose.CameraMoveStartedReason.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cameraMoveStartedReason = null;
                    break;
                }
                cameraMoveStartedReason = values[i];
                if (cameraMoveStartedReason.getValue() == value) {
                    break;
                }
                i++;
            }
            return cameraMoveStartedReason == null ? com.google.maps.android.compose.CameraMoveStartedReason.UNKNOWN : cameraMoveStartedReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.google.maps.android.compose.CameraMoveStartedReason[] values() {
        return (com.google.maps.android.compose.CameraMoveStartedReason[]) $VALUES.clone();
    }

    public static com.google.maps.android.compose.CameraMoveStartedReason valueOf(java.lang.String str) {
        return (com.google.maps.android.compose.CameraMoveStartedReason) java.lang.Enum.valueOf(com.google.maps.android.compose.CameraMoveStartedReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.google.maps.android.compose.CameraMoveStartedReason> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.google.maps.android.compose.CameraMoveStartedReason[] $values() {
        return new com.google.maps.android.compose.CameraMoveStartedReason[]{UNKNOWN, NO_MOVEMENT_YET, GESTURE, API_ANIMATION, DEVELOPER_ANIMATION};
    }
}
