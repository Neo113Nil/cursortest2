package com.android.volley.toolbox;

/* loaded from: classes3.dex */
final class NetworkUtility {
    private NetworkUtility() {
    }

    static void getHighSpeedVideoFpsRangesFor(long j, com.android.volley.Request<?> request, byte[] bArr, int i) {
        if (com.android.volley.VolleyLog.DEBUG || j > 3000) {
            com.android.volley.VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, java.lang.Long.valueOf(j), bArr != null ? java.lang.Integer.valueOf(bArr.length) : "null", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount()));
        }
    }

    static com.android.volley.NetworkResponse getHighResolutionOutputSizeshNQ4ISI(com.android.volley.Request<?> request, long j, java.util.List<com.android.volley.Header> list) {
        com.android.volley.Cache.Entry cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.NetworkResponse(304, (byte[]) null, true, j, list);
        }
        return new com.android.volley.NetworkResponse(304, cacheEntry.data, true, j, com.android.volley.toolbox.HttpHeaderParser.getHighSpeedVideoFpsRangesFor(list, cacheEntry));
    }

    static byte[] Camera2StreamConfigurationMap(java.io.InputStream inputStream, int i, com.android.volley.toolbox.ByteArrayPool byteArrayPool) throws java.io.IOException {
        byte[] bArr;
        com.android.volley.toolbox.PoolingByteArrayOutputStream poolingByteArrayOutputStream = new com.android.volley.toolbox.PoolingByteArrayOutputStream(byteArrayPool, i);
        try {
            bArr = byteArrayPool.getBuf(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArr, 0, read);
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused) {
                            com.android.volley.VolleyLog.v("Error occurred when closing InputStream", new java.lang.Object[0]);
                        }
                    }
                    byteArrayPool.returnBuf(bArr);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                    com.android.volley.VolleyLog.v("Error occurred when closing InputStream", new java.lang.Object[0]);
                }
            }
            byteArrayPool.returnBuf(bArr);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    static void getHighSpeedVideoSizes(com.android.volley.Request<?> request, com.android.volley.toolbox.NetworkUtility.RetryInfo retryInfo) throws com.android.volley.VolleyError {
        com.android.volley.RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(retryInfo.getHighSpeedVideoFpsRanges);
            request.addMarker(java.lang.String.format("%s-retry [timeout=%s]", retryInfo.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(timeoutMs)));
        } catch (com.android.volley.VolleyError e) {
            request.addMarker(java.lang.String.format("%s-timeout-giveup [timeout=%s]", retryInfo.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    static class RetryInfo {
        private final com.android.volley.VolleyError getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* synthetic */ RetryInfo(java.lang.String str, com.android.volley.VolleyError volleyError, byte b) {
            this(str, volleyError);
        }

        private RetryInfo(java.lang.String str, com.android.volley.VolleyError volleyError) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = volleyError;
        }
    }

    static com.android.volley.toolbox.NetworkUtility.RetryInfo Camera2StreamConfigurationMap(com.android.volley.Request<?> request, java.io.IOException iOException, long j, com.android.volley.toolbox.HttpResponse httpResponse, byte[] bArr) throws com.android.volley.VolleyError {
        byte b = 0;
        if (iOException instanceof java.net.SocketTimeoutException) {
            return new com.android.volley.toolbox.NetworkUtility.RetryInfo("socket", new com.android.volley.TimeoutError(), b);
        }
        if (iOException instanceof java.net.MalformedURLException) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad URL ");
            sb.append(request.getUrl());
            throw new java.lang.RuntimeException(sb.toString(), iOException);
        }
        if (httpResponse != null) {
            int statusCode = httpResponse.getStatusCode();
            com.android.volley.VolleyLog.e("Unexpected response code %d for %s", java.lang.Integer.valueOf(statusCode), request.getUrl());
            if (bArr != null) {
                com.android.volley.NetworkResponse networkResponse = new com.android.volley.NetworkResponse(statusCode, bArr, false, android.os.SystemClock.elapsedRealtime() - j, httpResponse.getHeaders());
                if (statusCode == 401 || statusCode == 403) {
                    return new com.android.volley.toolbox.NetworkUtility.RetryInfo("auth", new com.android.volley.AuthFailureError(networkResponse), b);
                }
                if (statusCode >= 400 && statusCode <= 499) {
                    throw new com.android.volley.ClientError(networkResponse);
                }
                if (statusCode >= 500 && statusCode <= 599 && request.shouldRetryServerErrors()) {
                    return new com.android.volley.toolbox.NetworkUtility.RetryInfo("server", new com.android.volley.ServerError(networkResponse), b);
                }
                throw new com.android.volley.ServerError(networkResponse);
            }
            return new com.android.volley.toolbox.NetworkUtility.RetryInfo("network", new com.android.volley.NetworkError(), b);
        }
        if (request.shouldRetryConnectionErrors()) {
            return new com.android.volley.toolbox.NetworkUtility.RetryInfo("connection", new com.android.volley.NoConnectionError(), b);
        }
        throw new com.android.volley.NoConnectionError(iOException);
    }
}
