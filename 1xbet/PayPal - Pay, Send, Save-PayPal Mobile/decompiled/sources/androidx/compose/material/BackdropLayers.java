package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/BackdropLayers;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BackdropLayers {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.material.BackdropLayers getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.material.BackdropLayers[] getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material.BackdropLayers getHighSpeedVideoSizes;

    private BackdropLayers(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.BackdropLayers backdropLayers = new androidx.compose.material.BackdropLayers(com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, 0);
        getHighResolutionOutputSizeshNQ4ISI = backdropLayers;
        androidx.compose.material.BackdropLayers backdropLayers2 = new androidx.compose.material.BackdropLayers("Front", 1);
        getHighSpeedVideoSizes = backdropLayers2;
        androidx.compose.material.BackdropLayers[] backdropLayersArr = {backdropLayers, backdropLayers2};
        getHighSpeedVideoFpsRanges = backdropLayersArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(backdropLayersArr);
    }

    public static androidx.compose.material.BackdropLayers[] values() {
        return (androidx.compose.material.BackdropLayers[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.material.BackdropLayers valueOf(java.lang.String str) {
        return (androidx.compose.material.BackdropLayers) java.lang.Enum.valueOf(androidx.compose.material.BackdropLayers.class, str);
    }
}
