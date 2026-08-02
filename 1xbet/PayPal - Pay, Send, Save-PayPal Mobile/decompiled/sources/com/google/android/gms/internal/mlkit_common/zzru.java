package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzru extends com.google.android.gms.internal.mlkit_common.zzsb {
    private final java.lang.String zza;
    private final boolean zzb;
    private final int zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_common.zzsb)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_common.zzsb zzsbVar = (com.google.android.gms.internal.mlkit_common.zzsb) obj;
        return this.zza.equals(zzsbVar.zzb()) && this.zzb == zzsbVar.zzc() && this.zzc == zzsbVar.zza();
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final java.lang.String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.zza + ", enableFirelog=" + this.zzb + ", firelogEventType=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final boolean zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final int zza() {
        return this.zzc;
    }

    /* synthetic */ zzru(java.lang.String str, boolean z, int i, com.google.android.gms.internal.mlkit_common.zzrt zzrtVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }
}
