package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class MessagingNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForMessaging {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String inboundService(java.lang.String str, boolean z) {
        return null;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String outboundService(java.lang.String str, boolean z) {
        return null;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1067444169) {
            if (str.equals("google-pubsub")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 114040) {
            if (hashCode == 114133 && str.equals("sqs")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("sns")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            return (c == 1 || c == 2) ? "aws.".concat(java.lang.String.valueOf(str)) : str;
        }
        return "gcp.pubsub";
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String outboundOperation(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Camera2StreamConfigurationMap(str));
        sb.append(".send");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String inboundOperation(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Camera2StreamConfigurationMap(str));
        sb.append(".process");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String timeInQueueService(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-queue");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String timeInQueueOperation(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Camera2StreamConfigurationMap(str));
        sb.append(".deliver");
        return sb.toString();
    }
}
