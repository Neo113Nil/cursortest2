package com.unity3d.ads.core.data.repository;

/* compiled from: FocusRepository.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusRepository;", "", "getLifecycleFlow", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lkotlinx/coroutines/CoroutineDispatcher;)V", "focusState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "getFocusState", "()Lkotlinx/coroutines/flow/SharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FocusRepository {
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.repository.FocusState> focusState;

    public FocusRepository(com.unity3d.ads.core.domain.AndroidGetLifecycleFlow getLifecycleFlow, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLifecycleFlow, "getLifecycleFlow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        try {
            final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.LifecycleEvent> invoke = getLifecycleFlow.invoke();
            final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.LifecycleEvent> flow = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.LifecycleEvent>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object L$0;
                        java.lang.Object L$1;
                        int label;
                        /* synthetic */ java.lang.Object result;

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                java.lang.Object obj2 = anonymousClass1.result;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                    com.unity3d.ads.core.domain.LifecycleEvent lifecycleEvent = (com.unity3d.ads.core.domain.LifecycleEvent) obj;
                                    if ((lifecycleEvent instanceof com.unity3d.ads.core.domain.LifecycleEvent.Paused) || (lifecycleEvent instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed)) {
                                        anonymousClass1.label = 1;
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
                        anonymousClass1 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.result;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.domain.LifecycleEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            };
            MutableSharedFlow$default = kotlinx.coroutines.flow.FlowKt.shareIn(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.repository.FocusState>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object L$0;
                        int label;
                        /* synthetic */ java.lang.Object result;

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                java.lang.Object obj2 = anonymousClass1.result;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                    com.unity3d.ads.core.domain.LifecycleEvent lifecycleEvent = (com.unity3d.ads.core.domain.LifecycleEvent) obj;
                                    com.unity3d.ads.core.data.repository.FocusState focused = lifecycleEvent instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed ? new com.unity3d.ads.core.data.repository.FocusState.Focused(lifecycleEvent.getActivity()) : new com.unity3d.ads.core.data.repository.FocusState.Unfocused(lifecycleEvent.getActivity());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(focused, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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
                        anonymousClass1 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.result;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.repository.FocusState> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            }, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(defaultDispatcher), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), 1);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.error("Could not subscribe to lifecycle flow", e);
            MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        }
        this.focusState = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.repository.FocusState> getFocusState() {
        return this.focusState;
    }
}
