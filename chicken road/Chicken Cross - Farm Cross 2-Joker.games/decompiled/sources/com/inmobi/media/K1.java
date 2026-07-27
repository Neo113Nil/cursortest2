package com.inmobi.media;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes6.dex */
public final class K1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6660a;
    public final /* synthetic */ P1 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(P1 p1, Context context, Continuation continuation) {
        super(2, continuation);
        this.b = p1;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new K1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6660a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.b.d = MapsKt.emptyMap();
            P1 p1 = this.b;
            Context context = this.c;
            this.f6660a = 1;
            p1.getClass();
            Object withContext = BuildersKt.withContext(AbstractC3904ma.c, new M1(p1, context, null), this);
            if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = Unit.INSTANCE;
            }
            if (withContext == coroutine_suspended) {
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
