package com.zettle.android.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/zettle/android/entities/TaxationMode;", "", "<init>", "(Ljava/lang/String;I)V", "INCLUSIVE", "EXCLUSIVE"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaxationMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.zettle.android.entities.TaxationMode[] $VALUES;
    public static final com.zettle.android.entities.TaxationMode INCLUSIVE = new com.zettle.android.entities.TaxationMode("INCLUSIVE", 0);
    public static final com.zettle.android.entities.TaxationMode EXCLUSIVE = new com.zettle.android.entities.TaxationMode("EXCLUSIVE", 1);

    private TaxationMode(java.lang.String str, int i) {
    }

    static {
        com.zettle.android.entities.TaxationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.zettle.android.entities.TaxationMode[] values() {
        return (com.zettle.android.entities.TaxationMode[]) $VALUES.clone();
    }

    public static com.zettle.android.entities.TaxationMode valueOf(java.lang.String str) {
        return (com.zettle.android.entities.TaxationMode) java.lang.Enum.valueOf(com.zettle.android.entities.TaxationMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.android.entities.TaxationMode> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.zettle.android.entities.TaxationMode[] $values() {
        return new com.zettle.android.entities.TaxationMode[]{INCLUSIVE, EXCLUSIVE};
    }
}
