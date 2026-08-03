package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KVariance {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.reflect.KVariance[] $VALUES;
    public static final kotlin.reflect.KVariance INVARIANT = new kotlin.reflect.KVariance("INVARIANT", 0);
    public static final kotlin.reflect.KVariance IN = new kotlin.reflect.KVariance("IN", 1);
    public static final kotlin.reflect.KVariance OUT = new kotlin.reflect.KVariance("OUT", 2);

    private static final /* synthetic */ kotlin.reflect.KVariance[] $values() {
        return new kotlin.reflect.KVariance[]{INVARIANT, IN, OUT};
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVariance> getEntries() {
        return $ENTRIES;
    }

    private KVariance(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.KVariance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.reflect.KVariance valueOf(java.lang.String str) {
        return (kotlin.reflect.KVariance) java.lang.Enum.valueOf(kotlin.reflect.KVariance.class, str);
    }

    public static kotlin.reflect.KVariance[] values() {
        return (kotlin.reflect.KVariance[]) $VALUES.clone();
    }
}
