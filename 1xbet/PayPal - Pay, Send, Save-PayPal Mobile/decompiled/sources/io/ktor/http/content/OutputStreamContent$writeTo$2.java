package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.OutputStreamContent$writeTo$2", f = "OutputStreamContent.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class OutputStreamContent$writeTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.http.content.OutputStreamContent getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.Closeable closeable;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.io.OutputStream outputStream = io.ktor.utils.io.jvm.javaio.BlockingKt.toOutputStream(this.getHighResolutionOutputSizeshNQ4ISI);
            try {
                function2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = outputStream;
                this.getHighSpeedVideoSizes = 1;
                if (function2.invoke(outputStream, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = outputStream;
            } catch (java.lang.Throwable th2) {
                closeable = outputStream;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    kotlin.io.CloseableKt.closeFinally(closeable, th);
                    throw th4;
                }
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.io.CloseableKt.closeFinally(closeable, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.OutputStreamContent$writeTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.http.content.OutputStreamContent$writeTo$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutputStreamContent$writeTo$2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.http.content.OutputStreamContent outputStreamContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutputStreamContent$writeTo$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel;
        this.getHighSpeedVideoFpsRangesFor = outputStreamContent;
    }
}
