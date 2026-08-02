package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ androidx.compose.ui.contentcapture.ContentCaptureEventType[] getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.ui.contentcapture.ContentCaptureEventType getHighSpeedVideoFpsRanges;
    public static final androidx.compose.ui.contentcapture.ContentCaptureEventType getHighSpeedVideoSizes;

    private ContentCaptureEventType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.contentcapture.ContentCaptureEventType contentCaptureEventType = new androidx.compose.ui.contentcapture.ContentCaptureEventType("VIEW_APPEAR", 0);
        getHighSpeedVideoSizes = contentCaptureEventType;
        androidx.compose.ui.contentcapture.ContentCaptureEventType contentCaptureEventType2 = new androidx.compose.ui.contentcapture.ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        getHighSpeedVideoFpsRanges = contentCaptureEventType2;
        androidx.compose.ui.contentcapture.ContentCaptureEventType[] contentCaptureEventTypeArr = {contentCaptureEventType, contentCaptureEventType2};
        getHighResolutionOutputSizeshNQ4ISI = contentCaptureEventTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(contentCaptureEventTypeArr);
    }

    public static androidx.compose.ui.contentcapture.ContentCaptureEventType[] values() {
        return (androidx.compose.ui.contentcapture.ContentCaptureEventType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.ui.contentcapture.ContentCaptureEventType valueOf(java.lang.String str) {
        return (androidx.compose.ui.contentcapture.ContentCaptureEventType) java.lang.Enum.valueOf(androidx.compose.ui.contentcapture.ContentCaptureEventType.class, str);
    }
}
