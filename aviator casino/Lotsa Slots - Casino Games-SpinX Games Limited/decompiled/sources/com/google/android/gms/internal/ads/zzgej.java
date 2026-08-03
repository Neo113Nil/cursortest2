package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgej implements com.google.android.gms.internal.ads.zzged {
    private final int zza;
    private final byte[] zzb;

    zzgej(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzged
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzged
    public final java.lang.String zzb() throws java.io.IOException {
        return new java.lang.String(this.zzb);
    }
}
