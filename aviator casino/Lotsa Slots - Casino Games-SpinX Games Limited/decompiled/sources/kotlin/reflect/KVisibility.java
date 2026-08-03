package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KVisibility {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.reflect.KVisibility[] $VALUES;
    public static final kotlin.reflect.KVisibility PUBLIC = new kotlin.reflect.KVisibility("PUBLIC", 0);
    public static final kotlin.reflect.KVisibility PROTECTED = new kotlin.reflect.KVisibility("PROTECTED", 1);
    public static final kotlin.reflect.KVisibility INTERNAL = new kotlin.reflect.KVisibility("INTERNAL", 2);
    public static final kotlin.reflect.KVisibility PRIVATE = new kotlin.reflect.KVisibility("PRIVATE", 3);

    private static final /* synthetic */ kotlin.reflect.KVisibility[] $values() {
        return new kotlin.reflect.KVisibility[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVisibility> getEntries() {
        return $ENTRIES;
    }

    private KVisibility(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.KVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.reflect.KVisibility valueOf(java.lang.String str) {
        return (kotlin.reflect.KVisibility) java.lang.Enum.valueOf(kotlin.reflect.KVisibility.class, str);
    }

    public static kotlin.reflect.KVisibility[] values() {
        return (kotlin.reflect.KVisibility[]) $VALUES.clone();
    }
}
