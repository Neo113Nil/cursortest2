package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzr extends com.google.android.libraries.places.api.net.IsOpenResponse {
    private final java.lang.Boolean zza;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.IsOpenResponse)) {
            return false;
        }
        com.google.android.libraries.places.api.net.IsOpenResponse isOpenResponse = (com.google.android.libraries.places.api.net.IsOpenResponse) obj;
        java.lang.Boolean bool = this.zza;
        return bool == null ? isOpenResponse.isOpen() == null : bool.equals(isOpenResponse.isOpen());
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.zza;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(bool).length() + 23);
        sb.append("IsOpenResponse{isOpen=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenResponse
    public final java.lang.Boolean isOpen() {
        return this.zza;
    }

    zzr(java.lang.Boolean bool) {
        this.zza = bool;
    }
}
