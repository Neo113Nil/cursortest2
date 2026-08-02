package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a2\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "reporter", "reportWhenComplete", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object reportWhenComplete(androidx.view.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.view.FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        int i;
        androidx.view.FullyDrawnReporter fullyDrawnReporter2;
        try {
            if (continuation instanceof androidx.view.FullyDrawnReporterKt$reportWhenComplete$1) {
                fullyDrawnReporterKt$reportWhenComplete$1 = (androidx.view.FullyDrawnReporterKt$reportWhenComplete$1) continuation;
                if ((fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter.addReporter();
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        fullyDrawnReporterKt$reportWhenComplete$1.getHighResolutionOutputSizeshNQ4ISI = fullyDrawnReporter;
                        fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoFpsRangesFor = 1;
                        fullyDrawnReporter2 = fullyDrawnReporter;
                        if (function1.invoke(fullyDrawnReporterKt$reportWhenComplete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.view.FullyDrawnReporter fullyDrawnReporter3 = (androidx.view.FullyDrawnReporter) fullyDrawnReporterKt$reportWhenComplete$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter2 = fullyDrawnReporter3;
                    }
                    fullyDrawnReporter2.removeReporter();
                    fullyDrawnReporter = kotlin.Unit.INSTANCE;
                    return fullyDrawnReporter;
                }
            }
            if (i != 0) {
            }
            fullyDrawnReporter2.removeReporter();
            fullyDrawnReporter = kotlin.Unit.INSTANCE;
            return fullyDrawnReporter;
        } catch (java.lang.Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
        fullyDrawnReporterKt$reportWhenComplete$1 = new androidx.view.FullyDrawnReporterKt$reportWhenComplete$1(continuation);
        java.lang.Object obj2 = fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fullyDrawnReporterKt$reportWhenComplete$1.getHighSpeedVideoFpsRangesFor;
    }
}
