package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdwp extends zzdwn {
    private final Context zzg;
    private final Executor zzh;

    public zzdwp(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbtt(context, o.f1952C.f1972s.l(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmR)).booleanValue() ? new zzdwm(this.zza, this.zze) : new zzdwl(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdxc(1));
                    } catch (Throwable th) {
                        o.f1952C.f1961g.zzw(th, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzdxc(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
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
