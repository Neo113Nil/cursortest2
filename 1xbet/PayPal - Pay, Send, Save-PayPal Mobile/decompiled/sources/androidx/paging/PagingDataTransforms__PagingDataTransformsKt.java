package androidx.paging;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\b\u0004\u0010\u0007\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\n\u0010\t\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\f\u0010\t\u001aK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0004\b\u000e\u0010\t\u001ak\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u000f2.\u0010\u0011\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/paging/PagingData;", "Lkotlin/Function2;", "Landroidx/paging/PageEvent;", "Lkotlin/coroutines/Continuation;", "p0", "transform", "(Landroidx/paging/PagingData;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingData;", "map", "", "flatMap", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Landroidx/paging/TerminalSeparatorType;", "Lkotlin/Function3;", "p1", "insertSeparators", "(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)Landroidx/paging/PagingData;", "insertHeaderItem", "(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/lang/Object;)Landroidx/paging/PagingData;", "insertFooterItem"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/paging/PagingDataTransforms")
/* loaded from: classes7.dex */
public final /* synthetic */ class PagingDataTransforms__PagingDataTransformsKt {
    public static final <T, R> androidx.paging.PagingData<R> transform(androidx.paging.PagingData<T> pagingData, kotlin.jvm.functions.Function2<? super androidx.paging.PageEvent<T>, ? super kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return new androidx.paging.PagingData<>(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1(pagingData.getFlow$paging_common(), function2), pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static /* synthetic */ androidx.paging.PagingData insertSeparators$default(androidx.paging.PagingData pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            terminalSeparatorType = androidx.paging.TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertSeparators(pagingData, terminalSeparatorType, function3);
    }

    public static final /* synthetic */ androidx.paging.PagingData insertSeparators(androidx.paging.PagingData pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, kotlin.jvm.functions.Function3 function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return new androidx.paging.PagingData(androidx.paging.SeparatorsKt.insertEventSeparators(pagingData.getFlow$paging_common(), terminalSeparatorType, function3), pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static /* synthetic */ androidx.paging.PagingData insertHeaderItem$default(androidx.paging.PagingData pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            terminalSeparatorType = androidx.paging.TerminalSeparatorType.FULLY_COMPLETE;
        }
        return androidx.paging.PagingDataTransforms.insertHeaderItem(pagingData, terminalSeparatorType, obj);
    }

    public static final <T> androidx.paging.PagingData<T> insertHeaderItem(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return insertSeparators(pagingData, terminalSeparatorType, new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1(t, null));
    }

    public static /* synthetic */ androidx.paging.PagingData insertFooterItem$default(androidx.paging.PagingData pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            terminalSeparatorType = androidx.paging.TerminalSeparatorType.FULLY_COMPLETE;
        }
        return androidx.paging.PagingDataTransforms.insertFooterItem(pagingData, terminalSeparatorType, obj);
    }

    public static final <T> androidx.paging.PagingData<T> insertFooterItem(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return insertSeparators(pagingData, terminalSeparatorType, new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1(t, null));
    }

    public static final /* synthetic */ androidx.paging.PagingData map(androidx.paging.PagingData pagingData, final kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        final kotlinx.coroutines.flow.Flow flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                                kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                                anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                java.lang.Object map = ((androidx.paging.PageEvent) obj).map(function2, anonymousClass1);
                                if (map != coroutine_suspended) {
                                    obj2 = map;
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
                            anonymousClass1.getHighSpeedVideoFpsRanges = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final /* synthetic */ androidx.paging.PagingData flatMap(androidx.paging.PagingData pagingData, final kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        final kotlinx.coroutines.flow.Flow flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.getHighSpeedVideoFpsRangesFor;
                                kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                java.lang.Object flatMap = ((androidx.paging.PageEvent) obj).flatMap(function2, anonymousClass1);
                                if (flatMap != coroutine_suspended) {
                                    obj2 = flatMap;
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
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                            anonymousClass1.Camera2StreamConfigurationMap = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                    anonymousClass1.Camera2StreamConfigurationMap = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final /* synthetic */ androidx.paging.PagingData filter(androidx.paging.PagingData pagingData, final kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        final kotlinx.coroutines.flow.Flow flow$paging_common = pagingData.getFlow$paging_common();
        return new androidx.paging.PagingData(new kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.Camera2StreamConfigurationMap;
                                kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                                anonymousClass1.getHighSpeedVideoSizes = flowCollector2;
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                java.lang.Object filter = ((androidx.paging.PageEvent) obj).filter(function2, anonymousClass1);
                                if (filter != coroutine_suspended) {
                                    obj2 = filter;
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
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 2;
                        }
                    }
                    anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoSizes = null;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {52, 50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoSizes = function2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    public static final <T> androidx.paging.PagingData<T> insertHeaderItem(androidx.paging.PagingData<T> pagingData, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return insertHeaderItem$default(pagingData, null, t, 1, null);
    }

    public static final <T> androidx.paging.PagingData<T> insertFooterItem(androidx.paging.PagingData<T> pagingData, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return insertFooterItem$default(pagingData, null, t, 1, null);
    }
}
