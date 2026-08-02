package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0082@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Ljava/io/File;", "p0", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.io.File file, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 fileStorageKt$runFileDiagnosticsIfNotCorruption$1;
        int i;
        try {
            if (continuation instanceof androidx.content.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1) {
                fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = (androidx.content.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1) continuation;
                if ((fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRangesFor;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRanges = file;
                    fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object invoke = function1.invoke(fileStorageKt$runFileDiagnosticsIfNotCorruption$1);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (java.io.IOException e) {
            if (e instanceof androidx.content.core.CorruptionException) {
                throw e;
            }
            throw androidx.content.core.FileDiagnostics.INSTANCE.attachFileDebugInfo(file, e);
        }
        fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = new androidx.content.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1(continuation);
        java.lang.Object obj2 = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.getHighSpeedVideoFpsRangesFor;
    }
}
