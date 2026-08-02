package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {22, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class ByteChannelUtilsKt$observable$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.Long Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.content.ProgressListener getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:2)|(3:(1:(1:(1:(6:8|9|10|11|12|13)(2:20|21))(3:22|23|24))(9:69|70|71|72|41|42|43|(4:45|26|27|(5:29|30|31|32|(4:34|35|36|(2:38|(5:40|41|42|43|(0)))(4:49|26|27|(7:56|57|(1:61)|64|11|12|13)(0))))(0))|53))(7:76|77|78|79|35|36|(0)(0))|18|19)(3:83|84|85)|25|26|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b1, code lost:
    
        if (r20.onProgress(r11, r21, r24) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #4 {all -> 0x01c4, blocks: (B:27:0x00e0, B:29:0x00e6), top: B:26:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c A[Catch: all -> 0x0179, TRY_LEAVE, TryCatch #6 {all -> 0x0179, blocks: (B:36:0x0124, B:38:0x012c), top: B:35:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x016c -> B:26:0x00e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0176 -> B:26:0x00e0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.pool.ObjectPool objectPool;
        ?? r4;
        io.ktor.utils.io.WriterScope writerScope;
        io.ktor.utils.io.pool.ObjectPool<byte[]> byteArrayPool;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        io.ktor.client.content.ProgressListener progressListener;
        java.lang.Long l;
        byte[] bArr;
        long j;
        io.ktor.utils.io.pool.ObjectPool objectPool2;
        byte[] bArr2;
        java.lang.Long l2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i;
        io.ktor.utils.io.WriterScope writerScope2;
        java.lang.Object obj2;
        io.ktor.utils.io.WriterScope writerScope3;
        io.ktor.utils.io.pool.ObjectPool objectPool3;
        io.ktor.utils.io.pool.ObjectPool objectPool4;
        java.lang.Object obj3;
        io.ktor.utils.io.WriterScope writerScope4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        io.ktor.client.content.ProgressListener progressListener2;
        java.lang.Long l3;
        io.ktor.utils.io.pool.ObjectPool objectPool5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputSizeshNQ4ISI;
        int i3 = 2;
        int i4 = 1;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            writerScope = (io.ktor.utils.io.WriterScope) this.getOutputSizes;
            byteArrayPool = io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool();
            byteReadChannel = this.getHighSpeedVideoFpsRanges;
            progressListener = this.getHighResolutionOutputSizeshNQ4ISI;
            l = this.Camera2StreamConfigurationMap;
            ?? borrow = byteArrayPool.borrow();
            bArr = (byte[]) borrow;
            j = 0;
            objectPool5 = borrow;
        } else {
            if (i2 == 1) {
                long j2 = this.getHighSpeedVideoFpsRangesFor;
                byte[] bArr3 = (byte[]) this.getOutputStallDuration;
                r4 = this.getInputSizeshNQ4ISI;
                java.lang.Long l4 = (java.lang.Long) this.getHighSpeedVideoSizesFor;
                progressListener = (io.ktor.client.content.ProgressListener) this.getInputFormats;
                io.ktor.utils.io.ByteReadChannel byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) this.getOutputMinFrameDuration;
                io.ktor.utils.io.pool.ObjectPool objectPool6 = (io.ktor.utils.io.pool.ObjectPool) this.getOutputFormats;
                io.ktor.utils.io.WriterScope writerScope5 = (io.ktor.utils.io.WriterScope) this.getOutputSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectPool = r4;
                    writerScope2 = writerScope5;
                    j = j2;
                    obj2 = obj;
                    bArr2 = bArr3;
                    objectPool2 = objectPool6;
                    l2 = l4;
                    byteReadChannel2 = byteReadChannel4;
                    i = ((java.lang.Number) obj2).intValue();
                    if (i > 0) {
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectPool = objectPool6;
                }
            } else if (i2 == 2) {
                i = this.getHighSpeedVideoSizes;
                long j3 = this.getHighSpeedVideoFpsRangesFor;
                byte[] bArr4 = (byte[]) this.getOutputStallDuration;
                ?? r5 = this.getInputSizeshNQ4ISI;
                java.lang.Long l5 = (java.lang.Long) this.getHighSpeedVideoSizesFor;
                io.ktor.client.content.ProgressListener progressListener3 = (io.ktor.client.content.ProgressListener) this.getInputFormats;
                io.ktor.utils.io.ByteReadChannel byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) this.getOutputMinFrameDuration;
                objectPool = (io.ktor.utils.io.pool.ObjectPool) this.getOutputFormats;
                io.ktor.utils.io.WriterScope writerScope6 = (io.ktor.utils.io.WriterScope) this.getOutputSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    bArr2 = bArr4;
                    io.ktor.utils.io.WriterScope writerScope7 = writerScope6;
                    io.ktor.utils.io.pool.ObjectPool objectPool7 = r5;
                    byteReadChannel2 = byteReadChannel5;
                    l2 = l5;
                    progressListener = progressListener3;
                    long j4 = j3 + i;
                    try {
                        this.getOutputSizes = writerScope7;
                        this.getOutputFormats = objectPool;
                        this.getOutputMinFrameDuration = byteReadChannel2;
                        this.getInputFormats = progressListener;
                        this.getHighSpeedVideoSizesFor = l2;
                        this.getInputSizeshNQ4ISI = objectPool7;
                        this.getOutputStallDuration = bArr2;
                        this.getHighSpeedVideoFpsRangesFor = j4;
                        this.getOutputSizeshNQ4ISI = 3;
                        if (progressListener.onProgress(j4, l2, this) != coroutine_suspended) {
                            objectPool2 = objectPool;
                            i3 = 2;
                            i4 = 1;
                            objectPool = objectPool7;
                            j = j4;
                            writerScope3 = writerScope7;
                            if (!byteReadChannel2.isClosedForRead()) {
                                try {
                                    this.getOutputSizes = writerScope3;
                                    this.getOutputFormats = objectPool2;
                                    this.getOutputMinFrameDuration = byteReadChannel2;
                                    this.getInputFormats = progressListener;
                                    this.getHighSpeedVideoSizesFor = l2;
                                    this.getInputSizeshNQ4ISI = objectPool;
                                    this.getOutputStallDuration = bArr2;
                                    this.getHighSpeedVideoFpsRangesFor = j;
                                    this.getOutputSizeshNQ4ISI = i4;
                                    obj2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable$default(byteReadChannel2, bArr2, 0, 0, this, 6, null);
                                    if (obj2 != coroutine_suspended) {
                                        objectPool2 = objectPool3;
                                        writerScope2 = writerScope4;
                                        byteReadChannel2 = byteReadChannel3;
                                        progressListener = progressListener2;
                                        l2 = l3;
                                        try {
                                            i = ((java.lang.Number) obj2).intValue();
                                            if (i > 0) {
                                                i4 = 1;
                                                writerScope3 = writerScope2;
                                                if (!byteReadChannel2.isClosedForRead()) {
                                                    objectPool3 = objectPool2;
                                                    io.ktor.utils.io.WriterScope writerScope8 = writerScope3;
                                                    io.ktor.client.content.ProgressListener progressListener4 = progressListener;
                                                    java.lang.Long l6 = l2;
                                                    java.lang.Throwable closedCause = byteReadChannel2.getClosedCause();
                                                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(writerScope8.getChannel(), closedCause);
                                                    if (closedCause == null && j == 0) {
                                                        this.getOutputSizes = objectPool3;
                                                        this.getOutputFormats = objectPool;
                                                        this.getOutputMinFrameDuration = null;
                                                        this.getInputFormats = null;
                                                        this.getHighSpeedVideoSizesFor = null;
                                                        this.getInputSizeshNQ4ISI = null;
                                                        this.getOutputStallDuration = null;
                                                        this.getOutputSizeshNQ4ISI = 4;
                                                    }
                                                    objectPool4 = objectPool3;
                                                    obj3 = objectPool;
                                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                    objectPool4.recycle(obj3);
                                                    return kotlin.Unit.INSTANCE;
                                                }
                                            } else {
                                                io.ktor.utils.io.ByteWriteChannel channel = writerScope2.getChannel();
                                                this.getOutputSizes = writerScope2;
                                                this.getOutputFormats = objectPool2;
                                                this.getOutputMinFrameDuration = byteReadChannel2;
                                                this.getInputFormats = progressListener;
                                                this.getHighSpeedVideoSizesFor = l2;
                                                this.getInputSizeshNQ4ISI = objectPool;
                                                this.getOutputStallDuration = bArr2;
                                                this.getHighSpeedVideoFpsRangesFor = j;
                                                this.getHighSpeedVideoSizes = i;
                                                this.getOutputSizeshNQ4ISI = i3;
                                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(channel, bArr2, 0, i, this) != coroutine_suspended) {
                                                    io.ktor.utils.io.pool.ObjectPool objectPool8 = objectPool;
                                                    objectPool = objectPool2;
                                                    j3 = j;
                                                    objectPool7 = objectPool8;
                                                    writerScope7 = writerScope2;
                                                    long j42 = j3 + i;
                                                    this.getOutputSizes = writerScope7;
                                                    this.getOutputFormats = objectPool;
                                                    this.getOutputMinFrameDuration = byteReadChannel2;
                                                    this.getInputFormats = progressListener;
                                                    this.getHighSpeedVideoSizesFor = l2;
                                                    this.getInputSizeshNQ4ISI = objectPool7;
                                                    this.getOutputStallDuration = bArr2;
                                                    this.getHighSpeedVideoFpsRangesFor = j42;
                                                    this.getOutputSizeshNQ4ISI = 3;
                                                    if (progressListener.onProgress(j42, l2, this) != coroutine_suspended) {
                                                    }
                                                }
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            r4 = objectPool;
                                            objectPool = objectPool2;
                                            objectPool.recycle(r4);
                                            throw th;
                                        }
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    objectPool2 = objectPool3;
                                    r4 = objectPool;
                                    objectPool = objectPool2;
                                    objectPool.recycle(r4);
                                    throw th;
                                }
                                objectPool3 = objectPool2;
                                writerScope4 = writerScope3;
                                byteReadChannel3 = byteReadChannel2;
                                progressListener2 = progressListener;
                                l3 = l2;
                            }
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        r4 = objectPool7;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r4 = r5;
                }
            } else if (i2 == 3) {
                long j5 = this.getHighSpeedVideoFpsRangesFor;
                bArr = (byte[]) this.getOutputStallDuration;
                ?? r42 = this.getInputSizeshNQ4ISI;
                l = (java.lang.Long) this.getHighSpeedVideoSizesFor;
                progressListener = (io.ktor.client.content.ProgressListener) this.getInputFormats;
                byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.getOutputMinFrameDuration;
                byteArrayPool = (io.ktor.utils.io.pool.ObjectPool) this.getOutputFormats;
                writerScope = (io.ktor.utils.io.WriterScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                j = j5;
                objectPool5 = r42;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = this.getOutputFormats;
                objectPool4 = (io.ktor.utils.io.pool.ObjectPool) this.getOutputSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    objectPool4.recycle(obj3);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    r4 = obj3;
                    objectPool = objectPool4;
                }
            }
            objectPool.recycle(r4);
            throw th;
        }
        io.ktor.utils.io.WriterScope writerScope9 = writerScope;
        bArr2 = bArr;
        objectPool2 = byteArrayPool;
        objectPool = objectPool5;
        r4 = writerScope9;
        io.ktor.utils.io.ByteReadChannel byteReadChannel6 = byteReadChannel;
        l2 = l;
        byteReadChannel2 = byteReadChannel6;
        writerScope3 = r4;
        if (!byteReadChannel2.isClosedForRead()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.utils.ByteChannelUtilsKt$observable$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.utils.ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new io.ktor.client.utils.ByteChannelUtilsKt$observable$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        byteChannelUtilsKt$observable$1.getOutputSizes = obj;
        return byteChannelUtilsKt$observable$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelUtilsKt$observable$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.content.ProgressListener progressListener, java.lang.Long l, kotlin.coroutines.Continuation<? super io.ktor.client.utils.ByteChannelUtilsKt$observable$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = byteReadChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = progressListener;
        this.Camera2StreamConfigurationMap = l;
    }
}
