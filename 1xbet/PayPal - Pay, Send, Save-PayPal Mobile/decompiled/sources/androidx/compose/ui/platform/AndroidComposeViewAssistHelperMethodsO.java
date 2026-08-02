package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAssistHelperMethodsO;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "p0", "Landroid/view/View;", "p1", "", "getHighSpeedVideoSizes", "(Landroid/view/ViewStructure;Landroid/view/View;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewAssistHelperMethodsO {
    public static final androidx.compose.ui.platform.AndroidComposeViewAssistHelperMethodsO INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAssistHelperMethodsO();

    private AndroidComposeViewAssistHelperMethodsO() {
    }

    public static void getHighSpeedVideoSizes(android.view.ViewStructure p0, android.view.View p1) {
        p0.setClassName(p1.getAccessibilityClassName().toString());
    }
}
