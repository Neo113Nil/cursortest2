package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdmf {
    private final zzdls zza;
    private final E2.a zzb;
    private final Context zzc;
    private final zzdqq zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzbjp zzh;
    private final zzeaf zzi;
    private final zzfia zzj;
    private final zzeaq zzk;
    private final zzfbe zzl;
    private I3.b zzm;

    public zzdmf(zzdmc zzdmcVar) {
        Context context;
        Executor executor;
        zzauo zzauoVar;
        VersionInfoParcel versionInfoParcel;
        E2.a aVar;
        zzeaf zzeafVar;
        zzfia zzfiaVar;
        zzdqq zzdqqVar;
        zzeaq zzeaqVar;
        zzfbe zzfbeVar;
        context = zzdmcVar.zzb;
        this.zzc = context;
        executor = zzdmcVar.zze;
        this.zze = executor;
        zzauoVar = zzdmcVar.zzf;
        this.zzf = zzauoVar;
        versionInfoParcel = zzdmcVar.zzg;
        this.zzg = versionInfoParcel;
        aVar = zzdmcVar.zza;
        this.zzb = aVar;
        this.zza = new zzdls();
        this.zzh = new zzbjp();
        zzeafVar = zzdmcVar.zzd;
        this.zzi = zzeafVar;
        zzfiaVar = zzdmcVar.zzh;
        this.zzj = zzfiaVar;
        zzdqqVar = zzdmcVar.zzc;
        this.zzd = zzdqqVar;
        zzeaqVar = zzdmcVar.zzi;
        this.zzk = zzeaqVar;
        zzfbeVar = zzdmcVar.zzj;
        this.zzl = zzfbeVar;
    }

    public static /* synthetic */ zzceb zza(zzdmf zzdmfVar, zzceb zzcebVar) {
        zzcebVar.zzag("/result", zzdmfVar.zzh);
        zzcft zzN = zzcebVar.zzN();
        E2.b bVar = new E2.b(zzdmfVar.zzc, null);
        zzeaf zzeafVar = zzdmfVar.zzi;
        zzfia zzfiaVar = zzdmfVar.zzj;
        zzdqq zzdqqVar = zzdmfVar.zzd;
        zzdls zzdlsVar = zzdmfVar.zza;
        zzN.zzV(null, zzdlsVar, zzdlsVar, zzdlsVar, zzdlsVar, false, null, bVar, null, null, zzeafVar, zzfiaVar, zzdqqVar, null, null, null, null, null, null);
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
                I3.b zzb;
                zzceb zzcebVar = (zzceb) obj;
                zzb = zzdmf.this.zzh.zzb(zzcebVar, str, jSONObject);
                return zzb;
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
        I3.b zzm = zzgbc.zzm(zzgbc.zzk(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcek
            @Override // com.google.android.gms.internal.ads.zzgai
            public final I3.b zza() {
                zzceo zzceoVar = o.f1952C.f1958d;
                Context context2 = context;
                zzeaq zzeaqVar2 = zzeaqVar;
                zzcfv zza = zzcfv.zza();
                zzauo zzauoVar2 = zzauoVar;
                zzfbe zzfbeVar2 = zzfbeVar;
                E2.a aVar2 = aVar;
                zzceb zza2 = zzceo.zza(context2, zza, "", false, false, zzauoVar2, null, versionInfoParcel, null, null, aVar2, zzbaw.zza(), null, null, zzeaqVar2, zzfbeVar2, zzdqqVar);
                final zzbze zza3 = zzbze.zza((Object) zza2);
                zza2.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzcel
                    @Override // com.google.android.gms.internal.ads.zzcfr
                    public final void zza(boolean z4, int i7, String str2, String str3) {
                        zzbze.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzbza.zzf), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzceb zzcebVar = (zzceb) obj;
                zzdmf.zza(zzdmf.this, zzcebVar);
                return zzcebVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzbzd.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
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
