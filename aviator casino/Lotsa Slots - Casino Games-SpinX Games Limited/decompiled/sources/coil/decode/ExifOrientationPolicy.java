package coil.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExifOrientationPolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "IGNORE", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExifOrientationPolicy {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ coil.decode.ExifOrientationPolicy[] $VALUES;
    public static final coil.decode.ExifOrientationPolicy IGNORE = new coil.decode.ExifOrientationPolicy("IGNORE", 0);
    public static final coil.decode.ExifOrientationPolicy RESPECT_PERFORMANCE = new coil.decode.ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
    public static final coil.decode.ExifOrientationPolicy RESPECT_ALL = new coil.decode.ExifOrientationPolicy("RESPECT_ALL", 2);

    private static final /* synthetic */ coil.decode.ExifOrientationPolicy[] $values() {
        return new coil.decode.ExifOrientationPolicy[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    public static kotlin.enums.EnumEntries<coil.decode.ExifOrientationPolicy> getEntries() {
        return $ENTRIES;
    }

    private ExifOrientationPolicy(java.lang.String str, int i) {
    }

    static {
        coil.decode.ExifOrientationPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static coil.decode.ExifOrientationPolicy valueOf(java.lang.String str) {
        return (coil.decode.ExifOrientationPolicy) java.lang.Enum.valueOf(coil.decode.ExifOrientationPolicy.class, str);
    }

    public static coil.decode.ExifOrientationPolicy[] values() {
        return (coil.decode.ExifOrientationPolicy[]) $VALUES.clone();
    }
}
