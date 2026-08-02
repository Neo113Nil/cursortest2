package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class SizeCannotEncodeVideoQuirk implements androidx.camera.core.impl.Quirk {
    public android.graphics.Rect adjustCropRectForProblematicEncodeSize(android.graphics.Rect rect, int i, androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo) {
        android.util.Size rotateSize = androidx.camera.core.impl.utils.TransformUtils.rotateSize(androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect), i);
        if (!isProblematicEncodeSize(rotateSize)) {
            return rect;
        }
        int heightAlignment = videoEncoderInfo != null ? videoEncoderInfo.getHeightAlignment() / 2 : 8;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        if (rect.width() == rotateSize.getHeight()) {
            rect2.left += heightAlignment;
            rect2.right -= heightAlignment;
            return rect2;
        }
        rect2.top += heightAlignment;
        rect2.bottom -= heightAlignment;
        return rect2;
    }

    static boolean Camera2StreamConfigurationMap() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public boolean isProblematicEncodeSize(android.util.Size size) {
        return (("motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL)) ? new java.util.HashSet(java.util.Collections.singletonList(new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1280))) : java.util.Collections.emptySet()).contains(size);
    }
}
