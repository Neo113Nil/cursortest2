package com.inmobi.media;

import com.adjust.sdk.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class K7 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6666a;
    public final /* synthetic */ P7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(P7 p7, int i, long j, Continuation continuation) {
        super(1, continuation);
        this.b = p7;
        this.c = i;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new K7(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K7) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6666a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Gh gh = this.b.f7163a;
        Integer boxInt = Boxing.boxInt(this.c);
        long j = this.d;
        this.f6666a = 1;
        Object a2 = gh.a(boxInt, Constants.HIGH, j, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
