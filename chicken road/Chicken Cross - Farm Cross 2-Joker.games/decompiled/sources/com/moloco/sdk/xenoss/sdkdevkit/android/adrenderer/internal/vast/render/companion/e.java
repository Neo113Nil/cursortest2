package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f11363a;
    public final D b;
    public final StateFlow<d.a> c;

    public static final class a implements Flow<d.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f11364a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a, reason: collision with other inner class name */
        public static final class C1592a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f11365a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionGoNextActionImpl$special$$inlined$map$1$2", f = "CompanionGoNextAction.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a, reason: collision with other inner class name */
            public static final class C1593a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f11366a;
                public int b;
                public Object c;

                public C1593a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f11366a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1592a.this.emit(null, this);
                }
            }

            public C1592a(FlowCollector flowCollector) {
                this.f11365a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1593a c1593a;
                int i;
                d.a b;
                if (continuation instanceof C1593a) {
                    c1593a = (C1593a) continuation;
                    int i2 = c1593a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1593a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1593a.f11366a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1593a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.f11365a;
                            b = f.b(((UInt) obj).getData());
                            c1593a.b = 1;
                            if (flowCollector.emit(b, c1593a) == coroutine_suspended) {
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
                c1593a = new C1593a(continuation);
                Object obj22 = c1593a.f11366a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1593a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public a(Flow flow) {
            this.f11364a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super d.a> flowCollector, Continuation continuation) {
            Object collect = this.f11364a.collect(new C1592a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.b.a(this.f11363a);
    }

    public e(int i, CoroutineScope scope) {
        d.a b;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f11363a = i;
        D d = new D(i, scope, null);
        this.b = d;
        a aVar = new a(d.a());
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null);
        b = f.b(i);
        this.c = FlowKt.stateIn(aVar, scope, WhileSubscribed$default, b);
    }
}
