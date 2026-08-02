package androidx.camera.camera2.pipe.core;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "Landroidx/camera/camera2/pipe/core/TimeSource;", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "now-vQl9yQU", "()J", "now"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemTimeSource implements androidx.camera.camera2.pipe.core.TimeSource {
    @javax.inject.Inject
    public SystemTimeSource() {
    }

    @Override // androidx.camera.camera2.pipe.core.TimeSource
    /* renamed from: now-vQl9yQU, reason: not valid java name */
    public final long mo885nowvQl9yQU() {
        return androidx.camera.camera2.pipe.core.TimestampNs.m888constructorimpl(android.os.SystemClock.elapsedRealtimeNanos());
    }
}
