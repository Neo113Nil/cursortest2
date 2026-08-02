package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_LogResponse extends com.google.android.datatransport.cct.internal.LogResponse {
    private final long nextRequestWaitMillis;

    AutoValue_LogResponse(long j) {
        this.nextRequestWaitMillis = j;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.nextRequestWaitMillis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof com.google.android.datatransport.cct.internal.LogResponse) && this.nextRequestWaitMillis == ((com.google.android.datatransport.cct.internal.LogResponse) obj).getNextRequestWaitMillis();
    }

    public final int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }
}
