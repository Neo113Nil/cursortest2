package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.zp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4281zp extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dp f7531a;
    public final /* synthetic */ InterfaceC4141ul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4281zp(Dp dp, InterfaceC4141ul interfaceC4141ul, Continuation continuation) {
        super(2, continuation);
        this.f7531a = dp;
        this.b = interfaceC4141ul;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4281zp(this.f7531a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4281zp(this.f7531a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Dp dp = this.f7531a;
        dp.h = this.b;
        dp.f.a(dp.j);
        return Unit.INSTANCE;
    }
}
