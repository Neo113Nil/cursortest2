package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzial implements com.google.android.gms.internal.ads.zzhqd {
    final com.google.android.gms.internal.ads.zzhqd zza;
    final com.google.android.gms.internal.ads.zzhqd zzb;

    /* synthetic */ zzial(com.google.android.gms.internal.ads.zzhqd zzhqdVar, com.google.android.gms.internal.ads.zzhqd zzhqdVar2, byte[] bArr) {
        this.zza = zzhqdVar;
        this.zzb = zzhqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
