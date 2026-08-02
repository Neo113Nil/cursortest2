package com.google.android.gms.internal.ads;

import F2.C0222c0;
import F2.F;
import F2.H;
import F2.InterfaceC0266z;
import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes.dex */
public final class zzeig extends H {
    final zzfay zza;
    final zzdhl zzb;
    private final Context zzc;
    private final zzcgb zzd;
    private InterfaceC0266z zze;

    public zzeig(zzcgb zzcgbVar, Context context, String str) {
        zzfay zzfayVar = new zzfay();
        this.zza = zzfayVar;
        this.zzb = new zzdhl();
        this.zzd = zzcgbVar;
        zzfayVar.zzt(str);
        this.zzc = context;
    }

    @Override // F2.I
    public final F zze() {
        zzdhn zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzfay zzfayVar = this.zza;
        if (zzfayVar.zzh() == null) {
            zzfayVar.zzs(com.google.android.gms.ads.internal.client.zzr.k());
        }
        return new zzeih(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // F2.I
    public final void zzf(zzbgh zzbghVar) {
        this.zzb.zza(zzbghVar);
    }

    @Override // F2.I
    public final void zzg(zzbgk zzbgkVar) {
        this.zzb.zzb(zzbgkVar);
    }

    @Override // F2.I
    public final void zzh(String str, zzbgq zzbgqVar, zzbgn zzbgnVar) {
        this.zzb.zzc(str, zzbgqVar, zzbgnVar);
    }

    @Override // F2.I
    public final void zzi(zzbls zzblsVar) {
        this.zzb.zzd(zzblsVar);
    }

    @Override // F2.I
    public final void zzj(zzbgu zzbguVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zze(zzbguVar);
        this.zza.zzs(zzrVar);
    }

    @Override // F2.I
    public final void zzk(zzbgx zzbgxVar) {
        this.zzb.zzf(zzbgxVar);
    }

    @Override // F2.I
    public final void zzl(InterfaceC0266z interfaceC0266z) {
        this.zze = interfaceC0266z;
    }

    @Override // F2.I
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // F2.I
    public final void zzn(zzblj zzbljVar) {
        this.zza.zzw(zzbljVar);
    }

    @Override // F2.I
    public final void zzo(zzbey zzbeyVar) {
        this.zza.zzD(zzbeyVar);
    }

    @Override // F2.I
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // F2.I
    public final void zzq(C0222c0 c0222c0) {
        this.zza.zzV(c0222c0);
    }
}
