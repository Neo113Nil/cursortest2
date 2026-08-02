package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfq {
    public final byte[] zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public final boolean zze;
    public com.google.android.libraries.places.internal.zzcfq zzf;
    public com.google.android.libraries.places.internal.zzcfq zzg;

    public final com.google.android.libraries.places.internal.zzcfq zza() {
        this.zzd = true;
        return new com.google.android.libraries.places.internal.zzcfq(this.zza, this.zzb, this.zzc, true, false);
    }

    public final com.google.android.libraries.places.internal.zzcfq zzb() {
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar == this) {
            zzcfqVar = null;
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = this.zzg;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
        zzcfqVar2.zzf = this.zzf;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = this.zzf;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar3);
        zzcfqVar3.zzg = this.zzg;
        this.zzf = null;
        this.zzg = null;
        return zzcfqVar;
    }

    public final com.google.android.libraries.places.internal.zzcfq zzc(com.google.android.libraries.places.internal.zzcfq zzcfqVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfqVar, "");
        zzcfqVar.zzg = this;
        zzcfqVar.zzf = this.zzf;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = this.zzf;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
        zzcfqVar2.zzg = zzcfqVar;
        this.zzf = zzcfqVar;
        return zzcfqVar;
    }

    public final void zze(com.google.android.libraries.places.internal.zzcfq zzcfqVar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfqVar, "");
        if (!zzcfqVar.zze) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i2 = zzcfqVar.zzc;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zzcfqVar.zzd) {
                throw new java.lang.IllegalArgumentException();
            }
            int i4 = zzcfqVar.zzb;
            if (i3 - i4 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = zzcfqVar.zza;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (java.lang.Object) null);
            i2 = zzcfqVar.zzc - zzcfqVar.zzb;
            zzcfqVar.zzc = i2;
            zzcfqVar.zzb = 0;
        }
        byte[] bArr2 = this.zza;
        byte[] bArr3 = zzcfqVar.zza;
        int i5 = this.zzb;
        kotlin.collections.ArraysKt.copyInto(bArr2, bArr3, i2, i5, i5 + i);
        zzcfqVar.zzc += i;
        this.zzb += i;
    }

    public final com.google.android.libraries.places.internal.zzcfq zzd(int i) {
        com.google.android.libraries.places.internal.zzcfq zza;
        if (i > this.zzc - this.zzb) {
            throw new java.lang.IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            zza = zza();
        } else {
            byte[] bArr = this.zza;
            zza = com.google.android.libraries.places.internal.zzcfr.zza();
            byte[] bArr2 = zza.zza;
            int i2 = this.zzb;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (java.lang.Object) null);
        }
        zza.zzc = zza.zzb + i;
        this.zzb += i;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zzg;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        zzcfqVar.zzc(zza);
        return zza;
    }

    public zzcfq(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = false;
    }

    public zzcfq() {
        this.zza = new byte[8192];
        this.zze = true;
        this.zzd = false;
    }
}
