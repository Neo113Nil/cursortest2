package coil.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcoil/decode/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DataSource {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ coil.decode.DataSource[] $VALUES;
    public static final coil.decode.DataSource MEMORY_CACHE = new coil.decode.DataSource("MEMORY_CACHE", 0);
    public static final coil.decode.DataSource MEMORY = new coil.decode.DataSource("MEMORY", 1);
    public static final coil.decode.DataSource DISK = new coil.decode.DataSource("DISK", 2);
    public static final coil.decode.DataSource NETWORK = new coil.decode.DataSource("NETWORK", 3);

    private static final /* synthetic */ coil.decode.DataSource[] $values() {
        return new coil.decode.DataSource[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    public static kotlin.enums.EnumEntries<coil.decode.DataSource> getEntries() {
        return $ENTRIES;
    }

    private DataSource(java.lang.String str, int i) {
    }

    static {
        coil.decode.DataSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static coil.decode.DataSource valueOf(java.lang.String str) {
        return (coil.decode.DataSource) java.lang.Enum.valueOf(coil.decode.DataSource.class, str);
    }

    public static coil.decode.DataSource[] values() {
        return (coil.decode.DataSource[]) $VALUES.clone();
    }
}
