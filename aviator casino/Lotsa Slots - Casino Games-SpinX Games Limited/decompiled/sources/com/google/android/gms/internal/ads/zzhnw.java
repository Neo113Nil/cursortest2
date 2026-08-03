package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnw {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    /* synthetic */ zzhnw(com.google.android.gms.internal.ads.zzhnt zzhntVar, byte[] bArr) {
        this.zza = new java.util.HashMap(zzhntVar.zze());
        this.zzb = new java.util.HashMap(zzhntVar.zzf());
        this.zzc = new java.util.HashMap(zzhntVar.zzg());
        this.zzd = new java.util.HashMap(zzhntVar.zzh());
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzhns zzhnsVar) {
        return this.zzb.containsKey(new com.google.android.gms.internal.ads.zzhnu(zzhnsVar.getClass(), zzhnsVar.zzf(), null));
    }

    public final com.google.android.gms.internal.ads.zzhdq zzb(com.google.android.gms.internal.ads.zzhns zzhnsVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnu zzhnuVar = new com.google.android.gms.internal.ads.zzhnu(zzhnsVar.getClass(), zzhnsVar.zzf(), null);
        java.util.Map map = this.zzb;
        if (map.containsKey(zzhnuVar)) {
            return ((com.google.android.gms.internal.ads.zzhlr) map.get(zzhnuVar)).zza(zzhnsVar, zzhelVar);
        }
        java.lang.String obj = zzhnuVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final com.google.android.gms.internal.ads.zzhns zzc(com.google.android.gms.internal.ads.zzhdq zzhdqVar, java.lang.Class cls, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnv zzhnvVar = new com.google.android.gms.internal.ads.zzhnv(zzhdqVar.getClass(), cls, null);
        java.util.Map map = this.zza;
        if (map.containsKey(zzhnvVar)) {
            return ((com.google.android.gms.internal.ads.zzhlu) map.get(zzhnvVar)).zza(zzhdqVar, zzhelVar);
        }
        java.lang.String obj = zzhnvVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzhns zzhnsVar) {
        return this.zzd.containsKey(new com.google.android.gms.internal.ads.zzhnu(zzhnsVar.getClass(), zzhnsVar.zzf(), null));
    }

    public final com.google.android.gms.internal.ads.zzheh zze(com.google.android.gms.internal.ads.zzhns zzhnsVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnu zzhnuVar = new com.google.android.gms.internal.ads.zzhnu(zzhnsVar.getClass(), zzhnsVar.zzf(), null);
        java.util.Map map = this.zzd;
        if (map.containsKey(zzhnuVar)) {
            return ((com.google.android.gms.internal.ads.zzhmv) map.get(zzhnuVar)).zza(zzhnsVar);
        }
        java.lang.String obj = zzhnuVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final com.google.android.gms.internal.ads.zzhns zzf(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnv zzhnvVar = new com.google.android.gms.internal.ads.zzhnv(zzhehVar.getClass(), cls, null);
        java.util.Map map = this.zzc;
        if (map.containsKey(zzhnvVar)) {
            return ((com.google.android.gms.internal.ads.zzhmy) map.get(zzhnvVar)).zza(zzhehVar);
        }
        java.lang.String obj = zzhnvVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ java.util.Map zzg() {
        return this.zza;
    }

    final /* synthetic */ java.util.Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ java.util.Map zzj() {
        return this.zzd;
    }
}
