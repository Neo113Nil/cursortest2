package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class BasicAsyncNetwork extends com.android.volley.AsyncNetwork {
    private final com.android.volley.toolbox.ByteArrayPool getHighSpeedVideoFpsRangesFor;
    private final com.android.volley.toolbox.AsyncHttpStack getHighSpeedVideoSizes;

    /* synthetic */ BasicAsyncNetwork(com.android.volley.toolbox.AsyncHttpStack asyncHttpStack, com.android.volley.toolbox.ByteArrayPool byteArrayPool, byte b) {
        this(asyncHttpStack, byteArrayPool);
    }

    private BasicAsyncNetwork(com.android.volley.toolbox.AsyncHttpStack asyncHttpStack, com.android.volley.toolbox.ByteArrayPool byteArrayPool) {
        this.getHighSpeedVideoSizes = asyncHttpStack;
        this.getHighSpeedVideoFpsRangesFor = byteArrayPool;
    }

    @Override // com.android.volley.AsyncNetwork
    public void setBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        super.setBlockingExecutor(executorService);
        this.getHighSpeedVideoSizes.setBlockingExecutor(executorService);
    }

    @Override // com.android.volley.AsyncNetwork
    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService executorService) {
        super.setNonBlockingExecutor(executorService);
        this.getHighSpeedVideoSizes.setNonBlockingExecutor(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(com.android.volley.Request<?> request, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete, java.io.IOException iOException, long j, com.android.volley.toolbox.HttpResponse httpResponse, byte[] bArr) {
        try {
            getBlockingExecutor().execute(new com.android.volley.toolbox.BasicAsyncNetwork.InvokeRetryPolicyTask(request, com.android.volley.toolbox.NetworkUtility.Camera2StreamConfigurationMap(request, iOException, j, httpResponse, bArr), onRequestComplete));
        } catch (com.android.volley.VolleyError e) {
            onRequestComplete.onError(e);
        }
    }

    class InvokeRetryPolicyTask<T> extends com.android.volley.RequestTask<T> {
        final com.android.volley.toolbox.NetworkUtility.RetryInfo getHighResolutionOutputSizeshNQ4ISI;
        final com.android.volley.AsyncNetwork.OnRequestComplete getHighSpeedVideoFpsRanges;
        final com.android.volley.Request<T> getHighSpeedVideoSizes;

        InvokeRetryPolicyTask(com.android.volley.Request<T> request, com.android.volley.toolbox.NetworkUtility.RetryInfo retryInfo, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete) {
            super(request);
            this.getHighSpeedVideoSizes = request;
            this.getHighResolutionOutputSizeshNQ4ISI = retryInfo;
            this.getHighSpeedVideoFpsRanges = onRequestComplete;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.android.volley.toolbox.NetworkUtility.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                com.android.volley.toolbox.BasicAsyncNetwork.this.performRequest(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            } catch (com.android.volley.VolleyError e) {
                this.getHighSpeedVideoFpsRanges.onError(e);
            }
        }
    }

    @Override // com.android.volley.AsyncNetwork
    public void performRequest(final com.android.volley.Request<?> request, final com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete) {
        if (getBlockingExecutor() == null) {
            throw new java.lang.IllegalStateException("mBlockingExecuter must be set before making a request");
        }
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.getHighSpeedVideoSizes.executeRequest(request, com.android.volley.toolbox.HttpHeaderParser.getHighSpeedVideoSizes(request.getCacheEntry()), new com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete() { // from class: com.android.volley.toolbox.BasicAsyncNetwork.1
            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onSuccess(com.android.volley.toolbox.HttpResponse httpResponse) {
                com.android.volley.toolbox.BasicAsyncNetwork.getHighResolutionOutputSizeshNQ4ISI(com.android.volley.toolbox.BasicAsyncNetwork.this, request, elapsedRealtime, httpResponse, onRequestComplete);
            }

            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onAuthError(com.android.volley.AuthFailureError authFailureError) {
                onRequestComplete.onError(authFailureError);
            }

            @Override // com.android.volley.toolbox.AsyncHttpStack.OnRequestComplete
            public void onError(java.io.IOException iOException) {
                com.android.volley.toolbox.BasicAsyncNetwork.this.getHighSpeedVideoSizes((com.android.volley.Request<?>) request, onRequestComplete, iOException, elapsedRealtime, (com.android.volley.toolbox.HttpResponse) null, (byte[]) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(long j, int i, com.android.volley.toolbox.HttpResponse httpResponse, com.android.volley.Request<?> request, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete, java.util.List<com.android.volley.Header> list, byte[] bArr) {
        com.android.volley.toolbox.NetworkUtility.getHighSpeedVideoFpsRangesFor(android.os.SystemClock.elapsedRealtime() - j, request, bArr, i);
        if (i < 200 || i > 299) {
            getHighSpeedVideoSizes(request, onRequestComplete, new java.io.IOException(), j, httpResponse, bArr);
        } else {
            onRequestComplete.onSuccess(new com.android.volley.NetworkResponse(i, bArr, false, android.os.SystemClock.elapsedRealtime() - j, list));
        }
    }

    class ResponseParsingTask<T> extends com.android.volley.RequestTask<T> {
        java.io.InputStream Camera2StreamConfigurationMap;
        com.android.volley.toolbox.HttpResponse getHighResolutionOutputSizeshNQ4ISI;
        com.android.volley.AsyncNetwork.OnRequestComplete getHighSpeedVideoFpsRanges;
        com.android.volley.Request<T> getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        java.util.List<com.android.volley.Header> getHighSpeedVideoSizesFor;
        int getInputFormats;

        ResponseParsingTask(java.io.InputStream inputStream, com.android.volley.toolbox.HttpResponse httpResponse, com.android.volley.Request<T> request, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete, long j, java.util.List<com.android.volley.Header> list, int i) {
            super(request);
            this.Camera2StreamConfigurationMap = inputStream;
            this.getHighResolutionOutputSizeshNQ4ISI = httpResponse;
            this.getHighSpeedVideoFpsRangesFor = request;
            this.getHighSpeedVideoFpsRanges = onRequestComplete;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoSizesFor = list;
            this.getInputFormats = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.android.volley.toolbox.BasicAsyncNetwork.this.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, com.android.volley.toolbox.NetworkUtility.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getContentLength(), com.android.volley.toolbox.BasicAsyncNetwork.this.getHighSpeedVideoFpsRangesFor));
            } catch (java.io.IOException e) {
                com.android.volley.toolbox.BasicAsyncNetwork.this.getHighSpeedVideoSizes((com.android.volley.Request<?>) this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, e, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, (byte[]) null);
            }
        }
    }

    public static class Builder {
        private com.android.volley.toolbox.ByteArrayPool getHighSpeedVideoFpsRangesFor = null;
        private com.android.volley.toolbox.AsyncHttpStack getHighSpeedVideoSizes;

        public Builder(com.android.volley.toolbox.AsyncHttpStack asyncHttpStack) {
            this.getHighSpeedVideoSizes = asyncHttpStack;
        }

        public com.android.volley.toolbox.BasicAsyncNetwork.Builder setPool(com.android.volley.toolbox.ByteArrayPool byteArrayPool) {
            this.getHighSpeedVideoFpsRangesFor = byteArrayPool;
            return this;
        }

        public com.android.volley.toolbox.BasicAsyncNetwork build() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new com.android.volley.toolbox.ByteArrayPool(4096);
            }
            return new com.android.volley.toolbox.BasicAsyncNetwork(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.android.volley.toolbox.BasicAsyncNetwork basicAsyncNetwork, com.android.volley.Request request, long j, com.android.volley.toolbox.HttpResponse httpResponse, com.android.volley.AsyncNetwork.OnRequestComplete onRequestComplete) {
        int statusCode = httpResponse.getStatusCode();
        java.util.List<com.android.volley.Header> headers = httpResponse.getHeaders();
        if (statusCode == 304) {
            onRequestComplete.onSuccess(com.android.volley.toolbox.NetworkUtility.getHighResolutionOutputSizeshNQ4ISI(request, android.os.SystemClock.elapsedRealtime() - j, headers));
            return;
        }
        byte[] contentBytes = httpResponse.getContentBytes();
        if (contentBytes == null && httpResponse.getContent() == null) {
            contentBytes = new byte[0];
        }
        byte[] bArr = contentBytes;
        if (bArr != null) {
            basicAsyncNetwork.getHighSpeedVideoFpsRangesFor(j, statusCode, httpResponse, request, onRequestComplete, headers, bArr);
        } else {
            basicAsyncNetwork.getBlockingExecutor().execute(basicAsyncNetwork.new ResponseParsingTask(httpResponse.getContent(), httpResponse, request, onRequestComplete, j, headers, statusCode));
        }
    }
}
