package p135s5;

import A5.e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16203c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i7) {
        this.f16201a = flutterJNI;
        this.f16202b = i7;
    }

    @Override // A5.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f16203c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i7 = this.f16202b;
        FlutterJNI flutterJNI = this.f16201a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i7, byteBuffer, byteBuffer.position());
        }
    }
}
