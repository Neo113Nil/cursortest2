package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MutexesKt$lockAndSuspend$lockFn$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    public static final androidx.camera.camera2.pipe.core.MutexesKt$lockAndSuspend$lockFn$1 getHighSpeedVideoSizes = new androidx.camera.camera2.pipe.core.MutexesKt$lockAndSuspend$lockFn$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.camera.camera2.pipe.core.MutexesKt.access$lockWithoutOwner(mutex, continuation);
    }

    MutexesKt$lockAndSuspend$lockFn$1() {
        super(2, androidx.camera.camera2.pipe.core.MutexesKt.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }
}
