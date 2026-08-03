package androidx.activity;

/* compiled from: FullyDrawnReporter.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        int i;
        androidx.activity.FullyDrawnReporter fullyDrawnReporter2;
        try {
            if (continuation instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) {
                fullyDrawnReporterKt$reportWhenComplete$1 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) continuation;
                if ((fullyDrawnReporterKt$reportWhenComplete$1.label & Integer.MIN_VALUE) != 0) {
                    fullyDrawnReporterKt$reportWhenComplete$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = fullyDrawnReporterKt$reportWhenComplete$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fullyDrawnReporterKt$reportWhenComplete$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter.addReporter();
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        fullyDrawnReporterKt$reportWhenComplete$1.L$0 = fullyDrawnReporter;
                        fullyDrawnReporterKt$reportWhenComplete$1.label = 1;
                        fullyDrawnReporter2 = fullyDrawnReporter;
                        if (function1.invoke(fullyDrawnReporterKt$reportWhenComplete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.activity.FullyDrawnReporter fullyDrawnReporter3 = (androidx.activity.FullyDrawnReporter) fullyDrawnReporterKt$reportWhenComplete$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter2 = fullyDrawnReporter3;
                    }
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    fullyDrawnReporter2.removeReporter();
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    fullyDrawnReporter = kotlin.Unit.INSTANCE;
                    return fullyDrawnReporter;
                }
            }
            if (i != 0) {
            }
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter2.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            fullyDrawnReporter = kotlin.Unit.INSTANCE;
            return fullyDrawnReporter;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
        fullyDrawnReporterKt$reportWhenComplete$1 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1(continuation);
        java.lang.Object obj2 = fullyDrawnReporterKt$reportWhenComplete$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fullyDrawnReporterKt$reportWhenComplete$1.label;
    }

    private static final java.lang.Object reportWhenComplete$$forInline(androidx.activity.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return kotlin.Unit.INSTANCE;
        }
        try {
            function1.invoke(continuation);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
