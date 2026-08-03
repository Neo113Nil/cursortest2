package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamn implements com.google.android.gms.internal.ads.zzahb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzamo zza;

    /* synthetic */ zzamn(com.google.android.gms.internal.ads.zzamo zzamoVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzamoVar);
        this.zza = zzamoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        com.google.android.gms.internal.ads.zzamo zzamoVar = this.zza;
        return zzamoVar.zzf().zzh(zzamoVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzamo zzamoVar = this.zza;
        long zzd = zzamoVar.zzd() + java.math.BigInteger.valueOf(zzamoVar.zzf().zzi(j)).multiply(java.math.BigInteger.valueOf(zzamoVar.zze() - zzamoVar.zzd())).divide(java.math.BigInteger.valueOf(zzamoVar.zzg())).longValue();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(j, java.lang.Math.max(zzamoVar.zzd(), java.lang.Math.min(zzd - 30000, zzamoVar.zze() - 1)));
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
