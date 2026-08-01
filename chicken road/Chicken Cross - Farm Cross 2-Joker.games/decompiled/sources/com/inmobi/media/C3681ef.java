package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3681ef extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4135uf f7086a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3681ef(C4135uf c4135uf, Continuation continuation) {
        super(2, continuation);
        this.f7086a = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3681ef(this.f7086a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3681ef(this.f7086a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Jp.a(this.f7086a.b.c.c);
        Jp.a(this.f7086a.b.c.b);
        return Unit.INSTANCE;
    }
}
