package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.j;
import J2.k;
import J2.l;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class zzbog {
    private static zzbog zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbog zza() {
        if (zza == null) {
            zza = new zzbog();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbof
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbby.zza(context2);
                zzbbp zzbbpVar = zzbby.zzaJ;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                zzbbp zzbbpVar2 = zzbby.zzay;
                zzbbw zzbbwVar = c0254t.f2726c;
                bundle.putBoolean("measurementEnabled", ((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue());
                if (((Boolean) zzbbwVar.zzb(zzbby.zzaF)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcga) Q0.a.h0(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new k() { // from class: com.google.android.gms.internal.ads.zzboe
                        @Override // J2.k
                        public final Object zza(Object obj) {
                            return zzcfz.zzb((IBinder) obj);
                        }
                    })).zze(new BinderC1507b(context2), new zzbod(com.google.android.gms.internal.measurement.zzee.zzg(context2, "FA-Ads", "am", str, bundle).zzd()));
                } catch (l | RemoteException | NullPointerException e7) {
                    j.i("#007 Could not call remote method.", e7);
                }
            }
        });
        thread.start();
        return thread;
    }
}
