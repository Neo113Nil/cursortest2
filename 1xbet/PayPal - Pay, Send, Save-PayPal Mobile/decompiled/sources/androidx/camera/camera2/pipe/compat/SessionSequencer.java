package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/compat/SessionSequencer;", "", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "concurrentSequencer", "<init>", "(Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;)V", "", "awaitSessionLock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/AtomicRef;", "Landroidx/camera/camera2/pipe/compat/SessionSequencer$State;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicRef;", "getHighResolutionOutputSizeshNQ4ISI", "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionSequencer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.compat.SessionSequencer.State> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/compat/SessionSequencer$State;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "CREATING", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        public static final androidx.camera.camera2.pipe.compat.SessionSequencer.State CREATED;
        public static final androidx.camera.camera2.pipe.compat.SessionSequencer.State CREATING;
        public static final androidx.camera.camera2.pipe.compat.SessionSequencer.State PENDING;
        private static final /* synthetic */ androidx.camera.camera2.pipe.compat.SessionSequencer.State[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private State(java.lang.String str, int i) {
        }

        static {
            androidx.camera.camera2.pipe.compat.SessionSequencer.State state = new androidx.camera.camera2.pipe.compat.SessionSequencer.State(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0);
            PENDING = state;
            androidx.camera.camera2.pipe.compat.SessionSequencer.State state2 = new androidx.camera.camera2.pipe.compat.SessionSequencer.State("CREATING", 1);
            CREATING = state2;
            androidx.camera.camera2.pipe.compat.SessionSequencer.State state3 = new androidx.camera.camera2.pipe.compat.SessionSequencer.State(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 2);
            CREATED = state3;
            androidx.camera.camera2.pipe.compat.SessionSequencer.State[] stateArr = {state, state2, state3};
            getHighSpeedVideoFpsRangesFor = stateArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public static androidx.camera.camera2.pipe.compat.SessionSequencer.State[] values() {
            return (androidx.camera.camera2.pipe.compat.SessionSequencer.State[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.camera.camera2.pipe.compat.SessionSequencer.State valueOf(java.lang.String str) {
            return (androidx.camera.camera2.pipe.compat.SessionSequencer.State) java.lang.Enum.valueOf(androidx.camera.camera2.pipe.compat.SessionSequencer.State.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.camera2.pipe.compat.SessionSequencer.State> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    public SessionSequencer(androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer concurrentSessionSequencer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentSessionSequencer, "");
        this.getHighSpeedVideoFpsRangesFor = concurrentSessionSequencer;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(androidx.camera.camera2.pipe.compat.SessionSequencer.State.PENDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitSessionLock(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1 sessionSequencer$awaitSessionLock$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1) {
            sessionSequencer$awaitSessionLock$1 = (androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1) continuation;
            if ((sessionSequencer$awaitSessionLock$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                sessionSequencer$awaitSessionLock$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = sessionSequencer$awaitSessionLock$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionSequencer$awaitSessionLock$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.Mutex sharedMutex = this.getHighSpeedVideoFpsRangesFor.getSharedMutex();
                    sessionSequencer$awaitSessionLock$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(sharedMutex, null, sessionSequencer$awaitSessionLock$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(androidx.camera.camera2.pipe.compat.SessionSequencer.State.PENDING, androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATING)) {
                    kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRangesFor.getSharedMutex(), null, 1, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        sessionSequencer$awaitSessionLock$1 = new androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1(this, continuation);
        java.lang.Object obj2 = sessionSequencer$awaitSessionLock$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionSequencer$awaitSessionLock$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(androidx.camera.camera2.pipe.compat.SessionSequencer.State.PENDING, androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATING)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void release() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATED) == androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATING) {
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRangesFor.getSharedMutex(), null, 1, null);
        }
    }
}
