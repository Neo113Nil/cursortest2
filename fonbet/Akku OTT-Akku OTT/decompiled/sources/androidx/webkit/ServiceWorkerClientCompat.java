package androidx.webkit;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.WorkerThread;

/* loaded from: classes3.dex */
public abstract class ServiceWorkerClientCompat {
    @WorkerThread
    public abstract WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest);
}
