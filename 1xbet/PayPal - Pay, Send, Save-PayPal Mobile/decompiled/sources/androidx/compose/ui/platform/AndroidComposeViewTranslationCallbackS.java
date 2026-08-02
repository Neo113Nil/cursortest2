package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "setViewTranslationCallback", "(Landroid/view/View;)V", "clearViewTranslationCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    public final void setViewTranslationCallback(android.view.View view) {
        view.setViewTranslationCallback(androidx.compose.ui.platform.AndroidComposeViewTranslationCallback.INSTANCE);
    }

    public final void clearViewTranslationCallback(android.view.View view) {
        view.clearViewTranslationCallback();
    }
}
