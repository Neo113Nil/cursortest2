package androidx.compose.runtime;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {143, 147, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
/* loaded from: classes3.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        if (r14 == r0) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6 A[Catch: all -> 0x0038, TryCatch #4 {all -> 0x0038, blocks: (B:11:0x0033, B:12:0x00d2, B:14:0x00d6, B:18:0x00e0, B:22:0x00ee, B:28:0x0104, B:30:0x010d, B:40:0x012b, B:41:0x012e, B:24:0x00f9, B:27:0x0101, B:36:0x0126, B:37:0x0129), top: B:10:0x0033, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #4 {all -> 0x0038, blocks: (B:11:0x0033, B:12:0x00d2, B:14:0x00d6, B:18:0x00e0, B:22:0x00ee, B:28:0x0104, B:30:0x010d, B:40:0x012b, B:41:0x012e, B:24:0x00f9, B:27:0x0101, B:36:0x0126, B:37:0x0129), top: B:10:0x0033, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ec -> B:41:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x010b -> B:41:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0122 -> B:31:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle;
        ?? r11;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle2;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object obj2;
        androidx.collection.MutableScatterSet mutableScatterSet;
        java.lang.Object obj3;
        boolean highSpeedVideoFpsRanges;
        kotlinx.coroutines.channels.Channel channel2;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function12;
        androidx.collection.MutableScatterSet mutableScatterSet2;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
            final androidx.collection.MutableScatterSet mutableScatterSet3 = new androidx.collection.MutableScatterSet(0, 1, null);
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function13 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.getHighResolutionOutputSizeshNQ4ISI(androidx.collection.MutableScatterSet.this, obj4);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            androidx.compose.runtime.snapshots.ObserverHandle registerApplyObserver = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.registerApplyObserver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.Channel.this, (java.util.Set) obj4);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            try {
                androidx.compose.runtime.snapshots.Snapshot takeSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeSnapshot(function13);
                kotlin.jvm.functions.Function0<T> function0 = this.getHighSpeedVideoFpsRanges;
                try {
                    androidx.compose.runtime.snapshots.Snapshot makeCurrent = takeSnapshot.makeCurrent();
                    try {
                        T invoke = function0.invoke();
                        takeSnapshot.dispose();
                        this.getHighSpeedVideoSizesFor = flowCollector2;
                        this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet3;
                        this.getHighSpeedVideoFpsRangesFor = function13;
                        this.Camera2StreamConfigurationMap = Channel$default;
                        this.getOutputFormats = registerApplyObserver;
                        this.getInputFormats = invoke;
                        this.getInputSizeshNQ4ISI = 1;
                        if (flowCollector2.emit(invoke, this) != coroutine_suspended) {
                            r11 = flowCollector2;
                            function1 = function13;
                            observerHandle2 = registerApplyObserver;
                            channel = Channel$default;
                            obj2 = invoke;
                            mutableScatterSet = mutableScatterSet3;
                            this.getHighSpeedVideoSizesFor = r11;
                            this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet;
                            this.getHighSpeedVideoFpsRangesFor = function1;
                            this.Camera2StreamConfigurationMap = channel;
                            this.getOutputFormats = observerHandle2;
                            this.getInputFormats = obj2;
                            this.getHighSpeedVideoSizes = 0;
                            this.getInputSizeshNQ4ISI = 2;
                            obj = channel.receive(this);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } finally {
                    }
                } finally {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                observerHandle = registerApplyObserver;
            }
        } else {
            try {
                try {
                    if (i != 1) {
                        if (i == 2) {
                            int i2 = this.getHighSpeedVideoSizes;
                            obj2 = this.getInputFormats;
                            observerHandle2 = (androidx.compose.runtime.snapshots.ObserverHandle) this.getOutputFormats;
                            channel = (kotlinx.coroutines.channels.Channel) this.Camera2StreamConfigurationMap;
                            function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
                            mutableScatterSet = (androidx.collection.MutableScatterSet) this.getHighResolutionOutputSizeshNQ4ISI;
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                r11 = flowCollector3;
                                java.util.Set set = (java.util.Set) obj;
                                do {
                                    if (i2 == 0) {
                                        highSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.getHighSpeedVideoFpsRanges(mutableScatterSet, set);
                                        if (!highSpeedVideoFpsRanges) {
                                            i2 = 0;
                                            set = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel.mo24073tryReceivePtdJZtk());
                                        }
                                    }
                                    i2 = 1;
                                    set = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel.mo24073tryReceivePtdJZtk());
                                } while (set != null);
                                if (i2 != 0) {
                                    mutableScatterSet.clear();
                                    androidx.compose.runtime.snapshots.Snapshot takeSnapshot2 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeSnapshot(function1);
                                    kotlin.jvm.functions.Function0<T> function02 = this.getHighSpeedVideoFpsRanges;
                                    try {
                                        try {
                                            obj3 = function02.invoke();
                                            takeSnapshot2.dispose();
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj3, obj2)) {
                                                this.getHighSpeedVideoSizesFor = r11;
                                                this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet;
                                                this.getHighSpeedVideoFpsRangesFor = function1;
                                                this.Camera2StreamConfigurationMap = channel;
                                                this.getOutputFormats = observerHandle2;
                                                this.getInputFormats = obj3;
                                                this.getInputSizeshNQ4ISI = 3;
                                                java.lang.Object emit = r11.emit(obj3, this);
                                                r11 = r11;
                                            }
                                        } finally {
                                        }
                                        androidx.compose.runtime.snapshots.Snapshot makeCurrent2 = takeSnapshot2.makeCurrent();
                                    } finally {
                                    }
                                }
                                this.getHighSpeedVideoSizesFor = r11;
                                this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet;
                                this.getHighSpeedVideoFpsRangesFor = function1;
                                this.Camera2StreamConfigurationMap = channel;
                                this.getOutputFormats = observerHandle2;
                                this.getInputFormats = obj2;
                                this.getHighSpeedVideoSizes = 0;
                                this.getInputSizeshNQ4ISI = 2;
                                obj = channel.receive(this);
                                if (obj != coroutine_suspended) {
                                    i2 = 0;
                                    r11 = r11;
                                    java.util.Set set2 = (java.util.Set) obj;
                                    do {
                                        if (i2 == 0) {
                                        }
                                        i2 = 1;
                                        set2 = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel.mo24073tryReceivePtdJZtk());
                                    } while (set2 != null);
                                    if (i2 != 0) {
                                    }
                                    this.getHighSpeedVideoSizesFor = r11;
                                    this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet;
                                    this.getHighSpeedVideoFpsRangesFor = function1;
                                    this.Camera2StreamConfigurationMap = channel;
                                    this.getOutputFormats = observerHandle2;
                                    this.getInputFormats = obj2;
                                    this.getHighSpeedVideoSizes = 0;
                                    this.getInputSizeshNQ4ISI = 2;
                                    obj = channel.receive(this);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        } else if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    this.getHighSpeedVideoSizesFor = r11;
                    this.getHighResolutionOutputSizeshNQ4ISI = mutableScatterSet;
                    this.getHighSpeedVideoFpsRangesFor = function1;
                    this.Camera2StreamConfigurationMap = channel;
                    this.getOutputFormats = observerHandle2;
                    this.getInputFormats = obj2;
                    this.getHighSpeedVideoSizes = 0;
                    this.getInputSizeshNQ4ISI = 2;
                    obj = channel.receive(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    observerHandle = observerHandle2;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                r11 = flowCollector;
                mutableScatterSet = mutableScatterSet2;
                function1 = function12;
                channel = channel2;
                observerHandle2 = observerHandle;
                obj2 = obj3;
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
            obj3 = this.getInputFormats;
            observerHandle = (androidx.compose.runtime.snapshots.ObserverHandle) this.getOutputFormats;
            channel2 = (kotlinx.coroutines.channels.Channel) this.Camera2StreamConfigurationMap;
            function12 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
            mutableScatterSet2 = (androidx.collection.MutableScatterSet) this.getHighResolutionOutputSizeshNQ4ISI;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
        }
        observerHandle2 = observerHandle;
        observerHandle2.dispose();
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.collection.MutableScatterSet mutableScatterSet, java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
            androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
            ((androidx.compose.runtime.snapshots.StateObjectImpl) obj).m5492recordReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(4));
        }
        mutableScatterSet.add(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.Channel channel, java.util.Set set) {
        if (set instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
            androidx.collection.ScatterSet<T> set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) set).getSet$runtime();
            java.lang.Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                java.lang.Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof androidx.compose.runtime.snapshots.StateObjectImpl)) {
                                    break loop0;
                                }
                                androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                if (((androidx.compose.runtime.snapshots.StateObjectImpl) obj).m5491isReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(4))) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            java.util.Set set2 = set;
            if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                for (T t : set2) {
                    if (t instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                        if (((androidx.compose.runtime.snapshots.StateObjectImpl) t).m5491isReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(4))) {
                        }
                    }
                    channel.mo9266trySendJP2dKIU(set);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.getHighSpeedVideoSizesFor = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
