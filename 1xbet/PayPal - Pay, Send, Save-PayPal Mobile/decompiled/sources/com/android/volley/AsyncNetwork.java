package com.android.volley;

/* loaded from: classes7.dex */
public abstract class AsyncNetwork implements com.android.volley.Network {
    private java.util.concurrent.ScheduledExecutorService getHighResolutionOutputSizeshNQ4ISI;
    private java.util.concurrent.ExecutorService getHighSpeedVideoFpsRangesFor;
    private java.util.concurrent.ExecutorService getHighSpeedVideoSizes;

    public interface OnRequestComplete {
        void onError(com.android.volley.VolleyError volleyError);

        void onSuccess(com.android.volley.NetworkResponse networkResponse);
    }

    public abstract void performRequest(com.android.volley.Request<?> request, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete);

    @Override // com.android.volley.Network
    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request<?> request) throws com.android.volley.VolleyError {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        performRequest(request, new com.android.volley.AsyncNetwork.OnRequestComplete() { // from class: com.android.volley.AsyncNetwork.1
            @Override // com.android.volley.AsyncNetwork.OnRequestComplete
            public void onSuccess(com.android.volley.NetworkResponse networkResponse) {
                atomicReference.set(networkResponse);
                countDownLatch.countDown();
            }

            @Override // com.android.volley.AsyncNetwork.OnRequestComplete
            public void onError(com.android.volley.VolleyError volleyError) {
                atomicReference2.set(volleyError);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (com.android.volley.NetworkResponse) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((com.android.volley.VolleyError) atomicReference2.get());
            }
            throw new com.android.volley.VolleyError("Neither response entry was set");
        } catch (java.lang.InterruptedException e) {
            com.android.volley.VolleyLog.e(e, "while waiting for CountDownLatch", new java.lang.Object[0]);
            java.lang.Thread.currentThread().interrupt();
            throw new com.android.volley.VolleyError(e);
        }
    }

    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        this.getHighSpeedVideoFpsRangesFor = executorService;
    }

    public void setBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        this.getHighSpeedVideoSizes = executorService;
    }

    public void setNonBlockingScheduledExecutor(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.getHighResolutionOutputSizeshNQ4ISI = scheduledExecutorService;
    }

    public java.util.concurrent.ExecutorService getBlockingExecutor() {
        return this.getHighSpeedVideoSizes;
    }

    protected java.util.concurrent.ExecutorService getNonBlockingExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected java.util.concurrent.ScheduledExecutorService getNonBlockingScheduledExecutor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
