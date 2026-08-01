package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3947np extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7274a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableSharedFlow c;
    public final /* synthetic */ C4004pp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3947np(MutableSharedFlow mutableSharedFlow, Continuation continuation, C4004pp c4004pp) {
        super(2, continuation);
        this.c = mutableSharedFlow;
        this.d = c4004pp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3947np c3947np = new C3947np(this.c, continuation, this.d);
        c3947np.b = obj;
        return c3947np;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3947np) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7274a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableSharedFlow mutableSharedFlow = this.c;
            C3919mp c3919mp = new C3919mp(coroutineScope, this.d);
            this.f7274a = 1;
            if (mutableSharedFlow.collect(c3919mp, this) == coroutine_suspended) {
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
