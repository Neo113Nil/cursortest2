package androidx.webkit;

/* loaded from: classes7.dex */
public abstract class TracingController {
    public abstract boolean isTracing();

    public abstract void start(androidx.webkit.TracingConfig tracingConfig);

    public abstract boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor);

    public static androidx.webkit.TracingController getInstance() {
        return androidx.webkit.TracingController.LAZY_HOLDER.getHighSpeedVideoSizes;
    }

    static class LAZY_HOLDER {
        static final androidx.webkit.TracingController getHighSpeedVideoSizes = new androidx.webkit.internal.TracingControllerImpl();

        private LAZY_HOLDER() {
        }
    }
}
