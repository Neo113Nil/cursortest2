package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
final class d {
    private static lib.android.paypal.com.magnessdk.network.base.d getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    java.util.concurrent.ThreadPoolExecutor getHighSpeedVideoFpsRanges;

    static lib.android.paypal.com.magnessdk.network.base.d getHighSpeedVideoFpsRangesFor() {
        lib.android.paypal.com.magnessdk.network.base.d dVar;
        synchronized (getHighSpeedVideoSizes) {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new lib.android.paypal.com.magnessdk.network.base.d();
            }
            dVar = getHighResolutionOutputSizeshNQ4ISI;
        }
        return dVar;
    }

    private d() {
        try {
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.ThreadPoolExecutor(10, 10, 60000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.ArrayBlockingQueue(256), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
        } catch (java.lang.Exception unused) {
        }
    }
}
