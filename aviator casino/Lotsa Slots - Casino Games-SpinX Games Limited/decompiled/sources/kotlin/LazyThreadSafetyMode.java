package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyThreadSafetyMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $VALUES;
    public static final kotlin.LazyThreadSafetyMode SYNCHRONIZED = new kotlin.LazyThreadSafetyMode("SYNCHRONIZED", 0);
    public static final kotlin.LazyThreadSafetyMode PUBLICATION = new kotlin.LazyThreadSafetyMode("PUBLICATION", 1);
    public static final kotlin.LazyThreadSafetyMode NONE = new kotlin.LazyThreadSafetyMode("NONE", 2);

    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $values() {
        return new kotlin.LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static kotlin.enums.EnumEntries<kotlin.LazyThreadSafetyMode> getEntries() {
        return $ENTRIES;
    }

    private LazyThreadSafetyMode(java.lang.String str, int i) {
    }

    static {
        kotlin.LazyThreadSafetyMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.LazyThreadSafetyMode valueOf(java.lang.String str) {
        return (kotlin.LazyThreadSafetyMode) java.lang.Enum.valueOf(kotlin.LazyThreadSafetyMode.class, str);
    }

    public static kotlin.LazyThreadSafetyMode[] values() {
        return (kotlin.LazyThreadSafetyMode[]) $VALUES.clone();
    }
}
