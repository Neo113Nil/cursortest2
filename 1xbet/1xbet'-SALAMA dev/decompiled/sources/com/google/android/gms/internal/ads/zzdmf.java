package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdmf {
    private final E2.a zzb;
    private final Context zzc;
    private final zzdqq zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzeaf zzi;
    private final zzfia zzj;
    private final zzeaq zzk;
    private final zzfbe zzl;
    private I3.b zzm;
    private final zzdls zza = new zzdls();
    private final zzbjp zzh = new zzbjp();

    public zzdmf(zzdmc zzdmcVar) {
        this.zzc = zzdmcVar.zzb;
        this.zze = zzdmcVar.zze;
        this.zzf = zzdmcVar.zzf;
        this.zzg = zzdmcVar.zzg;
        this.zzb = zzdmcVar.zza;
        this.zzi = zzdmcVar.zzd;
        this.zzj = zzdmcVar.zzh;
        this.zzd = zzdmcVar.zzc;
        this.zzk = zzdmcVar.zzi;
        this.zzl = zzdmcVar.zzj;
    }

    public static /* synthetic */ zzceb zza(zzdmf zzdmfVar, zzceb zzcebVar) {
        zzcebVar.zzag("/result", zzdmfVar.zzh);
        zzcft zzcftVarZzN = zzcebVar.zzN();
        E2.b bVar = new E2.b(zzdmfVar.zzc, null);
        zzeaf zzeafVar = zzdmfVar.zzi;
        zzfia zzfiaVar = zzdmfVar.zzj;
        zzdqq zzdqqVar = zzdmfVar.zzd;
        zzdls zzdlsVar = zzdmfVar.zza;
        zzcftVarZzN.zzV(null, zzdlsVar, zzdlsVar, zzdlsVar, zzdlsVar, false, null, bVar, null, null, zzeafVar, zzfiaVar, zzdqqVar, null, null, null, null, null, null);
        return zzcebVar;
    }

    public final synchronized I3.b zzg(final String str, final JSONObject jSONObject) {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return zzgbc.zzh(null);
        }
        return zzgbc.zzn(bVar, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return this.zza.zzh.zzb((zzceb) obj, str, jSONObject);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfaf zzfafVar, zzfai zzfaiVar, zzcln zzclnVar) {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgbc.zzr(bVar, new zzdlz(this, zzfafVar, zzfaiVar, zzclnVar), this.zze);
    }

    public final synchronized void zzi() {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgbc.zzr(bVar, new zzdlv(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgbc.zzr(bVar, new zzdly(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzdV);
        final Context context = this.zzc;
        final zzauo zzauoVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final E2.a aVar = this.zzb;
        final zzeaq zzeaqVar = this.zzk;
        final zzfbe zzfbeVar = this.zzl;
        final zzdqq zzdqqVar = this.zzd;
        I3.b bVarZzm = zzgbc.zzm(zzgbc.zzk(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcek
            @Override // com.google.android.gms.internal.ads.zzgai
            public final I3.b zza() throws zzcen {
                zzceo zzceoVar = o.f1952C.f1958d;
                Context context2 = context;
                zzeaq zzeaqVar2 = zzeaqVar;
                zzcfv zzcfvVarZza = zzcfv.zza();
                zzauo zzauoVar2 = zzauoVar;
                zzfbe zzfbeVar2 = zzfbeVar;
                E2.a aVar2 = aVar;
                zzceb zzcebVarZza = zzceo.zza(context2, zzcfvVarZza, "", false, false, zzauoVar2, null, versionInfoParcel, null, null, aVar2, zzbaw.zza(), null, null, zzeaqVar2, zzfbeVar2, zzdqqVar);
                final zzbze zzbzeVarZza = zzbze.zza((Object) zzcebVarZza);
                zzcebVarZza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzcel
                    @Override // com.google.android.gms.internal.ads.zzcfr
                    public final void zza(boolean z4, int i7, String str2, String str3) {
                        zzbzeVarZza.zzb();
                    }
                });
                zzcebVarZza.loadUrl(str);
                return zzbzeVarZza;
            }
        }, zzbza.zzf), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzceb zzcebVar = (zzceb) obj;
                zzdmf.zza(this.zza, zzcebVar);
                return zzcebVar;
            }
        }, this.zze);
        this.zzm = bVarZzm;
        zzbzd.zza(bVarZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbiz zzbizVar) {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgbc.zzr(bVar, new zzdlw(this, str, zzbizVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbiz zzbizVar) {
        zzl(str, new zzdmd(this, weakReference, str, zzbizVar, null));
    }

    public final synchronized void zzn(String str, zzbiz zzbizVar) {
        I3.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgbc.zzr(bVar, new zzdlx(this, str, zzbizVar), this.zze);
    }
}
