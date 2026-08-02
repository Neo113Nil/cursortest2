package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewSensitiveContent35 {
    public static final androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35 INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewSensitiveContent35();

    private AndroidComposeViewSensitiveContent35() {
    }

    public static void getHighSpeedVideoFpsRangesFor(android.view.View p0, boolean p1) {
        if (p1) {
            p0.setContentSensitivity(1);
        } else {
            p0.setContentSensitivity(0);
        }
    }
}
