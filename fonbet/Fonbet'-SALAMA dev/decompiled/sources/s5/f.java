package s5;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class f implements A5.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16196b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16197c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i7) {
        this.f16195a = flutterJNI;
        this.f16196b = i7;
    }

    @Override // A5.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f16197c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i7 = this.f16196b;
        FlutterJNI flutterJNI = this.f16195a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i7, byteBuffer, byteBuffer.position());
        }
    }
}
