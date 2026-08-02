package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzo extends com.google.android.play.core.splitinstall.internal.zzp {
    private final int zza;
    private final long zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.splitinstall.internal.zzp)) {
            return false;
        }
        com.google.android.play.core.splitinstall.internal.zzp zzpVar = (com.google.android.play.core.splitinstall.internal.zzp) obj;
        return this.zza == zzpVar.zza() && this.zzb == zzpVar.zzb();
    }

    public final java.lang.String toString() {
        int i = this.zza;
        long j = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventRecord{eventType=");
        sb.append(i);
        sb.append(", eventTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.zza;
    }

    public final int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    zzo(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }
}
