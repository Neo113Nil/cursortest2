package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/animation/core/MutatorMutex$Mutator;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/getHighSpeedVideoFpsRanges;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "Mutator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.animation.core.MutatorMutex.Mutator> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "Landroidx/compose/animation/core/MutatePriority;", "p0", "Lkotlinx/coroutines/Job;", "p1", "<init>", "(Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/Job;)V", "", "getHighSpeedVideoSizes", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)Z", "", "getHighSpeedVideoFpsRangesFor", "()V", "Landroidx/compose/animation/core/MutatePriority;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Mutator {
        private final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.animation.core.MutatePriority Camera2StreamConfigurationMap;

        public Mutator(androidx.compose.animation.core.MutatePriority mutatePriority, kotlinx.coroutines.Job job) {
            this.Camera2StreamConfigurationMap = mutatePriority;
            this.getHighSpeedVideoFpsRanges = job;
        }

        public final boolean getHighSpeedVideoSizes(androidx.compose.animation.core.MutatorMutex.Mutator p0) {
            return this.Camera2StreamConfigurationMap.compareTo(p0.Camera2StreamConfigurationMap) >= 0;
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRanges.cancel((java.util.concurrent.CancellationException) new androidx.compose.animation.core.MutationInterruptedException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(androidx.compose.animation.core.MutatorMutex.Mutator p0) {
        androidx.compose.animation.core.MutatorMutex.Mutator mutator;
        do {
            mutator = this.Camera2StreamConfigurationMap.get();
            if (mutator != null && !p0.getHighSpeedVideoSizes(mutator)) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, mutator, p0));
        if (mutator != null) {
            mutator.getHighSpeedVideoFpsRangesFor();
        }
    }

    public static /* synthetic */ java.lang.Object mutate$default(androidx.compose.animation.core.MutatorMutex mutatorMutex, androidx.compose.animation.core.MutatePriority mutatePriority, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.animation.core.MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public final <R> java.lang.Object mutate(androidx.compose.animation.core.MutatePriority mutatePriority, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    public static /* synthetic */ java.lang.Object mutateWith$default(androidx.compose.animation.core.MutatorMutex mutatorMutex, java.lang.Object obj, androidx.compose.animation.core.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.animation.core.MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    public final <T, R> java.lang.Object mutateWith(T t, androidx.compose.animation.core.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.MutatorMutex$mutateWith$2(mutatePriority, this, function2, t, null), continuation);
    }
}
