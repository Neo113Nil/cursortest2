package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcah {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcah.class.getName());
    private static final byte[] zzb = "-bin".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    public static byte[][] zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        int length;
        int i;
        byte[][] zzc = com.google.android.libraries.places.internal.zzbkw.zzc(zzbmgVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzc.length;
            if (i2 >= length) {
                break;
            }
            byte[] bArr = zzc[i2];
            byte[] bArr2 = zzc[i2 + 1];
            if (zzc(bArr, zzb)) {
                i = i3 + 2;
                zzc[i3] = bArr;
                zzc[i3 + 1] = com.google.android.libraries.places.internal.zzbkw.zzb.encode(bArr2).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
            } else {
                for (byte b : bArr2) {
                    if (b < 32 || b > 126) {
                        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII);
                        java.util.logging.Logger logger = zza;
                        java.util.logging.Level level = java.util.logging.Level.WARNING;
                        java.lang.String arrays = java.util.Arrays.toString(bArr2);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 21 + java.lang.String.valueOf(arrays).length() + 34);
                        sb.append("Metadata key=");
                        sb.append(str);
                        sb.append(", value=");
                        sb.append(arrays);
                        sb.append(" contains invalid ASCII characters");
                        logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                        break;
                    }
                }
                i = i3 + 2;
                zzc[i3] = bArr;
                zzc[i3 + 1] = bArr2;
            }
            i3 = i;
            i2 += 2;
        }
        return i3 == length ? zzc : (byte[][]) java.util.Arrays.copyOfRange(zzc, 0, i3);
    }

    public static byte[][] zzb(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = zzb;
            if (zzc(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (zzc(bArr5, bArr4)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] decode = com.google.common.io.BaseEncoding.base64().decode(new java.lang.String(bArr6, i5, i4 - i5, java.nio.charset.StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(decode);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = com.google.common.io.BaseEncoding.base64().decode(new java.lang.String(bArr3, java.nio.charset.StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private zzcah() {
    }
}
