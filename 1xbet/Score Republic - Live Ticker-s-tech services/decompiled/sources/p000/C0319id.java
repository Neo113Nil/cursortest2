package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0319id implements InterfaceC0847wo, InterfaceC0627qq, qu0 {

    /* JADX INFO: renamed from: j */
    public final ByteBuffer f3533j;

    public C0319id(ByteBuffer byteBuffer, int i) {
        switch (i) {
            case 1:
                this.f3533j = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f3533j = byteBuffer;
                break;
        }
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: g */
    public short mo612g() throws C0590pq {
        ByteBuffer byteBuffer = this.f3533j;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0590pq();
    }

    @Override // p000.qu0
    /* JADX INFO: renamed from: i */
    public void mo2594i(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f3533j) {
            this.f3533j.position(0);
            messageDigest.update(this.f3533j.putInt(num.intValue()).array());
        }
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: l */
    public int mo616l() {
        return mo612g() | (mo612g() << 8);
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: m */
    public Object mo617m() {
        ByteBuffer byteBuffer = this.f3533j;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.InterfaceC0627qq
    /* JADX INFO: renamed from: o */
    public int mo619o(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f3533j;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // p000.InterfaceC0627qq
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f3533j;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C0319id() {
        this.f3533j = ByteBuffer.allocate(4);
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: d */
    public void mo610d() {
    }
}
