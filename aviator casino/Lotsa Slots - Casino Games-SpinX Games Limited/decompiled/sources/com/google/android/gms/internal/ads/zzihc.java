package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzihc {
    zzihc() {
    }

    protected static final int zzb(java.lang.String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        java.lang.System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    abstract boolean zza(byte[] bArr, int i, int i2);
}
