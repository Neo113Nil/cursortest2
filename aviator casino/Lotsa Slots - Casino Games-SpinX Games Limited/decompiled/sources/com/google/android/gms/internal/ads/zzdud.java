package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdud extends com.google.android.gms.internal.ads.zzbmr {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdpo zzb;
    private final com.google.android.gms.internal.ads.zzdpt zzc;

    public zzdud(java.lang.String str, com.google.android.gms.internal.ads.zzdpo zzdpoVar, com.google.android.gms.internal.ads.zzdpt zzdptVar) {
        this.zza = str;
        this.zzb = zzdpoVar;
        this.zzc = zzdptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.lang.String zzc() throws android.os.RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.util.List zzd() throws android.os.RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.internal.ads.zzbme zzf() throws android.os.RemoteException {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.lang.String zzg() throws android.os.RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.lang.String zzh() throws android.os.RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final android.os.Bundle zzi() throws android.os.RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzj() throws android.os.RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.ads.internal.client.zzea zzk() throws android.os.RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzl(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzm(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzn(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.internal.ads.zzblx zzo() throws android.os.RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.dynamic.IObjectWrapper zzp() throws android.os.RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final java.lang.String zzq() throws android.os.RemoteException {
        return this.zza;
    }
}
