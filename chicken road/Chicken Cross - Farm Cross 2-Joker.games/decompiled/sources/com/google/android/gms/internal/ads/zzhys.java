package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhys extends zzhym {
    private final zzhyp zza;
    private final zzhyq zzb;
    private final zzhyr zzc;

    private zzhys(zzhyp zzhypVar, int i, zzhyq zzhyqVar, zzhyr zzhyrVar) {
        this.zza = zzhypVar;
        this.zzb = zzhyqVar;
        this.zzc = zzhyrVar;
    }

    public static zzhys zzb(zzhyr zzhyrVar) {
        return new zzhys(zzhyp.zza, 64, zzhyq.zza, zzhyrVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhys)) {
            return false;
        }
        zzhys zzhysVar = (zzhys) obj;
        return zzhysVar.zza == this.zza && zzhysVar.zzb == this.zzb && zzhysVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhys.class, this.zza, 64, this.zzb, this.zzc);
    }

    public final String toString() {
        String zzhypVar = this.zza.toString();
        int length = zzhypVar.length();
        String obj = this.zzb.toString();
        int length2 = obj.length();
        String obj2 = this.zzc.toString();
        StringBuilder sb = new StringBuilder(length + 12 + length2 + 20 + obj2.length());
        sb.append("SLH-DSA-");
        sb.append(zzhypVar);
        sb.append("-128");
        sb.append(obj);
        sb.append(" instance, variant: ");
        sb.append(obj2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhyr.zzb;
    }
}
