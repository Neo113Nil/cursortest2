package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzxn {
    public static com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzg(java.lang.Iterable iterable, int i, int i2, float f) {
        java.util.Iterator it = iterable.iterator();
        int i3 = 0;
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        while (it.hasNext()) {
            android.graphics.Point point = (android.graphics.Point) it.next();
            i4 = java.lang.Math.min(i4, point.x);
            i5 = java.lang.Math.min(i5, point.y);
            i3 = java.lang.Math.max(i3, point.x);
            i6 = java.lang.Math.max(i6, point.y);
        }
        float f2 = i;
        float f3 = i2;
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxg((i4 + 0.0f) / f2, (i5 + 0.0f) / f3, (i3 + 0.0f) / f2, (i6 + 0.0f) / f3, 0.0f);
    }

    abstract float zza();

    abstract float zzb();

    abstract float zzc();

    abstract float zzd();

    abstract float zze();

    final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }

    final float zzf() {
        if (zzh()) {
            return (zzb() - zzc()) * (zzd() - zze());
        }
        return 0.0f;
    }
}
