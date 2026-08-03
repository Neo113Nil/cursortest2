package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzift implements com.google.android.gms.internal.ads.zzigh {
    private final com.google.android.gms.internal.ads.zzifp zza;
    private final com.google.android.gms.internal.ads.zzigt zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzidp zzd;

    private zzift(com.google.android.gms.internal.ads.zzigt zzigtVar, com.google.android.gms.internal.ads.zzidp zzidpVar, com.google.android.gms.internal.ads.zzifp zzifpVar) {
        this.zzb = zzigtVar;
        this.zzc = zzifpVar instanceof com.google.android.gms.internal.ads.zziea;
        this.zzd = zzidpVar;
        this.zza = zzifpVar;
    }

    static com.google.android.gms.internal.ads.zzift zzh(com.google.android.gms.internal.ads.zzigt zzigtVar, com.google.android.gms.internal.ads.zzidp zzidpVar, com.google.android.gms.internal.ads.zzifp zzifpVar) {
        return new com.google.android.gms.internal.ads.zzift(zzigtVar, zzidpVar, zzifpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final java.lang.Object zza() {
        com.google.android.gms.internal.ads.zzifp zzifpVar = this.zza;
        return zzifpVar instanceof com.google.android.gms.internal.ads.zziee ? ((com.google.android.gms.internal.ads.zziee) zzifpVar).zzbg() : zzifpVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.ads.zziee) obj).zzt.equals(((com.google.android.gms.internal.ads.zziee) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.ads.zziea) obj).zza.equals(((com.google.android.gms.internal.ads.zziea) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zzc(java.lang.Object obj) {
        int hashCode = ((com.google.android.gms.internal.ads.zziee) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((com.google.android.gms.internal.ads.zziea) obj).zza.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzigi.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.ads.zzigi.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zze(java.lang.Object obj) {
        int zzh = ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzh();
        return this.zzc ? zzh + ((com.google.android.gms.internal.ads.zziea) obj).zza.zzg() : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        java.util.Iterator zzc = ((com.google.android.gms.internal.ads.zziea) obj).zza.zzc();
        while (zzc.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) zzc.next();
            com.google.android.gms.internal.ads.zzids zzidsVar = (com.google.android.gms.internal.ads.zzids) entry.getKey();
            if (zzidsVar.zzc() != com.google.android.gms.internal.ads.zzihh.MESSAGE || zzidsVar.zzd() || zzidsVar.zze()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.ads.zziew) {
                zzihiVar.zzv(zzidsVar.zza(), ((com.google.android.gms.internal.ads.zziew) entry).zza().zzc());
            } else {
                zzihiVar.zzv(zzidsVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzf(zzihiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzg(java.lang.Object obj, com.google.android.gms.internal.ads.zzigc zzigcVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzj(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zziee zzieeVar = (com.google.android.gms.internal.ads.zziee) obj;
        if (zzieeVar.zzt == com.google.android.gms.internal.ads.zzigu.zza()) {
            zzieeVar.zzt = com.google.android.gms.internal.ads.zzigu.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzk(java.lang.Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzl(java.lang.Object obj) {
        return ((com.google.android.gms.internal.ads.zziea) obj).zza.zze();
    }
}
