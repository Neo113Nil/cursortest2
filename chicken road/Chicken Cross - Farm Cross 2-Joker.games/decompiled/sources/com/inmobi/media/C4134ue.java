package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4134ue extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7415a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4215xe c;
    public final /* synthetic */ De d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134ue(C4215xe c4215xe, Continuation continuation, De de) {
        super(2, continuation);
        this.c = c4215xe;
        this.d = de;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4134ue c4134ue = new C4134ue(this.c, continuation, this.d);
        c4134ue.b = obj;
        return c4134ue;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4134ue) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7415a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            C4215xe c4215xe = this.c;
            C4105te c4105te = new C4105te(coroutineScope, this.d);
            this.f7415a = 1;
            if (c4215xe.collect(c4105te, this) == coroutine_suspended) {
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
