package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlinx/datetime/format/AmPmMarker;", "", "<init>", "(Ljava/lang/String;I)V", "AM", "PM"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmPmMarker {
    public static final kotlinx.datetime.format.AmPmMarker AM;
    public static final kotlinx.datetime.format.AmPmMarker PM;
    private static final /* synthetic */ kotlinx.datetime.format.AmPmMarker[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AmPmMarker(java.lang.String str, int i) {
    }

    static {
        kotlinx.datetime.format.AmPmMarker amPmMarker = new kotlinx.datetime.format.AmPmMarker("AM", 0);
        AM = amPmMarker;
        kotlinx.datetime.format.AmPmMarker amPmMarker2 = new kotlinx.datetime.format.AmPmMarker("PM", 1);
        PM = amPmMarker2;
        kotlinx.datetime.format.AmPmMarker[] amPmMarkerArr = {amPmMarker, amPmMarker2};
        getHighResolutionOutputSizeshNQ4ISI = amPmMarkerArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(amPmMarkerArr);
    }

    public static kotlinx.datetime.format.AmPmMarker valueOf(java.lang.String str) {
        return (kotlinx.datetime.format.AmPmMarker) java.lang.Enum.valueOf(kotlinx.datetime.format.AmPmMarker.class, str);
    }

    public static kotlinx.datetime.format.AmPmMarker[] values() {
        return (kotlinx.datetime.format.AmPmMarker[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.datetime.format.AmPmMarker> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
