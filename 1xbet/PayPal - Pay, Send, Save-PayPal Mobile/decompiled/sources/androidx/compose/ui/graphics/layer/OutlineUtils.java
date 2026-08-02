package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/OutlineUtils;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getHighSpeedVideoSizes", "(Landroid/view/View;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OutlineUtils {
    public static final androidx.compose.ui.graphics.layer.OutlineUtils INSTANCE = new androidx.compose.ui.graphics.layer.OutlineUtils();

    private OutlineUtils() {
    }

    public static boolean getHighSpeedVideoSizes(android.view.View p0) {
        p0.invalidateOutline();
        return true;
    }
}
