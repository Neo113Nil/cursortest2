package K1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements T1.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f937b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f938c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i3) {
        this.f936a = flutterJNI;
        this.f937b = i3;
    }

    @Override // T1.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f938c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i3 = this.f937b;
        FlutterJNI flutterJNI = this.f936a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
        }
    }
}
