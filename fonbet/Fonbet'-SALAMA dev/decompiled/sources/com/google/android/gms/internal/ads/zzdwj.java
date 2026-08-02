package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdwj extends zzdwn {
    private final Context zzg;
    private final Executor zzh;

    public zzdwj(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbtt(context, o.f1952C.f1972s.l(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzg(this.zze, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmR)).booleanValue() ? new zzdwm(this.zza, this.zze) : new zzdwl(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdxc(1));
                    } catch (Throwable th) {
                        o.f1952C.f1961g.zzw(th, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzdxc(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i7 = J.f3546b;
        j.b("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdxc(1));
    }

    public final I3.b zza(zzbuo zzbuoVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbuoVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwj.this.zzb();
                    }
                }, zzbza.zzg);
                zzdwn.zzc(this.zzg, this.zza, this.zzh);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
