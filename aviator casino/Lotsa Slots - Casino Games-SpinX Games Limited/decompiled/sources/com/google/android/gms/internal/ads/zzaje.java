package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaje extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaje(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaje zzajeVar = (com.google.android.gms.internal.ads.zzaje) obj;
            if (this.zzc == zzajeVar.zzc && java.util.Objects.equals(this.zza, zzajeVar.zza) && java.util.Objects.equals(this.zzb, zzajeVar.zzb) && java.util.Arrays.equals(this.zzd, zzajeVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        java.lang.String str2 = this.zzb;
        return ((((((i + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 11 + length2 + 14 + java.lang.String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzajo, com.google.android.gms.internal.ads.zzao
    public final void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
