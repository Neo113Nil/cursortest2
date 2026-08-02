package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class PeerServiceNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForPeerService {
    private static final java.lang.String[] Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.Object, java.lang.String[]> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.datadog.trace.api.naming.NamingSchema.ForPeerService
    public boolean supports() {
        return true;
    }

    public PeerServiceNamingV1(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String[] strArr) {
        int i = 0;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        java.lang.String str = null;
        java.lang.Object obj = null;
        while (true) {
            if (i < length) {
                java.lang.String str2 = strArr[i];
                java.lang.Object obj2 = map.get(str2);
                if (obj2 != null) {
                    str = str2;
                    obj = obj2;
                    break;
                }
                i++;
                obj = obj2;
            } else {
                break;
            }
        }
        if (obj == null) {
            return true;
        }
        map.put(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE, obj);
        map.put(com.datadog.trace.api.DDTags.PEER_SERVICE_SOURCE, str);
        return true;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForPeerService
    public java.util.Map<java.lang.String, java.lang.Object> tags(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map.get("span.kind");
        if (!"client".equals(obj) && !"producer".equals(obj)) {
            return map;
        }
        java.lang.Object obj2 = map.get(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT);
        java.lang.String obj3 = obj2 == null ? null : obj2.toString();
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI.get(obj3);
        if (str != null) {
            if (str != null) {
                map.put(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE, str);
                map.put(com.datadog.trace.api.DDTags.PEER_SERVICE_SOURCE, "_component_override");
            }
        } else if (!getHighResolutionOutputSizeshNQ4ISI(map, getHighSpeedVideoFpsRangesFor.get(obj3))) {
            getHighResolutionOutputSizeshNQ4ISI(map, Camera2StreamConfigurationMap);
        }
        return map;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap(7);
        hashMap.put("java-kafka", new java.lang.String[]{com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.KAFKA_BOOTSTRAP_SERVERS});
        hashMap.put("hazelcast-sdk", new java.lang.String[]{"hazelcast.instance", com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_HOSTNAME});
        hashMap.put("couchbase-client", new java.lang.String[]{com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.COUCHBASE_SEED_NODES, "net.peer.name", com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_HOSTNAME});
        hashMap.put("java-cassandra", new java.lang.String[]{com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.CASSANDRA_CONTACT_POINTS, com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_HOSTNAME});
        java.lang.String[] strArr = {com.datadog.trace.bootstrap.instrumentation.api.Tags.RPC_SERVICE, com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_HOSTNAME};
        hashMap.put("grpc-client", strArr);
        hashMap.put("armeria-grpc-client", strArr);
        hashMap.put("rmi-client", strArr);
        hashMap.put("java-aws-sdk", new java.lang.String[0]);
        getHighSpeedVideoFpsRangesFor = hashMap;
        Camera2StreamConfigurationMap = new java.lang.String[]{"db.instance", com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_HOSTNAME};
    }
}
