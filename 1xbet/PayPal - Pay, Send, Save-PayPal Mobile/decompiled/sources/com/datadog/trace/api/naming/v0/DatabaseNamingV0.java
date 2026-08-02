package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class DatabaseNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForDatabase {
    private final boolean Camera2StreamConfigurationMap;

    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String normalizedName(java.lang.String str) {
        return str;
    }

    public DatabaseNamingV0(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String operation(java.lang.String str) {
        java.lang.String str2;
        if (!"couchbase".equals(str)) {
            str2 = ".query";
        } else {
            str2 = ".call";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String service(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap) {
            return str;
        }
        return null;
    }
}
