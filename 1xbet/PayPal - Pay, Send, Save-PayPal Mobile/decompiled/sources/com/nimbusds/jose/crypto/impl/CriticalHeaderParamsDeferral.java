package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public class CriticalHeaderParamsDeferral {
    private java.util.Set<java.lang.String> deferredParams = java.util.Collections.emptySet();

    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return java.util.Collections.singleton("b64");
    }

    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return java.util.Collections.unmodifiableSet(this.deferredParams);
    }

    public void setDeferredCriticalHeaderParams(java.util.Set<java.lang.String> set) {
        if (set == null) {
            this.deferredParams = java.util.Collections.emptySet();
        } else {
            this.deferredParams = set;
        }
    }

    public boolean headerPasses(com.nimbusds.jose.Header header) {
        if (header.getCriticalParams() == null) {
            return true;
        }
        for (java.lang.String str : header.getCriticalParams()) {
            if (!getProcessedCriticalHeaderParams().contains(str) && !getDeferredCriticalHeaderParams().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void ensureHeaderPasses(com.nimbusds.jose.JWEHeader jWEHeader) throws com.nimbusds.jose.JOSEException {
        if (!headerPasses(jWEHeader)) {
            throw new com.nimbusds.jose.JOSEException("Unsupported critical header parameter(s)");
        }
    }
}
