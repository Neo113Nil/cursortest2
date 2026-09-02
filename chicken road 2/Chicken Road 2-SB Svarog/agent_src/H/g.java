package H;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements P.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f238b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f239c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f237a = flutterJNI;
        this.f238b = i2;
    }

    @Override // P.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f239c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f238b;
        FlutterJNI flutterJNI = this.f237a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
