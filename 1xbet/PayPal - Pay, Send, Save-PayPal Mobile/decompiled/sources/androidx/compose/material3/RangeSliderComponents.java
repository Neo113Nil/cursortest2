package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/RangeSliderComponents;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RangeSliderComponents {
    public static final androidx.compose.material3.RangeSliderComponents Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.RangeSliderComponents getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material3.RangeSliderComponents getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.material3.RangeSliderComponents[] getHighSpeedVideoSizes;

    private RangeSliderComponents(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.RangeSliderComponents rangeSliderComponents = new androidx.compose.material3.RangeSliderComponents("ENDTHUMB", 0);
        getHighSpeedVideoFpsRangesFor = rangeSliderComponents;
        androidx.compose.material3.RangeSliderComponents rangeSliderComponents2 = new androidx.compose.material3.RangeSliderComponents("STARTTHUMB", 1);
        getHighResolutionOutputSizeshNQ4ISI = rangeSliderComponents2;
        androidx.compose.material3.RangeSliderComponents rangeSliderComponents3 = new androidx.compose.material3.RangeSliderComponents("TRACK", 2);
        Camera2StreamConfigurationMap = rangeSliderComponents3;
        androidx.compose.material3.RangeSliderComponents[] rangeSliderComponentsArr = {rangeSliderComponents, rangeSliderComponents2, rangeSliderComponents3};
        getHighSpeedVideoSizes = rangeSliderComponentsArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(rangeSliderComponentsArr);
    }

    public static androidx.compose.material3.RangeSliderComponents valueOf(java.lang.String str) {
        return (androidx.compose.material3.RangeSliderComponents) java.lang.Enum.valueOf(androidx.compose.material3.RangeSliderComponents.class, str);
    }

    public static androidx.compose.material3.RangeSliderComponents[] values() {
        return (androidx.compose.material3.RangeSliderComponents[]) getHighSpeedVideoSizes.clone();
    }
}
