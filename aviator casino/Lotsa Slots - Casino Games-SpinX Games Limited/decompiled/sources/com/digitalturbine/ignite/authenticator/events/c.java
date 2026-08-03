package com.digitalturbine.ignite.authenticator.events;

/* loaded from: classes2.dex */
public enum c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");

    private static final java.util.Map<java.lang.String, com.digitalturbine.ignite.authenticator.events.c> CONSTANTS = new java.util.HashMap();
    private final java.lang.String value;

    static {
        for (com.digitalturbine.ignite.authenticator.events.c cVar : values()) {
            CONSTANTS.put(cVar.value, cVar);
        }
    }

    c(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String a() {
        return this.value;
    }
}
