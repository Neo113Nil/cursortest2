package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class of {
    final int g;
    public final com.facetec.sdk.pq i;
    public final com.facetec.sdk.pq j;
    public static final com.facetec.sdk.pq c = com.facetec.sdk.pq.d(io.ktor.sse.ServerSentEventKt.COLON);
    public static final com.facetec.sdk.pq d = com.facetec.sdk.pq.d(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
    public static final com.facetec.sdk.pq e = com.facetec.sdk.pq.d(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public static final com.facetec.sdk.pq f3703a = com.facetec.sdk.pq.d(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
    public static final com.facetec.sdk.pq b = com.facetec.sdk.pq.d(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
    public static final com.facetec.sdk.pq h = com.facetec.sdk.pq.d(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);

    interface c {
    }

    public of(java.lang.String str, java.lang.String str2) {
        this(com.facetec.sdk.pq.d(str), com.facetec.sdk.pq.d(str2));
    }

    public of(com.facetec.sdk.pq pqVar, java.lang.String str) {
        this(pqVar, com.facetec.sdk.pq.d(str));
    }

    public of(com.facetec.sdk.pq pqVar, com.facetec.sdk.pq pqVar2) {
        this.j = pqVar;
        this.i = pqVar2;
        this.g = pqVar.j() + 32 + pqVar2.j();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.of)) {
            return false;
        }
        com.facetec.sdk.of ofVar = (com.facetec.sdk.of) obj;
        return this.j.equals(ofVar.j) && this.i.equals(ofVar.i);
    }

    public final int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + this.i.hashCode();
    }

    public final java.lang.String toString() {
        return com.facetec.sdk.nh.c("%s: %s", this.j.e(), this.i.e());
    }
}
