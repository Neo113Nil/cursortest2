package androidx.webkit;

/* loaded from: classes7.dex */
public abstract class ServiceWorkerControllerCompat {
    public abstract androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat);

    public static androidx.webkit.ServiceWorkerControllerCompat getInstance() {
        return androidx.webkit.ServiceWorkerControllerCompat.LAZY_HOLDER.getHighSpeedVideoFpsRangesFor;
    }

    static class LAZY_HOLDER {
        static final androidx.webkit.ServiceWorkerControllerCompat getHighSpeedVideoFpsRangesFor = new androidx.webkit.internal.ServiceWorkerControllerImpl();

        private LAZY_HOLDER() {
        }
    }
}
