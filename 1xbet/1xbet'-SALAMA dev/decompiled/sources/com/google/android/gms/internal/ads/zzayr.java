package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzayr {
    private final Object zza = new Object();
    private zzayp zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzayp zzaypVar = this.zzb;
                if (zzaypVar == null) {
                    return null;
                }
                return zzaypVar.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzayp zzaypVar = this.zzb;
                if (zzaypVar == null) {
                    return null;
                }
                return zzaypVar.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzayq zzayqVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzayp();
                }
                this.zzb.zzf(zzayqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i7 = J.f3546b;
                        j.g("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzayp();
                        }
                        this.zzb.zzg(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzayq zzayqVar) {
        synchronized (this.zza) {
            try {
                zzayp zzaypVar = this.zzb;
                if (zzaypVar == null) {
                    return;
                }
                zzaypVar.zzh(zzayqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
