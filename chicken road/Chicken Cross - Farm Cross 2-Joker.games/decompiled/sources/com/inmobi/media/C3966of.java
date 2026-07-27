package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3966of extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7288a;
    public final /* synthetic */ C4135uf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3966of(C4135uf c4135uf, Continuation continuation) {
        super(2, continuation);
        this.b = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3966of(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3966of(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7288a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Y9 l = this.b.l();
            if (l != null) {
                ((Z9) l).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            Flow b = ((C3709fe) this.b.b.j.getValue()).b();
            C3937nf c3937nf = new C3937nf(null);
            this.f7288a = 1;
            if (FlowKt.first(b, c3937nf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.m();
        ((C3709fe) this.b.b.j.getValue()).a();
        return Unit.INSTANCE;
    }
}
