package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetLifecycleFlow.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidGetLifecycleFlow$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.unity3d.ads.core.domain.LifecycleEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetLifecycleFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetLifecycleFlow$invoke$2(com.unity3d.ads.core.domain.AndroidGetLifecycleFlow androidGetLifecycleFlow, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidGetLifecycleFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2 androidGetLifecycleFlow$invoke$2 = new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2(this.this$0, continuation);
        androidGetLifecycleFlow$invoke$2.L$0 = obj;
        return androidGetLifecycleFlow$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.unity3d.ads.core.domain.LifecycleEvent> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            final ?? r1 = new android.app.Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(producerScope, activity, bundle, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(android.app.Activity activity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(producerScope, activity, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(android.app.Activity activity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(producerScope, activity, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(android.app.Activity activity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(producerScope, activity, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(android.app.Activity activity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(producerScope, activity, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(producerScope, activity, bundle, null), 3, null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(android.app.Activity activity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(producerScope, activity, null), 3, null);
                }
            };
            context = this.this$0.applicationContext;
            ((android.app.Application) context).registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks) r1);
            final com.unity3d.ads.core.domain.AndroidGetLifecycleFlow androidGetLifecycleFlow = this.this$0;
            this.label = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    android.content.Context context2;
                    context2 = com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.this.applicationContext;
                    ((android.app.Application) context2).unregisterActivityLifecycleCallbacks(r1);
                }
            }, this) == coroutine_suspended) {
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
}
