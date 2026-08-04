package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzdwt extends zzdwn {
    private String zzg;
    private int zzh = 1;

    public zzdwt(Context context) {
        this.zzf = new zzbtt(context, o.f1952C.f1972s.l(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i7 = this.zzh;
                        if (i7 == 2) {
                            this.zzf.zzp().zze(this.zze, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmR)).booleanValue() ? new zzdwm(this.zza, this.zze) : new zzdwl(this));
                        } else if (i7 == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmR)).booleanValue() ? new zzdwm(this.zza, this.zze) : new zzdwl(this));
                        } else {
                            this.zza.zzd(new zzdxc(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdxc(1));
                    } catch (Throwable th) {
                        o.f1952C.f1961g.zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzdxc(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, com.google.android.gms.common.internal.InterfaceC0807c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i7 = J.f3546b;
        j.b("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdxc(1));
    }

    public final I3.b zza(zzbuo zzbuoVar) {
        synchronized (this.zzb) {
            try {
                int i7 = this.zzh;
                if (i7 != 1 && i7 != 2) {
                    return zzgbc.zzg(new zzdxc(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbuoVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzbza.zzg);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final I3.b zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i7 = this.zzh;
                if (i7 != 1 && i7 != 3) {
                    return zzgbc.zzg(new zzdxc(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdws
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzbza.zzg);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
