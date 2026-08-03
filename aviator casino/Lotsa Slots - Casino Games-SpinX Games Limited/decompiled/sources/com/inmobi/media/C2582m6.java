package com.inmobi.media;

/* renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2582m6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5329a;
    public final /* synthetic */ com.inmobi.media.C2662p6 b;
    public final /* synthetic */ com.inmobi.media.C2478i6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2582m6(com.inmobi.media.C2662p6 c2662p6, com.inmobi.media.C2478i6 c2478i6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2662p6;
        this.c = c2478i6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2582m6(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2582m6(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5329a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2452h6 abstractC2452h6 = this.b.b;
            java.util.ArrayList arrayList = this.c.f5254a;
            this.f5329a = 1;
            if (abstractC2452h6.a(arrayList, this) == coroutine_suspended) {
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
