package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzma extends com.google.android.gms.internal.mlkit_vision_common.zzme {
    private final java.lang.String zza;
    private final boolean zzb;
    private final int zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_common.zzme)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_common.zzme zzmeVar = (com.google.android.gms.internal.mlkit_vision_common.zzme) obj;
        return this.zza.equals(zzmeVar.zzb()) && this.zzb == zzmeVar.zzc() && this.zzc == zzmeVar.zza();
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final java.lang.String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.zza + ", enableFirelog=" + this.zzb + ", firelogEventType=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.zzc;
    }

    /* synthetic */ zzma(java.lang.String str, boolean z, int i, com.google.android.gms.internal.mlkit_vision_common.zzlz zzlzVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }
}
