package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/core/MutexToken;", "Landroidx/camera/camera2/pipe/core/Token;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "<init>", "(Lkotlinx/coroutines/sync/Mutex;)V", "", "release", "()Z", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicBoolean;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicBoolean;", "getReleased", "released"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutexToken implements androidx.camera.camera2.pipe.core.Token {
    private final kotlinx.atomicfu.AtomicBoolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges;

    public MutexToken(kotlinx.coroutines.sync.Mutex mutex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "");
        this.getHighSpeedVideoFpsRanges = mutex;
        this.Camera2StreamConfigurationMap = kotlinx.atomicfu.AtomicFU.atomic(false);
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public final boolean getReleased() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public final boolean release() {
        if (!this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
            return false;
        }
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
        return true;
    }
}
