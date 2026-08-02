package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroid/text/Layout$Alignment;", "get", "(I)Landroid/text/Layout$Alignment;", "getHighSpeedVideoFpsRanges", "Landroid/text/Layout$Alignment;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextAlignmentAdapter {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.TextAlignmentAdapter INSTANCE = new androidx.compose.ui.text.android.TextAlignmentAdapter();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final android.text.Layout.Alignment Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final android.text.Layout.Alignment getHighResolutionOutputSizeshNQ4ISI;

    private TextAlignmentAdapter() {
    }

    static {
        android.text.Layout.Alignment[] values = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
        for (android.text.Layout.Alignment alignment3 : values) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        Camera2StreamConfigurationMap = alignment;
        getHighResolutionOutputSizeshNQ4ISI = alignment2;
    }

    public final android.text.Layout.Alignment get(int value) {
        if (value == 0) {
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        if (value == 1) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (value == 2) {
            return android.text.Layout.Alignment.ALIGN_CENTER;
        }
        if (value == 3) {
            return Camera2StreamConfigurationMap;
        }
        if (value == 4) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        return android.text.Layout.Alignment.ALIGN_NORMAL;
    }
}
