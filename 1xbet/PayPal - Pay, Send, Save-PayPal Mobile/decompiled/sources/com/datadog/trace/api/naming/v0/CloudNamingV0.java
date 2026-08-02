package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class CloudNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForCloud {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public CloudNamingV0(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String operationForRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return "aws.http";
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String serviceForRequest(java.lang.String str, java.lang.String str2) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            return null;
        }
        if (str2 == null) {
            return "java-aws-sdk";
        }
        str2.hashCode();
        return (str2.equals("sns") || str2.equals("sqs")) ? str2 : "java-aws-sdk";
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String operationForFaas(java.lang.String str) {
        return "dd-tracer-serverless-span";
    }
}
