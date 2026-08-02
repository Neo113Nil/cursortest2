package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjg implements com.google.android.libraries.places.internal.zzbji {
    @Override // com.google.android.libraries.places.internal.zzbjj
    public final java.io.OutputStream zzb(java.io.OutputStream outputStream) throws java.io.IOException {
        return new java.util.zip.GZIPOutputStream(outputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzbjw
    public final java.io.InputStream zzc(java.io.InputStream inputStream) throws java.io.IOException {
        return new java.util.zip.GZIPInputStream(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzbjj, com.google.android.libraries.places.internal.zzbjw
    public final java.lang.String zza() {
        return com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
    }
}
