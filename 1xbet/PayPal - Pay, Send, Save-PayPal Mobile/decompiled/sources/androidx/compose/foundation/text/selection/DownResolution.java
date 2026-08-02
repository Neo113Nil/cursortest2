package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DownResolution {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.foundation.text.selection.DownResolution getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.foundation.text.selection.DownResolution getHighSpeedVideoFpsRanges;
    public static final androidx.compose.foundation.text.selection.DownResolution getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.foundation.text.selection.DownResolution getHighSpeedVideoSizes;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.DownResolution[] getOutputFormats;

    private DownResolution(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.DownResolution downResolution = new androidx.compose.foundation.text.selection.DownResolution("Up", 0);
        getHighSpeedVideoFpsRangesFor = downResolution;
        androidx.compose.foundation.text.selection.DownResolution downResolution2 = new androidx.compose.foundation.text.selection.DownResolution("Drag", 1);
        getHighResolutionOutputSizeshNQ4ISI = downResolution2;
        androidx.compose.foundation.text.selection.DownResolution downResolution3 = new androidx.compose.foundation.text.selection.DownResolution("Timeout", 2);
        getHighSpeedVideoSizes = downResolution3;
        androidx.compose.foundation.text.selection.DownResolution downResolution4 = new androidx.compose.foundation.text.selection.DownResolution(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, 3);
        getHighSpeedVideoFpsRanges = downResolution4;
        androidx.compose.foundation.text.selection.DownResolution[] downResolutionArr = {downResolution, downResolution2, downResolution3, downResolution4};
        getOutputFormats = downResolutionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(downResolutionArr);
    }

    public static androidx.compose.foundation.text.selection.DownResolution[] values() {
        return (androidx.compose.foundation.text.selection.DownResolution[]) getOutputFormats.clone();
    }

    public static androidx.compose.foundation.text.selection.DownResolution valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.DownResolution) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.DownResolution.class, str);
    }
}
