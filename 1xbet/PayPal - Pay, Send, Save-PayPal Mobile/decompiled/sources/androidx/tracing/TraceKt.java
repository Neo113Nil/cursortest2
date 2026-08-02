package androidx.tracing;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001aF\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0086H¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "label", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lazyLabel", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "methodName", "", "cookie", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "traceAsync", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lazyMethodName", "lazyCookie", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TraceKt {
    public static final <T> T trace(java.lang.String str, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.tracing.Trace.beginSection(str);
        try {
            return function0.invoke();
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    public static final <T> T trace(kotlin.jvm.functions.Function0<java.lang.String> function0, kotlin.jvm.functions.Function0<? extends T> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        boolean isEnabled = androidx.tracing.Trace.isEnabled();
        if (isEnabled) {
            androidx.tracing.Trace.beginSection(function0.invoke());
        }
        try {
            return function02.invoke();
        } finally {
            if (isEnabled) {
                androidx.tracing.Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.tracing.TraceKt$traceAsync$1 traceKt$traceAsync$1;
        int i2;
        try {
            if (continuation instanceof androidx.tracing.TraceKt$traceAsync$1) {
                traceKt$traceAsync$1 = (androidx.tracing.TraceKt$traceAsync$1) continuation;
                if ((traceKt$traceAsync$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    traceKt$traceAsync$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = traceKt$traceAsync$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = traceKt$traceAsync$1.getHighSpeedVideoFpsRangesFor;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.tracing.Trace.beginAsyncSection(str, i);
                        traceKt$traceAsync$1.Camera2StreamConfigurationMap = str;
                        traceKt$traceAsync$1.getHighSpeedVideoSizes = i;
                        traceKt$traceAsync$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = function1.invoke(traceKt$traceAsync$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = traceKt$traceAsync$1.getHighSpeedVideoSizes;
                        str = (java.lang.String) traceKt$traceAsync$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            return obj;
        } finally {
            androidx.tracing.Trace.endAsyncSection(str, i);
        }
        traceKt$traceAsync$1 = new androidx.tracing.TraceKt$traceAsync$1(continuation);
        java.lang.Object obj2 = traceKt$traceAsync$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = traceKt$traceAsync$1.getHighSpeedVideoFpsRangesFor;
    }

    public static final <T> T traceAsync(kotlin.jvm.functions.Function0<java.lang.String> function0, kotlin.jvm.functions.Function0<java.lang.Integer> function02, kotlin.jvm.functions.Function0<? extends T> function03) {
        java.lang.String str;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        if (androidx.tracing.Trace.isEnabled()) {
            str = function0.invoke();
            i = function02.invoke().intValue();
            androidx.tracing.Trace.beginAsyncSection(str, i);
        } else {
            str = null;
            i = 0;
        }
        try {
            return function03.invoke();
        } finally {
            if (str != null) {
                androidx.tracing.Trace.endAsyncSection(str, i);
            }
        }
    }
}
