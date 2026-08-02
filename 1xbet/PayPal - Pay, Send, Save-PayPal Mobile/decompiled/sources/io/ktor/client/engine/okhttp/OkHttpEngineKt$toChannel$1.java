package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 179}, m = "invokeSuspend", n = {"$this$writer", "$this$use$iv", "source", "lastRead", "$this$writer", "$this$use$iv", "source", "lastRead"}, s = {"L$0", "L$1", "L$4", "L$5", "L$0", "L$1", "L$4", "L$5"})
/* loaded from: classes17.dex */
final class OkHttpEngineKt$toChannel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.request.HttpRequestData getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ okio.BufferedSource getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (r10.flush(r16) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c2 -> B:8:0x002b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.lang.Throwable th2;
        io.ktor.utils.io.WriterScope writerScope;
        final kotlin.coroutines.CoroutineContext coroutineContext;
        final io.ktor.client.request.HttpRequestData httpRequestData;
        final okio.BufferedSource bufferedSource;
        final kotlin.jvm.internal.Ref.IntRef intRef;
        io.ktor.utils.io.WriterScope writerScope2;
        java.io.Closeable closeable2;
        kotlin.coroutines.CoroutineContext coroutineContext2;
        io.ktor.client.request.HttpRequestData httpRequestData2;
        okio.BufferedSource bufferedSource2;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
        } catch (java.lang.Throwable th3) {
            th = th3;
            closeable = closeable2;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope3 = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoSizesFor;
            okio.BufferedSource bufferedSource3 = this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.CoroutineContext coroutineContext3 = this.Camera2StreamConfigurationMap;
            okio.BufferedSource bufferedSource4 = bufferedSource3;
            writerScope = writerScope3;
            coroutineContext = coroutineContext3;
            httpRequestData = this.getHighResolutionOutputSizeshNQ4ISI;
            bufferedSource = bufferedSource4;
            closeable = bufferedSource3;
            intRef = new kotlin.jvm.internal.Ref.IntRef();
            if (!bufferedSource.isOpen()) {
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            th2 = null;
            if (closeable != null) {
            }
            if (th2 == null) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.getInputSizeshNQ4ISI;
                bufferedSource2 = (okio.BufferedSource) this.getOutputMinFrameDuration;
                httpRequestData2 = (io.ktor.client.request.HttpRequestData) this.getOutputFormats;
                coroutineContext2 = (kotlin.coroutines.CoroutineContext) this.getHighSpeedVideoSizes;
                closeable2 = (java.io.Closeable) this.getHighSpeedVideoFpsRangesFor;
                writerScope2 = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                intRef = intRef2;
                bufferedSource = bufferedSource2;
                httpRequestData = httpRequestData2;
                coroutineContext = coroutineContext2;
                closeable = closeable2;
                writerScope = writerScope2;
                try {
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (java.lang.Throwable th5) {
                            kotlin.ExceptionsKt.addSuppressed(th, th5);
                        }
                    }
                    th2 = th;
                    if (th2 == null) {
                    }
                }
                if (!bufferedSource.isOpen() && kotlinx.coroutines.JobKt.isActive(coroutineContext) && intRef.element >= 0) {
                    io.ktor.utils.io.ByteWriteChannel channel = writerScope.getChannel();
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.IntRef.this, bufferedSource, httpRequestData, coroutineContext, (java.nio.ByteBuffer) obj2);
                            return highSpeedVideoFpsRanges;
                        }
                    };
                    this.getHighSpeedVideoSizesFor = writerScope;
                    this.getHighSpeedVideoFpsRangesFor = closeable;
                    this.getHighSpeedVideoSizes = coroutineContext;
                    this.getOutputFormats = httpRequestData;
                    this.getOutputMinFrameDuration = bufferedSource;
                    this.getInputSizeshNQ4ISI = intRef;
                    this.getInputFormats = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.write$default(channel, 0, function1, this, 1, null) != coroutine_suspended) {
                        writerScope2 = writerScope;
                        coroutineContext2 = coroutineContext;
                        httpRequestData2 = httpRequestData;
                        bufferedSource2 = bufferedSource;
                        closeable2 = closeable;
                        intRef2 = intRef;
                        io.ktor.utils.io.ByteWriteChannel channel2 = writerScope2.getChannel();
                        this.getHighSpeedVideoSizesFor = writerScope2;
                        this.getHighSpeedVideoFpsRangesFor = closeable2;
                        this.getHighSpeedVideoSizes = coroutineContext2;
                        this.getOutputFormats = httpRequestData2;
                        this.getOutputMinFrameDuration = bufferedSource2;
                        this.getInputSizeshNQ4ISI = intRef2;
                        this.getInputFormats = 2;
                    }
                    return coroutine_suspended;
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                th2 = null;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                    }
                }
                if (th2 == null) {
                    return kotlin.Unit.INSTANCE;
                }
                throw th2;
            }
            intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.getInputSizeshNQ4ISI;
            bufferedSource2 = (okio.BufferedSource) this.getOutputMinFrameDuration;
            httpRequestData2 = (io.ktor.client.request.HttpRequestData) this.getOutputFormats;
            coroutineContext2 = (kotlin.coroutines.CoroutineContext) this.getHighSpeedVideoSizes;
            closeable2 = (java.io.Closeable) this.getHighSpeedVideoFpsRangesFor;
            writerScope2 = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ByteWriteChannel channel22 = writerScope2.getChannel();
            this.getHighSpeedVideoSizesFor = writerScope2;
            this.getHighSpeedVideoFpsRangesFor = closeable2;
            this.getHighSpeedVideoSizes = coroutineContext2;
            this.getOutputFormats = httpRequestData2;
            this.getOutputMinFrameDuration = bufferedSource2;
            this.getInputSizeshNQ4ISI = intRef2;
            this.getInputFormats = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.IntRef intRef, okio.BufferedSource bufferedSource, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.CoroutineContext coroutineContext, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object m23436constructorimpl;
        try {
            intRef.element = bufferedSource.read(byteBuffer);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            th = th;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlinx.coroutines.JobKt.getJob(coroutineContext).getCancellationException());
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) m23436constructorimpl;
            if (cancellationException != null) {
                th = cancellationException;
            }
            throw io.ktor.client.engine.okhttp.OkHttpEngineKt.access$mapExceptions(th, httpRequestData);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1 okHttpEngineKt$toChannel$1 = new io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        okHttpEngineKt$toChannel$1.getHighSpeedVideoSizesFor = obj;
        return okHttpEngineKt$toChannel$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngineKt$toChannel$1(okio.BufferedSource bufferedSource, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bufferedSource;
        this.Camera2StreamConfigurationMap = coroutineContext;
        this.getHighResolutionOutputSizeshNQ4ISI = httpRequestData;
    }
}
