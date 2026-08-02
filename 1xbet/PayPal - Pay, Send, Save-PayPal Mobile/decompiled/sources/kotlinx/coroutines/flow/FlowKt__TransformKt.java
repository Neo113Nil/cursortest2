package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0002\u001aL\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001aL\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000b\u0010\u000e\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u000f\u0010\f\u001aa\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\b¢\u0006\u0004\b\u0013\u0010\b\u001ag\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0006\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\b¢\u0006\u0004\b\u0014\u0010\b\u001a)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0016\u0010\f\u001aG\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0018\u0010\b\u001ae\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u000122\u0010\u001a\u001a.\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0010\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001ae\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u000122\u0010\u001a\u001a.\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0010\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019¢\u0006\u0004\b\u001d\u0010\u001c\u001ak\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020!¢\u0006\u0004\b#\u0010$"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "p0", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "filterNot", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "filterIsInstance", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/reflect/KClass;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/reflect/KClass;)Lkotlinx/coroutines/flow/Flow;", "filterNotNull", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "map", "mapNotNull", "Lkotlin/collections/IndexedValue;", "withIndex", "", "onEach", "Lkotlin/Function3;", "p1", "scan", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "runningFold", "accumulator", "runningReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "", "", "chunked", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__TransformKt {
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scan(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.FlowKt.runningFold(flow, r, function3);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filter(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNot(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.Flow<R> filterIsInstance(kotlinx.coroutines.flow.Flow<?> flow) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(flow);
    }

    public static final <R> kotlinx.coroutines.flow.Flow<R> filterIsInstance(final kotlinx.coroutines.flow.Flow<?> flow, final kotlin.reflect.KClass<R> kClass) {
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.reflect.KClass Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                if (this.Camera2StreamConfigurationMap.isInstance(obj)) {
                                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighSpeedVideoFpsRanges;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.reflect.KClass kClass) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.Camera2StreamConfigurationMap = kClass;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2(flowCollector, kClass), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNotNull(final kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                if (t != null) {
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> map(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapNotNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<kotlin.collections.IndexedValue<T>> withIndex(final kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return new kotlinx.coroutines.flow.Flow<kotlin.collections.IndexedValue<? extends T>>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.collections.IndexedValue<? extends T>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1(flowCollector, new kotlin.jvm.internal.Ref.IntRef()), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onEach(final kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
                
                    if (r6.emit(r2, r0) != r1) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoSizes;
                                kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRangesFor;
                                anonymousClass1.getHighSpeedVideoSizes = t;
                                anonymousClass1.getHighSpeedVideoFpsRanges = flowCollector2;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (function2.invoke(t, anonymousClass1) != coroutine_suspended) {
                                    obj = t;
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
                            obj = anonymousClass1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighSpeedVideoSizes = null;
                            anonymousClass1.getHighSpeedVideoFpsRanges = null;
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        }
                    }
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.getHighSpeedVideoFpsRanges = null;
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 51}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> runningFold(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r, flow, function3);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> runningReduce(final kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1(objectRef, function3, flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<java.util.List<T>> chunked(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Expected positive chunk size, but got ".concat(java.lang.String.valueOf(i)).toString());
        }
        return new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(flow, i);
    }
}
