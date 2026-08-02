package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzwq {
    private int zza;
    private final SparseArray zzb;
    private final zzdd zzc;

    public zzwq() {
        this(new zzdd() { // from class: com.google.android.gms.internal.ads.zzwp
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i7) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i8 = this.zza;
            if (i8 > 0 && i7 < this.zzb.keyAt(i8)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i7 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i7, Object obj) {
        if (this.zza == -1) {
            zzcv.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            zzcv.zzd(i7 >= keyAt);
            if (keyAt == i7) {
                this.zzc.zza(this.zzb.valueAt(r1.size() - 1));
            }
        }
        this.zzb.append(i7, obj);
    }

    public final void zzd() {
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            this.zzc.zza(this.zzb.valueAt(i7));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i7) {
        int i8 = 0;
        while (i8 < this.zzb.size() - 1) {
            int i9 = i8 + 1;
            if (i7 < this.zzb.keyAt(i9)) {
                return;
            }
            this.zzc.zza(this.zzb.valueAt(i8));
            this.zzb.removeAt(i8);
            int i10 = this.zza;
            if (i10 > 0) {
                this.zza = i10 - 1;
            }
            i8 = i9;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwq(zzdd zzddVar) {
        this.zzb = new SparseArray();
        this.zzc = zzddVar;
        this.zza = -1;
    }
}
