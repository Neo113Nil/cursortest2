package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqb extends com.google.android.gms.internal.ads.zzhqe {
    private final com.google.android.gms.internal.ads.zzhqc zza;
    private final com.google.android.gms.internal.ads.zzibb zzb;

    private zzhqb(com.google.android.gms.internal.ads.zzhqc zzhqcVar, com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zza = zzhqcVar;
        this.zzb = zzibbVar;
    }

    public static com.google.android.gms.internal.ads.zzhqb zzc(com.google.android.gms.internal.ads.zzhqc zzhqcVar, com.google.android.gms.internal.ads.zzibb zzibbVar) throws java.security.GeneralSecurityException {
        if (zzhqcVar.zzc() == zzibbVar.zzd()) {
            return new com.google.android.gms.internal.ads.zzhqb(zzhqcVar, zzibbVar);
        }
        throw new java.security.GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhqe, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return null;
    }

    public final com.google.android.gms.internal.ads.zzibb zzd() {
        return this.zzb;
    }
}
