package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class D {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f10889a;
    public final MutableStateFlow<StateFlow<UInt>> b;
    public final StateFlow<UInt> c;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<ProducerScope<? super UInt>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10890a;
        public /* synthetic */ Object b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1$1", f = "CountdownFlow.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a, reason: collision with other inner class name */
        public static final class C1508a extends SuspendLambda implements Function2<StateFlow<? extends UInt>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10891a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ProducerScope<UInt> c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a$a, reason: collision with other inner class name */
            public static final class C1509a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ProducerScope<UInt> f10892a;

                /* JADX WARN: Multi-variable type inference failed */
                public C1509a(ProducerScope<? super UInt> producerScope) {
                    this.f10892a = producerScope;
                }

                public final Object a(int i, Continuation<? super Unit> continuation) {
                    Object send = this.f10892a.send(UInt.m8170boximpl(i), continuation);
                    return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((UInt) obj).getData(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1508a(ProducerScope<? super UInt> producerScope, Continuation<? super C1508a> continuation) {
                super(2, continuation);
                this.c = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(StateFlow<UInt> stateFlow, Continuation<? super Unit> continuation) {
                return ((C1508a) create(stateFlow, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1508a c1508a = new C1508a(this.c, continuation);
                c1508a.b = obj;
                return c1508a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10891a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.b;
                    C1509a c1509a = new C1509a(this.c);
                    this.f10891a = 1;
                    if (stateFlow.collect(c1509a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super UInt> producerScope, Continuation<? super Unit> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = D.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10890a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.b;
                MutableStateFlow mutableStateFlow = D.this.b;
                C1508a c1508a = new C1508a(producerScope, null);
                this.f10890a = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c1508a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ D(int i, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    public D(int i, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10889a = scope;
        MutableStateFlow<StateFlow<UInt>> MutableStateFlow = StateFlowKt.MutableStateFlow(C4820g.a(i, scope, null, 4, null));
        this.b = MutableStateFlow;
        this.c = FlowKt.stateIn(FlowKt.channelFlow(new a(null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), MutableStateFlow.getValue().getValue());
    }

    public final void a(int i) {
        this.b.setValue(C4820g.a(i, this.f10889a, null, 4, null));
    }

    public final StateFlow<UInt> a() {
        return this.c;
    }
}
