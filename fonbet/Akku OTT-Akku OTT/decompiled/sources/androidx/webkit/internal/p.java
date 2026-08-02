package androidx.webkit.internal;

import androidx.work.impl.WorkerWrapper;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$onPageLoadEventFired$4;
        Boolean runWorker$lambda$1;
        switch (this.a) {
            case 0:
                lambda$onPageLoadEventFired$4 = WebNavigationClientAdapter.lambda$onPageLoadEventFired$4((WebViewPageBoundaryInterface) this.b);
                return lambda$onPageLoadEventFired$4;
            default:
                runWorker$lambda$1 = WorkerWrapper.runWorker$lambda$1((WorkerWrapper) this.b);
                return runWorker$lambda$1;
        }
    }
}
