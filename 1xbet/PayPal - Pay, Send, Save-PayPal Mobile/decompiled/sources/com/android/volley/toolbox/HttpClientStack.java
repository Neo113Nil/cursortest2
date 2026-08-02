package com.android.volley.toolbox;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class HttpClientStack implements com.android.volley.toolbox.HttpStack {
    protected final org.apache.http.client.HttpClient mClient;

    protected void onPrepareRequest(org.apache.http.client.methods.HttpUriRequest httpUriRequest) throws java.io.IOException {
    }

    public HttpClientStack(org.apache.http.client.HttpClient httpClient) {
        this.mClient = httpClient;
    }

    private static void getHighSpeedVideoFpsRanges(org.apache.http.client.methods.HttpUriRequest httpUriRequest, java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.lang.String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    public static final class HttpPatch extends org.apache.http.client.methods.HttpEntityEnclosingRequestBase {
        public static final java.lang.String METHOD_NAME = "PATCH";

        public HttpPatch() {
        }

        public HttpPatch(java.net.URI uri) {
            setURI(uri);
        }

        public HttpPatch(java.lang.String str) {
            setURI(java.net.URI.create(str));
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public final java.lang.String getMethod() {
            return "PATCH";
        }
    }

    @Override // com.android.volley.toolbox.HttpStack
    public org.apache.http.HttpResponse performRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError {
        org.apache.http.client.methods.HttpUriRequest httpUriRequest;
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(request.getUrl());
                    httpPost.addHeader("Content-Type", request.getPostBodyContentType());
                    httpPost.setEntity(new org.apache.http.entity.ByteArrayEntity(postBody));
                    httpUriRequest = httpPost;
                    break;
                } else {
                    httpUriRequest = new org.apache.http.client.methods.HttpGet(request.getUrl());
                    break;
                }
            case 0:
                httpUriRequest = new org.apache.http.client.methods.HttpGet(request.getUrl());
                break;
            case 1:
                org.apache.http.client.methods.HttpPost httpPost2 = new org.apache.http.client.methods.HttpPost(request.getUrl());
                httpPost2.addHeader("Content-Type", request.getBodyContentType());
                byte[] body = request.getBody();
                httpUriRequest = httpPost2;
                if (body != null) {
                    httpPost2.setEntity(new org.apache.http.entity.ByteArrayEntity(body));
                    httpUriRequest = httpPost2;
                    break;
                }
                break;
            case 2:
                org.apache.http.client.methods.HttpPut httpPut = new org.apache.http.client.methods.HttpPut(request.getUrl());
                httpPut.addHeader("Content-Type", request.getBodyContentType());
                byte[] body2 = request.getBody();
                httpUriRequest = httpPut;
                if (body2 != null) {
                    httpPut.setEntity(new org.apache.http.entity.ByteArrayEntity(body2));
                    httpUriRequest = httpPut;
                    break;
                }
                break;
            case 3:
                httpUriRequest = new org.apache.http.client.methods.HttpDelete(request.getUrl());
                break;
            case 4:
                httpUriRequest = new org.apache.http.client.methods.HttpHead(request.getUrl());
                break;
            case 5:
                httpUriRequest = new org.apache.http.client.methods.HttpOptions(request.getUrl());
                break;
            case 6:
                httpUriRequest = new org.apache.http.client.methods.HttpTrace(request.getUrl());
                break;
            case 7:
                com.android.volley.toolbox.HttpClientStack.HttpPatch httpPatch = new com.android.volley.toolbox.HttpClientStack.HttpPatch(request.getUrl());
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                byte[] body3 = request.getBody();
                httpUriRequest = httpPatch;
                if (body3 != null) {
                    httpPatch.setEntity(new org.apache.http.entity.ByteArrayEntity(body3));
                    httpUriRequest = httpPatch;
                    break;
                }
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown request method.");
        }
        getHighSpeedVideoFpsRanges(httpUriRequest, map);
        getHighSpeedVideoFpsRanges(httpUriRequest, request.getHeaders());
        onPrepareRequest(httpUriRequest);
        org.apache.http.params.HttpParams params = httpUriRequest.getParams();
        int timeoutMs = request.getTimeoutMs();
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(params, 5000);
        org.apache.http.params.HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.mClient.execute(httpUriRequest);
    }
}
