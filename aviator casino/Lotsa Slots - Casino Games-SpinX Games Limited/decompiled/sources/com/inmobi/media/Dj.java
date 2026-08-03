package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ej f4666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dj(com.inmobi.media.Ej ej, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4666a = ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Dj(this.f4666a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Dj(this.f4666a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return com.inmobi.media.C5.a(this.f4666a.f4688a) ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ARGB_8888;
    }
}
