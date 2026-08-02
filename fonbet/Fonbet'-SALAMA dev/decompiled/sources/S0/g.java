package S0;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public final class g extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final R0.h f6240a;

    public g(R0.h hVar) {
        this.f6240a = hVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f6240a.shouldInterceptRequest(webResourceRequest);
    }
}
