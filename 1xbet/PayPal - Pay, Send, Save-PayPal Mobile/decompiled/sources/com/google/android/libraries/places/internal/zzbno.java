package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbno implements com.google.android.libraries.places.internal.zzbmf {
    private static final byte[] zza = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean zzc(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    @Override // com.google.android.libraries.places.internal.zzbmf
    public final /* synthetic */ byte[] zza(java.lang.Object obj) {
        byte[] bytes = ((java.lang.String) obj).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (zzc(bytes[i])) {
                byte[] bArr = new byte[((length - i) * 3) + i];
                if (i != 0) {
                    java.lang.System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    int i3 = i2 + 1;
                    byte b = bytes[i];
                    if (zzc(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = zza;
                        bArr[i3] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & com.google.common.base.Ascii.SI];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2 = i3;
                    }
                    i++;
                }
                return java.util.Arrays.copyOf(bArr, i2);
            }
            i++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmf
    public final /* synthetic */ java.lang.Object zzb(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new java.lang.String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                break;
            }
            i++;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 >= length2) {
                return new java.lang.String(allocate.array(), 0, allocate.position(), java.nio.charset.StandardCharsets.UTF_8);
            }
            int i3 = i2 + 1;
            if (bArr[i2] == 37 && i2 + 2 < length2) {
                try {
                    allocate.put((byte) java.lang.Integer.parseInt(new java.lang.String(bArr, i3, 2, java.nio.charset.StandardCharsets.US_ASCII), 16));
                    i2 += 3;
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            allocate.put(bArr[i2]);
            i2 = i3;
        }
    }

    /* synthetic */ zzbno(byte[] bArr) {
    }

    private zzbno() {
        throw null;
    }
}
