package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vo extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5021a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ android.view.ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vo(android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final void a(kotlinx.coroutines.channels.ProducerScope producerScope, int i) {
        producerScope.mo10716trySendJP2dKIU(java.lang.Boolean.valueOf(i == 0));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Vo vo = new com.inmobi.media.Vo(this.c, continuation);
        vo.b = obj;
        return vo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Vo vo = new com.inmobi.media.Vo(this.c, (kotlin.coroutines.Continuation) obj2);
        vo.b = (kotlinx.coroutines.channels.ProducerScope) obj;
        return vo.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5021a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
            producerScope.mo10716trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.c.getWindowVisibility() == 0));
            android.view.ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new android.view.ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: com.inmobi.media.Vo$$ExternalSyntheticLambda0
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i2) {
                    com.inmobi.media.Vo.a(kotlinx.coroutines.channels.ProducerScope.this, i2);
                }
            };
            this.c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            android.view.ViewGroup viewGroup = this.c;
            if (androidx.core.view.ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new com.inmobi.media.Uo(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Vo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.Vo.a();
                }
            };
            this.f5021a = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

    public static final kotlin.Unit a() {
        return kotlin.Unit.INSTANCE;
    }
}
