package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class DatabaseNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForDatabase {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String service(java.lang.String str) {
        return null;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String normalizedName(java.lang.String str) {
        str.hashCode();
        if (str.equals("sqlserver")) {
            return "mssql";
        }
        return !str.equals("mongo") ? str : com.datadog.trace.api.DDSpanTypes.MONGO;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForDatabase
    public java.lang.String operation(java.lang.String str) {
        str.hashCode();
        if (str.equals("opensearch.rest")) {
            str = com.datadog.trace.api.DDSpanTypes.OPENSEARCH;
        } else if (str.equals("elasticsearch.rest")) {
            str = com.datadog.trace.api.DDSpanTypes.ELASTICSEARCH;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".query");
        return sb.toString();
    }
}
