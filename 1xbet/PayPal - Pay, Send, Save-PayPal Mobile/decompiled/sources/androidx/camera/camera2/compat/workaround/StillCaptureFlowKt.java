package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Landroidx/camera/camera2/pipe/Request;", "", "shouldStopRepeatingBeforeCapture", "(Ljava/util/List;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StillCaptureFlowKt {
    public static final boolean shouldStopRepeatingBeforeCapture(java.util.List<androidx.camera.camera2.pipe.Request> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (((androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class)) == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (androidx.camera.camera2.pipe.Request request : list) {
            androidx.camera.camera2.pipe.RequestTemplate template = request.getTemplate();
            if (template != null && template.m686unboximpl() == 2) {
                z = true;
            }
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Integer num = (java.lang.Integer) request.get(key);
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
