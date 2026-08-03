package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Lj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Nj f4822a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lj(com.inmobi.media.Nj nj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4822a = nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Lj(this.f4822a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Lj(this.f4822a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return com.inmobi.media.C5.a(this.f4822a.f5284a) ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ARGB_8888;
    }
}
