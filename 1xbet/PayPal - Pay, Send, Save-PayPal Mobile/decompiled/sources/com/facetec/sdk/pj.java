package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface pj extends com.facetec.sdk.qa, java.nio.channels.WritableByteChannel {
    com.facetec.sdk.pj b(com.facetec.sdk.pq pqVar) throws java.io.IOException;

    com.facetec.sdk.pj c(java.lang.String str) throws java.io.IOException;

    com.facetec.sdk.pj c(byte[] bArr) throws java.io.IOException;

    com.facetec.sdk.pk c();

    com.facetec.sdk.pj e(byte[] bArr, int i, int i2) throws java.io.IOException;

    @Override // com.facetec.sdk.qa, java.io.Flushable
    void flush() throws java.io.IOException;

    com.facetec.sdk.pj g(int i) throws java.io.IOException;

    com.facetec.sdk.pj h(int i) throws java.io.IOException;

    com.facetec.sdk.pj h(long j) throws java.io.IOException;

    com.facetec.sdk.pj j(int i) throws java.io.IOException;

    com.facetec.sdk.pj l(long j) throws java.io.IOException;

    com.facetec.sdk.pj t() throws java.io.IOException;
}
