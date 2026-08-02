package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public abstract class BaseHttpStack implements com.android.volley.toolbox.HttpStack {
    public abstract com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError;

    @Override // com.android.volley.toolbox.HttpStack
    @java.lang.Deprecated
    public final org.apache.http.HttpResponse performRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError {
        com.android.volley.toolbox.HttpResponse executeRequest = executeRequest(request, map);
        org.apache.http.message.BasicHttpResponse basicHttpResponse = new org.apache.http.message.BasicHttpResponse(new org.apache.http.message.BasicStatusLine(new org.apache.http.ProtocolVersion("HTTP", 1, 1), executeRequest.getStatusCode(), ""));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.android.volley.Header header : executeRequest.getHeaders()) {
            arrayList.add(new org.apache.http.message.BasicHeader(header.getName(), header.getValue()));
        }
        basicHttpResponse.setHeaders((org.apache.http.Header[]) arrayList.toArray(new org.apache.http.Header[0]));
        java.io.InputStream content = executeRequest.getContent();
        if (content != null) {
            org.apache.http.entity.BasicHttpEntity basicHttpEntity = new org.apache.http.entity.BasicHttpEntity();
            basicHttpEntity.setContent(content);
            basicHttpEntity.setContentLength(executeRequest.getContentLength());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
