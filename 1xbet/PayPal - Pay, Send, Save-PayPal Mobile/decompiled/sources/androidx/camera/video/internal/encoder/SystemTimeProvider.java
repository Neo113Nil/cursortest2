package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public class SystemTimeProvider implements androidx.camera.video.internal.encoder.TimeProvider {
    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long uptimeUs() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(java.lang.System.nanoTime());
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long realtimeUs() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(android.os.SystemClock.elapsedRealtimeNanos());
    }
}
