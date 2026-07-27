package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.rq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4061rq extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7361a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061rq(String str, Y9 y9, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4061rq(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4061rq(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7361a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        xq xqVar = xq.f7488a;
        String str = this.b;
        Y9 y9 = this.c;
        this.f7361a = 1;
        Object a2 = xqVar.a(str, y9, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
