package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Le extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6694a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Oe c;
    public final /* synthetic */ Te d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Le(Oe oe, Continuation continuation, Te te) {
        super(2, continuation);
        this.c = oe;
        this.d = te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Le le = new Le(this.c, continuation, this.d);
        le.b = obj;
        return le;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Le) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6694a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            Oe oe = this.c;
            Ke ke = new Ke(coroutineScope, this.d);
            this.f6694a = 1;
            if (oe.collect(ke, this) == coroutine_suspended) {
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
