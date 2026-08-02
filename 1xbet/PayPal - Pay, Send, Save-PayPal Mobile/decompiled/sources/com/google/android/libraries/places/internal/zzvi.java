package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvi extends com.google.android.libraries.places.internal.zzvk {
    private final com.google.android.libraries.places.internal.zzut zza;
    private final com.google.android.libraries.places.internal.zzut zzb;
    private final int[] zzc;
    private final int zzd;

    /* synthetic */ zzvi(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zzut zzutVar2, byte[] bArr) {
        super(null);
        this.zza = zzutVar;
        this.zzb = zzutVar2;
        int zza = zzutVar2.zza();
        com.google.android.libraries.places.internal.zzxb.zzb(zza <= 28, "metadata size too large");
        int[] iArr = new int[zza];
        this.zzc = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < zza) {
            com.google.android.libraries.places.internal.zztv zzd = zzd(i);
            long zzi = zzd.zzi() | j;
            if (zzi == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (zzd.equals(zzd(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = zzd.zzf() ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = zzi;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = zzi;
        }
        this.zzd = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zztv zzd(int i) {
        com.google.android.libraries.places.internal.zzut zzutVar = this.zza;
        int zza = zzutVar.zza();
        return i >= zza ? this.zzb.zzb(i - zza) : zzutVar.zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object zze(int i) {
        com.google.android.libraries.places.internal.zzut zzutVar = this.zza;
        int zza = zzutVar.zza();
        return i >= zza ? this.zzb.zzc(i - zza) : zzutVar.zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final void zza(com.google.android.libraries.places.internal.zzva zzvaVar, java.lang.Object obj) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            com.google.android.libraries.places.internal.zztv zzd = zzd(i2 & 31);
            if (zzd.zzf()) {
                zzvaVar.zzb(zzd, new com.google.android.libraries.places.internal.zzvh(this, zzd, i2, null), obj);
            } else {
                zzvaVar.zza(zzd, zzd.zze(zze(i2)), obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final java.util.Set zzc() {
        return new com.google.android.libraries.places.internal.zzvg(this);
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }

    final /* synthetic */ int[] zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final int zzb() {
        return this.zzd;
    }
}
