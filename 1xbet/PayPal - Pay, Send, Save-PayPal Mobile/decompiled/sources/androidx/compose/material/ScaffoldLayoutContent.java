package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/compose/material/ScaffoldLayoutContent;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScaffoldLayoutContent {
    public static final androidx.compose.material.ScaffoldLayoutContent Camera2StreamConfigurationMap;
    public static final androidx.compose.material.ScaffoldLayoutContent getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.material.ScaffoldLayoutContent getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material.ScaffoldLayoutContent getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.material.ScaffoldLayoutContent getHighSpeedVideoSizes;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizesFor;
    private static final /* synthetic */ androidx.compose.material.ScaffoldLayoutContent[] getInputSizeshNQ4ISI;

    private ScaffoldLayoutContent(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent = new androidx.compose.material.ScaffoldLayoutContent("TopBar", 0);
        getHighSpeedVideoSizes = scaffoldLayoutContent;
        androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent2 = new androidx.compose.material.ScaffoldLayoutContent("MainContent", 1);
        Camera2StreamConfigurationMap = scaffoldLayoutContent2;
        androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent3 = new androidx.compose.material.ScaffoldLayoutContent("Snackbar", 2);
        getHighResolutionOutputSizeshNQ4ISI = scaffoldLayoutContent3;
        androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent4 = new androidx.compose.material.ScaffoldLayoutContent("Fab", 3);
        getHighSpeedVideoFpsRangesFor = scaffoldLayoutContent4;
        androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent5 = new androidx.compose.material.ScaffoldLayoutContent("BottomBar", 4);
        getHighSpeedVideoFpsRanges = scaffoldLayoutContent5;
        androidx.compose.material.ScaffoldLayoutContent[] scaffoldLayoutContentArr = {scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
        getInputSizeshNQ4ISI = scaffoldLayoutContentArr;
        getHighSpeedVideoSizesFor = kotlin.enums.EnumEntriesKt.enumEntries(scaffoldLayoutContentArr);
    }

    public static androidx.compose.material.ScaffoldLayoutContent[] values() {
        return (androidx.compose.material.ScaffoldLayoutContent[]) getInputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.material.ScaffoldLayoutContent valueOf(java.lang.String str) {
        return (androidx.compose.material.ScaffoldLayoutContent) java.lang.Enum.valueOf(androidx.compose.material.ScaffoldLayoutContent.class, str);
    }
}
