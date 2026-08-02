package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aû\u0001\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0007¢\u0006\u0002\b\b2'\u0010\u000b\u001a#\b\u0001\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032'\u0010\f\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032'\u0010\r\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\u001e\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aÈ\u0001\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0007¢\u0006\u0002\b\b2'\u0010\u000b\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032'\u0010\f\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u000e\u0010\u0010\u001a¼\u0001\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0012¢\u0006\u0002\b\b2\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u001e\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000¢\u0006\u0004\b\u000e\u0010\u0013\u001a\u0099\u0001\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0012¢\u0006\u0002\b\b2\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u000e\u0010\u0014\u001a\u0097\u0001\u0010\u0015\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0002\b\b2\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u001e\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001aº\u0001\u0010\u0017\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0002\b\b2\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00020\u0011H\u0086\bø\u0001\u0000\u0082\u0002(\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0004 \u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0083\u0001\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0002\b\b2\"\u0010\f\u001a\u001e\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00190\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u007f\u0010\u001d\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00032\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f*\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a%\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\u00060#j\u0002`$2\u0006\u0010\u000b\u001a\u00020%H\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Error", "A", "B", "Lkotlin/Function2;", "Larrow/core/raise/Raise;", "Lkotlin/coroutines/Continuation;", "", "Larrow/core/raise/Effect;", "Lkotlin/ExtensionFunctionType;", "", "Lkotlin/ParameterName;", "p0", "p1", "p2", "fold", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Larrow/core/raise/EagerEffect;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "_foldOrThrow", "p3", "_fold", "Larrow/core/raise/Trace;", "", "traced", "(Larrow/core/raise/Raise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "OtherError", "withErrorTraced", "(Larrow/core/raise/Raise;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Larrow/core/raise/Traced;", "withCause", "(Larrow/core/raise/Traced;Larrow/core/raise/Traced;)Larrow/core/raise/Traced;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/getHighSpeedVideoFpsRanges;", "Larrow/core/raise/DefaultRaise;", "raisedOrRethrow", "(Ljava/util/concurrent/CancellationException;Larrow/core/raise/DefaultRaise;)Ljava/lang/Object;", "", "RaiseCancellationExceptionCaptured", "Ljava/lang/String;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/raise/RaiseKt")
/* loaded from: classes.dex */
final /* synthetic */ class RaiseKt__FoldKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e1 A[PHI: r13
      0x00e1: PHI (r13v11 java.lang.Object) = (r13v6 java.lang.Object), (r13v9 java.lang.Object), (r13v1 java.lang.Object) binds: [B:30:0x00c1, B:25:0x00de, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Error, A, B> java.lang.Object fold(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function23, kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function24, kotlin.coroutines.Continuation<? super B> continuation) {
        arrow.core.raise.RaiseKt__FoldKt$fold$1 raiseKt__FoldKt$fold$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function25;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function26;
        arrow.core.raise.RaiseCancellationException e;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof arrow.core.raise.RaiseKt__FoldKt$fold$1) {
            raiseKt__FoldKt$fold$1 = (arrow.core.raise.RaiseKt__FoldKt$fold$1) continuation;
            if ((raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = raiseKt__FoldKt$fold$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = function22;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = function23;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = function24;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = defaultRaise;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 1;
                        java.lang.Object invoke = defaultRaise.invoke(function2, raiseKt__FoldKt$fold$1);
                        if (invoke != coroutine_suspended) {
                            obj = invoke;
                            defaultRaise2 = defaultRaise;
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        function26 = function23;
                        e = e2;
                        defaultRaise.complete();
                        amex.AMEXKernel aMEXKernel = (java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 3;
                        obj = function26.invoke(aMEXKernel, raiseKt__FoldKt$fold$1);
                        if (obj != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        function25 = function22;
                        th = th2;
                        defaultRaise.complete();
                        java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 4;
                        obj = function25.invoke(nonFatalOrThrow, raiseKt__FoldKt$fold$1);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                if (i == 1) {
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges;
                    function24 = (kotlin.jvm.functions.Function2) raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap;
                    function23 = (kotlin.jvm.functions.Function2) raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI;
                    function22 = (kotlin.jvm.functions.Function2) raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function27 = function23;
                        e = e3;
                        function26 = function27;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        amex.AMEXKernel aMEXKernel2 = (java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 3;
                        obj = function26.invoke(aMEXKernel2, raiseKt__FoldKt$fold$1);
                        if (obj != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th3) {
                        function25 = function22;
                        th = th3;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Throwable nonFatalOrThrow2 = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 4;
                        obj = function25.invoke(nonFatalOrThrow2, raiseKt__FoldKt$fold$1);
                        if (obj == coroutine_suspended) {
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap;
                    function26 = (kotlin.jvm.functions.Function2) raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI;
                    function25 = (kotlin.jvm.functions.Function2) raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (arrow.core.raise.RaiseCancellationException e4) {
                        e = e4;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        amex.AMEXKernel aMEXKernel22 = (java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 3;
                        obj = function26.invoke(aMEXKernel22, raiseKt__FoldKt$fold$1);
                        if (obj != coroutine_suspended) {
                            return obj;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Throwable nonFatalOrThrow22 = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = null;
                        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 4;
                        obj = function25.invoke(nonFatalOrThrow22, raiseKt__FoldKt$fold$1);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                defaultRaise2.complete();
                raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = function22;
                raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = function23;
                raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = defaultRaise2;
                raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
                raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 2;
                java.lang.Object invoke2 = function24.invoke(obj, raiseKt__FoldKt$fold$1);
                return invoke2 == coroutine_suspended ? invoke2 : coroutine_suspended;
            }
        }
        raiseKt__FoldKt$fold$1 = new arrow.core.raise.RaiseKt__FoldKt$fold$1(continuation);
        java.lang.Object obj2 = raiseKt__FoldKt$fold$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        defaultRaise2.complete();
        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRangesFor = function22;
        raiseKt__FoldKt$fold$1.getHighResolutionOutputSizeshNQ4ISI = function23;
        raiseKt__FoldKt$fold$1.Camera2StreamConfigurationMap = defaultRaise2;
        raiseKt__FoldKt$fold$1.getHighSpeedVideoFpsRanges = null;
        raiseKt__FoldKt$fold$1.getHighSpeedVideoSizes = 2;
        java.lang.Object invoke22 = function24.invoke(obj2, raiseKt__FoldKt$fold$1);
        if (invoke22 == coroutine_suspended2) {
        }
    }

    public static final <Error, A, B> java.lang.Object fold(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function23, kotlin.coroutines.Continuation<? super B> continuation) {
        return arrow.core.raise.RaiseKt.fold(function2, new arrow.core.raise.RaiseKt__FoldKt$fold$7(null), function22, function23, continuation);
    }

    public static final <Error, A, B> B _fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends B> function12, kotlin.jvm.functions.Function1<? super Error, ? extends B> function13, kotlin.jvm.functions.Function1<? super A, ? extends B> function14) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return function14.invoke(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return function13.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            return function12.invoke(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
        }
    }

    public static final <Error, OtherError, A> A withErrorTraced(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super arrow.core.raise.Trace, ? super OtherError, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super OtherError>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(true);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return invoke;
        } catch (arrow.core.raise.Traced e) {
            defaultRaise.complete();
            arrow.core.raise.Traced traced = e;
            try {
                raise.raise(function2.invoke(arrow.core.raise.Trace.m9708boximpl(arrow.core.raise.Trace.m9709constructorimpl(traced)), (java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(traced, defaultRaise)));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.Traced e2) {
                throw arrow.core.raise.RaiseKt.withCause(e2, e);
            }
        }
    }

    public static final arrow.core.raise.Traced withCause(arrow.core.raise.Traced traced, arrow.core.raise.Traced traced2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traced, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traced2, "");
        return new arrow.core.raise.Traced(traced.getRaised(), traced.getRaise$arrow_core(), traced2);
    }

    public static final <R> R raisedOrRethrow(java.util.concurrent.CancellationException cancellationException, arrow.core.raise.DefaultRaise defaultRaise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationException, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultRaise, "");
        if (!(cancellationException instanceof arrow.core.raise.RaiseCancellationException)) {
            throw cancellationException;
        }
        arrow.core.raise.RaiseCancellationException raiseCancellationException = (arrow.core.raise.RaiseCancellationException) cancellationException;
        if (raiseCancellationException.getRaise$arrow_core() == defaultRaise) {
            return (R) raiseCancellationException.getRaised();
        }
        throw cancellationException;
    }

    public static final <Error, A, B> B fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends B> function12, kotlin.jvm.functions.Function1<? super Error, ? extends B> function13, kotlin.jvm.functions.Function1<? super A, ? extends B> function14) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return function14.invoke(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return function13.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            return function12.invoke(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
        }
    }

    public static final <Error, A, B> B fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends B> function12, kotlin.jvm.functions.Function1<? super A, ? extends B> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return function13.invoke(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return function12.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A, B> B _foldOrThrow(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends B> function12, kotlin.jvm.functions.Function1<? super A, ? extends B> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return function13.invoke(invoke);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return function12.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A> A traced(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function2<? super arrow.core.raise.Trace, ? super Error, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(true);
        try {
            A invoke = function1.invoke(defaultRaise);
            defaultRaise.complete();
            return invoke;
        } catch (arrow.core.raise.Traced e) {
            defaultRaise.complete();
            arrow.core.raise.Traced traced = e;
            java.util.concurrent.CancellationException m9709constructorimpl = arrow.core.raise.Trace.m9709constructorimpl(traced);
            amex.AMEXKernel aMEXKernel = (java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(traced, defaultRaise);
            function2.invoke(arrow.core.raise.Trace.m9708boximpl(m9709constructorimpl), aMEXKernel);
            try {
                raise.raise(aMEXKernel);
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.Traced e2) {
                throw arrow.core.raise.RaiseKt.withCause(e2, e);
            }
        }
    }
}
