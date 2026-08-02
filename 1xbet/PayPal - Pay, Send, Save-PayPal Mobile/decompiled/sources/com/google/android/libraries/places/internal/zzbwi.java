package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwi extends java.io.OutputStream {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbwl zza;
    private final java.util.List zzb;
    private com.google.android.libraries.places.internal.zzcam zzc;

    /* synthetic */ zzbwi(com.google.android.libraries.places.internal.zzbwl zzbwlVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbwlVar);
        this.zza = zzbwlVar;
        this.zzb = new java.util.ArrayList();
    }

    final /* synthetic */ int zza() {
        java.util.Iterator it = this.zzb.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.google.android.libraries.places.internal.zzcam) it.next()).zzd();
        }
        return i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        com.google.android.libraries.places.internal.zzcam zzcamVar = this.zzc;
        byte b = (byte) i;
        if (zzcamVar == null || zzcamVar.zzc() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            zzcamVar.zzb(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.zzc == null) {
            com.google.android.libraries.places.internal.zzbwl zzbwlVar = this.zza;
            com.google.android.libraries.places.internal.zzcam zza = zzbwlVar.zzh().zza(java.lang.Math.max(4096, i2));
            this.zzc = zza;
            this.zzb.add(zza);
        }
        while (i2 > 0) {
            int min = java.lang.Math.min(i2, this.zzc.zzc());
            if (min == 0) {
                int zzd = this.zzc.zzd();
                com.google.android.libraries.places.internal.zzcam zza2 = this.zza.zzh().zza(java.lang.Math.max(i2, zzd + zzd));
                this.zzc = zza2;
                this.zzb.add(zza2);
            } else {
                this.zzc.zza(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    final /* synthetic */ java.util.List zzb() {
        return this.zzb;
    }
}
