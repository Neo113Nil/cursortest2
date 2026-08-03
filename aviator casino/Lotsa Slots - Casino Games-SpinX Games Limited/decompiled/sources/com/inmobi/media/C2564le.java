package com.inmobi.media;

/* renamed from: com.inmobi.media.le, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2564le extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Be f5315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2564le(com.inmobi.media.Be be, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5315a = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2564le(this.f5315a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2564le(this.f5315a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Mn.a(this.f5315a.b.c.c);
        com.inmobi.media.Mn.a(this.f5315a.b.c.b);
        return kotlin.Unit.INSTANCE;
    }
}
