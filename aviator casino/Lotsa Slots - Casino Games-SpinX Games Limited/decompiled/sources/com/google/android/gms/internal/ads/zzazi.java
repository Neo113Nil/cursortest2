package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzazi {
    public static java.lang.String zza(byte[] bArr, boolean z) {
        return android.util.Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] zzb(java.lang.String str, boolean z) throws java.lang.IllegalArgumentException {
        byte[] decode = android.util.Base64.decode(str, 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new java.lang.IllegalArgumentException("Unable to decode ".concat(str));
    }
}
