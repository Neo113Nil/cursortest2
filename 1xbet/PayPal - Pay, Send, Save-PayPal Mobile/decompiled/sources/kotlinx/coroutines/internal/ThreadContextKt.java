package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012\"&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "threadContextElements", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/ThreadContextElement;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/internal/ThreadState;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreadContextKt {
    public static final kotlinx.coroutines.internal.Symbol NO_THREAD_ELEMENTS = new kotlinx.coroutines.internal.Symbol("NO_THREAD_ELEMENTS");
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return kotlinx.coroutines.internal.ThreadContextKt.m24130$r8$lambda$JV_KVVI_n23GsB5XC6MwwiLObk(obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return kotlinx.coroutines.internal.ThreadContextKt.$r8$lambda$BWRz50x54qs2OVxeNX6EXirG04g((kotlinx.coroutines.ThreadContextElement) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return kotlinx.coroutines.internal.ThreadContextKt.m24131$r8$lambda$LvERHGTiz1zuawbtmH23u2Uqo8((kotlinx.coroutines.internal.ThreadState) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
        }
    };

    public static final java.lang.Object threadContextElements(kotlin.coroutines.CoroutineContext coroutineContext) {
        java.lang.Object fold = coroutineContext.fold(0, getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final java.lang.Object updateThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof java.lang.Integer) {
            return coroutineContext.fold(new kotlinx.coroutines.internal.ThreadState(coroutineContext, ((java.lang.Number) obj).intValue()), getHighSpeedVideoFpsRanges);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((kotlinx.coroutines.ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }

    public static final void restoreThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof kotlinx.coroutines.internal.ThreadState) {
            kotlinx.coroutines.internal.ThreadState threadState = (kotlinx.coroutines.internal.ThreadState) obj;
            int length = threadState.Camera2StreamConfigurationMap.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                kotlinx.coroutines.ThreadContextElement<java.lang.Object> threadContextElement = threadState.Camera2StreamConfigurationMap[length];
                kotlin.jvm.internal.Intrinsics.checkNotNull(threadContextElement);
                threadContextElement.restoreThreadContext(coroutineContext, threadState.getHighSpeedVideoSizes[length]);
                if (i < 0) {
                    return;
                } else {
                    length = i;
                }
            }
        } else {
            java.lang.Object fold = coroutineContext.fold(null, getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.checkNotNull(fold, "");
            ((kotlinx.coroutines.ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
        }
    }

    public static /* synthetic */ kotlinx.coroutines.ThreadContextElement $r8$lambda$BWRz50x54qs2OVxeNX6EXirG04g(kotlinx.coroutines.ThreadContextElement threadContextElement, kotlin.coroutines.CoroutineContext.Element element) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (element instanceof kotlinx.coroutines.ThreadContextElement) {
            return (kotlinx.coroutines.ThreadContextElement) element;
        }
        return null;
    }

    /* renamed from: $r8$lambda$JV-_KVVI_n23GsB5XC6MwwiLObk, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m24130$r8$lambda$JV_KVVI_n23GsB5XC6MwwiLObk(java.lang.Object obj, kotlin.coroutines.CoroutineContext.Element element) {
        if (!(element instanceof kotlinx.coroutines.ThreadContextElement)) {
            return obj;
        }
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : java.lang.Integer.valueOf(intValue + 1);
    }

    /* renamed from: $r8$lambda$LvERHGT-iz1zuawbtmH23u2Uqo8, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.internal.ThreadState m24131$r8$lambda$LvERHGTiz1zuawbtmH23u2Uqo8(kotlinx.coroutines.internal.ThreadState threadState, kotlin.coroutines.CoroutineContext.Element element) {
        if (element instanceof kotlinx.coroutines.ThreadContextElement) {
            kotlinx.coroutines.ThreadContextElement<java.lang.Object> threadContextElement = (kotlinx.coroutines.ThreadContextElement) element;
            java.lang.Object updateThreadContext = threadContextElement.updateThreadContext(threadState.getHighSpeedVideoFpsRangesFor);
            java.lang.Object[] objArr = threadState.getHighSpeedVideoSizes;
            int i = threadState.getHighSpeedVideoFpsRanges;
            objArr[i] = updateThreadContext;
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] threadContextElementArr = threadState.Camera2StreamConfigurationMap;
            threadState.getHighSpeedVideoFpsRanges = i + 1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(threadContextElement, "");
            threadContextElementArr[i] = threadContextElement;
        }
        return threadState;
    }
}
