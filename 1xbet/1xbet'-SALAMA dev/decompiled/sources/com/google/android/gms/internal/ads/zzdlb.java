package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdlb {
    private final zzfba zza;
    private final Executor zzb;
    private final zzdnq zzc;
    private final zzdml zzd;
    private final Context zze;
    private final zzdqq zzf;
    private final zzfia zzg;
    private final zzeaf zzh;

    public zzdlb(zzfba zzfbaVar, Executor executor, zzdnq zzdnqVar, Context context, zzdqq zzdqqVar, zzfia zzfiaVar, zzeaf zzeafVar, zzdml zzdmlVar) {
        this.zza = zzfbaVar;
        this.zzb = executor;
        this.zzc = zzdnqVar;
        this.zze = context;
        this.zzf = zzdqqVar;
        this.zzg = zzfiaVar;
        this.zzh = zzeafVar;
        this.zzd = zzdmlVar;
    }

    public static /* synthetic */ I3.b zza(final zzdlb zzdlbVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfaf zzfafVar, zzfai zzfaiVar, String str, String str2, Object obj) {
        final zzceb zzcebVarZza = zzdlbVar.zzc.zza(zzrVar, zzfafVar, zzfaiVar);
        final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVarZza);
        if (zzdlbVar.zza.zzb != null) {
            zzdlbVar.zzh(zzcebVarZza);
            zzcebVarZza.zzaj(zzcfv.zzd());
        } else {
            zzdmi zzdmiVarZzb = zzdlbVar.zzd.zzb();
            zzcebVarZza.zzN().zzV(zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, zzdmiVarZzb, false, null, new E2.b(zzdlbVar.zze, null), null, null, zzdlbVar.zzh, zzdlbVar.zzg, zzdlbVar.zzf, null, zzdmiVarZzb, null, null, null, null);
            zzj(zzcebVarZza);
        }
        zzcebVarZza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str3, String str4) {
                zzdlb.zzf(this.zza, zzcebVarZza, zzbzeVarZza, z4, i7, str3, str4);
            }
        });
        zzcebVarZza.zzae(str, str2, null);
        return zzbzeVarZza;
    }

    public static I3.b zzb(zzdlb zzdlbVar, Object obj) {
        zzceb zzcebVarZza = zzdlbVar.zzc.zza(com.google.android.gms.ads.internal.client.zzr.k(), null, null);
        final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVarZza);
        zzdlbVar.zzh(zzcebVarZza);
        zzcebVarZza.zzN().zzJ(new zzcfs() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // com.google.android.gms.internal.ads.zzcfs
            public final void zza() {
                zzbzeVarZza.zzb();
            }
        });
        zzcebVarZza.loadUrl((String) C0254t.f2723d.f2726c.zzb(zzbby.zzdW));
        return zzbzeVarZza;
    }

    public static /* synthetic */ I3.b zzc(final zzdlb zzdlbVar, JSONObject jSONObject, final zzceb zzcebVar) {
        zzblj zzbljVar = zzdlbVar.zza.zzb;
        final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVar);
        if (zzbljVar != null) {
            zzcebVar.zzaj(zzcfv.zzd());
        } else {
            zzcebVar.zzaj(zzcfv.zze());
        }
        zzcebVar.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdku
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str, String str2) {
                zzdlb.zzg(this.zza, zzcebVar, zzbzeVarZza, z4, i7, str, str2);
            }
        });
        zzcebVar.zzp("google.afma.nativeAds.renderVideo", jSONObject);
        return zzbzeVarZza;
    }

    public static /* synthetic */ void zzf(zzdlb zzdlbVar, zzceb zzcebVar, zzbze zzbzeVar, boolean z4, int i7, String str, String str2) {
        if (z4) {
            if (zzdlbVar.zza.zza != null && zzcebVar.zzq() != null) {
                zzcebVar.zzq().zzs(zzdlbVar.zza.zza);
            }
            zzbzeVar.zzb();
            return;
        }
        zzbzeVar.zzd(new zzefk(1, "Html video Web View failed to load. Error code: " + i7 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static void zzg(zzdlb zzdlbVar, zzceb zzcebVar, zzbze zzbzeVar, boolean z4, int i7, String str, String str2) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzee)).booleanValue()) {
            zzdlbVar.zzi(zzcebVar, zzbzeVar);
            return;
        }
        if (z4) {
            zzdlbVar.zzi(zzcebVar, zzbzeVar);
            return;
        }
        zzbzeVar.zzd(new zzefk(1, "Native Video WebView failed to load. Error code: " + i7 + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzceb zzcebVar) {
        zzj(zzcebVar);
        zzcebVar.zzag("/video", zzbiy.zzl);
        zzcebVar.zzag("/videoMeta", zzbiy.zzm);
        zzcebVar.zzag("/precache", new zzccj());
        zzcebVar.zzag("/delayPageLoaded", zzbiy.zzp);
        zzcebVar.zzag("/instrument", zzbiy.zzn);
        zzcebVar.zzag("/log", zzbiy.zzg);
        zzcebVar.zzag("/click", new zzbhx(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcebVar.zzN().zzG(true);
            zzcebVar.zzag("/open", new zzbjl(null, null, null, null, null));
        } else {
            zzcebVar.zzN().zzG(false);
        }
        if (o.f1952C.f1978y.zzp(zzcebVar.getContext())) {
            Map map = new HashMap();
            if (zzcebVar.zzD() != null) {
                map = zzcebVar.zzD().zzaw;
            }
            zzcebVar.zzag("/logScionEvent", new zzbjf(zzcebVar.getContext(), map));
        }
    }

    private final void zzi(zzceb zzcebVar, zzbze zzbzeVar) {
        if (this.zza.zza != null && zzcebVar.zzq() != null) {
            zzcebVar.zzq().zzs(this.zza.zza);
        }
        zzbzeVar.zzb();
    }

    private static final void zzj(zzceb zzcebVar) {
        zzcebVar.zzag("/videoClicked", zzbiy.zzh);
        zzcebVar.zzN().zzI(true);
        zzcebVar.zzag("/getNativeAdViewSignals", zzbiy.zzs);
        zzcebVar.zzag("/getNativeClickMeta", zzbiy.zzt);
    }

    public final I3.b zzd(final JSONObject jSONObject) {
        return zzgbc.zzn(zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdlb.zzb(this.zza, obj);
            }
        }, this.zzb), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdlb.zzc(this.zza, jSONObject, (zzceb) obj);
            }
        }, this.zzb);
    }

    public final I3.b zze(final String str, final String str2, final zzfaf zzfafVar, final zzfai zzfaiVar, final com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdlb.zza(this.zza, zzrVar, zzfafVar, zzfaiVar, str, str2, obj);
            }
        }, this.zzb);
    }
}
