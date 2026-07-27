package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3705fa extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7103a;
    public final /* synthetic */ C3733ga b;
    public final /* synthetic */ Nf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705fa(C3733ga c3733ga, Nf nf, Continuation continuation) {
        super(2, continuation);
        this.b = c3733ga;
        this.c = nf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3705fa(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3705fa(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7103a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Y4 y4 = this.b.f7119a;
        Nf nf = this.c;
        this.f7103a = 1;
        Object a2 = y4.a(nf, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
