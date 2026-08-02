package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class MessagingNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForMessaging {
    private final boolean getHighSpeedVideoFpsRangesFor;

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String timeInQueueService(java.lang.String str) {
        return str;
    }

    public MessagingNamingV0(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String outboundOperation(java.lang.String str) {
        if ("amqp".equals(str)) {
            return com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.AMQP_COMMAND;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".produce");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String outboundService(java.lang.String str, boolean z) {
        return inboundService(str, z);
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String inboundOperation(java.lang.String str) {
        str.hashCode();
        if (str.equals("sqs")) {
            return "aws.http";
        }
        if (str.equals("amqp")) {
            return com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.AMQP_COMMAND;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".consume");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String inboundService(java.lang.String str, boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return z ? str : com.datadog.trace.api.Config.get().getServiceName();
        }
        return null;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForMessaging
    public java.lang.String timeInQueueOperation(java.lang.String str) {
        if ("sqs".equals(str)) {
            return "aws.http";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".deliver");
        return sb.toString();
    }
}
