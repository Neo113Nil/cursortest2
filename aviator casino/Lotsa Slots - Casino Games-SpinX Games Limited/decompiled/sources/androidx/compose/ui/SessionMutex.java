package androidx.compose.ui;

/* compiled from: SessionMutex.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001'B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\u0005\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007`\b¢\u0006\u0004\b\u0003\u0010\tJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J]\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0001\u0010\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001d21\u0010\u001f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020 H\u0086@¢\u0006\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR.\u0010\u0005\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0005\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00070\u0006j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0007`\b¨\u0006("}, d2 = {"Landroidx/compose/ui/SessionMutex;", "T", "", "constructor-impl", "()Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionHolder", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/SessionMutex$Session;", "Landroidx/compose/ui/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "currentSession", "getCurrentSession-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "equals", "", "other", "equals-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)I", "toString", "", "toString-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;", "withSessionCancellingPrevious", "R", "sessionInitializer", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "session", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lkotlin/coroutines/Continuation;", "withSessionCancellingPrevious-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Session", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> currentSessionHolder;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.SessionMutex m1750boximpl(java.util.concurrent.atomic.AtomicReference atomicReference) {
        return new androidx.compose.ui.SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> m1752constructorimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1753equalsimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.SessionMutex) && kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, ((androidx.compose.ui.SessionMutex) obj).getCurrentSessionHolder());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1754equalsimpl0(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, atomicReference2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1756hashCodeimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1757toStringimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m1753equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m1756hashCodeimpl(this.currentSessionHolder);
    }

    public java.lang.String toString() {
        return m1757toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference getCurrentSessionHolder() {
        return this.currentSessionHolder;
    }

    private /* synthetic */ SessionMutex(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> m1751constructorimpl() {
        return m1752constructorimpl(new java.util.concurrent.atomic.AtomicReference(null));
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m1755getCurrentSessionimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference) {
        androidx.compose.ui.SessionMutex.Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> java.lang.Object m1758withSessionCancellingPreviousimpl(java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, ? extends T> function1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionMutex.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/SessionMutex$Session;", "T", "", "job", "Lkotlinx/coroutines/Job;", "value", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Session<T> {
        private final kotlinx.coroutines.Job job;
        private final T value;

        public Session(kotlinx.coroutines.Job job, T t) {
            this.job = job;
            this.value = t;
        }

        public final kotlinx.coroutines.Job getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
