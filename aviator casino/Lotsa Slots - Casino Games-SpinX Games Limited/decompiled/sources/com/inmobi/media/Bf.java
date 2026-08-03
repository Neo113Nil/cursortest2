package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4623a;
    public final /* synthetic */ com.inmobi.media.Re b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(com.inmobi.media.Re re, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = re;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Bf(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Bf(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4623a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue();
            com.inmobi.media.Re re = this.b;
            this.f4623a = 1;
            obj = b9.f4618a.a(re, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
        if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
            throw new java.io.IOException();
        }
        kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
        return ve.d().string(kotlin.text.Charsets.UTF_8);
    }
}
