package androidx.browser.trusted;

/* loaded from: classes6.dex */
class ConnectionHolder implements android.content.ServiceConnection {
    int Camera2StreamConfigurationMap;
    androidx.browser.trusted.TrustedWebActivityServiceConnection getHighResolutionOutputSizeshNQ4ISI;
    java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> getHighSpeedVideoFpsRanges;
    java.lang.Exception getHighSpeedVideoFpsRangesFor;
    final java.lang.Runnable getHighSpeedVideoSizes;
    private final androidx.browser.trusted.ConnectionHolder.WrapperFactory getInputFormats;

    static class WrapperFactory {
        WrapperFactory() {
        }

        static androidx.browser.trusted.TrustedWebActivityServiceConnection getHighSpeedVideoSizes(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection(android.support.customtabs.trusted.ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    ConnectionHolder(java.lang.Runnable runnable) {
        this(runnable, new androidx.browser.trusted.ConnectionHolder.WrapperFactory());
    }

    private ConnectionHolder(java.lang.Runnable runnable, androidx.browser.trusted.ConnectionHolder.WrapperFactory wrapperFactory) {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = runnable;
        this.getInputFormats = wrapperFactory;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.browser.trusted.ConnectionHolder.WrapperFactory.getHighSpeedVideoSizes(componentName, iBinder);
        java.util.Iterator<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().set(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoFpsRanges.clear();
        this.Camera2StreamConfigurationMap = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes.run();
        this.Camera2StreamConfigurationMap = 2;
    }
}
