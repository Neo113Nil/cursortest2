package com.nimbusds.jose.proc;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class DefaultJOSEObjectTypeVerifier<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> {
    public static final com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier JOSE = new com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier(com.nimbusds.jose.JOSEObjectType.JOSE, null);
    public static final com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier JWT = new com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier(com.nimbusds.jose.JOSEObjectType.JWT, null);
    private final java.util.Set<com.nimbusds.jose.JOSEObjectType> allowedTypes;

    public DefaultJOSEObjectTypeVerifier() {
        this.allowedTypes = java.util.Collections.singleton(null);
    }

    public DefaultJOSEObjectTypeVerifier(java.util.Set<com.nimbusds.jose.JOSEObjectType> set) {
        if (set == null || set.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The allowed types must not be null or empty");
        }
        this.allowedTypes = set;
    }

    public DefaultJOSEObjectTypeVerifier(com.nimbusds.jose.JOSEObjectType... jOSEObjectTypeArr) {
        if (jOSEObjectTypeArr == null || jOSEObjectTypeArr.length == 0) {
            throw new java.lang.IllegalArgumentException("The allowed types must not be null or empty");
        }
        this.allowedTypes = new java.util.HashSet(java.util.Arrays.asList(jOSEObjectTypeArr));
    }

    public java.util.Set<com.nimbusds.jose.JOSEObjectType> getAllowedTypes() {
        return this.allowedTypes;
    }

    @Override // com.nimbusds.jose.proc.JOSEObjectTypeVerifier
    public void verify(com.nimbusds.jose.JOSEObjectType jOSEObjectType, C c) throws com.nimbusds.jose.proc.BadJOSEException {
        if (jOSEObjectType == null && !this.allowedTypes.contains(null)) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Required JOSE header typ (type) parameter is missing");
        }
        if (this.allowedTypes.contains(jOSEObjectType)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JOSE header typ (type) ");
        sb.append(jOSEObjectType);
        sb.append(" not allowed");
        throw new com.nimbusds.jose.proc.BadJOSEException(sb.toString());
    }
}
