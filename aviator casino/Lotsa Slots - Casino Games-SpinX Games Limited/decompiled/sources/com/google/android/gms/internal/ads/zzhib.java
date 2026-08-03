package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhib extends com.google.android.gms.internal.ads.zzheu {
    private final com.google.android.gms.internal.ads.zzhia zza;
    private final int zzb;

    private zzhib(com.google.android.gms.internal.ads.zzhia zzhiaVar, int i) {
        this.zza = zzhiaVar;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzhib zzb(com.google.android.gms.internal.ads.zzhia zzhiaVar, int i) throws java.security.GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new com.google.android.gms.internal.ads.zzhib(zzhiaVar, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhib)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhib zzhibVar = (com.google.android.gms.internal.ads.zzhib) obj;
        return zzhibVar.zza == this.zza && zzhibVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhib.class, this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 48 + java.lang.String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(obj);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzhia.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhia zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
