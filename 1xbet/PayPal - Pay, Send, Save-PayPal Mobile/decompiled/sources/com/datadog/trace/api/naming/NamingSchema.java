package com.datadog.trace.api.naming;

/* loaded from: classes3.dex */
public interface NamingSchema {

    public interface ForCache {
        java.lang.String operation(java.lang.String str);

        java.lang.String service(java.lang.String str);
    }

    public interface ForClient {
        java.lang.String operationForComponent(java.lang.String str);

        java.lang.String operationForProtocol(java.lang.String str);
    }

    public interface ForCloud {
        java.lang.String operationForFaas(java.lang.String str);

        java.lang.String operationForRequest(java.lang.String str, java.lang.String str2, java.lang.String str3);

        java.lang.String serviceForRequest(java.lang.String str, java.lang.String str2);
    }

    public interface ForDatabase {
        java.lang.String normalizedName(java.lang.String str);

        java.lang.String operation(java.lang.String str);

        java.lang.String service(java.lang.String str);
    }

    public interface ForMessaging {
        java.lang.String inboundOperation(java.lang.String str);

        java.lang.String inboundService(java.lang.String str, boolean z);

        java.lang.String outboundOperation(java.lang.String str);

        java.lang.String outboundService(java.lang.String str, boolean z);

        java.lang.String timeInQueueOperation(java.lang.String str);

        java.lang.String timeInQueueService(java.lang.String str);
    }

    public interface ForPeerService {
        boolean supports();

        java.util.Map<java.lang.String, java.lang.Object> tags(java.util.Map<java.lang.String, java.lang.Object> map);
    }

    public interface ForServer {
        java.lang.String operationForComponent(java.lang.String str);

        java.lang.String operationForProtocol(java.lang.String str);
    }

    boolean allowInferredServices();

    com.datadog.trace.api.naming.NamingSchema.ForCache cache();

    com.datadog.trace.api.naming.NamingSchema.ForClient client();

    com.datadog.trace.api.naming.NamingSchema.ForCloud cloud();

    com.datadog.trace.api.naming.NamingSchema.ForDatabase database();

    com.datadog.trace.api.naming.NamingSchema.ForMessaging messaging();

    com.datadog.trace.api.naming.NamingSchema.ForPeerService peerService();

    com.datadog.trace.api.naming.NamingSchema.ForServer server();
}
