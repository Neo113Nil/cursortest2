package com.inmobi.media;

/* renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2594mi extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f5339a;
    public com.inmobi.media.GestureDetectorOnGestureListenerC2675pi b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594mi(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.e = gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2594mi c2594mi = new com.inmobi.media.C2594mi(this.e, continuation);
        c2594mi.d = obj;
        return c2594mi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2594mi c2594mi = new com.inmobi.media.C2594mi(this.e, (kotlin.coroutines.Continuation) obj2);
        c2594mi.d = (kotlinx.coroutines.CoroutineScope) obj;
        return c2594mi.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.d;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.e;
            kotlinx.coroutines.sync.Mutex mutex2 = gestureDetectorOnGestureListenerC2675pi2.y;
            this.d = coroutineScope2;
            this.f5339a = mutex2;
            this.b = gestureDetectorOnGestureListenerC2675pi2;
            this.c = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            gestureDetectorOnGestureListenerC2675pi = gestureDetectorOnGestureListenerC2675pi2;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC2675pi = this.b;
            mutex = this.f5339a;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC2675pi.A)) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
                if (interfaceC2772t9 != null) {
                    java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "updateWebViewLoaded " + coroutineScope);
                }
                gestureDetectorOnGestureListenerC2675pi.getListener().g(gestureDetectorOnGestureListenerC2675pi);
                gestureDetectorOnGestureListenerC2675pi.setAndUpdateViewState(androidx.webkit.Profile.DEFAULT_PROFILE_NAME);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = gestureDetectorOnGestureListenerC2675pi.i;
                if (interfaceC2772t92 != null) {
                    java.lang.String str2 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC2675pi.getViewState());
                }
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
