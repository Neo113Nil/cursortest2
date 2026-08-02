package androidx.paging;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aC\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\r\u0010\t\u001ac\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/paging/PagingData;", "Ljava/util/concurrent/Executor;", "p0", "Lkotlin/Function1;", "p1", "map", "(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Landroidx/paging/PagingData;", "", "flatMap", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Landroidx/paging/TerminalSeparatorType;", "Lkotlin/Function2;", "p2", "insertSeparators", "(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingData;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/paging/PagingDataTransforms")
/* loaded from: classes7.dex */
final /* synthetic */ class PagingDataTransforms__PagingDataTransforms_jvmKt {
    public static /* synthetic */ androidx.paging.PagingData insertSeparators$default(androidx.paging.PagingData pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            terminalSeparatorType = androidx.paging.TerminalSeparatorType.FULLY_COMPLETE;
        }
        return androidx.paging.PagingDataTransforms.insertSeparators(pagingData, terminalSeparatorType, executor, function2);
    }

    public static final <R, T extends R> androidx.paging.PagingData<R> insertSeparators(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.insertSeparators(pagingData, terminalSeparatorType, new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1(executor, function2, null));
    }

    public static final <T, R> androidx.paging.PagingData<R> map(androidx.paging.PagingData<T> pagingData, final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData<>(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
                
                    if (r10.emit(r11, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.Camera2StreamConfigurationMap;
                                kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(this.getHighResolutionOutputSizeshNQ4ISI);
                                androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 pagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1((androidx.paging.PageEvent) obj, this.getHighSpeedVideoFpsRanges, null);
                                anonymousClass1.getHighSpeedVideoSizes = flowCollector2;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(from, pagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1, anonymousClass1);
                                if (withContext != coroutine_suspended) {
                                    obj2 = withContext;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighSpeedVideoSizes = null;
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1 function1) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = executor;
                    this.getHighSpeedVideoFpsRanges = function1;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1.AnonymousClass2(flowCollector, executor, function1), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final <T, R> androidx.paging.PagingData<R> flatMap(androidx.paging.PagingData<T> pagingData, final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData<>(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
                
                    if (r10.emit(r11, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.Camera2StreamConfigurationMap;
                                kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(this.getHighResolutionOutputSizeshNQ4ISI);
                                androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1 pagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1((androidx.paging.PageEvent) obj, this.getHighSpeedVideoFpsRanges, null);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(from, pagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1, anonymousClass1);
                                if (withContext != coroutine_suspended) {
                                    obj2 = withContext;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                            anonymousClass1.Camera2StreamConfigurationMap = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                    anonymousClass1.Camera2StreamConfigurationMap = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1 function1) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = executor;
                    this.getHighSpeedVideoFpsRanges = function1;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1.AnonymousClass2(flowCollector, executor, function1), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final <T> androidx.paging.PagingData<T> filter(androidx.paging.PagingData<T> pagingData, final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData<>(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
                
                    if (r10.emit(r11, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoSizes;
                                kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(this.getHighResolutionOutputSizeshNQ4ISI);
                                androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 pagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1((androidx.paging.PageEvent) obj, this.getHighSpeedVideoFpsRanges, null);
                                anonymousClass1.getHighSpeedVideoFpsRanges = flowCollector2;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(from, pagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1, anonymousClass1);
                                if (withContext != coroutine_suspended) {
                                    obj2 = withContext;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighSpeedVideoFpsRanges = null;
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoFpsRanges = null;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1 function1) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = executor;
                    this.getHighSpeedVideoFpsRanges = function1;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1.AnonymousClass2(flowCollector, executor, function1), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final <R, T extends R> androidx.paging.PagingData<R> insertSeparators(androidx.paging.PagingData<T> pagingData, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return insertSeparators$default(pagingData, null, executor, function2, 1, null);
    }
}
