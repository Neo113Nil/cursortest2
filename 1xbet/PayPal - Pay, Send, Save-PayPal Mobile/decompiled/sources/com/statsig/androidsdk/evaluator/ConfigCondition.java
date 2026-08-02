package com.statsig.androidsdk.evaluator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/statsig/androidsdk/evaluator/ConfigCondition;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "FAIL_GATE", "PASS_GATE", "IP_BASED", "UA_BASED", "USER_FIELD", "CURRENT_TIME", "ENVIRONMENT_FIELD", "USER_BUCKET", "UNIT_ID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigCondition {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.statsig.androidsdk.evaluator.ConfigCondition[] $VALUES;
    public static final com.statsig.androidsdk.evaluator.ConfigCondition PUBLIC = new com.statsig.androidsdk.evaluator.ConfigCondition("PUBLIC", 0);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition FAIL_GATE = new com.statsig.androidsdk.evaluator.ConfigCondition("FAIL_GATE", 1);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition PASS_GATE = new com.statsig.androidsdk.evaluator.ConfigCondition("PASS_GATE", 2);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition IP_BASED = new com.statsig.androidsdk.evaluator.ConfigCondition("IP_BASED", 3);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition UA_BASED = new com.statsig.androidsdk.evaluator.ConfigCondition("UA_BASED", 4);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition USER_FIELD = new com.statsig.androidsdk.evaluator.ConfigCondition("USER_FIELD", 5);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition CURRENT_TIME = new com.statsig.androidsdk.evaluator.ConfigCondition("CURRENT_TIME", 6);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition ENVIRONMENT_FIELD = new com.statsig.androidsdk.evaluator.ConfigCondition("ENVIRONMENT_FIELD", 7);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition USER_BUCKET = new com.statsig.androidsdk.evaluator.ConfigCondition("USER_BUCKET", 8);
    public static final com.statsig.androidsdk.evaluator.ConfigCondition UNIT_ID = new com.statsig.androidsdk.evaluator.ConfigCondition("UNIT_ID", 9);

    private ConfigCondition(java.lang.String str, int i) {
    }

    static {
        com.statsig.androidsdk.evaluator.ConfigCondition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.statsig.androidsdk.evaluator.ConfigCondition[] values() {
        return (com.statsig.androidsdk.evaluator.ConfigCondition[]) $VALUES.clone();
    }

    public static com.statsig.androidsdk.evaluator.ConfigCondition valueOf(java.lang.String str) {
        return (com.statsig.androidsdk.evaluator.ConfigCondition) java.lang.Enum.valueOf(com.statsig.androidsdk.evaluator.ConfigCondition.class, str);
    }

    public static kotlin.enums.EnumEntries<com.statsig.androidsdk.evaluator.ConfigCondition> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.statsig.androidsdk.evaluator.ConfigCondition[] $values() {
        return new com.statsig.androidsdk.evaluator.ConfigCondition[]{PUBLIC, FAIL_GATE, PASS_GATE, IP_BASED, UA_BASED, USER_FIELD, CURRENT_TIME, ENVIRONMENT_FIELD, USER_BUCKET, UNIT_ID};
    }
}
