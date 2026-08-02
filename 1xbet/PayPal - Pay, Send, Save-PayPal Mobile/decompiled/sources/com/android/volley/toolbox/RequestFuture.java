package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class RequestFuture<T> implements java.util.concurrent.Future<T>, com.android.volley.Response.Listener<T>, com.android.volley.Response.ErrorListener {
    private T getHighResolutionOutputSizeshNQ4ISI;
    private com.android.volley.Request<?> getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private com.android.volley.VolleyError getHighSpeedVideoSizes;

    public static <E> com.android.volley.toolbox.RequestFuture<E> newFuture() {
        return new com.android.volley.toolbox.RequestFuture<>();
    }

    private RequestFuture() {
    }

    public void setRequest(com.android.volley.Request<?> request) {
        this.getHighSpeedVideoFpsRanges = request;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return false;
            }
            if (isDone()) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges.cancel();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        try {
            return Camera2StreamConfigurationMap(null);
        } catch (java.util.concurrent.TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return Camera2StreamConfigurationMap(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    private T Camera2StreamConfigurationMap(java.lang.Long l) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes != null) {
                throw new java.util.concurrent.ExecutionException(this.getHighSpeedVideoSizes);
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = android.os.SystemClock.uptimeMillis();
                }
            }
            if (this.getHighSpeedVideoSizes != null) {
                throw new java.util.concurrent.ExecutionException(this.getHighSpeedVideoSizes);
            }
            if (!this.getHighSpeedVideoFpsRangesFor) {
                throw new java.util.concurrent.TimeoutException();
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        com.android.volley.Request<?> request = this.getHighSpeedVideoFpsRanges;
        if (request == null) {
            return false;
        }
        return request.isCanceled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        synchronized (this) {
            if (!this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == null) {
                z = isCancelled();
            }
        }
        return z;
    }

    @Override // com.android.volley.Response.Listener
    public void onResponse(T t) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            notifyAll();
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(com.android.volley.VolleyError volleyError) {
        synchronized (this) {
            this.getHighSpeedVideoSizes = volleyError;
            notifyAll();
        }
    }
}
