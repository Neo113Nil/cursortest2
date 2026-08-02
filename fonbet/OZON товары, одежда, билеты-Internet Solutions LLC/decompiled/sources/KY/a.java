package KY;

import qc.InterfaceC9019a;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC9019a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewResourcesManagerImpl f15438a;

    public /* synthetic */ a(WebViewResourcesManagerImpl webViewResourcesManagerImpl) {
        this.f15438a = webViewResourcesManagerImpl;
    }

    @Override // qc.InterfaceC9019a
    public final void run() {
        this.f15438a.inProgress = null;
    }
}
