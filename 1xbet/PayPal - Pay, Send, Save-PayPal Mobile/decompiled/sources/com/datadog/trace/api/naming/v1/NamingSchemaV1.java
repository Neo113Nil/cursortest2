package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class NamingSchemaV1 implements com.datadog.trace.api.naming.NamingSchema {
    private final com.datadog.trace.api.naming.NamingSchema.ForCache getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.naming.v1.CacheNamingV1();
    private final com.datadog.trace.api.naming.NamingSchema.ForClient Camera2StreamConfigurationMap = new com.datadog.trace.api.naming.v1.ClientNamingV1();
    private final com.datadog.trace.api.naming.NamingSchema.ForCloud getHighSpeedVideoFpsRanges = new com.datadog.trace.api.naming.v1.CloudNamingV1();
    private final com.datadog.trace.api.naming.NamingSchema.ForDatabase getHighSpeedVideoSizes = new com.datadog.trace.api.naming.v1.DatabaseNamingV1();
    private final com.datadog.trace.api.naming.NamingSchema.ForMessaging getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.api.naming.v1.MessagingNamingV1();
    private final com.datadog.trace.api.naming.NamingSchema.ForPeerService getOutputFormats = new com.datadog.trace.api.naming.v1.PeerServiceNamingV1(com.datadog.trace.api.Config.get().getPeerServiceComponentOverrides());
    private final com.datadog.trace.api.naming.NamingSchema.ForServer getInputFormats = new com.datadog.trace.api.naming.v1.ServerNamingV1();

    @Override // com.datadog.trace.api.naming.NamingSchema
    public boolean allowInferredServices() {
        return false;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForCache cache() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForClient client() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForCloud cloud() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForDatabase database() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForMessaging messaging() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForPeerService peerService() {
        return this.getOutputFormats;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForServer server() {
        return this.getInputFormats;
    }
}
