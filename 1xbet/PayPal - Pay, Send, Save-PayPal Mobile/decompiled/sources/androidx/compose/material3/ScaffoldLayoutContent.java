package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/compose/material3/ScaffoldLayoutContent;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScaffoldLayoutContent {
    public static final androidx.compose.material3.ScaffoldLayoutContent Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.ScaffoldLayoutContent getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.material3.ScaffoldLayoutContent getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material3.ScaffoldLayoutContent getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.material3.ScaffoldLayoutContent getHighSpeedVideoSizes;
    private static final /* synthetic */ kotlin.enums.EnumEntries getInputFormats;
    private static final /* synthetic */ androidx.compose.material3.ScaffoldLayoutContent[] getInputSizeshNQ4ISI;

    private ScaffoldLayoutContent(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.ScaffoldLayoutContent scaffoldLayoutContent = new androidx.compose.material3.ScaffoldLayoutContent("TopBar", 0);
        getHighResolutionOutputSizeshNQ4ISI = scaffoldLayoutContent;
        androidx.compose.material3.ScaffoldLayoutContent scaffoldLayoutContent2 = new androidx.compose.material3.ScaffoldLayoutContent("MainContent", 1);
        getHighSpeedVideoFpsRangesFor = scaffoldLayoutContent2;
        androidx.compose.material3.ScaffoldLayoutContent scaffoldLayoutContent3 = new androidx.compose.material3.ScaffoldLayoutContent("Snackbar", 2);
        getHighSpeedVideoFpsRanges = scaffoldLayoutContent3;
        androidx.compose.material3.ScaffoldLayoutContent scaffoldLayoutContent4 = new androidx.compose.material3.ScaffoldLayoutContent("Fab", 3);
        Camera2StreamConfigurationMap = scaffoldLayoutContent4;
        androidx.compose.material3.ScaffoldLayoutContent scaffoldLayoutContent5 = new androidx.compose.material3.ScaffoldLayoutContent("BottomBar", 4);
        getHighSpeedVideoSizes = scaffoldLayoutContent5;
        androidx.compose.material3.ScaffoldLayoutContent[] scaffoldLayoutContentArr = {scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
        getInputSizeshNQ4ISI = scaffoldLayoutContentArr;
        getInputFormats = kotlin.enums.EnumEntriesKt.enumEntries(scaffoldLayoutContentArr);
    }

    public static androidx.compose.material3.ScaffoldLayoutContent valueOf(java.lang.String str) {
        return (androidx.compose.material3.ScaffoldLayoutContent) java.lang.Enum.valueOf(androidx.compose.material3.ScaffoldLayoutContent.class, str);
    }

    public static androidx.compose.material3.ScaffoldLayoutContent[] values() {
        return (androidx.compose.material3.ScaffoldLayoutContent[]) getInputSizeshNQ4ISI.clone();
    }
}
