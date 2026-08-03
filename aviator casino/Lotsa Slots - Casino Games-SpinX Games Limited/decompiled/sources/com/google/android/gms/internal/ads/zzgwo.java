package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgwo {
    java.lang.Object[] zza;
    int zzb;
    com.google.android.gms.internal.ads.zzgwn zzc;

    public zzgwo() {
        this(4);
    }

    private final void zze(int i) {
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.ads.zzgwh.zze(length, i2));
        }
    }

    private final com.google.android.gms.internal.ads.zzgwp zzf(boolean z) {
        com.google.android.gms.internal.ads.zzgwn zzgwnVar;
        com.google.android.gms.internal.ads.zzgwn zzgwnVar2;
        if (z && (zzgwnVar2 = this.zzc) != null) {
            throw zzgwnVar2.zza();
        }
        com.google.android.gms.internal.ads.zzgym zzk = com.google.android.gms.internal.ads.zzgym.zzk(this.zzb, this.zza, this);
        if (!z || (zzgwnVar = this.zzc) == null) {
            return zzk;
        }
        throw zzgwnVar.zza();
    }

    public final com.google.android.gms.internal.ads.zzgwo zza(java.lang.Object obj, java.lang.Object obj2) {
        zze(this.zzb + 1);
        com.google.android.gms.internal.ads.zzgvi.zza(obj, obj2);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgwo zzb(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            zze(this.zzb + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgwp zzc() {
        return zzf(true);
    }

    public final com.google.android.gms.internal.ads.zzgwp zzd() {
        return zzf(false);
    }

    zzgwo(int i) {
        this.zza = new java.lang.Object[i + i];
        this.zzb = 0;
    }
}
