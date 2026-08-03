package com.inmobi.media;

/* renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2722re extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ae f5427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2722re(com.inmobi.media.Ae ae, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5427a = ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2722re(this.f5427a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2722re(this.f5427a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f5427a.h.onVideoPaused();
        return kotlin.Unit.INSTANCE;
    }
}
