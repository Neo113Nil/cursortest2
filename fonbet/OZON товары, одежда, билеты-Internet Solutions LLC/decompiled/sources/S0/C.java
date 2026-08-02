package S0;

import n8.InterfaceC8452b;

/* loaded from: classes.dex */
public final class C implements n8.e {
    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < 16; i11++) {
            byte b11 = (byte) ((bArr[i11] << 1) & 254);
            bArr2[i11] = b11;
            if (i11 < 15) {
                bArr2[i11] = (byte) (((byte) ((bArr[i11 + 1] >> 7) & 1)) | b11);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new V8.b();
    }
}
