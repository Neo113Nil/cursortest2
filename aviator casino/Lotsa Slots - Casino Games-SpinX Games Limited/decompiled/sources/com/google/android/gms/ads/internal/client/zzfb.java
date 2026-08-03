package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzfb implements com.google.android.gms.ads.MediaContent {
    private final com.google.android.gms.internal.ads.zzbmb zza;
    private final com.google.android.gms.ads.VideoController zzb = new com.google.android.gms.ads.VideoController();
    private final com.google.android.gms.internal.ads.zzbmv zzc;

    public zzfb(com.google.android.gms.internal.ads.zzbmb zzbmbVar, com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        this.zza = zzbmbVar;
        this.zzc = zzbmvVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final android.graphics.drawable.Drawable getMainImage() {
        try {
            com.google.android.gms.dynamic.IObjectWrapper zzg = this.zza.zzg();
            if (zzg != null) {
                return (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzg);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.ads.VideoController getVideoController() {
        try {
            com.google.android.gms.internal.ads.zzbmb zzbmbVar = this.zza;
            if (zzbmbVar.zzj() != null) {
                this.zzb.zza(zzbmbVar.zzj());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(android.graphics.drawable.Drawable drawable) {
        try {
            this.zza.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(drawable));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zza() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.internal.ads.zzbmv zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzbmb zzc() {
        return this.zza;
    }
}
