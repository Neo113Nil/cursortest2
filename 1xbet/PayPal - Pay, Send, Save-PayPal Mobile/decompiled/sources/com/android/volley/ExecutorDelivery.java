package com.android.volley;

/* loaded from: classes3.dex */
public class ExecutorDelivery implements com.android.volley.ResponseDelivery {
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;

    public ExecutorDelivery(final android.os.Handler handler) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.Executor() { // from class: com.android.volley.ExecutorDelivery.1
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public ExecutorDelivery(java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoFpsRanges = executor;
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(com.android.volley.Request<?> request, com.android.volley.Response<?> response) {
        postResponse(request, response, null);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(com.android.volley.Request<?> request, com.android.volley.Response<?> response, java.lang.Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.getHighSpeedVideoFpsRanges.execute(new com.android.volley.ExecutorDelivery.ResponseDeliveryRunnable(request, response, runnable));
    }

    @Override // com.android.volley.ResponseDelivery
    public void postError(com.android.volley.Request<?> request, com.android.volley.VolleyError volleyError) {
        request.addMarker("post-error");
        this.getHighSpeedVideoFpsRanges.execute(new com.android.volley.ExecutorDelivery.ResponseDeliveryRunnable(request, com.android.volley.Response.error(volleyError), null));
    }

    static class ResponseDeliveryRunnable implements java.lang.Runnable {
        private final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
        private final com.android.volley.Request getHighSpeedVideoFpsRanges;
        private final com.android.volley.Response getHighSpeedVideoSizes;

        public ResponseDeliveryRunnable(com.android.volley.Request request, com.android.volley.Response response, java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges = request;
            this.getHighSpeedVideoSizes = response;
            this.getHighResolutionOutputSizeshNQ4ISI = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getHighSpeedVideoFpsRanges.isCanceled()) {
                this.getHighSpeedVideoFpsRanges.finish("canceled-at-delivery");
                return;
            }
            if (this.getHighSpeedVideoSizes.isSuccess()) {
                this.getHighSpeedVideoFpsRanges.deliverResponse(this.getHighSpeedVideoSizes.result);
            } else {
                this.getHighSpeedVideoFpsRanges.deliverError(this.getHighSpeedVideoSizes.error);
            }
            if (this.getHighSpeedVideoSizes.intermediate) {
                this.getHighSpeedVideoFpsRanges.addMarker("intermediate-response");
            } else {
                this.getHighSpeedVideoFpsRanges.finish(com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone);
            }
            java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
