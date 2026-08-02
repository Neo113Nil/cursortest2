package A0;

import android.content.pm.ApkChecksum;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.metrics.MediaMetricsManager;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;

/* renamed from: A0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0039k {
    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager e(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession n(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget o(F f, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(f, rect, point, scrollCaptureCallback);
    }
}
