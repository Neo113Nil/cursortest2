package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnt {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    public zzhnt() {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
        this.zzc = new java.util.HashMap();
        this.zzd = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.ads.zzhnt zza(com.google.android.gms.internal.ads.zzhlu zzhluVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnv zzhnvVar = new com.google.android.gms.internal.ads.zzhnv(zzhluVar.zzb(), zzhluVar.zzc(), null);
        java.util.Map map = this.zza;
        if (map.containsKey(zzhnvVar)) {
            com.google.android.gms.internal.ads.zzhlu zzhluVar2 = (com.google.android.gms.internal.ads.zzhlu) map.get(zzhnvVar);
            if (!zzhluVar2.equals(zzhluVar) || !zzhluVar.equals(zzhluVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhnvVar.toString()));
            }
        } else {
            map.put(zzhnvVar, zzhluVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhnt zzb(com.google.android.gms.internal.ads.zzhlr zzhlrVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnu zzhnuVar = new com.google.android.gms.internal.ads.zzhnu(zzhlrVar.zzc(), zzhlrVar.zzb(), null);
        java.util.Map map = this.zzb;
        if (map.containsKey(zzhnuVar)) {
            com.google.android.gms.internal.ads.zzhlr zzhlrVar2 = (com.google.android.gms.internal.ads.zzhlr) map.get(zzhnuVar);
            if (!zzhlrVar2.equals(zzhlrVar) || !zzhlrVar.equals(zzhlrVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhnuVar.toString()));
            }
        } else {
            map.put(zzhnuVar, zzhlrVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhnt zzc(com.google.android.gms.internal.ads.zzhmy zzhmyVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnv zzhnvVar = new com.google.android.gms.internal.ads.zzhnv(zzhmyVar.zzb(), zzhmyVar.zzc(), null);
        java.util.Map map = this.zzc;
        if (map.containsKey(zzhnvVar)) {
            com.google.android.gms.internal.ads.zzhmy zzhmyVar2 = (com.google.android.gms.internal.ads.zzhmy) map.get(zzhnvVar);
            if (!zzhmyVar2.equals(zzhmyVar) || !zzhmyVar.equals(zzhmyVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhnvVar.toString()));
            }
        } else {
            map.put(zzhnvVar, zzhmyVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhnt zzd(com.google.android.gms.internal.ads.zzhmv zzhmvVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnu zzhnuVar = new com.google.android.gms.internal.ads.zzhnu(zzhmvVar.zzc(), zzhmvVar.zzb(), null);
        java.util.Map map = this.zzd;
        if (map.containsKey(zzhnuVar)) {
            com.google.android.gms.internal.ads.zzhmv zzhmvVar2 = (com.google.android.gms.internal.ads.zzhmv) map.get(zzhnuVar);
            if (!zzhmvVar2.equals(zzhmvVar) || !zzhmvVar.equals(zzhmvVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhnuVar.toString()));
            }
        } else {
            map.put(zzhnuVar, zzhmvVar);
        }
        return this;
    }

    final /* synthetic */ java.util.Map zze() {
        return this.zza;
    }

    final /* synthetic */ java.util.Map zzf() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zzg() {
        return this.zzc;
    }

    final /* synthetic */ java.util.Map zzh() {
        return this.zzd;
    }

    public zzhnt(com.google.android.gms.internal.ads.zzhnw zzhnwVar) {
        this.zza = new java.util.HashMap(zzhnwVar.zzg());
        this.zzb = new java.util.HashMap(zzhnwVar.zzh());
        this.zzc = new java.util.HashMap(zzhnwVar.zzi());
        this.zzd = new java.util.HashMap(zzhnwVar.zzj());
    }
}
