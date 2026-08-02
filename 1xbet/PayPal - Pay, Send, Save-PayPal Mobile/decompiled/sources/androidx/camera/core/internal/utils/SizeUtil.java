package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public final class SizeUtil {
    public static final android.util.Size RESOLUTION_ZERO = new android.util.Size(0, 0);
    public static final android.util.Size RESOLUTION_QVGA = new android.util.Size(320, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    public static final android.util.Size RESOLUTION_VGA = new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
    public static final android.util.Size RESOLUTION_480P = new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
    public static final android.util.Size RESOLUTION_720P = new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);
    public static final android.util.Size RESOLUTION_1080P = new android.util.Size(1920, 1080);
    public static final android.util.Size RESOLUTION_1440P = new android.util.Size(1920, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH);
    public static final android.util.Size RESOLUTION_1440P_16_9 = new android.util.Size(2560, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH);
    public static final android.util.Size RESOLUTION_UHD = new android.util.Size(3840, 2160);

    public static int getArea(int i, int i2) {
        return i * i2;
    }

    private SizeUtil() {
    }

    public static int getArea(android.util.Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }

    public static boolean isSmallerByArea(android.util.Size size, android.util.Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static boolean isLongerInAnyEdge(android.util.Size size, android.util.Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    public static android.util.Size getMaxSize(java.util.List<android.util.Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (android.util.Size) java.util.Collections.max(list, new androidx.camera.core.impl.utils.CompareSizesByArea());
    }

    public static <T> T findNearestHigherFor(android.util.Size size, java.util.TreeMap<android.util.Size, T> treeMap) {
        java.util.Map.Entry<android.util.Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        java.util.Map.Entry<android.util.Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }
}
