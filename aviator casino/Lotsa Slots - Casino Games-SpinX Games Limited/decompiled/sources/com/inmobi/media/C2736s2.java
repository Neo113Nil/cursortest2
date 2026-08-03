package com.inmobi.media;

/* renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2736s2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f5437a;
    public final /* synthetic */ com.inmobi.media.AbstractC2765t2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2736s2(com.inmobi.media.AbstractC2765t2 abstractC2765t2, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.b = abstractC2765t2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new com.inmobi.media.C2736s2(this.b, (kotlin.coroutines.Continuation) obj3).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5437a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2765t2 abstractC2765t2 = this.b;
            this.f5437a = 1;
            if (com.inmobi.media.AbstractC2765t2.a(abstractC2765t2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
