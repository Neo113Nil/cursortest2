package com.statsig.androidsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/statsig/androidsdk/EvaluationReason;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Network", "Cache", "Sticky", "LocalOverride", "Unrecognized", "Uninitialized", "Bootstrap", "OnDeviceEvalAdapterBootstrapRecognized", "OnDeviceEvalAdapterBootstrapUnrecognized", "InvalidBootstrap", "NetworkNotModified", "Error"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EvaluationReason {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.EvaluationReason[] $VALUES;
    public static final com.statsig.androidsdk.EvaluationReason Network = new com.statsig.androidsdk.EvaluationReason("Network", 0);
    public static final com.statsig.androidsdk.EvaluationReason Cache = new com.statsig.androidsdk.EvaluationReason("Cache", 1);
    public static final com.statsig.androidsdk.EvaluationReason Sticky = new com.statsig.androidsdk.EvaluationReason("Sticky", 2);
    public static final com.statsig.androidsdk.EvaluationReason LocalOverride = new com.statsig.androidsdk.EvaluationReason("LocalOverride", 3);
    public static final com.statsig.androidsdk.EvaluationReason Unrecognized = new com.statsig.androidsdk.EvaluationReason("Unrecognized", 4);
    public static final com.statsig.androidsdk.EvaluationReason Uninitialized = new com.statsig.androidsdk.EvaluationReason("Uninitialized", 5);
    public static final com.statsig.androidsdk.EvaluationReason Bootstrap = new com.statsig.androidsdk.EvaluationReason("Bootstrap", 6);
    public static final com.statsig.androidsdk.EvaluationReason OnDeviceEvalAdapterBootstrapRecognized = new com.statsig.androidsdk.EvaluationReason("OnDeviceEvalAdapterBootstrapRecognized", 7);
    public static final com.statsig.androidsdk.EvaluationReason OnDeviceEvalAdapterBootstrapUnrecognized = new com.statsig.androidsdk.EvaluationReason("OnDeviceEvalAdapterBootstrapUnrecognized", 8);
    public static final com.statsig.androidsdk.EvaluationReason InvalidBootstrap = new com.statsig.androidsdk.EvaluationReason("InvalidBootstrap", 9);
    public static final com.statsig.androidsdk.EvaluationReason NetworkNotModified = new com.statsig.androidsdk.EvaluationReason("NetworkNotModified", 10);
    public static final com.statsig.androidsdk.EvaluationReason Error = new com.statsig.androidsdk.EvaluationReason("Error", 11);

    private EvaluationReason(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.EvaluationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = com.statsig.androidsdk.EvaluationReason.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "[OnDevice]Bootstrap:Recognized";
        }
        if (i == 2) {
            return "[OnDevice]Bootstrap:Unrecognized";
        }
        return name();
    }

    public static com.statsig.androidsdk.EvaluationReason[] values() {
        return (com.statsig.androidsdk.EvaluationReason[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.EvaluationReason valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.EvaluationReason) java.lang.Enum.valueOf(com.statsig.androidsdk.EvaluationReason.class, str);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.statsig.androidsdk.EvaluationReason.values().length];
            try {
                iArr[com.statsig.androidsdk.EvaluationReason.OnDeviceEvalAdapterBootstrapRecognized.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.statsig.androidsdk.EvaluationReason.OnDeviceEvalAdapterBootstrapUnrecognized.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.EvaluationReason> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.EvaluationReason[] $values() {
        return new com.statsig.androidsdk.EvaluationReason[]{Network, Cache, Sticky, LocalOverride, Unrecognized, Uninitialized, Bootstrap, OnDeviceEvalAdapterBootstrapRecognized, OnDeviceEvalAdapterBootstrapUnrecognized, InvalidBootstrap, NetworkNotModified, Error};
    }
}
