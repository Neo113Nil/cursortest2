package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalMutatorMutex$Mutator;", "Landroidx/compose/material/Camera2StreamConfigurationMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "Camera2StreamConfigurationMap", "Mutator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalMutatorMutex {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.material.InternalMutatorMutex.Mutator> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex$Mutator;", "", "Landroidx/compose/foundation/MutatePriority;", "p0", "Lkotlinx/coroutines/Job;", "p1", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/Job;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/MutatePriority;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Mutator {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final androidx.compose.foundation.MutatePriority getHighSpeedVideoSizes;

        public Mutator(androidx.compose.foundation.MutatePriority mutatePriority, kotlinx.coroutines.Job job) {
            this.getHighSpeedVideoSizes = mutatePriority;
            this.getHighSpeedVideoFpsRanges = job;
        }
    }

    public static /* synthetic */ java.lang.Object mutate$default(androidx.compose.material.InternalMutatorMutex internalMutatorMutex, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public final <R> java.lang.Object mutate(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.InternalMutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    public static /* synthetic */ java.lang.Object mutateWith$default(androidx.compose.material.InternalMutatorMutex internalMutatorMutex, java.lang.Object obj, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    public final <T, R> java.lang.Object mutateWith(T t, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.InternalMutatorMutex$mutateWith$2(mutatePriority, this, function2, t, null), continuation);
    }

    public final boolean tryMutate(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean tryLock$default = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.Camera2StreamConfigurationMap, null, 1, null);
        if (!tryLock$default) {
            return tryLock$default;
        }
        try {
            block.invoke();
            return tryLock$default;
        } finally {
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.Camera2StreamConfigurationMap, null, 1, null);
        }
    }

    public static final /* synthetic */ void access$tryMutateOrCancel(androidx.compose.material.InternalMutatorMutex internalMutatorMutex, androidx.compose.material.InternalMutatorMutex.Mutator mutator) {
        androidx.compose.material.InternalMutatorMutex.Mutator mutator2;
        do {
            mutator2 = internalMutatorMutex.getHighSpeedVideoFpsRanges.get();
            if (mutator2 != null && mutator.getHighSpeedVideoSizes.compareTo(mutator2.getHighSpeedVideoSizes) < 0) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex.getHighSpeedVideoFpsRanges, mutator2, mutator));
        if (mutator2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(mutator2.getHighSpeedVideoFpsRanges, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
