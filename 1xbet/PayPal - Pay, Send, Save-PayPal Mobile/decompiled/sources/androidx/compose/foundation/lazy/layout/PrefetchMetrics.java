package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "<init>", "()V", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/layout/Averages;", "getAverage", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;", "Landroidx/collection/MutableScatterMap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterMap;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/layout/Averages;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.Averages getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.Averages> Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();

    public final androidx.compose.foundation.lazy.layout.Averages getAverage(java.lang.Object contentType) {
        androidx.compose.foundation.lazy.layout.Averages averages = this.getHighSpeedVideoSizes;
        if (this.getHighResolutionOutputSizeshNQ4ISI == contentType && averages != null) {
            return averages;
        }
        androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.Averages> mutableScatterMap = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.lazy.layout.Averages averages2 = mutableScatterMap.get(contentType);
        if (averages2 == null) {
            averages2 = new androidx.compose.foundation.lazy.layout.Averages();
            mutableScatterMap.set(contentType, averages2);
        }
        androidx.compose.foundation.lazy.layout.Averages averages3 = averages2;
        this.getHighResolutionOutputSizeshNQ4ISI = contentType;
        this.getHighSpeedVideoSizes = averages3;
        return averages3;
    }
}
