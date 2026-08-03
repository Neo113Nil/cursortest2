package com.inmobi.media;

/* loaded from: classes5.dex */
public final class To extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4984a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ android.view.ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public To(android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final void a(kotlinx.coroutines.channels.ProducerScope producerScope, boolean z) {
        producerScope.mo10716trySendJP2dKIU(java.lang.Boolean.valueOf(z));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.To to = new com.inmobi.media.To(this.c, continuation);
        to.b = obj;
        return to;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.To to = new com.inmobi.media.To(this.c, (kotlin.coroutines.Continuation) obj2);
        to.b = (kotlinx.coroutines.channels.ProducerScope) obj;
        return to.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4984a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
            android.view.ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.inmobi.media.To$$ExternalSyntheticLambda0
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    com.inmobi.media.To.a(kotlinx.coroutines.channels.ProducerScope.this, z);
                }
            };
            this.c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            android.view.ViewGroup viewGroup = this.c;
            if (androidx.core.view.ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new com.inmobi.media.So(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.To$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.To.a();
                }
            };
            this.f4984a = 1;
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
