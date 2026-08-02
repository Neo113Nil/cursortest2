package zb;

/* loaded from: classes18.dex */
public class a implements common.emv.cardio.CardSession {

    /* renamed from: a, reason: collision with root package name */
    public final common.emv.cardio.CardSession f7088a;
    public final java.util.concurrent.atomic.AtomicLong b;

    @Override // common.emv.cardio.CardSession
    public byte[] send(byte[] bArr) throws java.io.IOException {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] send = this.f7088a.send(bArr);
        this.b.addAndGet(java.lang.System.currentTimeMillis() - currentTimeMillis);
        return send;
    }

    @Override // common.emv.cardio.CardSession
    public void close(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.f7088a.close(j, timeUnit);
    }

    public a(common.emv.cardio.CardSession cardSession, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f7088a = cardSession;
        this.b = atomicLong;
    }
}
