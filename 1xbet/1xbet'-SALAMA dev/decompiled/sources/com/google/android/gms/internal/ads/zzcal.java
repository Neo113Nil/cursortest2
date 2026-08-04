package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class zzcal {
    private final Context zza;
    private final zzcaw zzb;
    private final ViewGroup zzc;
    private final zzdqq zzd;
    private zzcak zze;

    public zzcal(Context context, ViewGroup viewGroup, zzceb zzcebVar, zzdqq zzdqqVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcebVar;
        this.zze = null;
        this.zzd = zzdqqVar;
    }

    public final zzcak zza() {
        return this.zze;
    }

    public final Integer zzb() {
        zzcak zzcakVar = this.zze;
        if (zzcakVar != null) {
            return zzcakVar.zzl();
        }
        return null;
    }

    public final void zzc(int i7, int i8, int i9, int i10) {
        D.d("The underlay may only be modified from the UI thread.");
        zzcak zzcakVar = this.zze;
        if (zzcakVar != null) {
            zzcakVar.zzF(i7, i8, i9, i10);
        }
    }

    public final void zzd(int i7, int i8, int i9, int i10, int i11, boolean z4, zzcav zzcavVar) {
        if (this.zze != null) {
            return;
        }
        zzbcf.zza(this.zzb.zzl().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcaw zzcawVar = this.zzb;
        zzcak zzcakVar = new zzcak(context, zzcawVar, i11, z4, zzcawVar.zzl().zza(), zzcavVar, this.zzd);
        this.zze = zzcakVar;
        this.zzc.addView(zzcakVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzF(i7, i8, i9, i10);
        this.zzb.zzz(false);
    }

    public final void zze() {
        D.d("onDestroy must be called from the UI thread.");
        zzcak zzcakVar = this.zze;
        if (zzcakVar != null) {
            zzcakVar.zzq();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzf() {
        D.d("onPause must be called from the UI thread.");
        zzcak zzcakVar = this.zze;
        if (zzcakVar != null) {
            zzcakVar.zzu();
        }
    }

    public final void zzg(int i7) {
        zzcak zzcakVar = this.zze;
        if (zzcakVar != null) {
            zzcakVar.zzC(i7);
        }
    }
}
