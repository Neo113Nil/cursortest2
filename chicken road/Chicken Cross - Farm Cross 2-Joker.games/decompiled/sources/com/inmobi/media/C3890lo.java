package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.lo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3890lo extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7232a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ Bo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3890lo(MutableStateFlow mutableStateFlow, Continuation continuation, Bo bo) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = bo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3890lo c3890lo = new C3890lo(this.c, continuation, this.d);
        c3890lo.b = obj;
        return c3890lo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3890lo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7232a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c;
            C3860ko c3860ko = new C3860ko(coroutineScope, this.d);
            this.f7232a = 1;
            if (mutableStateFlow.collect(c3860ko, this) == coroutine_suspended) {
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
