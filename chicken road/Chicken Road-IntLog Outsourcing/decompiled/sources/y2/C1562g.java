package y2;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: y2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562g implements H2.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f12363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12364b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12365c = new AtomicBoolean(false);

    public C1562g(FlutterJNI flutterJNI, int i2) {
        this.f12363a = flutterJNI;
        this.f12364b = i2;
    }

    @Override // H2.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f12365c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f12364b;
        FlutterJNI flutterJNI = this.f12363a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
