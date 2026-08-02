package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 32}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class ByteChannelsKt$split$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:7:0x0016, B:8:0x0045, B:10:0x004d, B:14:0x0064, B:16:0x006c, B:23:0x00b3, B:28:0x00c3, B:33:0x002a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:7:0x0016, B:8:0x0045, B:10:0x004d, B:14:0x0064, B:16:0x006c, B:23:0x00b3, B:28:0x00c3, B:33:0x002a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:7:0x0016, B:8:0x0045, B:10:0x004d, B:14:0x0064, B:16:0x006c, B:23:0x00b3, B:28:0x00c3, B:33:0x002a), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [byte[]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        int intValue;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (bArr == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
                bArr = io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().borrow();
            } else if (bArr == 1) {
                byte[] bArr2 = (byte[]) this.getHighSpeedVideoFpsRangesFor;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                bArr = bArr2;
                kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                intValue = ((java.lang.Number) obj).intValue();
                if (intValue > 0) {
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1(this.getHighSpeedVideoSizes, bArr, intValue, null), 3, null);
                    async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, bArr, intValue, null), 3, null);
                    kotlinx.coroutines.Deferred[] deferredArr = {async$default, async$default2};
                    this.getHighSpeedVideoSizesFor = coroutineScope2;
                    this.getHighSpeedVideoFpsRangesFor = bArr;
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    if (kotlinx.coroutines.AwaitKt.awaitAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) deferredArr), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                coroutineScope = coroutineScope2;
            } else {
                if (bArr != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.getHighSpeedVideoFpsRangesFor;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Throwable th) {
            try {
                this.Camera2StreamConfigurationMap.cancel(th);
                this.getHighSpeedVideoSizes.cancel(th);
                this.getHighSpeedVideoFpsRanges.cancel(th);
                io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
            } catch (java.lang.Throwable th2) {
                io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
                this.getHighSpeedVideoSizes.close();
                this.getHighSpeedVideoFpsRanges.close();
                throw th2;
            }
        }
        if (this.Camera2StreamConfigurationMap.isClosedForRead()) {
            this.getHighSpeedVideoSizesFor = coroutineScope;
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable$default(this.Camera2StreamConfigurationMap, bArr, 0, 0, this, 6, null);
            if (obj != coroutine_suspended) {
                bArr = bArr;
                kotlinx.coroutines.CoroutineScope coroutineScope22 = coroutineScope;
                intValue = ((java.lang.Number) obj).intValue();
                if (intValue > 0) {
                }
                coroutineScope = coroutineScope22;
                if (this.Camera2StreamConfigurationMap.isClosedForRead()) {
                    java.lang.Throwable closedCause = this.Camera2StreamConfigurationMap.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
                    this.getHighSpeedVideoSizes.close();
                    this.getHighSpeedVideoFpsRanges.close();
                    return kotlin.Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ io.ktor.utils.io.ByteChannel getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(io.ktor.utils.io.ByteChannel byteChannel, byte[] bArr, int i, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = byteChannel;
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.getHighSpeedVideoSizes = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ int Camera2StreamConfigurationMap;
        final /* synthetic */ io.ktor.utils.io.ByteChannel getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ byte[] getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, 0, this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(io.ktor.utils.io.ByteChannel byteChannel, byte[] bArr, int i, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = byteChannel;
            this.getHighSpeedVideoFpsRanges = bArr;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.ByteChannelsKt$split$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.ByteChannelsKt$split$1 byteChannelsKt$split$1 = new io.ktor.util.ByteChannelsKt$split$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        byteChannelsKt$split$1.getHighSpeedVideoSizesFor = obj;
        return byteChannelsKt$split$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$split$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.utils.io.ByteChannel byteChannel2, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = byteReadChannel;
        this.getHighSpeedVideoSizes = byteChannel;
        this.getHighSpeedVideoFpsRanges = byteChannel2;
    }
}
