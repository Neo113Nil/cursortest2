package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzqy extends com.google.android.libraries.places.internal.zzry {
    private com.google.common.collect.ImmutableList zza;
    private com.google.common.collect.ImmutableList zzb;
    private java.util.UUID zzc;
    private long zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.internal.zzry
    public final com.google.android.libraries.places.internal.zzry zza(com.google.common.collect.ImmutableList immutableList) {
        if (immutableList == null) {
            throw new java.lang.NullPointerException("Null spansNames");
        }
        this.zza = immutableList;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzry
    public final com.google.android.libraries.places.internal.zzry zzb(com.google.common.collect.ImmutableList immutableList) {
        if (immutableList == null) {
            throw new java.lang.NullPointerException("Null extras");
        }
        this.zzb = immutableList;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzry
    public final com.google.android.libraries.places.internal.zzry zzc(java.util.UUID uuid) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null rootTraceId");
        }
        this.zzc = uuid;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzry
    public final com.google.android.libraries.places.internal.zzrz zze() {
        com.google.common.collect.ImmutableList immutableList;
        com.google.common.collect.ImmutableList immutableList2;
        java.util.UUID uuid;
        if (this.zze == 1 && (immutableList = this.zza) != null && (immutableList2 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new com.google.android.libraries.places.internal.zzqz(immutableList, immutableList2, uuid, this.zzd, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" spansNames");
        }
        if (this.zzb == null) {
            sb.append(" extras");
        }
        if (this.zzc == null) {
            sb.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb.append(" rootDurationMs");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zzry
    public final com.google.android.libraries.places.internal.zzry zzd(long j) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }

    zzqy() {
    }
}
