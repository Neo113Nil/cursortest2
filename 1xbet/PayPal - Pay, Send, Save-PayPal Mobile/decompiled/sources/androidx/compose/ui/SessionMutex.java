package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B1\b\u0002\u0012&\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\t\u0010\nJS\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2'\u0010\u0012\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR4\u0010 \u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00018\u00008G¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001&\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u0005"}, d2 = {"Landroidx/compose/ui/SessionMutex;", "T", "", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/SessionMutex$Session;", "Landroidx/compose/ui/getHighSpeedVideoFpsRanges;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "constructor-impl", "()Ljava/util/concurrent/atomic/AtomicReference;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "session", "withSessionCancellingPrevious-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withSessionCancellingPrevious", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getCurrentSession-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "Session", "currentSessionHolder"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> Camera2StreamConfigurationMap;

    private static <T> java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> getHighSpeedVideoFpsRangesFor(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        return atomicReference;
    }

    private /* synthetic */ SessionMutex(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.Camera2StreamConfigurationMap = atomicReference;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> m5517constructorimpl() {
        return getHighSpeedVideoFpsRangesFor(new java.util.concurrent.atomic.AtomicReference(null));
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m5520getCurrentSessionimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        androidx.compose.ui.SessionMutex.Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getHighSpeedVideoFpsRanges();
        }
        return null;
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> java.lang.Object m5523withSessionCancellingPreviousimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, ? extends T> function1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, null), continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f"}, d2 = {"Landroidx/compose/ui/SessionMutex$Session;", "T", "", "Lkotlinx/coroutines/Job;", "p0", "p1", "<init>", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "()Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Session<T> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final T getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;

        public Session(kotlinx.coroutines.Job job, T t) {
            this.getHighSpeedVideoFpsRangesFor = job;
            this.getHighSpeedVideoFpsRanges = t;
        }

        public final T getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final kotlinx.coroutines.Job getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m5522toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m5521hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m5518equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5522toStringimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionMutex(currentSessionHolder=");
        sb.append(atomicReference);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5521hashCodeimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5519equalsimpl0(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<java.lang.Object>> atomicReference, java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<java.lang.Object>> atomicReference2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, atomicReference2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5518equalsimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.SessionMutex) && kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, ((androidx.compose.ui.SessionMutex) obj).getCamera2StreamConfigurationMap());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.SessionMutex m5516boximpl(java.util.concurrent.atomic.AtomicReference atomicReference) {
        return new androidx.compose.ui.SessionMutex(atomicReference);
    }
}
