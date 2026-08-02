package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzti extends com.google.android.libraries.places.internal.zzut {
    private java.lang.Object[] zza = new java.lang.Object[8];
    private int zzb = 0;

    private final int zzh(com.google.android.libraries.places.internal.zztv zztvVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i + i].equals(zztvVar)) {
                return i;
            }
        }
        return -1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata{");
        for (int i = 0; i < this.zzb; i++) {
            sb.append(" '");
            sb.append(zzb(i));
            sb.append("': ");
            sb.append(zzc(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzut
    public final com.google.android.libraries.places.internal.zztv zzb(int i) {
        if (i < this.zzb) {
            return (com.google.android.libraries.places.internal.zztv) this.zza[i + i];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // com.google.android.libraries.places.internal.zzut
    public final java.lang.Object zzc(int i) {
        if (i < this.zzb) {
            return this.zza[i + i + 1];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // com.google.android.libraries.places.internal.zzut
    public final java.lang.Object zzd(com.google.android.libraries.places.internal.zztv zztvVar) {
        int zzh = zzh(zztvVar);
        if (zzh != -1) {
            return zztvVar.zze(this.zza[zzh + zzh + 1]);
        }
        return null;
    }

    final void zze(com.google.android.libraries.places.internal.zztv zztvVar, java.lang.Object obj) {
        int zzh;
        if (!zztvVar.zzf() && (zzh = zzh(zztvVar)) != -1) {
            java.lang.Object[] objArr = this.zza;
            com.google.android.libraries.places.internal.zzxb.zza(obj, "metadata value");
            objArr[zzh + zzh + 1] = obj;
            return;
        }
        int i = this.zzb + 1;
        java.lang.Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (i + i > length) {
            this.zza = java.util.Arrays.copyOf(objArr2, length + length);
        }
        java.lang.Object[] objArr3 = this.zza;
        int i2 = this.zzb;
        com.google.android.libraries.places.internal.zzxb.zza(zztvVar, "metadata key");
        objArr3[i2 + i2] = zztvVar;
        java.lang.Object[] objArr4 = this.zza;
        int i3 = this.zzb;
        com.google.android.libraries.places.internal.zzxb.zza(obj, "metadata value");
        objArr4[i3 + i3 + 1] = obj;
        this.zzb++;
    }

    final void zzf(com.google.android.libraries.places.internal.zztv zztvVar) {
        int i;
        int zzh = zzh(zztvVar);
        if (zzh >= 0) {
            int i2 = zzh + zzh;
            int i3 = i2 + 2;
            while (true) {
                i = this.zzb;
                if (i3 >= i + i) {
                    break;
                }
                java.lang.Object obj = this.zza[i3];
                if (!obj.equals(zztvVar)) {
                    java.lang.Object[] objArr = this.zza;
                    objArr[i2] = obj;
                    objArr[i2 + 1] = objArr[i3 + 1];
                    i2 += 2;
                }
                i3 += 2;
            }
            this.zzb = i - ((i3 - i2) >> 1);
            while (i2 < i3) {
                this.zza[i2] = null;
                i2++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzut
    public final int zza() {
        return this.zzb;
    }

    zzti() {
    }
}
