package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzqz extends com.google.android.libraries.places.internal.zzrz {
    private final com.google.common.collect.ImmutableList zza;
    private final com.google.common.collect.ImmutableList zzb;
    private final java.util.UUID zzc;
    private final long zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzrz)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzrz zzrzVar = (com.google.android.libraries.places.internal.zzrz) obj;
        return this.zza.equals(zzrzVar.zza()) && this.zzb.equals(zzrzVar.zzb()) && this.zzc.equals(zzrzVar.zzc()) && this.zzd == zzrzVar.zzd();
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int hashCode3 = this.zzc.hashCode();
        long j = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    @Override // com.google.android.libraries.places.internal.zzrz
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzrz
    public final java.util.UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzrz
    public final com.google.common.collect.ImmutableList zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzrz
    public final com.google.common.collect.ImmutableList zza() {
        return this.zza;
    }

    /* synthetic */ zzqz(com.google.common.collect.ImmutableList immutableList, com.google.common.collect.ImmutableList immutableList2, java.util.UUID uuid, long j, byte[] bArr) {
        this.zza = immutableList;
        this.zzb = immutableList2;
        this.zzc = uuid;
        this.zzd = j;
    }
}
