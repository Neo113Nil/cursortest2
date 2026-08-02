package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", i = {0}, l = {206}, m = "invokeSuspend", n = {"stream"}, s = {"L$1"}, v = 1)
/* loaded from: classes3.dex */
final class FileWriteScope$writeData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.content.core.FileWriteScope<T> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.FileOutputStream fileOutputStream;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            try {
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(this.getHighSpeedVideoSizes.getFile());
                    androidx.content.core.FileReadScope fileReadScope = this.getHighSpeedVideoSizes;
                    java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                    java.io.FileOutputStream fileOutputStream3 = fileOutputStream2;
                    androidx.content.core.Serializer serializer = fileReadScope.getSerializer();
                    androidx.content.core.UncloseableOutputStream uncloseableOutputStream = new androidx.content.core.UncloseableOutputStream(fileOutputStream3);
                    this.Camera2StreamConfigurationMap = fileOutputStream2;
                    this.getHighSpeedVideoFpsRangesFor = fileOutputStream3;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (serializer.writeTo(obj2, uncloseableOutputStream, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fileOutputStream = fileOutputStream3;
                    r1 = fileOutputStream2;
                } else {
                    if (r1 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (java.io.FileOutputStream) this.getHighSpeedVideoFpsRangesFor;
                    java.io.Closeable closeable = (java.io.Closeable) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = closeable;
                }
                fileOutputStream.getFD().sync();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(r1, null);
                return kotlin.Unit.INSTANCE;
            } finally {
            }
        } catch (java.lang.Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                throw androidx.content.core.DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.getHighSpeedVideoSizes.getFile().getParent(), e);
            }
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.FileWriteScope$writeData$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.FileWriteScope$writeData$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileWriteScope$writeData$2(androidx.content.core.FileWriteScope<T> fileWriteScope, T t, kotlin.coroutines.Continuation<? super androidx.content.core.FileWriteScope$writeData$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = fileWriteScope;
        this.getHighSpeedVideoFpsRanges = t;
    }
}
