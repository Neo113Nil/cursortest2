package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.ads.core.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: FocusRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusRepository;", "", "getLifecycleFlow", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/log/Logger;)V", "focusState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "getFocusState", "()Lkotlinx/coroutines/flow/SharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FocusRepository {
    private final SharedFlow<FocusState> focusState;
    private final Logger logger;

    public FocusRepository(AndroidGetLifecycleFlow getLifecycleFlow, CoroutineDispatcher defaultDispatcher, Logger logger) {
        MutableSharedFlow MutableSharedFlow$default;
        Intrinsics.checkNotNullParameter(getLifecycleFlow, "getLifecycleFlow");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        try {
            final Flow<LifecycleEvent> invoke = getLifecycleFlow.invoke();
            final Flow<LifecycleEvent> flow = new Flow<LifecycleEvent>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                                    if ((lifecycleEvent instanceof LifecycleEvent.Paused) || (lifecycleEvent instanceof LifecycleEvent.Resumed)) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super LifecycleEvent> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
            MutableSharedFlow$default = FlowKt.shareIn(new Flow<FocusState>() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        FocusState unfocused;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                                    if (lifecycleEvent instanceof LifecycleEvent.Resumed) {
                                        unfocused = new FocusState.Focused(((LifecycleEvent.Resumed) lifecycleEvent).getActivity());
                                    } else {
                                        unfocused = new FocusState.Unfocused(lifecycleEvent.getActivity());
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(unfocused, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FocusState> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }, CoroutineScopeKt.CoroutineScope(defaultDispatcher), SharingStarted.INSTANCE.getEagerly(), 1);
        } catch (Exception e) {
            this.logger.error("Could not subscribe to lifecycle flow", e);
            MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        }
        this.focusState = MutableSharedFlow$default;
    }

    public final SharedFlow<FocusState> getFocusState() {
        return this.focusState;
    }
}
