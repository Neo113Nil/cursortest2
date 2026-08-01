package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3678ec extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3707fc f7084a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3678ec(C3707fc c3707fc, Continuation continuation) {
        super(2, continuation);
        this.f7084a = c3707fc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3678ec(this.f7084a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3678ec(this.f7084a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3707fc c3707fc = this.f7084a;
        c3707fc.f.onAdLoadFailed(c3707fc.e);
        return Unit.INSTANCE;
    }
}
