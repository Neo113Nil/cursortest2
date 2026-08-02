package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/statsig/androidsdk/KeyType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INITIALIZE", "BOOTSTRAP", "OVERALL", "CHECK_GATE", "GET_CONFIG", "GET_EXPERIMENT", "GET_LAYER", "RETRY_FAILED_LOG"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.KeyType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.KeyType.Companion INSTANCE;

    @com.google.gson.annotations.SerializedName("initialize")
    public static final com.statsig.androidsdk.KeyType INITIALIZE = new com.statsig.androidsdk.KeyType("INITIALIZE", 0);

    @com.google.gson.annotations.SerializedName("bootstrap")
    public static final com.statsig.androidsdk.KeyType BOOTSTRAP = new com.statsig.androidsdk.KeyType("BOOTSTRAP", 1);

    @com.google.gson.annotations.SerializedName("overall")
    public static final com.statsig.androidsdk.KeyType OVERALL = new com.statsig.androidsdk.KeyType("OVERALL", 2);

    @com.google.gson.annotations.SerializedName("check_gate")
    public static final com.statsig.androidsdk.KeyType CHECK_GATE = new com.statsig.androidsdk.KeyType("CHECK_GATE", 3);

    @com.google.gson.annotations.SerializedName("get_config")
    public static final com.statsig.androidsdk.KeyType GET_CONFIG = new com.statsig.androidsdk.KeyType("GET_CONFIG", 4);

    @com.google.gson.annotations.SerializedName("get_experiment")
    public static final com.statsig.androidsdk.KeyType GET_EXPERIMENT = new com.statsig.androidsdk.KeyType("GET_EXPERIMENT", 5);

    @com.google.gson.annotations.SerializedName("get_layer")
    public static final com.statsig.androidsdk.KeyType GET_LAYER = new com.statsig.androidsdk.KeyType("GET_LAYER", 6);

    @com.google.gson.annotations.SerializedName("retry_failed_log")
    public static final com.statsig.androidsdk.KeyType RETRY_FAILED_LOG = new com.statsig.androidsdk.KeyType("RETRY_FAILED_LOG", 7);

    private KeyType(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.KeyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.statsig.androidsdk.KeyType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/statsig/androidsdk/KeyType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/statsig/androidsdk/KeyType;", "convertFromString", "(Ljava/lang/String;)Lcom/statsig/androidsdk/KeyType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.statsig.androidsdk.KeyType convertFromString(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.lang.String str = value;
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "checkGate", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                return com.statsig.androidsdk.KeyType.CHECK_GATE;
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "getExperiment", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                return com.statsig.androidsdk.KeyType.GET_EXPERIMENT;
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "getConfig", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                return com.statsig.androidsdk.KeyType.GET_CONFIG;
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "getLayer", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                return com.statsig.androidsdk.KeyType.GET_LAYER;
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.statsig.androidsdk.KeyType[] values() {
        return (com.statsig.androidsdk.KeyType[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.KeyType valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.KeyType) java.lang.Enum.valueOf(com.statsig.androidsdk.KeyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.KeyType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.KeyType[] $values() {
        return new com.statsig.androidsdk.KeyType[]{INITIALIZE, BOOTSTRAP, OVERALL, CHECK_GATE, GET_CONFIG, GET_EXPERIMENT, GET_LAYER, RETRY_FAILED_LOG};
    }
}
