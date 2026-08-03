package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakx implements com.google.android.gms.internal.ads.zzahf {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzakx(int i, long j, int i2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
    }

    public final java.lang.String toString() {
        java.lang.String zzz = com.google.android.gms.internal.ads.zzfl.zzz(this.zza);
        int length = zzz.length();
        long j = this.zzb;
        int length2 = java.lang.String.valueOf(j).length();
        int i = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 29 + length2 + 16 + java.lang.String.valueOf(i).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(zzz);
        sb.append(", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
