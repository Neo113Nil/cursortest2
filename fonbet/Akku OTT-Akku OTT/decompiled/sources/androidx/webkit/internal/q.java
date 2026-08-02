package androidx.webkit.internal;

import androidx.work.impl.WorkerWrapper;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$onPageDOMContentLoadedEventFired$5;
        Boolean trySetRunning$lambda$11;
        Void deleteFirebaseInstallationId;
        switch (this.a) {
            case 0:
                lambda$onPageDOMContentLoadedEventFired$5 = WebNavigationClientAdapter.lambda$onPageDOMContentLoadedEventFired$5((WebViewPageBoundaryInterface) this.b);
                return lambda$onPageDOMContentLoadedEventFired$5;
            case 1:
                trySetRunning$lambda$11 = WorkerWrapper.trySetRunning$lambda$11((WorkerWrapper) this.b);
                return trySetRunning$lambda$11;
            default:
                deleteFirebaseInstallationId = ((FirebaseInstallations) this.b).deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
        }
    }
}
