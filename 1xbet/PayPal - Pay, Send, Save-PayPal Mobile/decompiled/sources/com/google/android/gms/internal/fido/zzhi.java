package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhi extends com.google.android.gms.internal.fido.zzhp {
    private final com.google.android.gms.internal.fido.zzgx zza;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zzd((byte) 64) != zzhpVar.zza()) {
            return zzd((byte) 64) - zzhpVar.zza();
        }
        com.google.android.gms.internal.fido.zzhi zzhiVar = (com.google.android.gms.internal.fido.zzhi) zzhpVar;
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zza;
        int zzd = zzgxVar.zzd();
        com.google.android.gms.internal.fido.zzgx zzgxVar2 = zzhiVar.zza;
        if (zzd != zzgxVar2.zzd()) {
            return zzgxVar.zzd() - zzgxVar2.zzd();
        }
        return com.google.android.gms.internal.fido.zzgm.zza().compare(zzgxVar.zzm(), zzhiVar.zza.zzm());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzhi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        int zzd = zzd((byte) 64);
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zzd), this.zza});
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.fido.zzgf zzd = com.google.android.gms.internal.fido.zzgf.zzf().zzd();
        byte[] zzm = this.zza.zzm();
        return "h'" + zzd.zzg(zzm, 0, zzm.length) + "'";
    }

    public final com.google.android.gms.internal.fido.zzgx zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd((byte) 64);
    }

    zzhi(com.google.android.gms.internal.fido.zzgx zzgxVar) {
        this.zza = zzgxVar;
    }
}
