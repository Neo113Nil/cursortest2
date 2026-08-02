package com.google.android.gms.internal.ads;

import F2.C0254t;
import io.sentry.Session;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzemz implements zzesh {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final InterfaceC1436a zzc;
    private final Executor zzd;
    private final zzesh zze;
    private final long zzf;
    private final zzdqq zzg;

    public zzemz(zzesh zzeshVar, long j, InterfaceC1436a interfaceC1436a, Executor executor, zzdqq zzdqqVar) {
        this.zzc = interfaceC1436a;
        this.zze = zzeshVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzemy zzemyVar;
        zzbbp zzbbpVar = zzbby.zzlM;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlL)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzbza.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzemw
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
                            @Override // java.lang.Runnable
                            public final void run() {
                                r0.zza.set(new zzemy(r0.zze.zzb(), r0.zzf, zzemz.this.zzc));
                            }
                        });
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    zzemyVar = (zzemy) this.zza.get();
                    if (zzemyVar == null) {
                        zzemy zzemyVar2 = new zzemy(this.zze.zzb(), this.zzf, this.zzc);
                        this.zza.set(zzemyVar2);
                        return zzemyVar2.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzemyVar.zza()) {
                        I3.b bVar = zzemyVar.zza;
                        zzesh zzeshVar = this.zze;
                        zzemy zzemyVar3 = new zzemy(zzeshVar.zzb(), this.zzf, this.zzc);
                        this.zza.set(zzemyVar3);
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlN)).booleanValue()) {
                            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlO)).booleanValue()) {
                                zzdqp zza = this.zzg.zza();
                                zza.zzb("action", "scs");
                                zza.zzb(Session.JsonKeys.SID, String.valueOf(this.zze.zza()));
                                zza.zzj();
                            }
                            return bVar;
                        }
                        zzemyVar = zzemyVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            zzemyVar = (zzemy) this.zza.get();
            if (zzemyVar == null || zzemyVar.zza()) {
                zzesh zzeshVar2 = this.zze;
                zzemy zzemyVar4 = new zzemy(zzeshVar2.zzb(), this.zzf, this.zzc);
                this.zza.set(zzemyVar4);
                zzemyVar = zzemyVar4;
            }
        }
        return zzemyVar.zza;
    }
}
