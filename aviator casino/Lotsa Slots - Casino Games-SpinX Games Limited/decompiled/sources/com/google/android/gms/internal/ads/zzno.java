package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzno {
    private final com.google.android.gms.internal.ads.zzs zza;
    private final android.util.SparseArray zzb;

    public zzno(com.google.android.gms.internal.ads.zzs zzsVar, android.util.SparseArray sparseArray) {
        this.zza = zzsVar;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(zzsVar.zzb());
        for (int i = 0; i < zzsVar.zzb(); i++) {
            int zzc = zzsVar.zzc(i);
            com.google.android.gms.internal.ads.zznn zznnVar = (com.google.android.gms.internal.ads.zznn) sparseArray.get(zzc);
            zznnVar.getClass();
            sparseArray2.append(zzc, zznnVar);
        }
        this.zzb = sparseArray2;
    }

    public final com.google.android.gms.internal.ads.zznn zza(int i) {
        com.google.android.gms.internal.ads.zznn zznnVar = (com.google.android.gms.internal.ads.zznn) this.zzb.get(i);
        zznnVar.getClass();
        return zznnVar;
    }

    public final boolean zzb(int i) {
        return this.zza.zza(i);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i) {
        return this.zza.zzc(i);
    }
}
