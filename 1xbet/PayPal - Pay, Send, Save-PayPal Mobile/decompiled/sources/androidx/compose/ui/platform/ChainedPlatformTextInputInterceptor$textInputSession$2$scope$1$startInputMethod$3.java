package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputMethodRequest getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSessionScope getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.PlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.platform.PlatformTextInputInterceptor invoke() {
                    androidx.compose.ui.platform.PlatformTextInputInterceptor highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor.this.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor;
                }

                {
                    super(0);
                }
            }), new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new java.lang.IllegalStateException("Interceptors flow should never terminate.".toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "interceptor", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputInterceptor, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputMethodRequest Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSessionScope getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (((androidx.compose.ui.platform.PlatformTextInputInterceptor) this.getHighSpeedVideoSizes).interceptStartInputMethod(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.platform.PlatformTextInputInterceptor platformTextInputInterceptor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.AnonymousClass2) create(platformTextInputInterceptor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.AnonymousClass2 anonymousClass2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass2.getHighSpeedVideoSizes = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = platformTextInputMethodRequest;
            this.getHighResolutionOutputSizeshNQ4ISI = platformTextInputSessionScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = chainedPlatformTextInputInterceptor;
        this.getHighResolutionOutputSizeshNQ4ISI = platformTextInputMethodRequest;
        this.getHighSpeedVideoFpsRangesFor = platformTextInputSessionScope;
    }
}
