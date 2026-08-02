package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080H¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u0004\u001a!\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\u00020\u000f*\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0016\u001a\u00020\u0015*\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0018\u0010 \u001a\u0006*\u00020\u00130\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0018\u0010!\u001a\u0006*\u00020\u00130\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f*\f\b\u0000\u0010#\"\u00020\"2\u00020\"*\f\b\u0000\u0010!\"\u00020\r2\u00020\r"}, d2 = {"", "E", "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "continuation", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "", "recoverAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/getHighResolutionOutputSizeshNQ4ISI;", "", "isArtificial", "(Ljava/lang/StackTraceElement;)Z", "", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "cause", "", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Ljava/lang/StackTraceElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackTraceRecoveryKt {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.StackTraceElement getHighSpeedVideoSizes = new _COROUTINE.ArtificialStackFrames().coroutineBoundary();

    static {
        java.lang.Object obj;
        java.lang.Object obj2;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m23436constructorimpl(java.lang.Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        Camera2StreamConfigurationMap = (java.lang.String) (kotlin.Result.m23439exceptionOrNullimpl(obj) == null ? obj : "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m23436constructorimpl(java.lang.Class.forName("kotlinx.coroutines.internal.StackTraceRecoveryKt").getCanonicalName());
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        getHighSpeedVideoFpsRangesFor = (java.lang.String) (kotlin.Result.m23439exceptionOrNullimpl(obj2) == null ? obj2 : "kotlinx.coroutines.internal.StackTraceRecoveryKt");
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E e) {
        E e2;
        java.lang.StackTraceElement stackTraceElement;
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() || (e2 = (E) kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(e)) == null) {
            return e;
        }
        java.lang.StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
        }
        length2 = -1;
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(stackTrace, Camera2StreamConfigurationMap);
        int i2 = (length - length2) - (highSpeedVideoFpsRangesFor == -1 ? 0 : length - highSpeedVideoFpsRangesFor);
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = getHighSpeedVideoSizes;
            } else {
                stackTraceElement = stackTrace[((length2 + 1) + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E e, kotlin.coroutines.Continuation<?> continuation) {
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? (E) access$recoverFromStackFrame(e, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation) : e;
    }

    public static final java.lang.Object recoverAndThrow(java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) {
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw access$recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
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

    public static final boolean isArtificial(java.lang.StackTraceElement stackTraceElement) {
        return kotlin.text.StringsKt.startsWith$default(stackTraceElement.getClassName(), _COROUTINE.CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, (java.lang.Object) null);
    }

    public static final void initCause(java.lang.Throwable th, java.lang.Throwable th2) {
        th.initCause(th2);
    }

    private static final int getHighSpeedVideoFpsRangesFor(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final /* synthetic */ java.lang.Throwable access$recoverFromStackFrame(java.lang.Throwable th, kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        kotlin.Pair pair;
        java.lang.StackTraceElement[] stackTraceElementArr;
        java.lang.Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && kotlin.jvm.internal.Intrinsics.areEqual(cause.getClass(), th.getClass())) {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (isArtificial(stackTrace[i2])) {
                        pair = kotlin.TuplesKt.to(cause, stackTrace);
                        break;
                    }
                    i2++;
                } else {
                    pair = kotlin.TuplesKt.to(th, new java.lang.StackTraceElement[0]);
                    break;
                }
            }
        } else {
            pair = kotlin.TuplesKt.to(th, new java.lang.StackTraceElement[0]);
        }
        java.lang.Throwable th2 = (java.lang.Throwable) pair.component1();
        java.lang.StackTraceElement[] stackTraceElementArr2 = (java.lang.StackTraceElement[]) pair.component2();
        java.lang.Throwable tryCopyException = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(th2);
        if (tryCopyException != null) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            java.lang.StackTraceElement getHighResolutionOutputSizeshNQ4ISI = coroutineStackFrame.getGetHighResolutionOutputSizeshNQ4ISI();
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                arrayDeque.add(getHighResolutionOutputSizeshNQ4ISI);
            }
            while (true) {
                if (!(coroutineStackFrame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                    coroutineStackFrame = null;
                }
                if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                java.lang.StackTraceElement getHighResolutionOutputSizeshNQ4ISI2 = coroutineStackFrame.getGetHighResolutionOutputSizeshNQ4ISI();
                if (getHighResolutionOutputSizeshNQ4ISI2 != null) {
                    arrayDeque.add(getHighResolutionOutputSizeshNQ4ISI2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                if (th2 != th) {
                    int length2 = stackTraceElementArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i3 = -1;
                            break;
                        }
                        if (isArtificial(stackTraceElementArr2[i3])) {
                            break;
                        }
                        i3++;
                    }
                    int i4 = i3 + 1;
                    int length3 = stackTraceElementArr2.length - 1;
                    if (i4 <= length3) {
                        while (true) {
                            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr2[length3];
                            java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) arrayDeque.getLast();
                            if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                                arrayDeque.removeLast();
                            }
                            arrayDeque.addFirst(stackTraceElementArr2[length3]);
                            if (length3 == i4) {
                                break;
                            }
                            length3--;
                        }
                    }
                }
                arrayDeque.addFirst(getHighSpeedVideoSizes);
                java.lang.StackTraceElement[] stackTrace2 = th2.getStackTrace();
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(stackTrace2, Camera2StreamConfigurationMap);
                if (highSpeedVideoFpsRangesFor != -1) {
                    java.lang.StackTraceElement[] stackTraceElementArr3 = new java.lang.StackTraceElement[arrayDeque.size() + highSpeedVideoFpsRangesFor];
                    for (int i5 = 0; i5 < highSpeedVideoFpsRangesFor; i5++) {
                        stackTraceElementArr3[i5] = stackTrace2[i5];
                    }
                    java.util.Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        stackTraceElementArr3[i + highSpeedVideoFpsRangesFor] = (java.lang.StackTraceElement) it.next();
                        i++;
                    }
                    stackTraceElementArr = stackTraceElementArr3;
                } else {
                    stackTraceElementArr = (java.lang.StackTraceElement[]) arrayDeque.toArray(new java.lang.StackTraceElement[0]);
                }
                tryCopyException.setStackTrace(stackTraceElementArr);
                return tryCopyException;
            }
        }
        return th;
    }
}
