package io.ktor.util;

/* compiled from: ByteChannels.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 32}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class ByteChannelsKt$split$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteChannel $first;
    final /* synthetic */ io.ktor.utils.io.ByteChannel $second;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel $this_split;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$split$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.utils.io.ByteChannel byteChannel2, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1> continuation) {
        super(2, continuation);
        this.$this_split = byteReadChannel;
        this.$first = byteChannel;
        this.$second = byteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.ByteChannelsKt$split$1 byteChannelsKt$split$1 = new io.ktor.util.ByteChannelsKt$split$1(this.$this_split, this.$first, this.$second, continuation);
        byteChannelsKt$split$1.L$0 = obj;
        return byteChannelsKt$split$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.ByteChannelsKt$split$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r14 = r1;
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0016, B:9:0x0045, B:11:0x004d, B:37:0x00b9, B:40:0x00d3, B:45:0x002b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:17:0x0067, B:19:0x006f), top: B:16:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0016, B:9:0x0045, B:11:0x004d, B:37:0x00b9, B:40:0x00d3, B:45:0x002b), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        byte[] bArr;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        int intValue;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        byte[] bArr2 = this.label;
        try {
            if (bArr2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                bArr2 = io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().borrow();
            } else if (bArr2 == 1) {
                byte[] bArr3 = (byte[]) this.L$1;
                kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                bArr = bArr3;
                coroutineScope2 = coroutineScope3;
                try {
                    intValue = ((java.lang.Number) obj).intValue();
                    if (intValue > 0) {
                        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1(this.$first, bArr, intValue, null), 3, null);
                        async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2(this.$second, bArr, intValue, null), 3, null);
                        kotlinx.coroutines.Deferred[] deferredArr = {async$default, async$default2};
                        this.L$0 = coroutineScope2;
                        this.L$1 = bArr;
                        this.label = 2;
                        if (kotlinx.coroutines.AwaitKt.awaitAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) deferredArr), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    coroutineScope = coroutineScope2;
                    bArr2 = bArr;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr2 = bArr;
                    try {
                        this.$this_split.cancel(th);
                        this.$first.cancel(th);
                        this.$second.cancel(th);
                        io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr2);
                        this.$first.close();
                        this.$second.close();
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr2);
                        this.$first.close();
                        this.$second.close();
                        throw th2;
                    }
                }
            } else {
                if (bArr2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr2 = (byte[]) this.L$1;
                kotlinx.coroutines.CoroutineScope coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        if (this.$this_split.isClosedForRead()) {
            this.L$0 = coroutineScope;
            this.L$1 = bArr2;
            this.label = 1;
            java.lang.Object readAvailable$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable$default(this.$this_split, bArr2, 0, 0, this, 6, null);
            if (readAvailable$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            bArr = bArr2;
            coroutineScope2 = coroutineScope;
            obj = readAvailable$default;
            intValue = ((java.lang.Number) obj).intValue();
            if (intValue > 0) {
            }
            coroutineScope = coroutineScope2;
            bArr2 = bArr;
            if (this.$this_split.isClosedForRead()) {
                java.lang.Throwable closedCause = this.$this_split.getClosedCause();
                if (closedCause != null) {
                    throw closedCause;
                }
                io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool().recycle(bArr2);
                this.$first.close();
                this.$second.close();
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* compiled from: ByteChannels.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ io.ktor.utils.io.ByteChannel $first;
        final /* synthetic */ int $read;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(io.ktor.utils.io.ByteChannel byteChannel, byte[] bArr, int i, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$first = byteChannel;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1(this.$first, this.$buffer, this.$read, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.util.ByteChannelsKt$split$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(this.$first, this.$buffer, 0, this.$read, this) == coroutine_suspended) {
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
    }

    /* compiled from: ByteChannels.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ int $read;
        final /* synthetic */ io.ktor.utils.io.ByteChannel $second;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(io.ktor.utils.io.ByteChannel byteChannel, byte[] bArr, int i, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$second = byteChannel;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2(this.$second, this.$buffer, this.$read, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.util.ByteChannelsKt$split$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(this.$second, this.$buffer, 0, this.$read, this) == coroutine_suspended) {
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
    }
}
