package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhvo extends com.google.android.gms.internal.ads.zzhxi {
    private final com.google.android.gms.internal.ads.zzhvm zza;
    private final com.google.android.gms.internal.ads.zzhvn zzb;

    private zzhvo(com.google.android.gms.internal.ads.zzhvm zzhvmVar, com.google.android.gms.internal.ads.zzhvn zzhvnVar) {
        this.zza = zzhvmVar;
        this.zzb = zzhvnVar;
    }

    public static com.google.android.gms.internal.ads.zzhvo zzb(com.google.android.gms.internal.ads.zzhvm zzhvmVar, com.google.android.gms.internal.ads.zzhvn zzhvnVar) {
        return new com.google.android.gms.internal.ads.zzhvo(zzhvmVar, zzhvnVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhvo)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhvo zzhvoVar = (com.google.android.gms.internal.ads.zzhvo) obj;
        return zzhvoVar.zza == this.zza && zzhvoVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhvo.class, this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + obj2.length() + 1);
        sb.append("ML-DSA Parameters (ML-DSA instance: ");
        sb.append(obj);
        sb.append(", variant: ");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzhvn.zzb;
    }
}
