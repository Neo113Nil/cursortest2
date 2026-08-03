package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ad extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ld f4601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(com.inmobi.media.Ld ld, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4601a = ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Ad(this.f4601a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Ad(this.f4601a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.inmobi.media.AbstractC2750sf.f5448a;
        android.content.Context applicationContext = this.f4601a.f5559a.f5538a.b.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.inmobi.media.AbstractC2750sf.a(applicationContext));
    }
}
