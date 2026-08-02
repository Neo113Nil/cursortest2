package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.o;
import android.content.Context;

/* loaded from: classes.dex */
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
        zzgbn zzgbnVar;
        zzgbnVar = this.zzd.zzg;
        final zzfia zzfiaVar = this.zza;
        final String str = this.zzb;
        final o oVar = this.zzc;
        zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzko)).booleanValue();
                zzclm zzclmVar = zzclm.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcln zzclnVar = zzclmVar.zzd;
                    context2 = zzclnVar.zzc;
                    zzclnVar.zzb = zzbtl.zzc(context2);
                    zzclmVar.zzd.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcln zzclnVar2 = zzclmVar.zzd;
                    context = zzclnVar2.zzc;
                    zzclnVar2.zza = zzbtl.zza(context);
                    zzclmVar.zzd.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                o oVar2 = oVar;
                zzfiaVar.zzd(str, oVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgbn zzgbnVar;
        final zzfia zzfiaVar = this.zza;
        final String str = (String) obj;
        zzgbnVar = this.zzd.zzg;
        final o oVar = this.zzc;
        zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
            @Override // java.lang.Runnable
            public final void run() {
                zzfia.this.zzd(str, oVar, null);
            }
        });
    }
}
