package androidx.compose.ui.contentcapture;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "", "p0", "", "p1", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "p2", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "p3", "<init>", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "()Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "()Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ContentCaptureEvent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.contentcapture.ContentCaptureEventType getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.coreshims.ViewStructureCompat getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    public ContentCaptureEvent(int i, long j, androidx.compose.ui.contentcapture.ContentCaptureEventType contentCaptureEventType, androidx.compose.ui.platform.coreshims.ViewStructureCompat viewStructureCompat) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = contentCaptureEventType;
        this.getHighResolutionOutputSizeshNQ4ISI = viewStructureCompat;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.compose.ui.contentcapture.ContentCaptureEventType getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final androidx.compose.ui.platform.coreshims.ViewStructureCompat getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentCaptureEvent(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode2 = java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode3 = this.getHighSpeedVideoSizes.hashCode();
        androidx.compose.ui.platform.coreshims.ViewStructureCompat viewStructureCompat = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.contentcapture.ContentCaptureEvent)) {
            return false;
        }
        androidx.compose.ui.contentcapture.ContentCaptureEvent contentCaptureEvent = (androidx.compose.ui.contentcapture.ContentCaptureEvent) p0;
        return this.Camera2StreamConfigurationMap == contentCaptureEvent.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == contentCaptureEvent.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == contentCaptureEvent.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, contentCaptureEvent.getHighResolutionOutputSizeshNQ4ISI);
    }
}
