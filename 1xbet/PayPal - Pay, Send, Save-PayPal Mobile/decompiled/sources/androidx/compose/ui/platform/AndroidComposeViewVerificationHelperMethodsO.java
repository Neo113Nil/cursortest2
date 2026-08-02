package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsO;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "", "p2", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsO {
    public static final androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    public static void getHighSpeedVideoFpsRanges(android.view.View view) {
        view.setFocusable(1);
        view.setDefaultFocusHighlightEnabled(false);
    }
}
