package com.google.android.gms.internal.ads;

import F2.I0;
import I2.J;
import J2.j;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdgk extends zzbff {
    private final zzdhc zza;
    private p105o3.a zzb;

    public zzdgk(zzdhc zzdhcVar) {
        this.zza = zzdhcVar;
    }

    private static float zzb(p105o3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) p105o3.b.t0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zze() {
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.e("Remote exception getting video controller aspect ratio.", e7);
                return 0.0f;
            }
        }
        p105o3.a aVar = this.zzb;
        if (aVar != null) {
            return zzb(aVar);
        }
        zzbfj zzbfjVarZzm = this.zza.zzm();
        if (zzbfjVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbfjVarZzm.zzd() == -1 || zzbfjVarZzm.zzc() == -1) ? 0.0f : zzbfjVarZzm.zzd() / zzbfjVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbfjVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzf() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzg() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final I0 zzh() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final p105o3.a zzi() {
        p105o3.a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbfj zzbfjVarZzm = this.zza.zzm();
        if (zzbfjVarZzm == null) {
            return null;
        }
        return zzbfjVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzj(p105o3.a aVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzk() {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzl() {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzm(zzbgr zzbgrVar) {
        if (this.zza.zzj() instanceof zzcfd) {
            ((zzcfd) this.zza.zzj()).zzv(zzbgrVar);
        }
    }
}
