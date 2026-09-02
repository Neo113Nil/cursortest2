package u0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845g implements D0.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f6714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6715b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6716c = new AtomicBoolean(false);

    public C0845g(FlutterJNI flutterJNI, int i2) {
        this.f6714a = flutterJNI;
        this.f6715b = i2;
    }

    @Override // D0.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f6716c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f6715b;
        FlutterJNI flutterJNI = this.f6714a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
