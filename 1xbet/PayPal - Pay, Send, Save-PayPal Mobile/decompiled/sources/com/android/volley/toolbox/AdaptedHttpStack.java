package com.android.volley.toolbox;

/* loaded from: classes7.dex */
class AdaptedHttpStack extends com.android.volley.toolbox.BaseHttpStack {
    private final com.android.volley.toolbox.HttpStack getHighResolutionOutputSizeshNQ4ISI;

    AdaptedHttpStack(com.android.volley.toolbox.HttpStack httpStack) {
        this.getHighResolutionOutputSizeshNQ4ISI = httpStack;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError {
        try {
            org.apache.http.HttpResponse performRequest = this.getHighResolutionOutputSizeshNQ4ISI.performRequest(request, map);
            int statusCode = performRequest.getStatusLine().getStatusCode();
            org.apache.http.Header[] allHeaders = performRequest.getAllHeaders();
            java.util.ArrayList arrayList = new java.util.ArrayList(allHeaders.length);
            for (org.apache.http.Header header : allHeaders) {
                arrayList.add(new com.android.volley.Header(header.getName(), header.getValue()));
            }
            if (performRequest.getEntity() == null) {
                return new com.android.volley.toolbox.HttpResponse(statusCode, arrayList);
            }
            long contentLength = performRequest.getEntity().getContentLength();
            if (((int) contentLength) != contentLength) {
                throw new java.io.IOException("Response too large: ".concat(java.lang.String.valueOf(contentLength)));
            }
            return new com.android.volley.toolbox.HttpResponse(statusCode, arrayList, (int) performRequest.getEntity().getContentLength(), performRequest.getEntity().getContent());
        } catch (org.apache.http.conn.ConnectTimeoutException e) {
            throw new java.net.SocketTimeoutException(e.getMessage());
        }
    }
}
