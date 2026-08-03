package com.inmobi.media;

/* renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2515ji extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5279a;
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2515ji(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2515ji(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2515ji(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5279a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f5279a = 1;
            if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.b.isAttachedToWindow() && (interfaceC2772t9 = this.b.i) != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a();
        }
        return kotlin.Unit.INSTANCE;
    }
}
