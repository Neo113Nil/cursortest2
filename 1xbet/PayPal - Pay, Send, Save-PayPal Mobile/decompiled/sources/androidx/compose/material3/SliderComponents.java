package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/SliderComponents;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SliderComponents {
    public static final androidx.compose.material3.SliderComponents Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.material3.SliderComponents getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.material3.SliderComponents[] getHighSpeedVideoSizes;

    private SliderComponents(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.SliderComponents sliderComponents = new androidx.compose.material3.SliderComponents("THUMB", 0);
        getHighSpeedVideoFpsRangesFor = sliderComponents;
        androidx.compose.material3.SliderComponents sliderComponents2 = new androidx.compose.material3.SliderComponents("TRACK", 1);
        Camera2StreamConfigurationMap = sliderComponents2;
        androidx.compose.material3.SliderComponents[] sliderComponentsArr = {sliderComponents, sliderComponents2};
        getHighSpeedVideoSizes = sliderComponentsArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(sliderComponentsArr);
    }

    public static androidx.compose.material3.SliderComponents valueOf(java.lang.String str) {
        return (androidx.compose.material3.SliderComponents) java.lang.Enum.valueOf(androidx.compose.material3.SliderComponents.class, str);
    }

    public static androidx.compose.material3.SliderComponents[] values() {
        return (androidx.compose.material3.SliderComponents[]) getHighSpeedVideoSizes.clone();
    }
}
