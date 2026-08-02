package kotlinx.coroutines.sync;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MutexImpl$onLock$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.sync.MutexImpl, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.sync.MutexImpl$onLock$1 getHighSpeedVideoFpsRangesFor = new kotlinx.coroutines.sync.MutexImpl$onLock$1();

    public final void getHighSpeedVideoFpsRanges(kotlinx.coroutines.sync.MutexImpl mutexImpl, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        mutexImpl.onLockRegFunction(selectInstance, obj);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.sync.MutexImpl mutexImpl, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        getHighSpeedVideoFpsRanges(mutexImpl, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    MutexImpl$onLock$1() {
        super(3, kotlinx.coroutines.sync.MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
