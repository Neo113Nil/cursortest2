package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzamm implements com.google.android.gms.internal.ads.zzahf {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzhaf zzb;

    public zzamm(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? com.google.android.gms.internal.ads.zzhaf.zzf(iArr) : com.google.android.gms.internal.ads.zzhaf.zza();
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzhaf zzhafVar = this.zzb;
        java.util.ArrayList arrayList = new java.util.ArrayList(zzhafVar.zzh());
        for (int i = 0; i < zzhafVar.zzh(); i++) {
            arrayList.add(com.google.android.gms.internal.ads.zzfl.zzz(zzhafVar.zzi(i)));
        }
        java.lang.String zzz = com.google.android.gms.internal.ads.zzfl.zzz(this.zza);
        java.lang.String obj = arrayList.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzz.length() + 37 + obj.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(zzz);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
