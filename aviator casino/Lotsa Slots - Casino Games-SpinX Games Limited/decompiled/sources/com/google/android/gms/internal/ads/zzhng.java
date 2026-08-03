package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhng {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zzhng() {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.ads.zzhng zza(com.google.android.gms.internal.ads.zzhnf zzhnfVar) throws java.security.GeneralSecurityException {
        if (zzhnfVar == null) {
            throw new java.lang.NullPointerException("primitive constructor must be non-null");
        }
        com.google.android.gms.internal.ads.zzhnh zzhnhVar = new com.google.android.gms.internal.ads.zzhnh(zzhnfVar.zzb(), zzhnfVar.zzc(), null);
        java.util.Map map = this.zza;
        if (map.containsKey(zzhnhVar)) {
            com.google.android.gms.internal.ads.zzhnf zzhnfVar2 = (com.google.android.gms.internal.ads.zzhnf) map.get(zzhnhVar);
            if (!zzhnfVar2.equals(zzhnfVar) || !zzhnfVar.equals(zzhnfVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhnhVar.toString()));
            }
        } else {
            map.put(zzhnhVar, zzhnfVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhng zzb(com.google.android.gms.internal.ads.zzhnl zzhnlVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zzb;
        java.lang.Class zza = zzhnlVar.zza();
        if (map.containsKey(zza)) {
            com.google.android.gms.internal.ads.zzhnl zzhnlVar2 = (com.google.android.gms.internal.ads.zzhnl) map.get(zza);
            if (!zzhnlVar2.equals(zzhnlVar) || !zzhnlVar.equals(zzhnlVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zza.toString()));
            }
        } else {
            map.put(zza, zzhnlVar);
        }
        return this;
    }

    final /* synthetic */ java.util.Map zzc() {
        return this.zza;
    }

    final /* synthetic */ java.util.Map zzd() {
        return this.zzb;
    }

    /* synthetic */ zzhng(com.google.android.gms.internal.ads.zzhnj zzhnjVar, byte[] bArr) {
        this.zza = new java.util.HashMap(zzhnjVar.zzc());
        this.zzb = new java.util.HashMap(zzhnjVar.zzd());
    }

    /* synthetic */ zzhng(byte[] bArr) {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
    }
}
