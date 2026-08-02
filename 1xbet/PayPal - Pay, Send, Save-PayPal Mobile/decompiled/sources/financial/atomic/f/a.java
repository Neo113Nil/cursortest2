package financial.atomic.f;

/* loaded from: classes3.dex */
public final class a extends android.webkit.WebView {

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.transact.Transact f6744a;
    public financial.atomic.muppet.inter.Page<? extends android.webkit.WebView> page;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(financial.atomic.transact.Transact transact) {
        super((r0 == null || (r0 = r0.getContext()) == null) ? transact.getContext() : r0);
        android.content.Context context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        java.lang.Object parent = transact.view().getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        this.f6744a = transact;
    }

    public final financial.atomic.muppet.inter.Page<android.webkit.WebView> getPage() {
        financial.atomic.muppet.inter.Page page = this.page;
        if (page != null) {
            return page;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final financial.atomic.transact.Transact getTransact() {
        return this.f6744a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (canGoBack()) {
                goBack();
            } else {
                getPage().close();
            }
            return true;
        }
        if (i != 125 || !canGoForward()) {
            return super.onKeyDown(i, keyEvent);
        }
        goForward();
        return true;
    }

    public final void setPage(financial.atomic.muppet.inter.Page<? extends android.webkit.WebView> page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        this.page = page;
    }
}
