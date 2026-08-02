package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u001ab\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000b\u001al\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\t\u001a\u00020\f27\u0010\r\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0015\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0013\u0010\u0016\u001a3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018\u001ac\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000228\u0010\t\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0019¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001ag\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0004\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0086\b¢\u0006\u0004\b\u001f\u0010\u000b\u001aR\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022'\u0010\t\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b \u0010\u000b\"\u001a\u0010\"\u001a\u00020!8\u0006X\u0086T¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\"\u0017\u0010*\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/coroutines/Continuation;", "", "p0", "flatMapConcat", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "", "p1", "flatMapMerge", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcat", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "", "merge", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/Flow;", "", "([Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flattenMerge", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "transformLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "flatMapLatest", "mapLatest", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "()V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getDEFAULT_CONCURRENCY", "()I", "getHighResolutionOutputSizeshNQ4ISI"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__MergeKt {
    private static final int getHighSpeedVideoFpsRanges = kotlinx.coroutines.internal.SystemPropsKt.systemProp(kotlinx.coroutines.flow.FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flatMapMerge$default(kotlinx.coroutines.flow.Flow flow, int i, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = getHighSpeedVideoFpsRanges;
        }
        return kotlinx.coroutines.flow.FlowKt.flatMapMerge(flow, i, function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends T>... flowArr) {
        return kotlinx.coroutines.flow.FlowKt.merge(kotlin.collections.ArraysKt.asIterable(flowArr));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flattenMerge$default(kotlinx.coroutines.flow.Flow flow, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = getHighSpeedVideoFpsRanges;
        }
        return kotlinx.coroutines.flow.FlowKt.flattenMerge(flow, i);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow, int i) {
        if (i > 0) {
            return i == 1 ? kotlinx.coroutines.flow.FlowKt.flattenConcat(flow) : new kotlinx.coroutines.flow.internal.ChannelFlowMerge(flow, i, null, 0, null, 28, null);
        }
        throw new java.lang.IllegalArgumentException("Expected positive concurrency level, but had ".concat(java.lang.String.valueOf(i)).toString());
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest(function3, flow, null, 0, null, 28, null);
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(flow, new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1(function2, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(flow, new kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcat(final kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.flattenConcat(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function2 Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoSizes;
                                kotlin.jvm.functions.Function2 function2 = this.Camera2StreamConfigurationMap;
                                anonymousClass1.getHighSpeedVideoSizes = flowCollector2;
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                java.lang.Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj2 = invoke;
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
                            anonymousClass1.Camera2StreamConfigurationMap = 2;
                        }
                    }
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.Camera2StreamConfigurationMap = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.Camera2StreamConfigurationMap = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapMerge(final kotlinx.coroutines.flow.Flow<? extends T> flow, int i, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.flattenMerge(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRangesFor;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                java.lang.Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj2 = invoke;
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
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                    anonymousClass1.Camera2StreamConfigurationMap = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, i);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcat(final kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
