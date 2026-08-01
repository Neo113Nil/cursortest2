package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.qp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4032qp extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7336a;
    public final /* synthetic */ C4116tp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032qp(C4116tp c4116tp, Continuation continuation) {
        super(2, continuation);
        this.b = c4116tp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4032qp(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4032qp(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7336a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.b.d;
            C3607bo c3607bo = new C3607bo(r7.f7402a.getDuration());
            this.f7336a = 1;
            if (mutableSharedFlow.emit(c3607bo, this) == coroutine_suspended) {
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
