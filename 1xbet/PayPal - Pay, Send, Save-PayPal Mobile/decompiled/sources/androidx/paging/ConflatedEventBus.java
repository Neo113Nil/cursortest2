package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005R(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "send", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConflatedEventBus<T> {
    private final kotlinx.coroutines.flow.Flow<T> flow;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Pair<java.lang.Integer, T>> getHighResolutionOutputSizeshNQ4ISI;

    public ConflatedEventBus(T t) {
        kotlinx.coroutines.flow.MutableStateFlow<kotlin.Pair<java.lang.Integer, T>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new kotlin.Pair(Integer.MIN_VALUE, t));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Pair<java.lang.Integer, T>> mutableStateFlow = MutableStateFlow;
        this.flow = new kotlinx.coroutines.flow.Flow<T>() { // from class: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                java.lang.Object second = ((kotlin.Pair) obj).getSecond();
                                if (second != null) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                    if (flowCollector.emit(second, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", i = {}, l = {52}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public /* synthetic */ ConflatedEventBus(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public final kotlinx.coroutines.flow.Flow<T> getFlow() {
        return this.flow;
    }

    public final void send(T data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new kotlin.Pair<>(java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getFirst().intValue() + 1), data));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConflatedEventBus() {
        this(r0, 1, r0);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }
}
