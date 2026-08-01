package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class Hb extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6600a;
    public final /* synthetic */ Kb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(Kb kb, Continuation continuation) {
        super(1, continuation);
        this.b = kb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Hb(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Hb(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6600a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Kb kb = this.b;
            kb.getClass();
            kb.b = new M6(AppMeasurement.CRASH_ORIGIN, (C4266za) Ba.f6473a.getValue(), kb, kb.f6669a.getEventConfig(), null);
            Kb kb2 = this.b;
            this.f6600a = 1;
            if (Kb.a(kb2, this) == coroutine_suspended) {
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
