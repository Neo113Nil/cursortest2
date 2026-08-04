package com.google.android.gms.internal.ads;

import F2.InterfaceC0265y0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzezi implements S2.a, zzcwe, zzcut, zzcuq, zzcvg, zzcxb, zzext, zzdcp {
    private final zzfcj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzezi zzi = null;

    public zzezi(zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.onAdMetadataChanged();
        } else {
            zzexk.zza(this.zzb, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyw
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((S2.a) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zza();
            return;
        }
        this.zza.zza();
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvw) obj).zzg();
            }
        });
        zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezf
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvg) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzb();
        } else {
            zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezg
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvg) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzc();
            return;
        }
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvw) obj).zzj();
            }
        });
        zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvg) obj).zzj();
            }
        });
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzdd();
        } else {
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyx
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvw) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(final zzbva zzbvaVar, final String str, final String str2) {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzdq(zzbvaVar, str, str2);
            return;
        }
        zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezh
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                zzbva zzbvaVar2 = zzbvaVar;
                ((zzbvw) obj).zzk(new zzbwk(zzbvaVar2.zzc(), zzbvaVar2.zzb()));
            }
        });
        zzexk.zza(this.zzf, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                zzbva zzbvaVar2 = zzbvaVar;
                ((zzbwb) obj).zze(new zzbwk(zzbvaVar2.zzc(), zzbvaVar2.zzb()), str, str2);
            }
        });
        zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyo
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvg) obj).zze(zzbvaVar);
            }
        });
        zzexk.zza(this.zzg, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyp
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvb) obj).zze(zzbvaVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzdz(zzeVar);
            return;
        }
        final int i7 = zzeVar.f10720a;
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbwa) obj).zzf(zzeVar);
            }
        });
        zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbwa) obj).zze(i7);
            }
        });
        zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzezd
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((zzbvg) obj).zzg(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zze();
        } else {
            zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeza
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvg) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzf();
        } else {
            zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvg) obj).zzl();
                }
            });
        }
    }

    public final void zzg(S2.a aVar) {
        this.zzb.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzh(zztVar);
        } else {
            zzexk.zza(this.zzh, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyt
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((InterfaceC0265y0) obj).c0(zztVar);
                }
            });
        }
    }

    public final void zzi(InterfaceC0265y0 interfaceC0265y0) {
        this.zzh.set(interfaceC0265y0);
    }

    public final void zzj(zzbvw zzbvwVar) {
        this.zzd.set(zzbvwVar);
    }

    public final void zzk(zzbwa zzbwaVar) {
        this.zzc.set(zzbwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final void zzl(zzext zzextVar) {
        this.zzi = (zzezi) zzextVar;
    }

    @Deprecated
    public final void zzm(zzbvg zzbvgVar) {
        this.zze.set(zzbvgVar);
    }

    @Deprecated
    public final void zzn(zzbvb zzbvbVar) {
        this.zzg.set(zzbvbVar);
    }

    public final void zzo(zzbwb zzbwbVar) {
        this.zzf.set(zzbwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzq(zzeVar);
        } else {
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyy
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvw) obj).zzi(zzeVar);
                }
            });
            zzexk.zza(this.zzd, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyz
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvw) obj).zzh(zzeVar.f10720a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        zzezi zzeziVar = this.zzi;
        if (zzeziVar != null) {
            zzeziVar.zzs();
        } else {
            zzexk.zza(this.zzc, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyu
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbwa) obj).zzg();
                }
            });
            zzexk.zza(this.zze, new zzexj() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // com.google.android.gms.internal.ads.zzexj
                public final void zza(Object obj) {
                    ((zzbvg) obj).zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
    }
}
