package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdh implements com.google.android.libraries.places.internal.zzcdl {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcde.class.getName());
    private static final com.google.android.libraries.places.internal.zzcfj zzb = com.google.android.libraries.places.internal.zzcfi.zza("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static /* synthetic */ java.lang.IllegalArgumentException zzc(java.lang.String str, java.lang.Object[] objArr) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    static /* synthetic */ int zze(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw zzi("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s), java.lang.Integer.valueOf(i));
    }

    static /* synthetic */ int zzf(com.google.android.libraries.places.internal.zzcfh zzcfhVar) {
        return (zzcfhVar.zzj() & 255) | ((zzcfhVar.zzj() & 255) << 16) | ((zzcfhVar.zzj() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.io.IOException zzi(java.lang.String str, java.lang.Object... objArr) throws java.io.IOException {
        throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    @Override // com.google.android.libraries.places.internal.zzcdl
    public final com.google.android.libraries.places.internal.zzccx zza(com.google.android.libraries.places.internal.zzcfh zzcfhVar, boolean z) {
        return new com.google.android.libraries.places.internal.zzcdf(zzcfhVar, 4096, true);
    }

    @Override // com.google.android.libraries.places.internal.zzcdl
    public final com.google.android.libraries.places.internal.zzccy zzb(com.google.android.libraries.places.internal.zzcfg zzcfgVar, boolean z) {
        return new com.google.android.libraries.places.internal.zzcdg(zzcfgVar, true);
    }
}
