package kotlinx.coroutines.debug.internal;

/* compiled from: DebugProbesImpl.kt */
@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001~B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0002J\r\u0010*\u001a\u00020%H\u0000¢\u0006\u0002\b+J\r\u0010,\u001a\u00020%H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\b4J4\u00105\u001a\u00020%*\u0002032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020)072\n\u00108\u001a\u000609j\u0002`:2\u0006\u0010;\u001a\u000201H\u0002J9\u0010A\u001a\b\u0012\u0004\u0012\u0002HC0B\"\b\b\u0000\u0010C*\u00020\u00012\u001e\b\u0004\u0010D\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002HC0EH\u0082\bJ\u0011\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010H¢\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020LJ\f\u0010M\u001a\u000201*\u00020\u0001H\u0002J\f\u0010N\u001a\b\u0012\u0004\u0012\u00020L0BJ\f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0BJ\u0010\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020SH\u0001J\u0010\u0010T\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\fH\u0002J\u0010\u0010U\u001a\u00020%2\u0006\u0010R\u001a\u00020SH\u0002J\u001e\u0010V\u001a\u00020%2\u0006\u0010R\u001a\u00020S2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00050BH\u0002J\"\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050B2\u0006\u0010K\u001a\u00020L2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050BJ.\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050B2\u0006\u0010[\u001a\u0002012\b\u0010\\\u001a\u0004\u0018\u00010\t2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050BH\u0002J=\u0010]\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020_0^2\u0006\u0010`\u001a\u00020_2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050H2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050BH\u0002¢\u0006\u0002\u0010bJ1\u0010c\u001a\u00020_2\u0006\u0010d\u001a\u00020_2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050H2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050BH\u0002¢\u0006\u0002\u0010eJ\u0019\u0010f\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030hH\u0000¢\u0006\u0002\biJ\u0019\u0010j\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030hH\u0000¢\u0006\u0002\bkJ\u001c\u0010l\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030h2\u0006\u0010[\u001a\u000201H\u0002J\u0018\u0010m\u001a\u00020%2\u0006\u0010g\u001a\u00020(2\u0006\u0010[\u001a\u000201H\u0002J\u000f\u0010n\u001a\u0004\u0018\u00010(*\u00020(H\u0082\u0010J(\u0010l\u001a\u00020%2\n\u0010o\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030h2\u0006\u0010[\u001a\u000201H\u0002J\u0016\u0010o\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0006\u0012\u0002\b\u00030hH\u0002J\u0013\u0010o\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u00020(H\u0082\u0010J'\u0010p\u001a\b\u0012\u0004\u0012\u0002Hq0h\"\u0004\b\u0000\u0010q2\f\u0010r\u001a\b\u0012\u0004\u0012\u0002Hq0hH\u0000¢\u0006\u0002\bsJ\u0012\u0010t\u001a\u00020u*\b\u0012\u0004\u0012\u00020\u00050BH\u0002J,\u0010v\u001a\b\u0012\u0004\u0012\u0002Hq0h\"\u0004\b\u0000\u0010q2\f\u0010r\u001a\b\u0012\u0004\u0012\u0002Hq0h2\b\u0010g\u001a\u0004\u0018\u00010uH\u0002J\u0014\u0010w\u001a\u00020%2\n\u0010o\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J%\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00050B\"\b\b\u0000\u0010q*\u00020y2\u0006\u0010z\u001a\u0002HqH\u0002¢\u0006\u0002\u0010{R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\t\u0010\u0012\u001a\u00020\u0013X\u0082\u0004R\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\t\u0010\u0017\u001a\u00020\u0018X\u0082\u0004R\u001a\u0010\u0019\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u000201*\u0002038BX\u0082\u0004¢\u0006\f\u0012\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010|\u001a\u00020\r*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "<init>", "()V", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "dateFormat", "Ljava/text/SimpleDateFormat;", "weakRefCleanerThread", "Ljava/lang/Thread;", "capturedCoroutinesMap", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "", "capturedCoroutines", "", "getCapturedCoroutines", "()Ljava/util/Set;", "installations", "Lkotlinx/atomicfu/AtomicInt;", "isInstalled", "isInstalled$kotlinx_coroutines_debug", "()Z", "sequenceNumber", "Lkotlinx/atomicfu/AtomicLong;", "sanitizeStackTraces", "getSanitizeStackTraces$kotlinx_coroutines_core", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "setEnableCreationStackTraces$kotlinx_coroutines_core", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "dynamicAttach", "Lkotlin/Function1;", "", "getDynamicAttach", "callerInfoCache", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "install", "install$kotlinx_coroutines_core", "uninstall", "uninstall$kotlinx_coroutines_core", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "hierarchyToString", "", "job", "Lkotlinx/coroutines/Job;", "hierarchyToString$kotlinx_coroutines_core", "build", "map", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "indent", "debugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "getDebugString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "dumpCoroutinesInfoImpl", "", "R", "create", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "dumpCoroutinesInfoAsJsonAndReferences", "", "()[Ljava/lang/Object;", "enhanceStackTraceWithThreadDumpAsJson", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "toStringRepr", "dumpCoroutinesInfo", "dumpDebuggerInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpCoroutines", "out", "Ljava/io/PrintStream;", "isFinished", "dumpCoroutinesSynchronized", "printStackTrace", "frames", "enhanceStackTraceWithThreadDump", "coroutineTrace", "enhanceStackTraceWithThreadDumpImpl", "state", "thread", "findContinuationStartIndex", "Lkotlin/Pair;", "", "indexOfResumeWith", "actualTrace", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "findIndexOfFrame", "frameIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "probeCoroutineResumed", "frame", "Lkotlin/coroutines/Continuation;", "probeCoroutineResumed$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineSuspended$kotlinx_coroutines_core", "updateState", "updateRunningState", "realCaller", "owner", "probeCoroutineCreated", "T", "completion", "probeCoroutineCreated$kotlinx_coroutines_core", "toStackTraceFrame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "createOwner", "probeCoroutineCompleted", "sanitizeStackTrace", "", "throwable", "(Ljava/lang/Throwable;)Ljava/util/List;", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugProbesImpl {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME;
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl INSTANCE;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> callerInfoCache;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> capturedCoroutinesMap;
    private static final java.text.SimpleDateFormat dateFormat;
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicInteger installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLong sequenceNumber;
    private static java.lang.Thread weakRefCleanerThread;

    private static /* synthetic */ void getDebugString$annotations(kotlinx.coroutines.Job job) {
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicInteger getInstallations() {
        return installations;
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicLong getSequenceNumber() {
        return sequenceNumber;
    }

    private DebugProbesImpl() {
    }

    static {
        kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = new kotlinx.coroutines.debug.internal.DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new _COROUTINE.ArtificialStackFrames().coroutineCreation();
        dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap<>(false, 1, null);
        installations = new java.util.concurrent.atomic.AtomicInteger(0);
        sequenceNumber = new java.util.concurrent.atomic.AtomicLong(0L);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap<>(true);
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return getInstallations().get() > 0;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        sanitizeStackTraces = z;
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        enableCreationStackTraces = z;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        ignoreCoroutinesWithEmptyContext = z;
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDynamicAttach() {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = this;
            java.lang.Object newInstance = java.lang.Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m10798constructorimpl = kotlin.Result.m10798constructorimpl((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        return (kotlin.jvm.functions.Function1) m10798constructorimpl;
    }

    public final void install$kotlinx_coroutines_core() {
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1;
        if (getInstallations().incrementAndGet() > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(true);
    }

    public final void uninstall$kotlinx_coroutines_core() {
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Agent was not installed".toString());
        }
        if (getInstallations().decrementAndGet() != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(false);
    }

    private final void startWeakRefCleanerThread() {
        java.lang.Thread thread;
        thread = kotlin.concurrent.ThreadsKt.thread((r12 & 1) != 0, (r12 & 2) != 0 ? false : true, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : "Coroutines Debugger Cleaner", (r12 & 16) != 0 ? -1 : 0, new kotlin.jvm.functions.Function0() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit startWeakRefCleanerThread$lambda$2;
                startWeakRefCleanerThread$lambda$2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
                return startWeakRefCleanerThread$lambda$2;
            }
        });
        weakRefCleanerThread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return kotlin.Unit.INSTANCE;
    }

    private final void stopWeakRefCleanerThread() {
        java.lang.Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    public final java.lang.String hierarchyToString$kotlinx_coroutines_core(kotlinx.coroutines.Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : capturedCoroutines) {
            if (((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) obj).delegate.getContext().get(kotlinx.coroutines.Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner> arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner coroutineOwner : arrayList2) {
            linkedHashMap.put(kotlinx.coroutines.JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        return sb.toString();
    }

    private final void build(kotlinx.coroutines.Job job, java.util.Map<kotlinx.coroutines.Job, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> map, java.lang.StringBuilder sb, java.lang.String str) {
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl == null) {
            if (!(job instanceof kotlinx.coroutines.internal.ScopeCoroutine)) {
                sb.append(str + getDebugString(job) + '\n');
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append('\t');
                str = sb2.toString();
            }
        } else {
            java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            sb.append(str + getDebugString(job) + ", continuation is " + debugCoroutineInfoImpl.get_state() + " at line " + stackTraceElement + '\n');
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb, str);
        }
    }

    private final java.lang.String getDebugString(kotlinx.coroutines.Job job) {
        return job instanceof kotlinx.coroutines.JobSupport ? ((kotlinx.coroutines.JobSupport) job).toDebugString() : job.toString();
    }

    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> create) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                boolean isFinished;
                kotlin.coroutines.CoroutineContext context;
                isFinished = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return create.invoke(coroutineOwner, context);
            }
        }));
    }

    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        java.lang.String name;
        java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = dumpCoroutinesInfo.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (kotlinx.coroutines.debug.internal.DebugCoroutineInfo debugCoroutineInfo : dumpCoroutinesInfo) {
            kotlin.coroutines.CoroutineContext context = debugCoroutineInfo.getContext();
            kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
            java.lang.Long l = null;
            java.lang.String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = (kotlinx.coroutines.CoroutineDispatcher) context.get(kotlinx.coroutines.CoroutineDispatcher.INSTANCE);
            java.lang.String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n                {\n                    \"name\": ");
            sb.append(stringRepr);
            sb.append(",\n                    \"id\": ");
            kotlinx.coroutines.CoroutineId coroutineId = (kotlinx.coroutines.CoroutineId) context.get(kotlinx.coroutines.CoroutineId.INSTANCE);
            if (coroutineId != null) {
                l = java.lang.Long.valueOf(coroutineId.getId());
            }
            sb.append(l);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(stringRepr2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(debugCoroutineInfo.getSequenceNumber());
            sb.append(",\n                    \"state\": \"");
            sb.append(debugCoroutineInfo.getState());
            sb.append("\"\n                } \n                ");
            arrayList3.add(kotlin.text.StringsKt.trimIndent(sb.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new java.lang.Object[]{com.ironsource.X3.j.d + kotlin.collections.CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, arrayList.toArray(new java.lang.Thread[0]), arrayList2.toArray(new kotlin.coroutines.jvm.internal.CoroutineStackFrame[0]), dumpCoroutinesInfo.toArray(new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[0])};
    }

    public final java.lang.String enhanceStackTraceWithThreadDumpAsJson(kotlinx.coroutines.debug.internal.DebugCoroutineInfo info) {
        java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : enhanceStackTraceWithThreadDump) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            java.lang.String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? toStringRepr(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(kotlin.text.StringsKt.trimIndent(sb.toString()));
        }
        return com.ironsource.X3.j.d + kotlin.collections.CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }

    private final java.lang.String toStringRepr(java.lang.Object obj) {
        java.lang.String repr;
        repr = kotlinx.coroutines.debug.internal.DebugProbesImplKt.repr(obj.toString());
        return repr;
    }

    public final void dumpCoroutines(java.io.PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
        kotlinx.coroutines.Job job;
        kotlin.coroutines.CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (kotlinx.coroutines.Job) context.get(kotlinx.coroutines.Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final void dumpCoroutinesSynchronized(java.io.PrintStream out) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        out.print("Coroutines dump " + dateFormat.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        for (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner coroutineOwner : kotlin.sequences.SequencesKt.sortedWith(kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean dumpCoroutinesSynchronized$lambda$14;
                dumpCoroutinesSynchronized$lambda$14 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) obj);
                return java.lang.Boolean.valueOf(dumpCoroutinesSynchronized$lambda$14);
            }
        }), new java.util.Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber), java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
            }
        })) {
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            java.util.List<java.lang.StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = INSTANCE;
            java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.get_state(), debugCoroutineInfoImpl.lastObservedThread, lastObservedStackTrace$kotlinx_coroutines_core);
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((kotlin.jvm.internal.Intrinsics.areEqual(debugCoroutineInfoImpl.get_state(), kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && enhanceStackTraceWithThreadDumpImpl == lastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.get_state() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.get_state()));
            if (lastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, enhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final void printStackTrace(java.io.PrintStream out, java.util.List<java.lang.StackTraceElement> frames) {
        java.util.Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((java.lang.StackTraceElement) it.next()));
        }
    }

    public final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump(kotlinx.coroutines.debug.internal.DebugCoroutineInfo info, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    private final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl(java.lang.String state, java.lang.Thread thread, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        java.lang.Object m10798constructorimpl;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = this;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(thread.getStackTrace());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) m10798constructorimpl;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, coroutineTrace);
        int intValue = findContinuationStartIndex.component1().intValue();
        int intValue2 = findContinuationStartIndex.component2().intValue();
        if (intValue == -1) {
            return coroutineTrace;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList((((coroutineTrace.size() + i) - intValue) - 1) - intValue2);
        int i2 = i - intValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = coroutineTrace.size();
        for (int i4 = intValue + 1; i4 < size; i4++) {
            arrayList.add(coroutineTrace.get(i4));
        }
        return arrayList;
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex(int indexOfResumeWith, java.lang.StackTraceElement[] actualTrace, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int findIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i, actualTrace, coroutineTrace);
            if (findIndexOfFrame != -1) {
                return kotlin.TuplesKt.to(java.lang.Integer.valueOf(findIndexOfFrame), java.lang.Integer.valueOf(i));
            }
        }
        return kotlin.TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, java.lang.StackTraceElement[] actualTrace, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kotlin.collections.ArraysKt.getOrNull(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i = 0;
        for (java.lang.StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> frame) {
        updateState(frame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> frame) {
        updateState(frame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED);
    }

    private final void updateState(kotlin.coroutines.Continuation<?> frame, java.lang.String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.getContext() == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING)) {
                kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame = frame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, state);
                return;
            }
            kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner = owner(frame);
            if (owner == null) {
                return;
            }
            updateState(owner, frame, state);
        }
    }

    private final void updateRunningState(kotlin.coroutines.jvm.internal.CoroutineStackFrame frame, java.lang.String state) {
        boolean z;
        if (isInstalled$kotlinx_coroutines_debug()) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl remove = concurrentWeakMap.remove(frame);
            if (remove != null) {
                z = false;
            } else {
                kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner = owner(frame);
                if (owner == null || (remove = owner.info) == null) {
                    return;
                }
                kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = remove.getLastObservedFrame$kotlinx_coroutines_core();
                kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (realCaller != null) {
                    concurrentWeakMap.remove(realCaller);
                }
                z = true;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            remove.updateState$kotlinx_coroutines_core(state, (kotlin.coroutines.Continuation) frame, z);
            kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller2 = realCaller(frame);
            if (realCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(realCaller2, remove);
        }
    }

    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final void updateState(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner, kotlin.coroutines.Continuation<?> frame, java.lang.String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame = continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) coroutineStackFrame;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(kotlin.coroutines.Continuation<? super T> completion) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        if (!(ignoreCoroutinesWithEmptyContext && completion.getContext() == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) && owner(completion) == null) {
            return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new java.lang.Exception())) : null);
        }
        return completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.Continuation<T> createOwner(kotlin.coroutines.Continuation<? super T> completion, kotlinx.coroutines.debug.internal.StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner = new kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<>(completion, new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl(completion.getContext(), frame, getSequenceNumber().incrementAndGet()));
        kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, true);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner) {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller;
        capturedCoroutinesMap.remove(owner);
        kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (realCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(realCaller);
    }

    /* compiled from: DebugProbesImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001b\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0019\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
        public final kotlin.coroutines.Continuation<T> delegate;
        public final kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl info;

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(kotlin.coroutines.Continuation<? super T> continuation, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = continuation;
            this.info = debugCoroutineInfoImpl;
        }

        private final kotlinx.coroutines.debug.internal.StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            kotlinx.coroutines.debug.internal.StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public java.lang.StackTraceElement getStackTraceElement() {
            kotlinx.coroutines.debug.internal.StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object result) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public java.lang.String toString() {
            return this.delegate.toString();
        }
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> sanitizeStackTrace(T throwable) {
        java.lang.StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        int i3 = i + 1;
        if (!sanitizeStackTraces) {
            int i4 = length - i3;
            java.util.ArrayList arrayList = new java.util.ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (isInternalMethod(stackTrace[i3])) {
                java.util.ArrayList arrayList3 = arrayList2;
                arrayList3.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && isInternalMethod(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList3.add(stackTrace[i8]);
                }
                arrayList3.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    private final boolean isInternalMethod(java.lang.StackTraceElement stackTraceElement) {
        return kotlin.text.StringsKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, (java.lang.Object) null);
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, kotlinx.coroutines.debug.internal.DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlinx.coroutines.debug.internal.DebugCoroutineInfo invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                boolean isFinished;
                kotlin.coroutines.CoroutineContext context;
                isFinished = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new kotlinx.coroutines.debug.internal.DebugCoroutineInfo(coroutineOwner.info, context);
            }
        }));
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, kotlinx.coroutines.debug.internal.DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlinx.coroutines.debug.internal.DebuggerInfo invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                boolean isFinished;
                kotlin.coroutines.CoroutineContext context;
                isFinished = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new kotlinx.coroutines.debug.internal.DebuggerInfo(coroutineOwner.info, context);
            }
        }));
    }

    private final kotlinx.coroutines.debug.internal.StackTraceFrame toStackTraceFrame(java.util.List<java.lang.StackTraceElement> list) {
        kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            java.util.ListIterator<java.lang.StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new kotlinx.coroutines.debug.internal.StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new kotlinx.coroutines.debug.internal.StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }
}
