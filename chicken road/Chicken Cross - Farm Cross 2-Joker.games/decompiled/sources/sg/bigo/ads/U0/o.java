package sg.bigo.ads.U0;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class o extends q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12578a;

    public o(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        this.f12578a = bArr;
    }

    @Override // sg.bigo.ads.U0.q
    public final int a() {
        return this.f12578a.length + 4;
    }

    @Override // sg.bigo.ads.U0.q
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f12578a.length);
        byteBuffer.put(this.f12578a);
    }
}
