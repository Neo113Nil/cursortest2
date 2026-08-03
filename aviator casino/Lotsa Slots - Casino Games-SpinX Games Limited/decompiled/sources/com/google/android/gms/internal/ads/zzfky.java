package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfky {
    public final com.google.android.gms.ads.internal.client.zzfw zza;
    public final com.google.android.gms.internal.ads.zzbsb zzb;
    public final com.google.android.gms.internal.ads.zzetc zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final android.os.Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final java.lang.String zzg;
    public final java.util.ArrayList zzh;
    public final java.util.ArrayList zzi;
    public final com.google.android.gms.internal.ads.zzblt zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final com.google.android.gms.ads.formats.AdManagerAdViewOptions zzm;
    public final com.google.android.gms.ads.formats.PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzcl zzo;
    public final com.google.android.gms.internal.ads.zzfkm zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final android.os.Bundle zzt;
    public final java.util.concurrent.atomic.AtomicLong zzu;
    public final boolean zzv;
    public final org.json.JSONArray zzw;
    public final com.google.android.gms.ads.internal.client.zzcp zzx;

    /* synthetic */ zzfky(com.google.android.gms.internal.ads.zzfkx zzfkxVar, byte[] bArr) {
        this.zzf = zzfkxVar.zzF();
        this.zzg = zzfkxVar.zzG();
        this.zzx = zzfkxVar.zzac();
        this.zze = zzfkxVar.zzE().zzB;
        com.google.android.gms.ads.internal.client.zzm zzE = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE2 = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE3 = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE4 = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE5 = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE6 = zzfkxVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(zzfkxVar.zzE().zza, zzfkxVar.zzE().zzb, zzE6.zzc, zzE5.zzd, zzE4.zze, zzE3.zzf, zzE2.zzg, zzE.zzh || zzfkxVar.zzI(), zzfkxVar.zzE().zzi, zzfkxVar.zzE().zzj, zzfkxVar.zzE().zzk, zzfkxVar.zzE().zzl, zzfkxVar.zzE().zzm, zzfkxVar.zzE().zzn, zzfkxVar.zzE().zzo, zzfkxVar.zzE().zzp, zzfkxVar.zzE().zzq, zzfkxVar.zzE().zzr, zzfkxVar.zzE().zzs, zzfkxVar.zzE().zzt, zzfkxVar.zzE().zzu, zzfkxVar.zzE().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfkxVar.zzE().zzw), zzfkxVar.zzE().zzx, zzfkxVar.zzE().zzy, zzfkxVar.zzE().zzz, zzfkxVar.zzE().zzA);
        this.zzd = zzmVar;
        this.zza = zzfkxVar.zzH() != null ? zzfkxVar.zzH() : zzfkxVar.zzL() != null ? zzfkxVar.zzL().zzf : null;
        this.zzh = zzfkxVar.zzJ();
        this.zzi = zzfkxVar.zzK();
        this.zzj = zzfkxVar.zzJ() == null ? null : zzfkxVar.zzL() == null ? new com.google.android.gms.internal.ads.zzblt(new com.google.android.gms.ads.formats.NativeAdOptions.Builder().build()) : zzfkxVar.zzL();
        this.zzk = zzfkxVar.zzM();
        this.zzl = zzfkxVar.zzQ();
        this.zzm = zzfkxVar.zzN();
        this.zzn = zzfkxVar.zzO();
        this.zzo = zzfkxVar.zzP();
        this.zzb = zzfkxVar.zzR();
        this.zzp = new com.google.android.gms.internal.ads.zzfkm(zzfkxVar.zzS(), null);
        this.zzq = zzfkxVar.zzT();
        this.zzr = zzfkxVar.zzU();
        this.zzc = zzfkxVar.zzV();
        this.zzs = zzfkxVar.zzW();
        this.zzt = zzfkxVar.zzX();
        if (zzmVar.zzA != 0) {
            this.zzu = new java.util.concurrent.atomic.AtomicLong(zzmVar.zzA);
        } else {
            this.zzu = zzfkxVar.zzY();
        }
        this.zzv = zzfkxVar.zzZ();
        this.zzw = zzfkxVar.zzaa();
    }

    public final boolean zza() {
        return this.zzg.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzef));
    }
}
