package com.inmobi.media;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Ra extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6824a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Short e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(Context context, String str, Long l, Short sh, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = str;
        this.d = l;
        this.e = sh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ra(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ra) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6824a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ta ta = Ta.f6869a;
            Context context = this.b;
            String str = this.c;
            Long l = this.d;
            Short sh = this.e;
            this.f6824a = 1;
            if (ta.a(context, str, l, sh, this) == coroutine_suspended) {
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
