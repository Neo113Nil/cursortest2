package coil.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scale.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil/size/Scale;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "FIT", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Scale {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ coil.size.Scale[] $VALUES;
    public static final coil.size.Scale FILL = new coil.size.Scale("FILL", 0);
    public static final coil.size.Scale FIT = new coil.size.Scale("FIT", 1);

    private static final /* synthetic */ coil.size.Scale[] $values() {
        return new coil.size.Scale[]{FILL, FIT};
    }

    public static kotlin.enums.EnumEntries<coil.size.Scale> getEntries() {
        return $ENTRIES;
    }

    private Scale(java.lang.String str, int i) {
    }

    static {
        coil.size.Scale[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static coil.size.Scale valueOf(java.lang.String str) {
        return (coil.size.Scale) java.lang.Enum.valueOf(coil.size.Scale.class, str);
    }

    public static coil.size.Scale[] values() {
        return (coil.size.Scale[]) $VALUES.clone();
    }
}
