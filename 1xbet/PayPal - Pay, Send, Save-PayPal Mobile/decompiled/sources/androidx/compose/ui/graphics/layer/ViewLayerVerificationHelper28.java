package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayerVerificationHelper28;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/view/View;I)V", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewLayerVerificationHelper28 {
    public static final androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28 INSTANCE = new androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public static void Camera2StreamConfigurationMap(android.view.View p0, int p1) {
        p0.setOutlineAmbientShadowColor(p1);
    }

    public static void getHighSpeedVideoFpsRanges(android.view.View p0, int p1) {
        p0.setOutlineSpotShadowColor(p1);
    }

    public static void getHighSpeedVideoFpsRanges(android.view.View p0) {
        p0.resetPivot();
    }
}
