package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3902m8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3902m8(Continuation continuation, C4043r8 c4043r8) {
        super(2, continuation);
        this.f7242a = c4043r8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3902m8(continuation, this.f7242a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3902m8((Continuation) obj2, this.f7242a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4043r8 c4043r8 = this.f7242a;
        c4043r8.n.removeListener(c4043r8.B);
        return Unit.INSTANCE;
    }
}
