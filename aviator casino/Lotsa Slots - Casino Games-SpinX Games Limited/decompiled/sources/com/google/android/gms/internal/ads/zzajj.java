package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajj extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final byte[] zzd;

    public zzajj(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajj zzajjVar = (com.google.android.gms.internal.ads.zzajj) obj;
            if (java.util.Objects.equals(this.zza, zzajjVar.zza) && java.util.Objects.equals(this.zzb, zzajjVar.zzb) && java.util.Objects.equals(this.zzc, zzajjVar.zzc) && java.util.Arrays.equals(this.zzd, zzajjVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return (((((((str != null ? str.hashCode() : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + java.util.Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzb;
        int length3 = length + 11 + length2 + 11 + str3.length();
        java.lang.String str4 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length3 + 14 + str4.length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }
}
