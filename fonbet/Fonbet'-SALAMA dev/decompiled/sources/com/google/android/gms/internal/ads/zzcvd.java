package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcvd extends zzdag implements zzcuu {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcvd(zzcvc zzcvcVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcvcVar, executor);
    }

    public static /* synthetic */ void zzd(zzcvd zzcvdVar) {
        synchronized (zzcvdVar) {
            int i7 = J.f3546b;
            j.d("Timeout waiting for show call succeed to be called.");
            zzcvdVar.zzc(new zzdey("Timeout for show call succeed."));
            zzcvdVar.zzd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcuu) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzb() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcuw
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcuu) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzc(final zzdey zzdeyVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcuu) obj).zzc(zzdey.this);
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcux
            @Override // java.lang.Runnable
            public final void run() {
                zzcvd.zzd(zzcvd.this);
            }
        }, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzkI)).intValue(), TimeUnit.MILLISECONDS);
    }
}
