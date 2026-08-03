package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfl {
    private final java.lang.Object zza = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzbfj zzb = null;
    private boolean zzc = false;

    public final void zza(android.content.Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                } else {
                    if (this.zzb == null) {
                        this.zzb = new com.google.android.gms.internal.ads.zzbfj();
                    }
                    this.zzb.zza(application, context);
                    this.zzc = true;
                }
            }
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new com.google.android.gms.internal.ads.zzbfj();
            }
            this.zzb.zzb(zzbfkVar);
        }
    }

    public final android.app.Activity zzd() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbfj zzbfjVar = this.zzb;
            if (zzbfjVar == null) {
                return null;
            }
            return zzbfjVar.zzd();
        }
    }

    public final android.content.Context zze() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbfj zzbfjVar = this.zzb;
            if (zzbfjVar == null) {
                return null;
            }
            return zzbfjVar.zze();
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbfj zzbfjVar = this.zzb;
            if (zzbfjVar == null) {
                return false;
            }
            return zzbfjVar.zzg().get();
        }
    }

    public final void zzg(com.google.android.gms.internal.ads.zzdwu zzdwuVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new com.google.android.gms.internal.ads.zzbfj();
            }
            this.zzb.zzj(zzdwuVar);
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbfj zzbfjVar = this.zzb;
            if (zzbfjVar == null) {
                return;
            }
            zzbfjVar.zzc(zzbfkVar);
        }
    }
}
