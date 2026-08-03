package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajs extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final byte[] zzb;

    public zzajs(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajs zzajsVar = (com.google.android.gms.internal.ads.zzajs) obj;
            if (java.util.Objects.equals(this.zza, zzajsVar.zza) && java.util.Arrays.equals(this.zzb, zzajsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 8 + str2.length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }
}
