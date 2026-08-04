package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.o;

/* JADX INFO: loaded from: classes.dex */
final class zzclm implements zzgay {
    final /* synthetic */ zzfia zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ o zzc;
    final /* synthetic */ zzcln zzd;

    public zzclm(zzcln zzclnVar, zzfia zzfiaVar, String str, o oVar) {
        this.zza = zzfiaVar;
        this.zzb = str;
        this.zzc = oVar;
        this.zzd = zzclnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(final Throwable th) {
        zzgbn zzgbnVar = this.zzd.zzg;
        final zzfia zzfiaVar = this.zza;
        final String str = this.zzb;
        final o oVar = this.zzc;
        zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzko)).booleanValue();
                zzclm zzclmVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcln zzclnVar = zzclmVar.zzd;
                    zzclnVar.zzb = zzbtl.zzc(zzclnVar.zzc);
                    zzclmVar.zzd.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcln zzclnVar2 = zzclmVar.zzd;
                    zzclnVar2.zza = zzbtl.zza(zzclnVar2.zzc);
                    zzclmVar.zzd.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                o oVar2 = oVar;
                zzfiaVar.zzd(str, oVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfia zzfiaVar = this.zza;
        final String str = (String) obj;
        zzgbn zzgbnVar = this.zzd.zzg;
        final o oVar = this.zzc;
        zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
            @Override // java.lang.Runnable
            public final void run() {
                zzfiaVar.zzd(str, oVar, null);
            }
        });
    }
}
