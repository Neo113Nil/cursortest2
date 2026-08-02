package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class NamingSchemaV0 implements com.datadog.trace.api.naming.NamingSchema {
    private final com.datadog.trace.api.naming.NamingSchema.ForCloud Camera2StreamConfigurationMap;
    private final com.datadog.trace.api.naming.NamingSchema.ForCache getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.trace.api.naming.NamingSchema.ForDatabase getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.datadog.trace.api.naming.NamingSchema.ForClient getHighSpeedVideoSizes;
    private final com.datadog.trace.api.naming.NamingSchema.ForMessaging getInputSizeshNQ4ISI;
    private final com.datadog.trace.api.naming.NamingSchema.ForServer getOutputFormats;
    private final com.datadog.trace.api.naming.NamingSchema.ForPeerService getOutputMinFrameDuration;

    public NamingSchemaV0() {
        com.datadog.trace.api.naming.NamingSchema.ForPeerService peerServiceNamingV0;
        boolean z = !com.datadog.trace.api.Config.get().isRemoveIntegrationServiceNamesEnabled();
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.api.naming.v0.CacheNamingV0(z);
        this.getHighSpeedVideoSizes = new com.datadog.trace.api.naming.v0.ClientNamingV0();
        this.Camera2StreamConfigurationMap = new com.datadog.trace.api.naming.v0.CloudNamingV0(z);
        this.getHighSpeedVideoFpsRanges = new com.datadog.trace.api.naming.v0.DatabaseNamingV0(z);
        this.getInputSizeshNQ4ISI = new com.datadog.trace.api.naming.v0.MessagingNamingV0(z);
        if (com.datadog.trace.api.Config.get().isPeerServiceDefaultsEnabled()) {
            peerServiceNamingV0 = new com.datadog.trace.api.naming.v1.PeerServiceNamingV1(com.datadog.trace.api.Config.get().getPeerServiceComponentOverrides());
        } else {
            peerServiceNamingV0 = new com.datadog.trace.api.naming.v0.PeerServiceNamingV0();
        }
        this.getOutputMinFrameDuration = peerServiceNamingV0;
        this.getOutputFormats = new com.datadog.trace.api.naming.v0.ServerNamingV0();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForCache cache() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForClient client() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForCloud cloud() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForDatabase database() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForMessaging messaging() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForServer server() {
        return this.getOutputFormats;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public com.datadog.trace.api.naming.NamingSchema.ForPeerService peerService() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public boolean allowInferredServices() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
