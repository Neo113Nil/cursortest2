package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzak {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzag zzb;
    public final com.google.android.gms.internal.ads.zzaf zzc;
    public final com.google.android.gms.internal.ads.zzan zzd;
    public final com.google.android.gms.internal.ads.zzab zze;
    public final com.google.android.gms.internal.ads.zzai zzf;

    static {
        new com.google.android.gms.internal.ads.zzz().zzc();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ zzak(java.lang.String str, com.google.android.gms.internal.ads.zzac zzacVar, com.google.android.gms.internal.ads.zzag zzagVar, com.google.android.gms.internal.ads.zzaf zzafVar, com.google.android.gms.internal.ads.zzan zzanVar, com.google.android.gms.internal.ads.zzai zzaiVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzagVar;
        this.zzc = zzafVar;
        this.zzd = zzanVar;
        this.zze = zzacVar;
        this.zzf = zzaiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzak)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzak zzakVar = (com.google.android.gms.internal.ads.zzak) obj;
        return java.util.Objects.equals(this.zza, zzakVar.zza) && this.zze.equals(zzakVar.zze) && java.util.Objects.equals(this.zzb, zzakVar.zzb) && java.util.Objects.equals(this.zzc, zzakVar.zzc) && java.util.Objects.equals(this.zzd, zzakVar.zzd) && java.util.Objects.equals(this.zzf, zzakVar.zzf);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        com.google.android.gms.internal.ads.zzag zzagVar = this.zzb;
        return (((((((hashCode + (zzagVar != null ? zzagVar.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzd.hashCode()) * 31;
    }
}
