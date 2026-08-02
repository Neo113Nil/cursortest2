package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class CacheNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForCache {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForCache
    public java.lang.String service(java.lang.String str) {
        return null;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCache
    public java.lang.String operation(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".command");
        return sb.toString();
    }
}
