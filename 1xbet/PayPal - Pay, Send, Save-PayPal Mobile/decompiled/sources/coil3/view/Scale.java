package coil3.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcoil3/size/Scale;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "FIT"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Scale {
    public static final coil3.view.Scale FILL = new coil3.view.Scale("FILL", 0);
    public static final coil3.view.Scale FIT = new coil3.view.Scale("FIT", 1);
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ coil3.view.Scale[] getHighSpeedVideoSizes;

    private Scale(java.lang.String str, int i) {
    }

    static {
        coil3.view.Scale[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
    }

    public static coil3.view.Scale[] values() {
        return (coil3.view.Scale[]) getHighSpeedVideoSizes.clone();
    }

    public static coil3.view.Scale valueOf(java.lang.String str) {
        return (coil3.view.Scale) java.lang.Enum.valueOf(coil3.view.Scale.class, str);
    }

    public static kotlin.enums.EnumEntries<coil3.view.Scale> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ coil3.view.Scale[] Camera2StreamConfigurationMap() {
        return new coil3.view.Scale[]{FILL, FIT};
    }
}
