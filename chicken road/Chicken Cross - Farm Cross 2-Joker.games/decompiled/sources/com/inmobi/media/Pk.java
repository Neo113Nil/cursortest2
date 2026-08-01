package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Pk extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6787a;
    public Rk b;
    public Ok c;
    public Ok d;
    public int e;
    public final /* synthetic */ Rk f;
    public final /* synthetic */ Ok g;
    public final /* synthetic */ Ok h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pk(Rk rk, Ok ok, Ok ok2, Continuation continuation) {
        super(2, continuation);
        this.f = rk;
        this.g = ok;
        this.h = ok2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pk(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Pk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Ok ok;
        Rk rk;
        Ok ok2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Rk rk2 = this.f;
            mutex = rk2.b;
            ok = this.g;
            Ok ok3 = this.h;
            this.f6787a = mutex;
            this.b = rk2;
            this.c = ok;
            this.d = ok3;
            this.e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rk = rk2;
            ok2 = ok3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ok2 = this.d;
            ok = this.c;
            rk = this.b;
            mutex = this.f6787a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            rk.b(ok, ok2);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
