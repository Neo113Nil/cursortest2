package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnj {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzhnj(com.google.android.gms.internal.ads.zzhng zzhngVar, byte[] bArr) {
        this.zza = new java.util.HashMap(zzhngVar.zzc());
        this.zzb = new java.util.HashMap(zzhngVar.zzd());
    }

    private final java.lang.Object zzf(com.google.android.gms.internal.ads.zzhdq zzhdqVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnh zzhnhVar = new com.google.android.gms.internal.ads.zzhnh(zzhdqVar.getClass(), cls, null);
        java.util.Map map = this.zza;
        if (map.containsKey(zzhnhVar)) {
            return ((com.google.android.gms.internal.ads.zzhnf) map.get(zzhnhVar)).zza(zzhdqVar);
        }
        java.lang.String obj = zzhnhVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(obj);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final java.lang.Object zza(com.google.android.gms.internal.ads.zzhdq zzhdqVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return zzf(zzhdqVar, cls);
    }

    public final java.lang.Object zzb(com.google.android.gms.internal.ads.zzhec zzhecVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final com.google.android.gms.internal.ads.zzhnl zzhnlVar = (com.google.android.gms.internal.ads.zzhnl) map.get(cls);
        return zzhnlVar.zzd(zzhecVar, new com.google.android.gms.internal.ads.zzhnk() { // from class: com.google.android.gms.internal.ads.zzhni
            @Override // com.google.android.gms.internal.ads.zzhnk
            public final /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzhdz zzhdzVar) {
                return com.google.android.gms.internal.ads.zzhnj.this.zze(zzhnlVar, zzhdzVar);
            }
        });
    }

    final /* synthetic */ java.util.Map zzc() {
        return this.zza;
    }

    final /* synthetic */ java.util.Map zzd() {
        return this.zzb;
    }

    final /* synthetic */ java.lang.Object zze(com.google.android.gms.internal.ads.zzhnl zzhnlVar, com.google.android.gms.internal.ads.zzhdz zzhdzVar) {
        return zzf(zzhdzVar.zza(), zzhnlVar.zzb());
    }
}
