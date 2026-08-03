package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdk implements com.google.android.gms.internal.ads.zzhed {
    private final java.io.InputStream zza;

    private zzhdk(java.io.InputStream inputStream) {
        this.zza = inputStream;
    }

    public static com.google.android.gms.internal.ads.zzhed zza(byte[] bArr) {
        return new com.google.android.gms.internal.ads.zzhdk(new java.io.ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final com.google.android.gms.internal.ads.zzhsz zzb() throws java.io.IOException {
        try {
            return com.google.android.gms.internal.ads.zzhsz.zzg(this.zza, com.google.android.gms.internal.ads.zzido.zza());
        } finally {
            this.zza.close();
        }
    }
}
