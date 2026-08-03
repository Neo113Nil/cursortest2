package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/MotionEventVerifierApi29;", "", "()V", "isValidMotionEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class MotionEventVerifierApi29 {
    public static final androidx.compose.ui.platform.MotionEventVerifierApi29 INSTANCE = new androidx.compose.ui.platform.MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    public final boolean isValidMotionEvent(android.view.MotionEvent event, int index) {
        float rawX = event.getRawX(index);
        if (!java.lang.Float.isInfinite(rawX) && !java.lang.Float.isNaN(rawX)) {
            float rawY = event.getRawY(index);
            if (!java.lang.Float.isInfinite(rawY) && !java.lang.Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
