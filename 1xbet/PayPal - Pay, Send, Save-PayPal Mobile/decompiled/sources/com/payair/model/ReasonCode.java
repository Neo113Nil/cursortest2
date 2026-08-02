package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/payair/model/ReasonCode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "DEVICE_LOST", "DEVICE_STOLEN", "ACCOUNT_CLOSED", "SUSPECTED_FRAUD", "OTHER"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReasonCode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.ReasonCode[] $VALUES;
    private final java.lang.String value;
    public static final com.payair.model.ReasonCode DEVICE_LOST = new com.payair.model.ReasonCode("DEVICE_LOST", 0, "DEVICE_LOST");
    public static final com.payair.model.ReasonCode DEVICE_STOLEN = new com.payair.model.ReasonCode("DEVICE_STOLEN", 1, "DEVICE_STOLEN");
    public static final com.payair.model.ReasonCode ACCOUNT_CLOSED = new com.payair.model.ReasonCode("ACCOUNT_CLOSED", 2, "ACCOUNT_CLOSED");
    public static final com.payair.model.ReasonCode SUSPECTED_FRAUD = new com.payair.model.ReasonCode("SUSPECTED_FRAUD", 3, "SUSPECTED_FRAUD");
    public static final com.payair.model.ReasonCode OTHER = new com.payair.model.ReasonCode("OTHER", 4, "OTHER");

    static {
        com.payair.model.ReasonCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private ReasonCode(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public static com.payair.model.ReasonCode[] values() {
        return (com.payair.model.ReasonCode[]) $VALUES.clone();
    }

    public static com.payair.model.ReasonCode valueOf(java.lang.String str) {
        return (com.payair.model.ReasonCode) java.lang.Enum.valueOf(com.payair.model.ReasonCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.ReasonCode> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.ReasonCode[] $values() {
        return new com.payair.model.ReasonCode[]{DEVICE_LOST, DEVICE_STOLEN, ACCOUNT_CLOSED, SUSPECTED_FRAUD, OTHER};
    }
}
