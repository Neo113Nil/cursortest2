package androidx.core.provider;

/* loaded from: classes3.dex */
class CallbackWrapper {
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.core.provider.FontsContractCompat.FontRequestCallback getHighSpeedVideoFpsRangesFor;

    CallbackWrapper(androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoFpsRangesFor = fontRequestCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
    }

    CallbackWrapper(androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this(fontRequestCallback, androidx.core.provider.RequestExecutor.getHighSpeedVideoSizes(androidx.core.provider.CalleeHandler.getHighSpeedVideoSizes()));
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.getHighResolutionOutputSizeshNQ4ISI == 0) {
            final android.graphics.Typeface typeface = typefaceResult.Camera2StreamConfigurationMap;
            final androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRetrieved(typeface);
                }
            });
        } else {
            final int i = typefaceResult.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback2.onTypefaceRequestFailed(i);
                }
            });
        }
    }
}
