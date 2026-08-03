package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzad implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzae zza;
    private int zzb;

    zzad(com.google.android.gms.internal.measurement.zzae zzaeVar) {
        java.util.Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        com.google.android.gms.internal.measurement.zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzh()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zzaeVar.zzl(i);
        }
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new java.util.NoSuchElementException(sb.toString());
    }
}
