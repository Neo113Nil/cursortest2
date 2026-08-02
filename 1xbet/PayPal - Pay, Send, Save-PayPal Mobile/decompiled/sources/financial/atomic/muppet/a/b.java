package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class b extends android.webkit.WebView {
    public b(android.content.Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && canGoBack()) {
            goBack();
            return true;
        }
        if (i != 125 || !canGoForward()) {
            return super.onKeyDown(i, keyEvent);
        }
        goForward();
        return true;
    }
}
