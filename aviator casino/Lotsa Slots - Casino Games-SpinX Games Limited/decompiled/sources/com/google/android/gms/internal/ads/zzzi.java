package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzzi {
    private int zza;
    private final android.util.SparseArray zzb;
    private final com.google.android.gms.internal.ads.zzdt zzc;

    public zzzi() {
        this(com.google.android.gms.internal.ads.zzzh.zza);
    }

    public final void zzb(int i, java.lang.Object obj) {
        if (this.zza == -1) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        android.util.SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.google.android.gms.internal.ads.zzgtj.zza(i >= keyAt);
            if (keyAt == i) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final java.lang.Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzd(int i) {
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.zzb;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final void zze() {
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i));
                i++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzzi(com.google.android.gms.internal.ads.zzdt zzdtVar) {
        this.zzb = new android.util.SparseArray();
        this.zzc = zzdtVar;
        this.zza = -1;
    }

    public final java.lang.Object zza(int i) {
        android.util.SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (true) {
            int i3 = this.zza;
            sparseArray = this.zzb;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }
}
