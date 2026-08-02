package com.google.android.gms.internal.ads;

import F2.InterfaceC0265y0;
import H2.m;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzewd implements zzcut, zzcwp, zzext, m, zzcxb, zzcvg, zzdcp {
    private final zzfcj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzewd zzh = null;

    public zzewd(zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
    }

    public static zzewd zzi(zzewd zzewdVar) {
        zzewd zzewdVar2 = new zzewd(zzewdVar.zza);
        zzewdVar2.zzh = zzewdVar;
        return zzewdVar2;
    }

    @Override // H2.m
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzdd();
        } else {
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevu
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzazx) obj).zzb();
                }
            });
        }
    }

    @Override // H2.m
    public final void zzdi() {
    }

    @Override // H2.m
    public final void zzdo() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzdo();
        } else {
            zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevr
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((m) obj).zzdo();
                }
            });
        }
    }

    @Override // H2.m
    public final void zzdp() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzdp();
            return;
        }
        zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzewc
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((m) obj).zzdp();
            }
        });
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzazx) obj).zzf();
            }
        });
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzazx) obj).zze();
            }
        });
    }

    @Override // H2.m
    public final void zzdr() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzdr();
        } else {
            zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzewb
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((m) obj).zzdr();
                }
            });
        }
    }

    @Override // H2.m
    public final void zzds(final int i7) {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzds(i7);
        } else {
            zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevx
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((m) obj).zzds(i7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzdz(zzeVar);
        } else {
            zzexk.zza(this.zzb, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevy
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzazt) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzexk.zza(this.zzb, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevz
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzazt) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.f10720a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzg() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzg();
        } else {
            zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzewa
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzcwp) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzh(zztVar);
        } else {
            zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevo
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((InterfaceC0265y0) obj).c0(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zzj() {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzj();
            return;
        }
        this.zza.zza();
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzazu) obj).zza();
            }
        });
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzazx) obj).zzc();
            }
        });
    }

    public final void zzk(final zzazq zzazqVar) {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzk(zzazqVar);
        } else {
            zzexk.zza(this.zzb, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevt
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzazt) obj).zzd(zzazq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final void zzl(zzext zzextVar) {
        this.zzh = (zzewd) zzextVar;
    }

    public final void zzm(m mVar) {
        this.zzf.set(mVar);
    }

    public final void zzn(InterfaceC0265y0 interfaceC0265y0) {
        this.zzg.set(interfaceC0265y0);
    }

    public final void zzo(zzazt zzaztVar) {
        this.zzb.set(zzaztVar);
    }

    public final void zzp(zzazx zzazxVar) {
        this.zzd.set(zzazxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewd zzewdVar = this.zzh;
        if (zzewdVar != null) {
            zzewdVar.zzq(zzeVar);
        } else {
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzevs
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzazx) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
    }
}
