package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgev implements com.google.android.gms.internal.ads.zzgfa {
    private final byte[] zza;

    public zzgev(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ void zza(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.io.InputStream inputStream) {
        try {
            return com.google.android.gms.internal.ads.zzgzm.zza(inputStream);
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgew("Cannot read bytes.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ java.lang.Object zzc() {
        return this.zza;
    }
}
