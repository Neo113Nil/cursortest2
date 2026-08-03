package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzag {
    public final android.net.Uri zza;
    public final java.lang.String zzb;
    public final com.google.android.gms.internal.ads.zzad zzc;
    public final com.google.android.gms.internal.ads.zzy zzd;
    public final java.util.List zze;
    public final java.lang.String zzf;
    public final com.google.android.gms.internal.ads.zzgwm zzg;
    public final java.lang.Object zzh;
    public final long zzi;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
    }

    /* synthetic */ zzag(android.net.Uri uri, java.lang.String str, com.google.android.gms.internal.ads.zzad zzadVar, com.google.android.gms.internal.ads.zzy zzyVar, java.util.List list, java.lang.String str2, com.google.android.gms.internal.ads.zzgwm zzgwmVar, java.lang.Object obj, long j, byte[] bArr) {
        this.zza = uri;
        int i = com.google.android.gms.internal.ads.zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgwmVar;
        int i2 = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        if (zzgwmVar.size() > 0) {
            throw null;
        }
        zzgwjVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzag)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzag zzagVar = (com.google.android.gms.internal.ads.zzag) obj;
        if (this.zza.equals(zzagVar.zza)) {
            java.lang.String str = zzagVar.zzb;
            com.google.android.gms.internal.ads.zzad zzadVar = zzagVar.zzc;
            com.google.android.gms.internal.ads.zzy zzyVar = zzagVar.zzd;
            if (this.zze.equals(zzagVar.zze)) {
                java.lang.String str2 = zzagVar.zzf;
                if (this.zzg.equals(zzagVar.zzg)) {
                    java.lang.Object obj2 = zzagVar.zzh;
                    long j = zzagVar.zzi;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
