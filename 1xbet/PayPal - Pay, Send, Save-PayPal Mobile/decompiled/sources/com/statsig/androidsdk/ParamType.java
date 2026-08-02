package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/statsig/androidsdk/ParamType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "BOOLEAN", "STRING", "NUMBER", "OBJECT", "ARRAY", "UNKNOWN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ParamType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.ParamType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.ParamType.Companion INSTANCE;
    private final java.lang.String value;
    public static final com.statsig.androidsdk.ParamType BOOLEAN = new com.statsig.androidsdk.ParamType("BOOLEAN", 0, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN);
    public static final com.statsig.androidsdk.ParamType STRING = new com.statsig.androidsdk.ParamType("STRING", 1, "string");
    public static final com.statsig.androidsdk.ParamType NUMBER = new com.statsig.androidsdk.ParamType("NUMBER", 2, "number");
    public static final com.statsig.androidsdk.ParamType OBJECT = new com.statsig.androidsdk.ParamType("OBJECT", 3, "object");
    public static final com.statsig.androidsdk.ParamType ARRAY = new com.statsig.androidsdk.ParamType("ARRAY", 4, "array");
    public static final com.statsig.androidsdk.ParamType UNKNOWN = new com.statsig.androidsdk.ParamType("UNKNOWN", 5, "unknown");

    private ParamType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.statsig.androidsdk.ParamType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.statsig.androidsdk.ParamType.Companion(null);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/statsig/androidsdk/ParamType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/statsig/androidsdk/ParamType;", "fromString", "(Ljava/lang/String;)Lcom/statsig/androidsdk/ParamType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.statsig.androidsdk.ParamType fromString(java.lang.String value) {
            com.statsig.androidsdk.ParamType paramType;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            com.statsig.androidsdk.ParamType[] values = com.statsig.androidsdk.ParamType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    paramType = null;
                    break;
                }
                paramType = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(paramType.getValue(), value)) {
                    break;
                }
                i++;
            }
            return paramType == null ? com.statsig.androidsdk.ParamType.UNKNOWN : paramType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.statsig.androidsdk.ParamType[] values() {
        return (com.statsig.androidsdk.ParamType[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.ParamType valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.ParamType) java.lang.Enum.valueOf(com.statsig.androidsdk.ParamType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.ParamType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.ParamType[] $values() {
        return new com.statsig.androidsdk.ParamType[]{BOOLEAN, STRING, NUMBER, OBJECT, ARRAY, UNKNOWN};
    }
}
