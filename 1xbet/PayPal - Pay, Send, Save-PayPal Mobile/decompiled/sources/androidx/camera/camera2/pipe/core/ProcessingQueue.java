package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001+BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R6\u0010#\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u001f\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010*"}, d2 = {"Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "T", "", "", "capacity", "Lkotlin/Function1;", "", "", "onUnprocessedElements", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "process", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "element", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitChecked", "(Ljava/lang/Object;)V", "", "tryEmit", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "(Ljava/lang/Throwable;)V", com.visa.cbp.getEncExpo.warmup, "getCapacity", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/coroutines/channels/Channel;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessingQueue<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.core.ProcessingQueue.Companion INSTANCE = new androidx.camera.camera2.pipe.core.ProcessingQueue.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<T> getHighSpeedVideoSizes;
    private final int capacity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.collections.ArrayDeque<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.util.List<? extends T>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.util.List<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessingQueue(int i, kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super java.util.List<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.capacity = i;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(false);
        this.getHighSpeedVideoSizes = kotlinx.coroutines.channels.ChannelKt.Channel$default(i, null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.core.ProcessingQueue$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.core.ProcessingQueue.$r8$lambda$S7l7sqMHhvUaxQ5VH8QW7tCGrXU(androidx.camera.camera2.pipe.core.ProcessingQueue.this, obj);
            }
        }, 2, null);
        this.Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public /* synthetic */ ProcessingQueue(int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.core.ProcessingQueue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.core.ProcessingQueue.m882$r8$lambda$WIhvWBrNSeX5RqXKtseOPkvHt4((java.util.List) obj);
            }
        } : function1, function2);
    }

    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = this.getHighSpeedVideoSizes.send(t, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    public final void emitChecked(T element) {
        java.lang.Object obj = this.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(element);
        if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to emit item to ProcessingQueue!: ");
        sb.append((java.lang.Object) kotlinx.coroutines.channels.ChannelResult.m24090toStringimpl(obj));
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public final boolean tryEmit(T element) {
        return kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(this.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (r2 != r6.Camera2StreamConfigurationMap.size()) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:12:0x002b, B:13:0x0088, B:15:0x004d, B:17:0x0057, B:18:0x005d, B:20:0x0063, B:22:0x0073, B:27:0x003e, B:29:0x0048, B:33:0x0037), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:12:0x002b, B:13:0x0088, B:15:0x004d, B:17:0x0057, B:18:0x005d, B:20:0x0063, B:22:0x0073, B:27:0x003e, B:29:0x0048, B:33:0x0037), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:13:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1 processingQueue$processingLoop$1;
        int i;
        java.lang.Object receive;
        int size;
        try {
            if (continuation instanceof androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1) {
                processingQueue$processingLoop$1 = (androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1) continuation;
                if ((processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = processingQueue$processingLoop$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.Channel<T> channel = this.getHighSpeedVideoSizes;
                        processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges = 1;
                        receive = channel.receive(processingQueue$processingLoop$1);
                        if (receive != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.Camera2StreamConfigurationMap.add(obj);
                        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
                            java.lang.Object obj2 = this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk();
                            while (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
                                this.Camera2StreamConfigurationMap.add(kotlinx.coroutines.channels.ChannelResult.m24085getOrThrowimpl(obj2));
                                obj2 = this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk();
                            }
                            size = this.Camera2StreamConfigurationMap.size();
                            kotlin.jvm.functions.Function2<java.util.List<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
                            kotlin.collections.ArrayDeque<T> arrayDeque = this.Camera2StreamConfigurationMap;
                            processingQueue$processingLoop$1.getHighSpeedVideoSizes = size;
                            processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges = 2;
                            if (function2.invoke(arrayDeque, processingQueue$processingLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        kotlinx.coroutines.channels.Channel<T> channel2 = this.getHighSpeedVideoSizes;
                        processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges = 1;
                        receive = channel2.receive(processingQueue$processingLoop$1);
                        if (receive != coroutine_suspended) {
                            this.Camera2StreamConfigurationMap.add(receive);
                            if (!this.Camera2StreamConfigurationMap.isEmpty()) {
                            }
                            kotlinx.coroutines.channels.Channel<T> channel22 = this.getHighSpeedVideoSizes;
                            processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges = 1;
                            receive = channel22.receive(processingQueue$processingLoop$1);
                            if (receive != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = processingQueue$processingLoop$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes(th);
            throw th;
        }
        processingQueue$processingLoop$1 = new androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1(this, continuation);
        java.lang.Object obj3 = processingQueue$processingLoop$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = processingQueue$processingLoop$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(java.lang.Throwable p0) {
        if (this.getHighSpeedVideoSizes.close(p0)) {
            java.lang.Object obj = this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk();
            while (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj)) {
                this.Camera2StreamConfigurationMap.add(kotlinx.coroutines.channels.ChannelResult.m24085getOrThrowimpl(obj));
                obj = this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk();
            }
            if (this.Camera2StreamConfigurationMap.isEmpty()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.Camera2StreamConfigurationMap));
            this.Camera2StreamConfigurationMap.clear();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/core/ProcessingQueue$Companion;", "", "<init>", "()V", "T", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "processIn", "(Landroidx/camera/camera2/pipe/core/ProcessingQueue;Lkotlinx/coroutines/CoroutineScope;)Landroidx/camera/camera2/pipe/core/ProcessingQueue;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> androidx.camera.camera2.pipe.core.ProcessingQueue<T> processIn(androidx.camera.camera2.pipe.core.ProcessingQueue<T> processingQueue, kotlinx.coroutines.CoroutineScope coroutineScope) {
            kotlinx.coroutines.Job launch$default;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingQueue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
            if (((androidx.camera.camera2.pipe.core.ProcessingQueue) processingQueue).getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.camera.camera2.pipe.core.ProcessingQueue$Companion$processIn$job$1(processingQueue, null), 3, null);
                if (launch$default.isCancelled()) {
                    processingQueue.getHighSpeedVideoSizes((java.lang.Throwable) null);
                }
                return processingQueue;
            }
            throw new java.lang.IllegalStateException("ProcessingQueue cannot be re-started!".toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S7l7sqMHhvUaxQ5VH8QW7tCGrXU(androidx.camera.camera2.pipe.core.ProcessingQueue processingQueue, java.lang.Object obj) {
        processingQueue.Camera2StreamConfigurationMap.add(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WIhvWBrNSeX5RqXKtse-OPkvHt4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m882$r8$lambda$WIhvWBrNSeX5RqXKtseOPkvHt4(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }
}
