package R0;

/* loaded from: classes.dex */
public final class g implements a1.e {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f1673c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public g(io.flutter.embedding.engine.FlutterJNI flutterJNI, int i2) {
        this.f1671a = flutterJNI;
        this.f1672b = i2;
    }

    @Override // a1.e
    public final void a(java.nio.ByteBuffer byteBuffer) {
        if (this.f1673c.getAndSet(true)) {
            throw new java.lang.IllegalStateException("Reply already submitted");
        }
        int i2 = this.f1672b;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f1671a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
