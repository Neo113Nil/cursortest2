package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import H2.m;
import p172z2.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzcyz implements e, S2.a, zzcuq, InterfaceC0217a, zzcxb, zzcvk, zzcwp, m, zzcvg, zzdcp {
    private final zzcyw zza = new zzcyw(this, null);
    private zzejd zzb;
    private zzejh zzc;
    private zzewd zzd;
    private zzezi zze;

    private static void zzn(Object obj, zzcyx zzcyxVar) {
        if (obj != null) {
            zzcyxVar.zza(obj);
        }
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxp
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxq
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejh) obj).onAdClicked();
            }
        });
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxv
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // p172z2.e
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyb
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zza();
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzb();
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyo
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxw
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzc();
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxx
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzc();
            }
        });
    }

    @Override // H2.m
    public final void zzdE() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyk
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzdd();
            }
        });
        zzn(this.zzc, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyp
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejh) obj).zzdd();
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyq
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzdd();
            }
        });
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzdd();
            }
        });
    }

    @Override // H2.m
    public final void zzdi() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
            }
        });
    }

    @Override // H2.m
    public final void zzdo() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzdo();
            }
        });
    }

    @Override // H2.m
    public final void zzdp() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyd
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzdp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(final zzbva zzbvaVar, final String str, final String str2) {
        zzn(this.zzb, new zzcyx(zzbvaVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcxy
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcya
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzdq(zzbvaVar, str, str2);
            }
        });
    }

    @Override // H2.m
    public final void zzdr() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzdr();
            }
        });
    }

    @Override // H2.m
    public final void zzds(final int i7) {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyl
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzds(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxo
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxz
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxr
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxs
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzg() {
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcym
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzh(zztVar);
            }
        });
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzh(zztVar);
            }
        });
        zzn(this.zzd, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzewd) obj).zzh(zztVar);
            }
        });
    }

    public final zzcyw zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcys
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzezi) obj).zzq(zzeVar);
            }
        });
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyt
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcxt
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzn(this.zzb, new zzcyx() { // from class: com.google.android.gms.internal.ads.zzcyc
            @Override // com.google.android.gms.internal.ads.zzcyx
            public final void zza(Object obj) {
                ((zzejd) obj).zzu();
            }
        });
    }
}
