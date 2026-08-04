package com.google.android.gms.internal.ads;

import F2.C0222c0;
import F2.Z;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzfay {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfx zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbey zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private Z zzl;
    private zzblj zzn;
    private zzejd zzr;
    private Bundle zzt;
    private C0222c0 zzu;
    private int zzm = 1;
    private final zzfal zzo = new zzfal();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final zzfay zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfay zzB(boolean z4) {
        this.zze = z4;
        return this;
    }

    public final zzfay zzC(int i7) {
        this.zzm = i7;
        return this;
    }

    public final zzfay zzD(zzbey zzbeyVar) {
        this.zzh = zzbeyVar;
        return this;
    }

    public final zzfay zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfay zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfay zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.f10710a;
            this.zzl = publisherAdViewOptions.f10711b;
        }
        return this;
    }

    public final zzfay zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzfay zzI(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        this.zzd = zzfxVar;
        return this;
    }

    public final zzfba zzJ() {
        D.j(this.zzc, "ad unit must not be null");
        D.j(this.zzb, "ad size must not be null");
        D.j(this.zza, "ad request must not be null");
        return new zzfba(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfay zzV(C0222c0 c0222c0) {
        this.zzu = c0222c0;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzh() {
        return this.zzb;
    }

    public final zzfal zzp() {
        return this.zzo;
    }

    public final zzfay zzq(zzfba zzfbaVar) {
        this.zzo.zza(zzfbaVar.zzo.zza);
        this.zza = zzfbaVar.zzd;
        this.zzb = zzfbaVar.zze;
        this.zzu = zzfbaVar.zzt;
        this.zzc = zzfbaVar.zzf;
        this.zzd = zzfbaVar.zza;
        this.zzf = zzfbaVar.zzg;
        this.zzg = zzfbaVar.zzh;
        this.zzh = zzfbaVar.zzi;
        this.zzi = zzfbaVar.zzj;
        zzr(zzfbaVar.zzl);
        zzG(zzfbaVar.zzm);
        this.zzp = zzfbaVar.zzp;
        this.zzq = zzfbaVar.zzq;
        this.zzr = zzfbaVar.zzc;
        this.zzs = zzfbaVar.zzr;
        this.zzt = zzfbaVar.zzs;
        return this;
    }

    public final zzfay zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.f10709a;
        }
        return this;
    }

    public final zzfay zzs(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfay zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfay zzu(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfay zzv(zzejd zzejdVar) {
        this.zzr = zzejdVar;
        return this;
    }

    public final zzfay zzw(zzblj zzbljVar) {
        this.zzn = zzbljVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfx(false, true, false);
        return this;
    }

    public final zzfay zzx(boolean z4) {
        this.zzp = z4;
        return this;
    }

    public final zzfay zzy(boolean z4) {
        this.zzq = z4;
        return this;
    }

    public final zzfay zzz(boolean z4) {
        this.zzs = true;
        return this;
    }
}
