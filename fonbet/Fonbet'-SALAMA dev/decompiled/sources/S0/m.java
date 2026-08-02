package S0;

import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public final class m extends R0.j {

    /* renamed from: a, reason: collision with root package name */
    public ServiceWorkerController f6247a;

    /* renamed from: b, reason: collision with root package name */
    public final ServiceWorkerControllerBoundaryInterface f6248b;

    /* renamed from: c, reason: collision with root package name */
    public final B f6249c;

    public m() {
        w.f6293h.getClass();
        ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
        this.f6247a = serviceWorkerController;
        if (serviceWorkerController == null) {
            this.f6247a = ServiceWorkerController.getInstance();
        }
        ServiceWorkerWebSettings serviceWorkerWebSettings = this.f6247a.getServiceWorkerWebSettings();
        B b7 = new B();
        b7.f6229b = serviceWorkerWebSettings;
        this.f6249c = b7;
    }
}
