package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7013a;

    public v3(int i) {
        this.f7013a = i;
    }

    public final java.lang.String a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = this.f7013a;
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
        byte b = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = (byte) ((b ^ bArr[i2]) ^ bArr3[i2 & 3]);
            b = bArr[i2];
        }
        return new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
    }
}
