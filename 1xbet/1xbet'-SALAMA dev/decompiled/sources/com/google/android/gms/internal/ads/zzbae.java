package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzbae {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbaa(this);
    private final Object zzc = new Object();
    private zzbah zzd;
    private Context zze;
    private zzbak zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbae zzbaeVar) {
        synchronized (zzbaeVar.zzc) {
            try {
                zzbah zzbahVar = zzbaeVar.zzd;
                if (zzbahVar == null) {
                    return;
                }
                if (zzbahVar.isConnected() || zzbaeVar.zzd.isConnecting()) {
                    zzbaeVar.zzd.disconnect();
                }
                zzbaeVar.zzd = null;
                zzbaeVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbah zzbahVarZzd = zzd(new zzbac(this), new zzbad(this));
                    this.zzd = zzbahVarZzd;
                    zzbahVarZzd.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long zza(zzbai zzbaiVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbaiVar);
                    } catch (RemoteException e7) {
                        int i7 = J.f3546b;
                        j.e("Unable to call into cache service.", e7);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbaf zzb(zzbai zzbaiVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbaf();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbaiVar);
                }
                return this.zzf.zzf(zzbaiVar);
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.e("Unable to call into cache service.", e7);
                return new zzbaf();
            }
        }
    }

    public final synchronized zzbah zzd(InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c) {
        return new zzbah(this.zze, o.f1952C.f1972s.l(), interfaceC0806b, interfaceC0807c);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                zzbbp zzbbpVar = zzbby.zzer;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeq)).booleanValue()) {
                        o.f1952C.f1960f.zzc(new zzbab(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        zzbbp zzbbpVar = zzbby.zzes;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzbza.zzd.schedule(this.zzb, ((Long) c0254t.f2726c.zzb(zzbby.zzet)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
