package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbgb {
    private final Object zza = new Object();
    private zzbfz zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                } else {
                    if (this.zzb == null) {
                        this.zzb = new zzbfz();
                    }
                    this.zzb.zza(application, context);
                    this.zzc = true;
                }
            }
        }
    }

    public final void zzb(zzbga zzbgaVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbfz();
            }
            this.zzb.zzb(zzbgaVar);
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            zzbfz zzbfzVar = this.zzb;
            if (zzbfzVar == null) {
                return null;
            }
            return zzbfzVar.zzd();
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            zzbfz zzbfzVar = this.zzb;
            if (zzbfzVar == null) {
                return null;
            }
            return zzbfzVar.zze();
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            zzbfz zzbfzVar = this.zzb;
            if (zzbfzVar == null) {
                return false;
            }
            return zzbfzVar.zzg().get();
        }
    }

    public final void zzg(zzdxs zzdxsVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbfz();
            }
            this.zzb.zzj(zzdxsVar);
        }
    }

    public final void zzc(zzbga zzbgaVar) {
        synchronized (this.zza) {
            zzbfz zzbfzVar = this.zzb;
            if (zzbfzVar == null) {
                return;
            }
            zzbfzVar.zzc(zzbgaVar);
        }
    }
}
