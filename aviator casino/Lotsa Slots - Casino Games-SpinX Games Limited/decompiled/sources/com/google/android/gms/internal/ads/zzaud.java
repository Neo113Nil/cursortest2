package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaud extends java.io.FilterInputStream {
    private final java.net.HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzaud(java.net.HttpURLConnection httpURLConnection) {
        super(r0);
        java.io.InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (java.io.IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.zza.disconnect();
    }
}
