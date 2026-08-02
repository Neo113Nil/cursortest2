package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public abstract class AsyncHttpStack extends com.android.volley.toolbox.BaseHttpStack {
    private java.util.concurrent.ExecutorService Camera2StreamConfigurationMap;
    private java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI;

    public interface OnRequestComplete {
        void onAuthError(com.android.volley.AuthFailureError authFailureError);

        void onError(java.io.IOException iOException);

        void onSuccess(com.android.volley.toolbox.HttpResponse httpResponse);
    }

    public abstract void executeRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map, com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete onRequestComplete);

    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        this.Camera2StreamConfigurationMap = executorService;
    }

    public void setBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        this.getHighResolutionOutputSizeshNQ4ISI = executorService;
    }

    protected java.util.concurrent.ExecutorService getBlockingExecutor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected java.util.concurrent.ExecutorService getNonBlockingExecutor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public final com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        executeRequest(request, map, new com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete() { // from class: com.android.volley.toolbox.AsyncHttpStack.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onSuccess(com.android.volley.toolbox.HttpResponse httpResponse) {
                atomicReference.set(new com.android.volley.toolbox.AsyncHttpStack.Response(httpResponse, null, 0 == true ? 1 : 0, (byte) 0));
                countDownLatch.countDown();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onAuthError(com.android.volley.AuthFailureError authFailureError) {
                atomicReference.set(new com.android.volley.toolbox.AsyncHttpStack.Response(null, 0 == true ? 1 : 0, authFailureError, (byte) 0));
                countDownLatch.countDown();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onError(java.io.IOException iOException) {
                atomicReference.set(new com.android.volley.toolbox.AsyncHttpStack.Response(null, iOException, 0 == true ? 1 : 0, (byte) 0));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            com.android.volley.toolbox.AsyncHttpStack.Response response = (com.android.volley.toolbox.AsyncHttpStack.Response) atomicReference.get();
            if (response.getHighResolutionOutputSizeshNQ4ISI != null) {
                return response.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (response.getHighSpeedVideoFpsRangesFor != null) {
                throw response.getHighSpeedVideoFpsRangesFor;
            }
            throw response.Camera2StreamConfigurationMap;
        } catch (java.lang.InterruptedException e) {
            com.android.volley.VolleyLog.e(e, "while waiting for CountDownLatch", new java.lang.Object[0]);
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException(e.toString());
        }
    }

    static class Response {
        com.android.volley.AuthFailureError Camera2StreamConfigurationMap;
        com.android.volley.toolbox.HttpResponse getHighResolutionOutputSizeshNQ4ISI;
        java.io.IOException getHighSpeedVideoFpsRangesFor;

        /* synthetic */ Response(com.android.volley.toolbox.HttpResponse httpResponse, java.io.IOException iOException, com.android.volley.AuthFailureError authFailureError, byte b) {
            this(httpResponse, iOException, authFailureError);
        }

        private Response(com.android.volley.toolbox.HttpResponse httpResponse, java.io.IOException iOException, com.android.volley.AuthFailureError authFailureError) {
            this.getHighResolutionOutputSizeshNQ4ISI = httpResponse;
            this.getHighSpeedVideoFpsRangesFor = iOException;
            this.Camera2StreamConfigurationMap = authFailureError;
        }
    }
}
