package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class PeerServiceNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForPeerService {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForPeerService
    public boolean supports() {
        return false;
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForPeerService
    public java.util.Map<java.lang.String, java.lang.Object> tags(java.util.Map<java.lang.String, java.lang.Object> map) {
        return java.util.Collections.emptyMap();
    }
}
