package com.amplitude.android;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.H;

@DebugMetadata(c = "com.amplitude.android.FrustrationInteractionsDetector$startUiChangeCollection$1", f = "FrustrationInteractionsDetector.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class o extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n b;

    @DebugMetadata(c = "com.amplitude.android.FrustrationInteractionsDetector$startUiChangeCollection$1$1", f = "FrustrationInteractionsDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<com.amplitude.core.platform.l, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ n b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.b, continuation);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.amplitude.core.platform.l lVar, Continuation<? super Unit> continuation) {
            return ((a) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.amplitude.core.platform.l lVar = (com.amplitude.core.platform.l) this.a;
            if (!(lVar instanceof com.amplitude.android.signals.a)) {
                return Unit.INSTANCE;
            }
            ((com.amplitude.android.signals.a) lVar).getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.b = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new o(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((o) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n nVar = this.b;
            nVar.b.c("Starting UI change signal collection for dead click detection");
            H h = nVar.a.p;
            a aVar = new a(nVar, null);
            this.a = 1;
            int i2 = kotlinx.coroutines.flow.x.a;
            Object collect = C1062g.a(new kotlinx.coroutines.flow.internal.l(new kotlinx.coroutines.flow.w(aVar, null), h, EmptyCoroutineContext.INSTANCE, -2, kotlinx.coroutines.channels.a.a), 0).collect(kotlinx.coroutines.flow.internal.s.a, this);
            if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                collect = Unit.INSTANCE;
            }
            if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutine_suspended) {
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
