package arrow.optics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Larrow/optics/OpticsTarget;", "", "<init>", "(Ljava/lang/String;I)V", androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, "LENS", "PRISM", "OPTIONAL", "DSL"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpticsTarget {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final arrow.optics.OpticsTarget DSL;
    public static final arrow.optics.OpticsTarget ISO;
    public static final arrow.optics.OpticsTarget LENS;
    public static final arrow.optics.OpticsTarget OPTIONAL;
    public static final arrow.optics.OpticsTarget PRISM;
    private static final /* synthetic */ arrow.optics.OpticsTarget[] getHighSpeedVideoFpsRanges;

    private OpticsTarget(java.lang.String str, int i) {
    }

    static {
        arrow.optics.OpticsTarget opticsTarget = new arrow.optics.OpticsTarget(androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, 0);
        ISO = opticsTarget;
        arrow.optics.OpticsTarget opticsTarget2 = new arrow.optics.OpticsTarget("LENS", 1);
        LENS = opticsTarget2;
        arrow.optics.OpticsTarget opticsTarget3 = new arrow.optics.OpticsTarget("PRISM", 2);
        PRISM = opticsTarget3;
        arrow.optics.OpticsTarget opticsTarget4 = new arrow.optics.OpticsTarget("OPTIONAL", 3);
        OPTIONAL = opticsTarget4;
        arrow.optics.OpticsTarget opticsTarget5 = new arrow.optics.OpticsTarget("DSL", 4);
        DSL = opticsTarget5;
        arrow.optics.OpticsTarget[] opticsTargetArr = {opticsTarget, opticsTarget2, opticsTarget3, opticsTarget4, opticsTarget5};
        getHighSpeedVideoFpsRanges = opticsTargetArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(opticsTargetArr);
    }

    public static arrow.optics.OpticsTarget[] values() {
        return (arrow.optics.OpticsTarget[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static arrow.optics.OpticsTarget valueOf(java.lang.String str) {
        return (arrow.optics.OpticsTarget) java.lang.Enum.valueOf(arrow.optics.OpticsTarget.class, str);
    }

    public static kotlin.enums.EnumEntries<arrow.optics.OpticsTarget> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
