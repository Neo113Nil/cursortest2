package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhza implements com.google.android.gms.internal.ads.zzhek {
    private final com.google.android.gms.internal.ads.zzhnc zza;

    zzhza(com.google.android.gms.internal.ads.zzhnc zzhncVar, com.google.android.gms.internal.ads.zzhmd zzhmdVar) {
        this.zza = zzhncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        for (com.google.android.gms.internal.ads.zzhzb zzhzbVar : this.zza.zza(bArr)) {
            try {
                zzhzbVar.zza.zza(bArr, bArr2);
                int i = zzhzbVar.zzb;
                return;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        throw new java.security.GeneralSecurityException("invalid signature");
    }
}
