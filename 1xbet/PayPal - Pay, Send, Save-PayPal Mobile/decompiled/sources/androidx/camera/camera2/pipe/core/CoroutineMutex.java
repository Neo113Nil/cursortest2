package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/core/CoroutineMutex;", "", "<init>", "()V", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex$camera_camera2_pipe", "()Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineMutex {
    private final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getMutex$camera_camera2_pipe, reason: from getter */
    public final kotlinx.coroutines.sync.Mutex getMutex() {
        return this.mutex;
    }
}
