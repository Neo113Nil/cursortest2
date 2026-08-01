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
public final class K2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6661a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ P2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(MutableStateFlow mutableStateFlow, Continuation continuation, P2 p2) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = p2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        K2 k2 = new K2(this.c, continuation, this.d);
        k2.b = obj;
        return k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6661a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c;
            J2 j2 = new J2(coroutineScope, this.d);
            this.f6661a = 1;
            if (mutableStateFlow.collect(j2, this) == coroutine_suspended) {
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
