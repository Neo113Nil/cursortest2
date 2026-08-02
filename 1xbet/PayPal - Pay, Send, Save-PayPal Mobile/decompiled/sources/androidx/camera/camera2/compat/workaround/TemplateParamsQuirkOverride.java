package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TemplateParamsQuirkOverride;", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "Landroidx/camera/core/impl/Quirks;", "quirks", "<init>", "(Landroidx/camera/core/impl/Quirks;)V", "Landroidx/camera/camera2/pipe/RequestTemplate;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "getOverrideParams-xlOpshk", "(Landroidx/camera/camera2/pipe/RequestTemplate;)Ljava/util/Map;", "getOverrideParams", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TemplateParamsQuirkOverride implements androidx.camera.camera2.compat.workaround.TemplateParamsOverride {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    public TemplateParamsQuirkOverride(androidx.camera.core.impl.Quirks quirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.INSTANCE.workaroundByCaptureIntentPreview(quirks);
        this.getHighSpeedVideoSizes = quirks.contains(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // androidx.camera.camera2.compat.workaround.TemplateParamsOverride
    /* renamed from: getOverrideParams-xlOpshk */
    public final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mo79getOverrideParamsxlOpshk(androidx.camera.camera2.pipe.RequestTemplate template) {
        if (template != null && template.m686unboximpl() == 3 && this.getHighSpeedVideoFpsRangesFor) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        if (template != null && template.m686unboximpl() == 4 && this.getHighSpeedVideoSizes) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 2));
        }
        return kotlin.collections.MapsKt.emptyMap();
    }
}
