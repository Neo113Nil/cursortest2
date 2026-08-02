package com.google.android.gms.internal.ads;

import F2.C;
import F2.C0254t;
import F2.InterfaceC0217a;
import F2.InterfaceC0226e0;
import F2.InterfaceC0265y0;
import F2.InterfaceC0266z;
import F2.Z;
import I2.J;
import J2.j;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z2.e;

/* loaded from: classes.dex */
public final class zzejd implements e, zzcxn, zzcwe, zzcut, zzcvk, InterfaceC0217a, zzcuq, zzcxb, zzcvg, zzdcp {
    final zzdqq zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zziR)).intValue());

    public zzejd(zzdqq zzdqqVar) {
        this.zza = zzdqqVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeio
                    @Override // com.google.android.gms.internal.ads.zzexj
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((Z) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
            return;
        }
        zzexk.zza(this.zzc, new zzejb());
    }

    @Override // z2.e
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiv
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((Z) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i7 = J.f3546b;
            j.b("The queue for app events is full, dropping the new event.");
            zzdqq zzdqqVar = this.zza;
            if (zzdqqVar != null) {
                zzdqp zza = zzdqqVar.zza();
                zza.zzb("action", "dae_action");
                zza.zzb("dae_name", str);
                zza.zzb("dae_data", str2);
                zza.zzj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzd();
            }
        });
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0226e0) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzj();
            }
        });
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0226e0) obj).zzf();
            }
        });
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0226e0) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
            zzexk.zza(this.zzc, new zzejb());
        }
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0226e0) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zze(com.google.android.gms.ads.internal.client.zze.this.f10720a);
            }
        });
        zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((C) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
    }

    public final synchronized InterfaceC0266z zzg() {
        return (InterfaceC0266z) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0265y0) obj).c0(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    public final synchronized Z zzi() {
        return (Z) this.zzd.get();
    }

    public final void zzj(InterfaceC0266z interfaceC0266z) {
        this.zzc.set(interfaceC0266z);
    }

    public final void zzk(C c3) {
        this.zzf.set(c3);
    }

    public final void zzl(InterfaceC0265y0 interfaceC0265y0) {
        this.zze.set(interfaceC0265y0);
    }

    public final void zzm(Z z4) {
        this.zzd.set(z4);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(InterfaceC0226e0 interfaceC0226e0) {
        this.zzg.set(interfaceC0226e0);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeiu
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0226e0) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final synchronized void zzs() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzi();
            }
        });
        zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeit
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((C) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeix
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0266z) obj).zzk();
            }
        });
    }
}
