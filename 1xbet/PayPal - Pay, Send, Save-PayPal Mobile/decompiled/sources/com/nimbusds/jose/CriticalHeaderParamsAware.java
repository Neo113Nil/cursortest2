package com.nimbusds.jose;

/* loaded from: classes4.dex */
public interface CriticalHeaderParamsAware {
    java.util.Set<java.lang.String> getDeferredCriticalHeaderParams();

    java.util.Set<java.lang.String> getProcessedCriticalHeaderParams();
}
