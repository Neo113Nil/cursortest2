package com.inmobi.media;

import android.app.Activity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Sg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6851a;
    public final /* synthetic */ Tg b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sg(Tg tg, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.b = tg;
        this.c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Sg(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Sg(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6851a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tg tg = this.b;
            Activity activity = this.c;
            this.f6851a = 1;
            if (tg.a(activity, this) == coroutine_suspended) {
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
