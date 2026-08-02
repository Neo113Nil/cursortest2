package androidx.compose.ui.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnnotationType {
    public static final androidx.compose.ui.text.AnnotationType Camera2StreamConfigurationMap;
    public static final androidx.compose.ui.text.AnnotationType getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.ui.text.AnnotationType getHighSpeedVideoFpsRanges;
    public static final androidx.compose.ui.text.AnnotationType getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.ui.text.AnnotationType getHighSpeedVideoSizes;
    public static final androidx.compose.ui.text.AnnotationType getHighSpeedVideoSizesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getInputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.ui.text.AnnotationType[] getOutputFormats;
    public static final androidx.compose.ui.text.AnnotationType getOutputMinFrameDuration;

    private AnnotationType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.text.AnnotationType annotationType = new androidx.compose.ui.text.AnnotationType("Paragraph", 0);
        Camera2StreamConfigurationMap = annotationType;
        androidx.compose.ui.text.AnnotationType annotationType2 = new androidx.compose.ui.text.AnnotationType("Span", 1);
        getHighSpeedVideoFpsRangesFor = annotationType2;
        androidx.compose.ui.text.AnnotationType annotationType3 = new androidx.compose.ui.text.AnnotationType("VerbatimTts", 2);
        getOutputMinFrameDuration = annotationType3;
        androidx.compose.ui.text.AnnotationType annotationType4 = new androidx.compose.ui.text.AnnotationType(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, 3);
        getHighSpeedVideoSizesFor = annotationType4;
        androidx.compose.ui.text.AnnotationType annotationType5 = new androidx.compose.ui.text.AnnotationType(com.google.common.net.HttpHeaders.LINK, 4);
        getHighSpeedVideoSizes = annotationType5;
        androidx.compose.ui.text.AnnotationType annotationType6 = new androidx.compose.ui.text.AnnotationType("Clickable", 5);
        getHighSpeedVideoFpsRanges = annotationType6;
        androidx.compose.ui.text.AnnotationType annotationType7 = new androidx.compose.ui.text.AnnotationType("String", 6);
        getHighResolutionOutputSizeshNQ4ISI = annotationType7;
        androidx.compose.ui.text.AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        getOutputFormats = annotationTypeArr;
        getInputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(annotationTypeArr);
    }

    public static androidx.compose.ui.text.AnnotationType[] values() {
        return (androidx.compose.ui.text.AnnotationType[]) getOutputFormats.clone();
    }

    public static androidx.compose.ui.text.AnnotationType valueOf(java.lang.String str) {
        return (androidx.compose.ui.text.AnnotationType) java.lang.Enum.valueOf(androidx.compose.ui.text.AnnotationType.class, str);
    }
}
