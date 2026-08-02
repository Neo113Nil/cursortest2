package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/Api35Impl;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api35Impl {
    public static final androidx.compose.ui.platform.Api35Impl INSTANCE = new androidx.compose.ui.platform.Api35Impl();

    private Api35Impl() {
    }

    @kotlin.jvm.JvmStatic
    public static final void getHighSpeedVideoFpsRanges(android.view.View p0, float p1) {
        p0.setRequestedFrameRate(p1);
    }
}
