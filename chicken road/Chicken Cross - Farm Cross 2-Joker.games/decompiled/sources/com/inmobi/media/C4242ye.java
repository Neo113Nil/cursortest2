package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4242ye extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7501a;
    public final /* synthetic */ De b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4242ye(De de, Continuation continuation) {
        super(2, continuation);
        this.b = de;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4242ye(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4242ye(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7501a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C4200x c4200x = this.b.f;
        this.f7501a = 1;
        Object a2 = c4200x.a(this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
