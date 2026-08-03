package com.inmobi.media;

/* renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2305bi extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f5126a;
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2305bi(android.view.ViewGroup viewGroup, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5126a = viewGroup;
        this.b = gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2305bi(this.f5126a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2305bi(this.f5126a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f5126a.removeView(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
