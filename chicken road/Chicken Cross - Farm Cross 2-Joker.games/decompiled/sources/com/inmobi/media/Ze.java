package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Ze extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3597bf f6991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze(C3597bf c3597bf, Continuation continuation) {
        super(2, continuation);
        this.f6991a = c3597bf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ze(this.f6991a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ze(this.f6991a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f6991a.g.setActivated(true);
        this.f6991a.g.setFocusable(true);
        C3597bf c3597bf = this.f6991a;
        if (c3597bf.i) {
            c3597bf.a();
        } else {
            AbstractC4012q5.a(c3597bf.b, new C3569af(c3597bf, null));
        }
        return Unit.INSTANCE;
    }
}
