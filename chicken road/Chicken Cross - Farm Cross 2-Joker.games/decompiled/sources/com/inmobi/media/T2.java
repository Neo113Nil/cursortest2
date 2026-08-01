package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class T2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U2 f6863a;
    public final /* synthetic */ AbstractC3691eo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(U2 u2, AbstractC3691eo abstractC3691eo, Continuation continuation) {
        super(2, continuation);
        this.f6863a = u2;
        this.b = abstractC3691eo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T2(this.f6863a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T2(this.f6863a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        U2 u2 = this.f6863a;
        AbstractC3691eo abstractC3691eo = this.b;
        int i = U2.h;
        u2.b(abstractC3691eo);
        return Unit.INSTANCE;
    }
}
