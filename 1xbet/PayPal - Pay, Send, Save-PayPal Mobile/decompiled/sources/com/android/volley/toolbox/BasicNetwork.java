package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class BasicNetwork implements com.android.volley.Network {
    private final com.android.volley.toolbox.BaseHttpStack getHighResolutionOutputSizeshNQ4ISI;

    @java.lang.Deprecated
    protected final com.android.volley.toolbox.HttpStack mHttpStack;
    protected final com.android.volley.toolbox.ByteArrayPool mPool;

    @java.lang.Deprecated
    public BasicNetwork(com.android.volley.toolbox.HttpStack httpStack) {
        this(httpStack, new com.android.volley.toolbox.ByteArrayPool(4096));
    }

    @java.lang.Deprecated
    public BasicNetwork(com.android.volley.toolbox.HttpStack httpStack, com.android.volley.toolbox.ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.android.volley.toolbox.AdaptedHttpStack(httpStack);
        this.mPool = byteArrayPool;
    }

    public BasicNetwork(com.android.volley.toolbox.BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new com.android.volley.toolbox.ByteArrayPool(4096));
    }

    public BasicNetwork(com.android.volley.toolbox.BaseHttpStack baseHttpStack, com.android.volley.toolbox.ByteArrayPool byteArrayPool) {
        this.getHighResolutionOutputSizeshNQ4ISI = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }

    @Override // com.android.volley.Network
    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request<?> request) throws com.android.volley.VolleyError {
        java.io.IOException iOException;
        com.android.volley.toolbox.HttpResponse httpResponse;
        byte[] bArr;
        com.android.volley.toolbox.HttpResponse executeRequest;
        int statusCode;
        java.util.List<com.android.volley.Header> headers;
        byte[] bArr2;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (true) {
            java.util.Collections.emptyList();
            try {
                executeRequest = this.getHighResolutionOutputSizeshNQ4ISI.executeRequest(request, com.android.volley.toolbox.HttpHeaderParser.getHighSpeedVideoSizes(request.getCacheEntry()));
                try {
                    statusCode = executeRequest.getStatusCode();
                    headers = executeRequest.getHeaders();
                    break;
                } catch (java.io.IOException e) {
                    bArr = null;
                    httpResponse = executeRequest;
                    iOException = e;
                }
            } catch (java.io.IOException e2) {
                iOException = e2;
                httpResponse = null;
                bArr = null;
            }
            com.android.volley.toolbox.NetworkUtility.getHighSpeedVideoSizes(request, com.android.volley.toolbox.NetworkUtility.Camera2StreamConfigurationMap(request, iOException, elapsedRealtime, httpResponse, bArr));
        }
        if (statusCode == 304) {
            return com.android.volley.toolbox.NetworkUtility.getHighResolutionOutputSizeshNQ4ISI(request, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, headers);
        }
        java.io.InputStream content = executeRequest.getContent();
        if (content != null) {
            bArr2 = com.android.volley.toolbox.NetworkUtility.Camera2StreamConfigurationMap(content, executeRequest.getContentLength(), this.mPool);
        } else {
            bArr2 = new byte[0];
        }
        com.android.volley.toolbox.NetworkUtility.getHighSpeedVideoFpsRangesFor(android.os.SystemClock.elapsedRealtime() - elapsedRealtime, request, bArr2, statusCode);
        if (statusCode < 200 || statusCode > 299) {
            throw new java.io.IOException();
        }
        return new com.android.volley.NetworkResponse(statusCode, bArr2, false, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, headers);
    }

    @java.lang.Deprecated
    protected static java.util.Map<java.lang.String, java.lang.String> convertHeaders(com.android.volley.Header[] headerArr) {
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
