package com.google.android.datatransport.runtime.backends;

/* loaded from: classes3.dex */
final class AutoValue_BackendResponse extends com.google.android.datatransport.runtime.backends.BackendResponse {
    private final long nextRequestWaitMillis;
    private final com.google.android.datatransport.runtime.backends.BackendResponse.Status status;

    AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status status, long j) {
        if (status == null) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.status = status;
        this.nextRequestWaitMillis = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus() {
        return this.status;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackendResponse{status=");
        sb.append(this.status);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.nextRequestWaitMillis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.backends.BackendResponse)) {
            return false;
        }
        com.google.android.datatransport.runtime.backends.BackendResponse backendResponse = (com.google.android.datatransport.runtime.backends.BackendResponse) obj;
        return this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis();
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode();
        long j = this.nextRequestWaitMillis;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
