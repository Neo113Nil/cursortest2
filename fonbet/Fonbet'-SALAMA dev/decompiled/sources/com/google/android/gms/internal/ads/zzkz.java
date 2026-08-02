package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzkz implements zzvb, zzrm {
    final /* synthetic */ zzld zza;
    private final zzlb zzb;

    public zzkz(zzld zzldVar, zzlb zzlbVar) {
        this.zza = zzldVar;
        this.zzb = zzlbVar;
    }

    private final Pair zzf(int i7, zzuq zzuqVar) {
        zzuq zzuqVar2;
        zzuq zzuqVar3 = null;
        if (zzuqVar != null) {
            zzlb zzlbVar = this.zzb;
            int i8 = 0;
            while (true) {
                if (i8 >= zzlbVar.zzc.size()) {
                    zzuqVar2 = null;
                    break;
                }
                if (((zzuq) zzlbVar.zzc.get(i8)).zzd == zzuqVar.zzd) {
                    Object obj = zzuqVar.zza;
                    Object obj2 = zzlbVar.zzb;
                    int i9 = zzlk.zzb;
                    zzuqVar2 = zzuqVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i8++;
            }
            if (zzuqVar2 == null) {
                return null;
            }
            zzuqVar3 = zzuqVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzuqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i7, zzuq zzuqVar, final zzum zzumVar) {
        zzdj zzdjVar;
        final Pair zzf = zzf(0, zzuqVar);
        if (zzf != null) {
            zzdjVar = this.zza.zzi;
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final void run() {
                    zzly zzlyVar;
                    Pair pair = zzf;
                    zzlyVar = zzkz.this.zza.zzh;
                    zzlyVar.zzag(((Integer) pair.first).intValue(), (zzuq) pair.second, zzumVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i7, zzuq zzuqVar, final zzuh zzuhVar, final zzum zzumVar) {
        zzdj zzdjVar;
        final Pair zzf = zzf(0, zzuqVar);
        if (zzf != null) {
            zzdjVar = this.zza.zzi;
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    zzly zzlyVar;
                    Pair pair = zzf;
                    zzlyVar = zzkz.this.zza.zzh;
                    zzlyVar.zzah(((Integer) pair.first).intValue(), (zzuq) pair.second, zzuhVar, zzumVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i7, zzuq zzuqVar, final zzuh zzuhVar, final zzum zzumVar) {
        zzdj zzdjVar;
        final Pair zzf = zzf(0, zzuqVar);
        if (zzf != null) {
            zzdjVar = this.zza.zzi;
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final void run() {
                    zzly zzlyVar;
                    Pair pair = zzf;
                    zzlyVar = zzkz.this.zza.zzh;
                    zzlyVar.zzai(((Integer) pair.first).intValue(), (zzuq) pair.second, zzuhVar, zzumVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i7, zzuq zzuqVar, final zzuh zzuhVar, final zzum zzumVar, final IOException iOException, final boolean z4) {
        zzdj zzdjVar;
        final Pair zzf = zzf(0, zzuqVar);
        if (zzf != null) {
            zzdjVar = this.zza.zzi;
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final void run() {
                    zzly zzlyVar;
                    Pair pair = zzf;
                    zzlyVar = zzkz.this.zza.zzh;
                    zzlyVar.zzaj(((Integer) pair.first).intValue(), (zzuq) pair.second, zzuhVar, zzumVar, iOException, z4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzak(int i7, zzuq zzuqVar, final zzuh zzuhVar, final zzum zzumVar, final int i8) {
        zzdj zzdjVar;
        final Pair zzf = zzf(0, zzuqVar);
        if (zzf != null) {
            zzdjVar = this.zza.zzi;
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final void run() {
                    zzly zzlyVar;
                    Pair pair = zzf;
                    zzlyVar = zzkz.this.zza.zzh;
                    zzlyVar.zzak(((Integer) pair.first).intValue(), (zzuq) pair.second, zzuhVar, zzumVar, i8);
                }
            });
        }
    }
}
