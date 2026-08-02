package com.datadog.trace.api.normalize;

/* loaded from: classes3.dex */
abstract class HttpPathNormalizer {
    public abstract java.lang.String normalize(java.lang.String str, boolean z);

    HttpPathNormalizer() {
    }

    public final java.lang.String normalize(java.lang.String str) {
        return normalize(str, false);
    }
}
