package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/layout/util/DisplayHelper;", "", "<init>", "()V", "Landroid/view/Display;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Landroid/graphics/Point;", "getRealSizeForDisplay", "(Landroid/view/Display;)Landroid/graphics/Point;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayHelper {
    public static final androidx.window.layout.util.DisplayHelper INSTANCE = new androidx.window.layout.util.DisplayHelper();

    private DisplayHelper() {
    }

    public final android.graphics.Point getRealSizeForDisplay(android.view.Display display) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(display, "");
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        return point;
    }
}
