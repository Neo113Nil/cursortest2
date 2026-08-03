package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdui extends com.google.android.gms.internal.ads.zzbnu {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdpo zzb;
    private final com.google.android.gms.internal.ads.zzdpt zzc;
    private final com.google.android.gms.internal.ads.zzdzl zzd;

    public zzdui(java.lang.String str, com.google.android.gms.internal.ads.zzdpo zzdpoVar, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = str;
        this.zzb = zzdpoVar;
        this.zzc = zzdptVar;
        this.zzd = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzA() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zzc;
        return (zzdptVar.zzE().isEmpty() || zzdptVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws android.os.RemoteException {
        this.zzb.zzA(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws android.os.RemoteException {
        this.zzb.zzB(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzbmb zzF() throws android.os.RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws android.os.RemoteException {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws android.os.RemoteException {
        try {
            if (!zzdqVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzJ(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzox)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final long zzK() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzb;
        if (zzdpoVar == null || zzdpoVar.zzo() == null) {
            return 0L;
        }
        return zzdpoVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzL(long j) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzb;
        if (zzdpoVar == null || zzdpoVar.zzo() == null) {
            return;
        }
        zzdpoVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.util.List zzf() throws android.os.RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzg() throws android.os.RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzbme zzh() throws android.os.RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzi() throws android.os.RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzj() throws android.os.RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final double zzk() throws android.os.RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzl() throws android.os.RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzm() throws android.os.RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws android.os.RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzo() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzp() throws android.os.RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzblx zzq() throws android.os.RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzs(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzt(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.dynamic.IObjectWrapper zzu() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.dynamic.IObjectWrapper zzv() throws android.os.RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final android.os.Bundle zzw() throws android.os.RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzx(com.google.android.gms.internal.ads.zzbns zzbnsVar) throws android.os.RemoteException {
        this.zzb.zzy(zzbnsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzy() throws android.os.RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.util.List zzz() throws android.os.RemoteException {
        return zzA() ? this.zzc.zzE() : java.util.Collections.emptyList();
    }
}
