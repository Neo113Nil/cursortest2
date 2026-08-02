package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class ServerNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForServer {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForServer
    public java.lang.String operationForProtocol(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".server.request");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForServer
    public java.lang.String operationForComponent(java.lang.String str) {
        return "http.server.request";
    }
}
