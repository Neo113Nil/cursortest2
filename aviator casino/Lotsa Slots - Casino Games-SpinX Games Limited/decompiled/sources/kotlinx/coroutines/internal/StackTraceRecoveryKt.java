package kotlinx.coroutines.internal;

/* compiled from: StackTraceRecovery.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u001f\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\u0002H\nH\u0002¢\u0006\u0002\u0010\r\u001a,\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0080\b¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n2\n\u0010\u000f\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a9\u0010\u0016\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\n2\u0006\u0010\u0018\u001a\u0002H\n2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001aH\u0002¢\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u0002H\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f0\u001e\"\b\b\u0000\u0010\n*\u00020\u000b*\u0002H\nH\u0002¢\u0006\u0002\u0010 \u001a1\u0010!\u001a\u00020\"2\u0010\u0010#\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f2\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001aH\u0002¢\u0006\u0002\u0010$\u001a\u0016\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0080H¢\u0006\u0002\u0010'\u001a \u0010(\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0081\b¢\u0006\u0002\u0010\r\u001a\u001f\u0010)\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0001¢\u0006\u0002\u0010\r\u001a\u001e\u0010*\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001a2\n\u0010\u000f\u001a\u00060\u0013j\u0002`\u0014H\u0002\u001a\u0010\u0010+\u001a\u00020,*\u00060\u0004j\u0002`\u001bH\u0000\u001a#\u0010-\u001a\u00020.*\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f2\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00100\u001a\u001c\u00101\u001a\u00020,*\u00060\u0004j\u0002`\u001b2\n\u00102\u001a\u00060\u0004j\u0002`\u001bH\u0002\u001a\u0014\u00105\u001a\u00020\"*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0018\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007*\f\b\u0000\u00103\"\u00020\u00132\u00020\u0013*\f\b\u0000\u00104\"\u00020\u00042\u00020\u0004¨\u00066"}, d2 = {"baseContinuationImplClass", "", "stackTraceRecoveryClass", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "stackTraceRecoveryClassName", "recoverStackTrace", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sanitizeStackTrace", "continuation", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "recoverFromStackFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "createFinalException", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "causeAndStacktrace", "Lkotlin/Pair;", "", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "mergeRecoveredTraces", "", "recoveredStacktrace", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "createStackTrace", "isArtificial", "", "firstFrameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "elementWiseEquals", "e", "CoroutineStackFrame", "StackTraceElement", "initCause", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StackTraceRecoveryKt {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME;
    private static final java.lang.String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final java.lang.String baseContinuationImplClassName;
    private static final java.lang.String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final java.lang.String stackTraceRecoveryClassName;

    static {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = stackTraceRecoveryClass;
        java.lang.Object obj4 = baseContinuationImplClass;
        ARTIFICIAL_FRAME = new _COROUTINE.ArtificialStackFrames().coroutineBoundary();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m10798constructorimpl(java.lang.Class.forName(baseContinuationImplClass).getCanonicalName());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(obj) == null) {
            obj4 = obj;
        }
        baseContinuationImplClassName = (java.lang.String) obj4;
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m10798constructorimpl(java.lang.Class.forName(stackTraceRecoveryClass).getCanonicalName());
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(obj2) == null) {
            obj3 = obj2;
        }
        stackTraceRecoveryClassName = (java.lang.String) obj3;
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E e) {
        java.lang.Throwable tryCopyException;
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (tryCopyException = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(e)) != null) ? (E) sanitizeStackTrace(tryCopyException) : e;
    }

    private static final <E extends java.lang.Throwable> E sanitizeStackTrace(E e) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
        }
        length2 = -1;
        int i2 = length2 + 1;
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i3 = (length - length2) - (firstFrameIndex == -1 ? 0 : length - firstFrameIndex);
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                stackTraceElement = ARTIFICIAL_FRAME;
            } else {
                stackTraceElement = stackTrace[(i2 + i4) - 1];
            }
            stackTraceElementArr[i4] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E e, kotlin.coroutines.Continuation<?> continuation) {
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? (E) recoverFromStackFrame(e, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation) : e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> E recoverFromStackFrame(E e, kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        kotlin.Pair causeAndStacktrace = causeAndStacktrace(e);
        java.lang.Throwable th = (java.lang.Throwable) causeAndStacktrace.component1();
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) causeAndStacktrace.component2();
        java.lang.Throwable tryCopyException = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(th);
        if (tryCopyException == null) {
            return e;
        }
        java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace = createStackTrace(coroutineStackFrame);
        if (createStackTrace.isEmpty()) {
            return e;
        }
        if (th != e) {
            mergeRecoveredTraces(stackTraceElementArr, createStackTrace);
        }
        return (E) createFinalException(th, tryCopyException, createStackTrace);
    }

    private static final <E extends java.lang.Throwable> E createFinalException(E e, E e2, java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i = 0;
        if (firstFrameIndex == -1) {
            e2.setStackTrace((java.lang.StackTraceElement[]) arrayDeque.toArray(new java.lang.StackTraceElement[0]));
            return e2;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[arrayDeque.size() + firstFrameIndex];
        for (int i2 = 0; i2 < firstFrameIndex; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        java.util.Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i3 = i + 1;
            stackTraceElementArr[i + firstFrameIndex] = (java.lang.StackTraceElement) it.next();
            i = i3;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> causeAndStacktrace(E e) {
        java.lang.Throwable cause = e.getCause();
        if (cause != null && kotlin.jvm.internal.Intrinsics.areEqual(cause.getClass(), e.getClass())) {
            java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (isArtificial(stackTraceElement)) {
                    return kotlin.TuplesKt.to(cause, stackTrace);
                }
            }
            return kotlin.TuplesKt.to(e, new java.lang.StackTraceElement[0]);
        }
        return kotlin.TuplesKt.to(e, new java.lang.StackTraceElement[0]);
    }

    public static final java.lang.Object recoverAndThrow(java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) {
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        throw th;
    }

    private static final java.lang.Object recoverAndThrow$$forInline(java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) {
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        throw th;
    }

    public static final <E extends java.lang.Throwable> E unwrap(E e) {
        return !kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() ? e : (E) unwrapImpl(e);
    }

    public static final <E extends java.lang.Throwable> E unwrapImpl(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && kotlin.jvm.internal.Intrinsics.areEqual(e2.getClass(), e.getClass())) {
            for (java.lang.StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque = new java.util.ArrayDeque<>();
        java.lang.StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    public static final boolean isArtificial(java.lang.StackTraceElement stackTraceElement) {
        return kotlin.text.StringsKt.startsWith$default(stackTraceElement.getClassName(), _COROUTINE.CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, (java.lang.Object) null);
    }

    private static final boolean elementWiseEquals(java.lang.StackTraceElement stackTraceElement, java.lang.StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final void initCause(java.lang.Throwable th, java.lang.Throwable th2) {
        th.initCause(th2);
    }

    private static final void mergeRecoveredTraces(java.lang.StackTraceElement[] stackTraceElementArr, java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    private static final int firstFrameIndex(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
