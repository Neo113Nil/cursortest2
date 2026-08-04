package com.google.android.gms.internal.ads;

import A1.Q;
import F2.C0222c0;
import F2.C0254t;
import F2.Z;
import I2.P;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzfba {
    public final com.google.android.gms.ads.internal.client.zzfx zza;
    public final zzblj zzb;
    public final zzejd zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzr zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbey zzi;
    public final com.google.android.gms.ads.internal.client.zzx zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final Z zzn;
    public final zzfan zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final C0222c0 zzt;

    public zzfba(zzfay zzfayVar, zzfaz zzfazVar) {
        this.zze = zzfayVar.zzb;
        this.zzf = zzfayVar.zzc;
        this.zzt = zzfayVar.zzu;
        int i7 = zzfayVar.zza.f10756a;
        long j = zzfayVar.zza.f10757b;
        Bundle bundle = zzfayVar.zza.f10758c;
        int i8 = zzfayVar.zza.f10759d;
        List list = zzfayVar.zza.f10760e;
        boolean z4 = zzfayVar.zza.f10761f;
        int i9 = zzfayVar.zza.f10762x;
        boolean z7 = true;
        if (!zzfayVar.zza.f10763y && !zzfayVar.zze) {
            z7 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i7, j, bundle, i8, list, z4, i9, z7, zzfayVar.zza.f10764z, zzfayVar.zza.f10739A, zzfayVar.zza.f10740B, zzfayVar.zza.f10741C, zzfayVar.zza.f10742D, zzfayVar.zza.f10743E, zzfayVar.zza.f10744F, zzfayVar.zza.f10745G, zzfayVar.zza.f10746H, zzfayVar.zza.f10747I, zzfayVar.zza.f10748J, zzfayVar.zza.f10749K, zzfayVar.zza.f10750L, zzfayVar.zza.f10751M, P.t(zzfayVar.zza.f10752N), zzfayVar.zza.f10753O, zzfayVar.zza.f10754P, zzfayVar.zza.f10755Q);
        this.zza = zzfayVar.zzd != null ? zzfayVar.zzd : zzfayVar.zzh != null ? zzfayVar.zzh.zzf : null;
        this.zzg = zzfayVar.zzf;
        this.zzh = zzfayVar.zzg;
        this.zzi = zzfayVar.zzf == null ? null : zzfayVar.zzh == null ? new zzbey(new B2.b(new Q())) : zzfayVar.zzh;
        this.zzj = zzfayVar.zzi;
        this.zzk = zzfayVar.zzm;
        this.zzl = zzfayVar.zzj;
        this.zzm = zzfayVar.zzk;
        this.zzn = zzfayVar.zzl;
        this.zzb = zzfayVar.zzn;
        this.zzo = new zzfan(zzfayVar.zzo, null);
        this.zzp = zzfayVar.zzp;
        this.zzq = zzfayVar.zzq;
        this.zzc = zzfayVar.zzr;
        this.zzr = zzfayVar.zzs;
        this.zzs = zzfayVar.zzt;
    }

    public final boolean zza() {
        return this.zzf.matches((String) C0254t.f2723d.f2726c.zzb(zzbby.zzds));
    }
}
