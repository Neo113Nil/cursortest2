package com.zettle.android.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/zettle/android/entities/TssOptInOut;", "", "<init>", "(Ljava/lang/String;I)V", "OPT_IN", "OPT_OUT", "NO_TSS_OPT_IN_OUT_DECISION"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TssOptInOut {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.zettle.android.entities.TssOptInOut[] $VALUES;
    public static final com.zettle.android.entities.TssOptInOut OPT_IN = new com.zettle.android.entities.TssOptInOut("OPT_IN", 0);
    public static final com.zettle.android.entities.TssOptInOut OPT_OUT = new com.zettle.android.entities.TssOptInOut("OPT_OUT", 1);
    public static final com.zettle.android.entities.TssOptInOut NO_TSS_OPT_IN_OUT_DECISION = new com.zettle.android.entities.TssOptInOut("NO_TSS_OPT_IN_OUT_DECISION", 2);

    private TssOptInOut(java.lang.String str, int i) {
    }

    static {
        com.zettle.android.entities.TssOptInOut[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.zettle.android.entities.TssOptInOut[] values() {
        return (com.zettle.android.entities.TssOptInOut[]) $VALUES.clone();
    }

    public static com.zettle.android.entities.TssOptInOut valueOf(java.lang.String str) {
        return (com.zettle.android.entities.TssOptInOut) java.lang.Enum.valueOf(com.zettle.android.entities.TssOptInOut.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.android.entities.TssOptInOut> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.zettle.android.entities.TssOptInOut[] $values() {
        return new com.zettle.android.entities.TssOptInOut[]{OPT_IN, OPT_OUT, NO_TSS_OPT_IN_OUT_DECISION};
    }
}
