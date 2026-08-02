package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u0003R(\u0010\"\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex$Mutator;", "p0", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "tryLock", "()Z", "unlock", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "Mutator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.foundation.MutatorMutex.Mutator> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "Landroidx/compose/foundation/MutatePriority;", "p0", "Lkotlinx/coroutines/Job;", "p1", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/Job;)V", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)Z", "", "getHighSpeedVideoFpsRanges", "()V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/MutatePriority;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Mutator {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.foundation.MutatePriority getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final kotlinx.coroutines.Job getHighSpeedVideoSizes;

        public Mutator(androidx.compose.foundation.MutatePriority mutatePriority, kotlinx.coroutines.Job job) {
            this.getHighSpeedVideoFpsRanges = mutatePriority;
            this.getHighSpeedVideoSizes = job;
        }

        public final boolean getHighSpeedVideoSizes(androidx.compose.foundation.MutatorMutex.Mutator p0) {
            return this.getHighSpeedVideoFpsRanges.compareTo(p0.getHighSpeedVideoFpsRanges) >= 0;
        }

        public final void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoSizes.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.MutationInterruptedException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(androidx.compose.foundation.MutatorMutex.Mutator p0) {
        androidx.compose.foundation.MutatorMutex.Mutator mutator;
        do {
            mutator = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (mutator != null && !p0.getHighSpeedVideoSizes(mutator)) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, mutator, p0));
        if (mutator != null) {
            mutator.getHighSpeedVideoFpsRanges();
        }
    }

    public static /* synthetic */ java.lang.Object mutate$default(androidx.compose.foundation.MutatorMutex mutatorMutex, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public final <R> java.lang.Object mutate(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    public static /* synthetic */ java.lang.Object mutateWith$default(androidx.compose.foundation.MutatorMutex mutatorMutex, java.lang.Object obj, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    public final <T, R> java.lang.Object mutateWith(T t, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.MutatorMutex$mutateWith$2(mutatePriority, this, function2, t, null), continuation);
    }

    public final boolean tryMutate(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean tryLock = tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            block.invoke();
            return tryLock;
        } finally {
            unlock();
        }
    }

    public final boolean tryLock() {
        return kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }

    public final void unlock() {
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }
}
