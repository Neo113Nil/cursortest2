package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleFocusCounters.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/core/data/repository/FocusState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidHandleFocusCounters$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.repository.FocusState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHandleFocusCounters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleFocusCounters$invoke$1(com.unity3d.ads.core.domain.AndroidHandleFocusCounters androidHandleFocusCounters, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = androidHandleFocusCounters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1 androidHandleFocusCounters$invoke$1 = new com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1(this.this$0, continuation);
        androidHandleFocusCounters$invoke$1.L$0 = obj;
        return androidHandleFocusCounters$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.data.repository.FocusState focusState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1) create(focusState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.unity3d.ads.core.domain.AndroidGetIsAdActivity androidGetIsAdActivity;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.repository.FocusState focusState = (com.unity3d.ads.core.data.repository.FocusState) this.L$0;
            this.this$0.onFocusStateChange(focusState);
            android.app.Activity activity = focusState.getActivity().get();
            if (activity == null || (str = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) == null) {
                str = "unknown_activity_name";
            }
            androidGetIsAdActivity = this.this$0.isAdActivity;
            if (!androidGetIsAdActivity.invoke(str)) {
                return kotlin.Unit.INSTANCE;
            }
            sessionRepository = this.this$0.sessionRepository;
            sessionRepository.incrementGlobalAdsFocusChangeCount();
            if (focusState instanceof com.unity3d.ads.core.data.repository.FocusState.Focused) {
                this.this$0.onResume(str);
            } else if (focusState instanceof com.unity3d.ads.core.data.repository.FocusState.Unfocused) {
                this.this$0.onPause(str);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
