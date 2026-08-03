package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcl {
    public static final com.google.android.gms.internal.ads.zzcl zza = new com.google.android.gms.internal.ads.zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcl(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = com.google.android.gms.internal.ads.zzfl.zzD(i3) ? com.google.android.gms.internal.ads.zzfl.zzG(i3) * i2 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzcl)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcl zzclVar = (com.google.android.gms.internal.ads.zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = java.lang.String.valueOf(i2).length();
        int i3 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 38 + length2 + 11 + java.lang.String.valueOf(i3).length() + 1);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }
}
