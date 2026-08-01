package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes6.dex */
public final class Np extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6751a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ Pp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Np(MutableStateFlow mutableStateFlow, Continuation continuation, Pp pp) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = pp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Np np = new Np(this.c, continuation, this.d);
        np.b = obj;
        return np;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Np) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6751a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c;
            Mp mp = new Mp(coroutineScope, this.d);
            this.f6751a = 1;
            if (mutableStateFlow.collect(mp, this) == coroutine_suspended) {
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
