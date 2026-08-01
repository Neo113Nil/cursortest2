package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Gi extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6586a;
    public final /* synthetic */ Hi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gi(Hi hi, Continuation continuation) {
        super(2, continuation);
        this.b = hi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Gi(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Gi(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6586a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            J0 j0 = (J0) G0.f6569a.getValue();
            AdQualityResult adQualityResult = this.b.f6606a;
            this.f6586a = 1;
            if (j0.a(adQualityResult, this) == coroutine_suspended) {
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
