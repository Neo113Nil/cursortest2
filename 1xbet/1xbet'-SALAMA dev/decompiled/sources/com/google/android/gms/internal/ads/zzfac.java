package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.F0;
import F2.P;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.D;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzfac extends zzbvc {
    private final zzezs zza;
    private final zzezi zzb;
    private final zzfas zzc;
    private zzdmu zzd;
    private boolean zze = false;

    public zzfac(zzezs zzezsVar, zzezi zzeziVar, zzfas zzfasVar) {
        this.zza = zzezsVar;
        this.zzb = zzeziVar;
        this.zzc = zzfasVar;
    }

    private final synchronized boolean zzy() {
        zzdmu zzdmuVar = this.zzd;
        return (zzdmuVar == null || zzdmuVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final Bundle zzb() {
        D.d("getAdMetadata can only be called from the UI thread.");
        zzdmu zzdmuVar = this.zzd;
        return zzdmuVar != null ? zzdmuVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized F0 zzc() {
        zzdmu zzdmuVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue() && (zzdmuVar = this.zzd) != null) {
            return zzdmuVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized String zzd() {
        zzdmu zzdmuVar = this.zzd;
        if (zzdmuVar == null || zzdmuVar.zzl() == null) {
            return null;
        }
        return zzdmuVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzf(p105o3.a aVar) {
        D.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (aVar != null) {
                context = (Context) p105o3.b.t0(aVar);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzfy)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbvd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg(zzbvh zzbvhVar) {
        D.d("loadAd must be called on the main UI thread.");
        String str = zzbvhVar.zzb;
        String str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzfw);
        if (str2 != null && str != null) {
            try {
                if (!Pattern.matches(str2, str)) {
                }
            } catch (RuntimeException e7) {
                o.f1952C.f1961g.zzw(e7, "NonagonUtil.isPatternMatched");
            }
            return;
        }
        if (zzy()) {
        }
        zzezk zzezkVar = new zzezk(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbvhVar.zza, zzbvhVar.zzb, zzezkVar, new zzfaa(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzi(p105o3.a aVar) {
        D.d("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(aVar == null ? null : (Context) p105o3.b.t0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzk(p105o3.a aVar) {
        D.d("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(aVar == null ? null : (Context) p105o3.b.t0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzl(P p5) {
        D.d("setAdMetadataListener can only be called from the UI thread.");
        if (p5 == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfab(this, p5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzm(String str) {
        D.d("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzn(boolean z4) {
        D.d("setImmersiveMode must be called on the main UI thread.");
        this.zze = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzo(zzbvg zzbvgVar) {
        D.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbvgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzp(String str) {
        D.d("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final synchronized void zzr(p105o3.a aVar) {
        try {
            D.d("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objT0 = p105o3.b.t0(aVar);
                    if (objT0 instanceof Activity) {
                        activity = (Activity) objT0;
                    }
                }
                this.zzd.zzh(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final boolean zzs() {
        D.d("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final boolean zzt() {
        zzdmu zzdmuVar = this.zzd;
        return zzdmuVar != null && zzdmuVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzu(zzbvb zzbvbVar) {
        D.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbvbVar);
    }
}
