package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
public final class wq extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7468a;
    public final /* synthetic */ Y9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Deferred d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(Y9 y9, String str, Deferred deferred, Continuation continuation) {
        super(2, continuation);
        this.b = y9;
        this.c = str;
        this.d = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wq(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wq) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7468a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("WebResourceHandler", "Waiting for response to finish download: " + this.c);
        }
        Deferred deferred = this.d;
        this.f7468a = 1;
        Object await = deferred.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
