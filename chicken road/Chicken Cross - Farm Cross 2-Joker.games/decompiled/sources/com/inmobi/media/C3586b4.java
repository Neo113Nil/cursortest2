package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;

/* renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3586b4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7023a;
    public final /* synthetic */ Deferred b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3586b4(Deferred deferred, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.b = deferred;
        this.c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3586b4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3586b4(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7023a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferred = this.b;
            this.f7023a = 1;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            this.c.invoke(obj);
        }
        return Unit.INSTANCE;
    }
}
