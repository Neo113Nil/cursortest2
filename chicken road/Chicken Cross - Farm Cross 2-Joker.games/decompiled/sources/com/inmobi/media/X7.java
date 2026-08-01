package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class X7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6944a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3562a8 c;
    public final /* synthetic */ C4043r8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X7(C3562a8 c3562a8, Continuation continuation, C4043r8 c4043r8) {
        super(2, continuation);
        this.c = c3562a8;
        this.d = c4043r8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        X7 x7 = new X7(this.c, continuation, this.d);
        x7.b = obj;
        return x7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6944a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            C3562a8 c3562a8 = this.c;
            W7 w7 = new W7(coroutineScope, this.d);
            this.f6944a = 1;
            if (c3562a8.collect(w7, this) == coroutine_suspended) {
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
