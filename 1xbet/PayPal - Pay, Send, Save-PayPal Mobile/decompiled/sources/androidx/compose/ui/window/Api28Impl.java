package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/window/Api28Impl;", "", "<init>", "()V", "Landroid/view/WindowManager$LayoutParams;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/WindowManager$LayoutParams;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api28Impl {
    public static final androidx.compose.ui.window.Api28Impl INSTANCE = new androidx.compose.ui.window.Api28Impl();

    private Api28Impl() {
    }

    public final void getHighSpeedVideoFpsRangesFor(android.view.WindowManager.LayoutParams p0) {
        p0.layoutInDisplayCutoutMode = 3;
    }
}
