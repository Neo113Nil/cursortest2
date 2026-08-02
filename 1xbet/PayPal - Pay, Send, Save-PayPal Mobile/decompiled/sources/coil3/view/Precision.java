package coil3.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcoil3/size/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "INEXACT"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Precision {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final coil3.view.Precision EXACT = new coil3.view.Precision("EXACT", 0);
    public static final coil3.view.Precision INEXACT = new coil3.view.Precision("INEXACT", 1);
    private static final /* synthetic */ coil3.view.Precision[] getHighResolutionOutputSizeshNQ4ISI;

    private Precision(java.lang.String str, int i) {
    }

    static {
        coil3.view.Precision[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static coil3.view.Precision[] values() {
        return (coil3.view.Precision[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static coil3.view.Precision valueOf(java.lang.String str) {
        return (coil3.view.Precision) java.lang.Enum.valueOf(coil3.view.Precision.class, str);
    }

    public static kotlin.enums.EnumEntries<coil3.view.Precision> getEntries() {
        return Camera2StreamConfigurationMap;
    }

    private static final /* synthetic */ coil3.view.Precision[] getHighSpeedVideoFpsRangesFor() {
        return new coil3.view.Precision[]{EXACT, INEXACT};
    }
}
