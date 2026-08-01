package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzflw {
    public final com.google.android.gms.ads.internal.client.zzfw zza;
    public final zzbst zzb;
    public final zzeua zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbmk zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzcl zzo;
    public final zzflk zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final JSONArray zzw;
    public final com.google.android.gms.ads.internal.client.zzcp zzx;

    /* synthetic */ zzflw(zzflv zzflvVar, byte[] bArr) {
        this.zzf = zzflvVar.zzF();
        this.zzg = zzflvVar.zzG();
        this.zzx = zzflvVar.zzac();
        this.zze = zzflvVar.zzE().zzC;
        com.google.android.gms.ads.internal.client.zzm zzE = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE2 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE3 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE4 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE5 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzE6 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(zzflvVar.zzE().zza, zzflvVar.zzE().zzb, zzE6.zzc, zzE5.zzd, zzE4.zze, zzE3.zzf, zzE2.zzg, zzE.zzh || zzflvVar.zzI(), zzflvVar.zzE().zzi, zzflvVar.zzE().zzj, zzflvVar.zzE().zzk, zzflvVar.zzE().zzl, zzflvVar.zzE().zzm, zzflvVar.zzE().zzn, zzflvVar.zzE().zzo, zzflvVar.zzE().zzp, zzflvVar.zzE().zzq, zzflvVar.zzE().zzr, zzflvVar.zzE().zzs, zzflvVar.zzE().zzt, zzflvVar.zzE().zzu, zzflvVar.zzE().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzflvVar.zzE().zzw), zzflvVar.zzE().zzx, zzflvVar.zzE().zzy, zzflvVar.zzE().zzz, zzflvVar.zzE().zzA, zzflvVar.zzE().zzB);
        this.zzd = zzmVar;
        this.zza = zzflvVar.zzH() != null ? zzflvVar.zzH() : zzflvVar.zzL() != null ? zzflvVar.zzL().zzf : null;
        this.zzh = zzflvVar.zzJ();
        this.zzi = zzflvVar.zzK();
        this.zzj = zzflvVar.zzJ() == null ? null : zzflvVar.zzL() == null ? new zzbmk(new NativeAdOptions.Builder().build()) : zzflvVar.zzL();
        this.zzk = zzflvVar.zzM();
        this.zzl = zzflvVar.zzQ();
        this.zzm = zzflvVar.zzN();
        this.zzn = zzflvVar.zzO();
        this.zzo = zzflvVar.zzP();
        this.zzb = zzflvVar.zzR();
        this.zzp = new zzflk(zzflvVar.zzS(), null);
        this.zzq = zzflvVar.zzT();
        this.zzr = zzflvVar.zzU();
        this.zzc = zzflvVar.zzV();
        this.zzs = zzflvVar.zzW();
        this.zzt = zzflvVar.zzX();
        if (zzmVar.zzA != 0) {
            this.zzu = new AtomicLong(zzmVar.zzA);
        } else {
            this.zzu = zzflvVar.zzY();
        }
        this.zzv = zzflvVar.zzZ();
        this.zzw = zzflvVar.zzaa();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzem));
    }
}
