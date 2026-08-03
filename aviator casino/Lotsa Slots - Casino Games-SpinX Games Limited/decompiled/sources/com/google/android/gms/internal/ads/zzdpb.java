package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdpb extends com.google.android.gms.internal.ads.zzbma {
    private final com.google.android.gms.internal.ads.zzdpt zza;
    private com.google.android.gms.dynamic.IObjectWrapper zzb;

    public zzdpb(com.google.android.gms.internal.ads.zzdpt zzdptVar) {
        this.zza = zzdptVar;
    }

    private static float zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.graphics.drawable.Drawable drawable;
        if (iObjectWrapper == null || (drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zze() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcne zzN;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zza;
        if (zzdptVar.zzab() != 0.0f) {
            return zzdptVar.zzab();
        }
        if (zzdptVar.zzy() != null) {
            try {
                return zzdptVar.zzy().zzm();
            } catch (android.os.RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznP)).booleanValue() && zzdptVar.zzU() != null && (zzN = zzdptVar.zzU().zzN()) != null && (i = zzN.zzb) >= 0 && (i2 = zzN.zza) > 0) {
            return i / i2;
        }
        com.google.android.gms.internal.ads.zzbme zzD = zzdptVar.zzD();
        if (zzD == null) {
            return 0.0f;
        }
        float zze = (zzD.zze() == -1 || zzD.zzf() == -1) ? 0.0f : zzD.zze() / zzD.zzf();
        return zze == 0.0f ? zzb(zzD.zzb()) : zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException {
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        com.google.android.gms.internal.ads.zzbme zzD = this.zza.zzD();
        if (zzD == null) {
            return null;
        }
        return zzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zzh() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zza;
        if (zzdptVar.zzy() != null) {
            return zzdptVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zzi() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zza;
        if (zzdptVar.zzy() != null) {
            return zzdptVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws android.os.RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final boolean zzk() throws android.os.RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final boolean zzl() throws android.os.RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzm(com.google.android.gms.internal.ads.zzbnj zzbnjVar) {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zza;
        if (zzdptVar.zzy() instanceof com.google.android.gms.internal.ads.zzcma) {
            ((com.google.android.gms.internal.ads.zzcma) zzdptVar.zzy()).zzv(zzbnjVar);
        }
    }
}
