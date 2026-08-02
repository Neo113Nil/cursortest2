package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class CacheNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForCache {
    private final boolean Camera2StreamConfigurationMap;

    public CacheNamingV0(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCache
    public java.lang.String operation(java.lang.String str) {
        java.lang.String str2;
        str.hashCode();
        if (str.equals("hazelcast")) {
            str2 = ".invoke";
        } else if (str.equals("ignite")) {
            str2 = ".cache";
        } else {
            str2 = ".query";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCache
    public java.lang.String service(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap) {
            return "hazelcast".equals(str) ? "hazelcast-sdk" : str;
        }
        return null;
    }
}
