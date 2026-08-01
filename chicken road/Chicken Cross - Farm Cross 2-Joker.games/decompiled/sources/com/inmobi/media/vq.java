package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
public final class vq extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7446a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(String str, Y9 y9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new vq(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new vq(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7446a;
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
        this.f7446a = 1;
        async$default = BuildersKt__Builders_commonKt.async$default(AbstractC3904ma.e, null, CoroutineStart.UNDISPATCHED, new C4117tq(str, y9, null), 1, null);
        return async$default == coroutine_suspended ? coroutine_suspended : async$default;
    }
}
