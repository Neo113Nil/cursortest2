package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1", f = "Navigation3.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class Navigation3Kt$rememberIsResumed$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.Lifecycle getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRangesFor;
            final androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoFpsRanges;
            final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1$$ExternalSyntheticLambda0
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    androidx.compose.runtime.ProduceStateScope.this.setValue(java.lang.Boolean.valueOf(lifecycle.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.RESUMED)));
                }
            };
            this.getHighSpeedVideoFpsRanges.addObserver(lifecycleEventObserver);
            final androidx.view.Lifecycle lifecycle2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (produceStateScope.awaitDispose(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1.1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    Camera2StreamConfigurationMap();
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap() {
                    androidx.view.Lifecycle.this.removeObserver(lifecycleEventObserver);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.Boolean> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1 navigation3Kt$rememberIsResumed$1$1 = new com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        navigation3Kt$rememberIsResumed$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return navigation3Kt$rememberIsResumed$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Navigation3Kt$rememberIsResumed$1$1(androidx.view.Lifecycle lifecycle, kotlin.coroutines.Continuation<? super com.datadog.android.compose.Navigation3Kt$rememberIsResumed$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lifecycle;
    }
}
