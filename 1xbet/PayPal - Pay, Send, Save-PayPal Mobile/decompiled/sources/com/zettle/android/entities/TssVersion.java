package com.zettle.android.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/zettle/android/entities/TssVersion;", "", "<init>", "(Ljava/lang/String;I)V", "V2"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TssVersion {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.zettle.android.entities.TssVersion[] $VALUES;
    public static final com.zettle.android.entities.TssVersion V2 = new com.zettle.android.entities.TssVersion("V2", 0);

    private TssVersion(java.lang.String str, int i) {
    }

    static {
        com.zettle.android.entities.TssVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.zettle.android.entities.TssVersion[] values() {
        return (com.zettle.android.entities.TssVersion[]) $VALUES.clone();
    }

    public static com.zettle.android.entities.TssVersion valueOf(java.lang.String str) {
        return (com.zettle.android.entities.TssVersion) java.lang.Enum.valueOf(com.zettle.android.entities.TssVersion.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.android.entities.TssVersion> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.zettle.android.entities.TssVersion[] $values() {
        return new com.zettle.android.entities.TssVersion[]{V2};
    }
}
