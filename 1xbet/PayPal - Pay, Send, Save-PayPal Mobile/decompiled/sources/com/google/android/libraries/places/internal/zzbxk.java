package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbxk extends com.google.android.libraries.places.internal.zzblj {
    private final com.google.android.libraries.places.internal.zzbis zza;
    private final com.google.android.libraries.places.internal.zzbmg zzb;
    private final com.google.android.libraries.places.internal.zzbml zzc;
    private final com.google.android.libraries.places.internal.zzblh zzd;

    public zzbxk(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzblh zzblhVar) {
        this.zzc = (com.google.android.libraries.places.internal.zzbml) com.google.common.base.Preconditions.checkNotNull(zzbmlVar, "method");
        this.zzb = (com.google.android.libraries.places.internal.zzbmg) com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        this.zza = (com.google.android.libraries.places.internal.zzbis) com.google.common.base.Preconditions.checkNotNull(zzbisVar, "callOptions");
        this.zzd = (com.google.android.libraries.places.internal.zzblh) com.google.common.base.Preconditions.checkNotNull(zzblhVar, "pickDetailsConsumer");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbxk zzbxkVar = (com.google.android.libraries.places.internal.zzbxk) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbxkVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbxkVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbxkVar.zzc) && com.google.common.base.Objects.equal(this.zzd, zzbxkVar.zzd);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzbis zzbisVar = this.zza;
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzbmgVar);
        java.lang.String valueOf3 = java.lang.String.valueOf(zzbisVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 17 + java.lang.String.valueOf(valueOf2).length() + 13 + java.lang.String.valueOf(valueOf3).length() + 1);
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzblj
    public final com.google.android.libraries.places.internal.zzbml zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzblj
    public final com.google.android.libraries.places.internal.zzbmg zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzblj
    public final com.google.android.libraries.places.internal.zzbis zza() {
        return this.zza;
    }
}
