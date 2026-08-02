package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/window/Api21Impl;", "", "<init>", "()V", "Landroid/view/Window;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/Window;)I", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/Window;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api21Impl {
    public static final androidx.compose.ui.window.Api21Impl INSTANCE = new androidx.compose.ui.window.Api21Impl();

    private Api21Impl() {
    }

    public final int getHighResolutionOutputSizeshNQ4ISI(android.view.Window p0) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        p0.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels - getHighSpeedVideoFpsRangesFor(p0, displayMetrics.heightPixels);
    }

    private final int getHighSpeedVideoFpsRangesFor(android.view.Window p0, int p1) {
        android.graphics.Rect rect = new android.graphics.Rect();
        p0.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top + (rect.bottom > p1 ? rect.bottom - p1 : 0);
    }
}
