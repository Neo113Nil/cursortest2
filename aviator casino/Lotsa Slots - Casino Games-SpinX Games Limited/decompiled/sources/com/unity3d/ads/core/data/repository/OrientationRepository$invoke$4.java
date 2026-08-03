package com.unity3d.ads.core.data.repository;

/* compiled from: OrientationRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class OrientationRepository$invoke$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.ref.WeakReference<android.app.Activity>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrientationRepository$invoke$4(com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4> continuation) {
        super(2, continuation);
        this.this$0 = orientationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4 orientationRepository$invoke$4 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4(this.this$0, continuation);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.ref.WeakReference<android.app.Activity> weakReference, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4) create(weakReference, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.L$0;
            mutableStateFlow = this.this$0._resumedActivityOrientation;
            android.app.Activity activity = (android.app.Activity) weakReference.get();
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxInt(activity != null ? activity.getRequestedOrientation() : -1));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
