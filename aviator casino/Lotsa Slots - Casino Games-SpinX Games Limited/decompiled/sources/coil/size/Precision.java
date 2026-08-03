package coil.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Precision.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcoil/size/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "INEXACT", "AUTOMATIC", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Precision {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ coil.size.Precision[] $VALUES;
    public static final coil.size.Precision EXACT = new coil.size.Precision("EXACT", 0);
    public static final coil.size.Precision INEXACT = new coil.size.Precision("INEXACT", 1);
    public static final coil.size.Precision AUTOMATIC = new coil.size.Precision("AUTOMATIC", 2);

    private static final /* synthetic */ coil.size.Precision[] $values() {
        return new coil.size.Precision[]{EXACT, INEXACT, AUTOMATIC};
    }

    public static kotlin.enums.EnumEntries<coil.size.Precision> getEntries() {
        return $ENTRIES;
    }

    private Precision(java.lang.String str, int i) {
    }

    static {
        coil.size.Precision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static coil.size.Precision valueOf(java.lang.String str) {
        return (coil.size.Precision) java.lang.Enum.valueOf(coil.size.Precision.class, str);
    }

    public static coil.size.Precision[] values() {
        return (coil.size.Precision[]) $VALUES.clone();
    }
}
