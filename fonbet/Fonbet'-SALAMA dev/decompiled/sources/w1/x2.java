package w1;

import java.security.MessageDigest;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class x2 extends MessageDigest {

    /* renamed from: a, reason: collision with root package name */
    public final CRC32 f17928a;

    public x2() {
        super("CRC");
        this.f17928a = new CRC32();
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        long value = this.f17928a.getValue();
        return new byte[]{(byte) (((-16777216) & value) >> 24), (byte) ((16711680 & value) >> 16), (byte) ((65280 & value) >> 8), (byte) (value & 255)};
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        this.f17928a.reset();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b7) {
        this.f17928a.update(b7);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i7, int i8) {
        this.f17928a.update(bArr, i7, i8);
    }
}
