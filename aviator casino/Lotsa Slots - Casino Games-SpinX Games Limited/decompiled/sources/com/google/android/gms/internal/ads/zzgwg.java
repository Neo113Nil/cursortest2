package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgwg extends com.google.android.gms.internal.ads.zzgwh {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzgwg(int i) {
        com.google.android.gms.internal.ads.zzgvi.zzb(i, "initialCapacity");
        this.zza = new java.lang.Object[i];
        this.zzb = 0;
    }

    private final void zzf(int i) {
        int length = this.zza.length;
        int zze = zze(length, this.zzb + i);
        if (zze > length || this.zzc) {
            this.zza = java.util.Arrays.copyOf(this.zza, zze);
            this.zzc = false;
        }
    }

    final void zzb(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzgyf.zza(objArr, 2);
        zzf(2);
        java.lang.System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final com.google.android.gms.internal.ads.zzgwh zzc(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            zzf(collection.size());
            if (collection instanceof com.google.android.gms.internal.ads.zzgwi) {
                this.zzb = ((com.google.android.gms.internal.ads.zzgwi) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwh
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgwh zzd(java.lang.Object obj) {
        throw null;
    }

    public final com.google.android.gms.internal.ads.zzgwg zza(java.lang.Object obj) {
        obj.getClass();
        zzf(1);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
