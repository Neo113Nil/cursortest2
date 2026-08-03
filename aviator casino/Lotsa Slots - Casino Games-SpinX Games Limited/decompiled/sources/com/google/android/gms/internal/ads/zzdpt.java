package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdpt {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private com.google.android.gms.internal.ads.zzblx zzc;
    private android.view.View zzd;
    private java.util.List zze;
    private com.google.android.gms.ads.internal.client.zzew zzg;
    private android.os.Bundle zzh;
    private com.google.android.gms.internal.ads.zzcku zzi;
    private com.google.android.gms.internal.ads.zzcku zzj;
    private com.google.android.gms.internal.ads.zzcku zzk;
    private com.google.android.gms.internal.ads.zzeln zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;
    private com.google.android.gms.internal.ads.zzcfw zzn;
    private android.view.View zzo;
    private android.view.View zzp;
    private com.google.android.gms.dynamic.IObjectWrapper zzq;
    private double zzr;
    private com.google.android.gms.internal.ads.zzbme zzs;
    private com.google.android.gms.internal.ads.zzbme zzt;
    private java.lang.String zzu;
    private float zzx;
    private java.lang.String zzy;
    private final androidx.collection.SimpleArrayMap zzv = new androidx.collection.SimpleArrayMap();
    private final androidx.collection.SimpleArrayMap zzw = new androidx.collection.SimpleArrayMap();
    private java.util.List zzf = java.util.Collections.emptyList();

    public static com.google.android.gms.internal.ads.zzdpt zzaf(com.google.android.gms.internal.ads.zzbvr zzbvrVar) {
        try {
            return zzak(zzam(zzbvrVar.zzn(), zzbvrVar), zzbvrVar.zzo(), (android.view.View) zzal(zzbvrVar.zzp()), zzbvrVar.zze(), zzbvrVar.zzf(), zzbvrVar.zzg(), zzbvrVar.zzs(), zzbvrVar.zzi(), (android.view.View) zzal(zzbvrVar.zzq()), zzbvrVar.zzr(), zzbvrVar.zzl(), zzbvrVar.zzm(), zzbvrVar.zzk(), zzbvrVar.zzh(), zzbvrVar.zzj(), zzbvrVar.zzz());
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdpt zzag(com.google.android.gms.internal.ads.zzbvo zzbvoVar) {
        try {
            com.google.android.gms.internal.ads.zzdps zzam = zzam(zzbvoVar.zzs(), null);
            com.google.android.gms.internal.ads.zzblx zzt = zzbvoVar.zzt();
            android.view.View view = (android.view.View) zzal(zzbvoVar.zzr());
            java.lang.String zze = zzbvoVar.zze();
            java.util.List zzf = zzbvoVar.zzf();
            java.lang.String zzg = zzbvoVar.zzg();
            android.os.Bundle zzp = zzbvoVar.zzp();
            java.lang.String zzi = zzbvoVar.zzi();
            android.view.View view2 = (android.view.View) zzal(zzbvoVar.zzu());
            com.google.android.gms.dynamic.IObjectWrapper zzv = zzbvoVar.zzv();
            java.lang.String zzj = zzbvoVar.zzj();
            com.google.android.gms.internal.ads.zzbme zzh = zzbvoVar.zzh();
            com.google.android.gms.internal.ads.zzdpt zzdptVar = new com.google.android.gms.internal.ads.zzdpt();
            zzdptVar.zza = 1;
            zzdptVar.zzb = zzam;
            zzdptVar.zzc = zzt;
            zzdptVar.zzd = view;
            zzdptVar.zzs("headline", zze);
            zzdptVar.zze = zzf;
            zzdptVar.zzs("body", zzg);
            zzdptVar.zzh = zzp;
            zzdptVar.zzs("call_to_action", zzi);
            zzdptVar.zzo = view2;
            zzdptVar.zzq = zzv;
            zzdptVar.zzs(com.ironsource.X3.i.F0, zzj);
            zzdptVar.zzt = zzh;
            return zzdptVar;
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdpt zzah(com.google.android.gms.internal.ads.zzbvn zzbvnVar) {
        try {
            com.google.android.gms.internal.ads.zzdps zzam = zzam(zzbvnVar.zzt(), null);
            com.google.android.gms.internal.ads.zzblx zzv = zzbvnVar.zzv();
            android.view.View view = (android.view.View) zzal(zzbvnVar.zzu());
            java.lang.String zze = zzbvnVar.zze();
            java.util.List zzf = zzbvnVar.zzf();
            java.lang.String zzg = zzbvnVar.zzg();
            android.os.Bundle zzr = zzbvnVar.zzr();
            java.lang.String zzi = zzbvnVar.zzi();
            android.view.View view2 = (android.view.View) zzal(zzbvnVar.zzw());
            com.google.android.gms.dynamic.IObjectWrapper zzx = zzbvnVar.zzx();
            java.lang.String zzk = zzbvnVar.zzk();
            java.lang.String zzl = zzbvnVar.zzl();
            double zzj = zzbvnVar.zzj();
            com.google.android.gms.internal.ads.zzbme zzh = zzbvnVar.zzh();
            com.google.android.gms.internal.ads.zzdpt zzdptVar = new com.google.android.gms.internal.ads.zzdpt();
            zzdptVar.zza = 2;
            zzdptVar.zzb = zzam;
            zzdptVar.zzc = zzv;
            zzdptVar.zzd = view;
            zzdptVar.zzs("headline", zze);
            zzdptVar.zze = zzf;
            zzdptVar.zzs("body", zzg);
            zzdptVar.zzh = zzr;
            zzdptVar.zzs("call_to_action", zzi);
            zzdptVar.zzo = view2;
            zzdptVar.zzq = zzx;
            zzdptVar.zzs(com.ironsource.X3.i.U, zzk);
            zzdptVar.zzs("price", zzl);
            zzdptVar.zzr = zzj;
            zzdptVar.zzs = zzh;
            return zzdptVar;
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdpt zzai(com.google.android.gms.internal.ads.zzbvn zzbvnVar) {
        try {
            return zzak(zzam(zzbvnVar.zzt(), null), zzbvnVar.zzv(), (android.view.View) zzal(zzbvnVar.zzu()), zzbvnVar.zze(), zzbvnVar.zzf(), zzbvnVar.zzg(), zzbvnVar.zzr(), zzbvnVar.zzi(), (android.view.View) zzal(zzbvnVar.zzw()), zzbvnVar.zzx(), zzbvnVar.zzk(), zzbvnVar.zzl(), zzbvnVar.zzj(), zzbvnVar.zzh(), null, 0.0f);
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdpt zzaj(com.google.android.gms.internal.ads.zzbvo zzbvoVar) {
        try {
            return zzak(zzam(zzbvoVar.zzs(), null), zzbvoVar.zzt(), (android.view.View) zzal(zzbvoVar.zzr()), zzbvoVar.zze(), zzbvoVar.zzf(), zzbvoVar.zzg(), zzbvoVar.zzp(), zzbvoVar.zzi(), (android.view.View) zzal(zzbvoVar.zzu()), zzbvoVar.zzv(), null, null, -1.0d, zzbvoVar.zzh(), zzbvoVar.zzj(), 0.0f);
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.zzdpt zzak(com.google.android.gms.ads.internal.client.zzea zzeaVar, com.google.android.gms.internal.ads.zzblx zzblxVar, android.view.View view, java.lang.String str, java.util.List list, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.view.View view2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str4, java.lang.String str5, double d, com.google.android.gms.internal.ads.zzbme zzbmeVar, java.lang.String str6, float f) {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = new com.google.android.gms.internal.ads.zzdpt();
        zzdptVar.zza = 6;
        zzdptVar.zzb = zzeaVar;
        zzdptVar.zzc = zzblxVar;
        zzdptVar.zzd = view;
        zzdptVar.zzs("headline", str);
        zzdptVar.zze = list;
        zzdptVar.zzs("body", str2);
        zzdptVar.zzh = bundle;
        zzdptVar.zzs("call_to_action", str3);
        zzdptVar.zzo = view2;
        zzdptVar.zzq = iObjectWrapper;
        zzdptVar.zzs(com.ironsource.X3.i.U, str4);
        zzdptVar.zzs("price", str5);
        zzdptVar.zzr = d;
        zzdptVar.zzs = zzbmeVar;
        zzdptVar.zzs(com.ironsource.X3.i.F0, str6);
        zzdptVar.zzu(f);
        return zzdptVar;
    }

    private static java.lang.Object zzal(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static com.google.android.gms.internal.ads.zzdps zzam(com.google.android.gms.ads.internal.client.zzea zzeaVar, com.google.android.gms.internal.ads.zzbvr zzbvrVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzdps(zzeaVar, zzbvrVar);
    }

    public final synchronized android.view.View zzA() {
        return this.zzd;
    }

    public final synchronized java.lang.String zzB() {
        return zzw("headline");
    }

    public final synchronized java.util.List zzC() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzbme zzD() {
        java.util.List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.Object obj = this.zze.get(0);
        if (obj instanceof android.os.IBinder) {
            return com.google.android.gms.internal.ads.zzbmd.zzh((android.os.IBinder) obj);
        }
        return null;
    }

    public final synchronized java.util.List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    public final synchronized java.lang.String zzG() {
        return zzw("body");
    }

    public final synchronized android.os.Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new android.os.Bundle();
        }
        return this.zzh;
    }

    public final synchronized java.lang.String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized android.view.View zzJ() {
        return this.zzo;
    }

    public final synchronized android.view.View zzK() {
        return this.zzp;
    }

    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized java.lang.String zzM() {
        return zzw(com.ironsource.X3.i.U);
    }

    public final synchronized java.lang.String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbme zzP() {
        return this.zzs;
    }

    public final synchronized java.lang.String zzQ() {
        return zzw(com.ironsource.X3.i.F0);
    }

    public final synchronized com.google.android.gms.internal.ads.zzbme zzR() {
        return this.zzt;
    }

    public final synchronized java.lang.String zzS() {
        return this.zzu;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcku zzT() {
        return this.zzi;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcku zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcku zzW() {
        return this.zzk;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcfw zzY() {
        return this.zzn;
    }

    public final synchronized com.google.android.gms.internal.ads.zzeln zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized androidx.collection.SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized java.lang.String zzac() {
        return this.zzy;
    }

    public final synchronized androidx.collection.SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzi;
        if (zzckuVar != null) {
            zzckuVar.destroy();
            this.zzi = null;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zzj;
        if (zzckuVar2 != null) {
            zzckuVar2.destroy();
            this.zzj = null;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar3 = this.zzk;
        if (zzckuVar3 != null) {
            zzckuVar3.destroy();
            this.zzk = null;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zzn;
        if (zzcfwVar != null) {
            zzcfwVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzblx zzblxVar) {
        this.zzc = zzblxVar;
    }

    public final synchronized void zzd(java.util.List list) {
        this.zze = list;
    }

    public final synchronized void zze(java.util.List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(android.view.View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(android.view.View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(com.google.android.gms.internal.ads.zzbme zzbmeVar) {
        this.zzs = zzbmeVar;
    }

    public final synchronized void zzk(com.google.android.gms.internal.ads.zzbme zzbmeVar) {
        this.zzt = zzbmeVar;
    }

    public final synchronized void zzl(java.lang.String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zzi = zzckuVar;
    }

    public final synchronized void zzn(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zzj = zzckuVar;
    }

    public final synchronized void zzo(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zzk = zzckuVar;
    }

    public final synchronized void zzp(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(com.google.android.gms.internal.ads.zzeln zzelnVar) {
        this.zzl = zzelnVar;
    }

    public final synchronized void zzr(com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zzn = zzcfwVar;
    }

    public final synchronized void zzs(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzblp zzblpVar) {
        if (zzblpVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzblpVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(java.lang.String str) {
        this.zzy = str;
    }

    public final synchronized java.lang.String zzw(java.lang.String str) {
        return (java.lang.String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.internal.ads.zzblx zzz() {
        return this.zzc;
    }
}
