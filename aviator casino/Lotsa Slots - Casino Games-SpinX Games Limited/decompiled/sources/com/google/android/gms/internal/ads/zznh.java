package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zznh {
    public static final com.google.android.gms.internal.ads.zznh zza = new com.google.android.gms.internal.ads.zznh(new com.google.android.gms.internal.ads.zzng());
    public final com.google.android.gms.internal.ads.zzgww zzb;
    public final java.lang.Double zzc = null;
    public final java.lang.Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznh(com.google.android.gms.internal.ads.zzng zzngVar) {
        this.zzb = zzngVar.zza();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zznh)) {
            return false;
        }
        com.google.android.gms.internal.ads.zznh zznhVar = (com.google.android.gms.internal.ads.zznh) obj;
        if (!this.zzb.equals(zznhVar.zzb)) {
            return false;
        }
        boolean z = zznhVar.zzf;
        boolean z2 = zznhVar.zzi;
        java.lang.Double d = zznhVar.zzc;
        java.lang.Double d2 = zznhVar.zzd;
        boolean z3 = zznhVar.zze;
        boolean z4 = zznhVar.zzg;
        boolean z5 = zznhVar.zzh;
        return true;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zzb, null, null, true, true, true, true, true);
    }
}
