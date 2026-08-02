package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class WindowInsetsNestedScrollConnection$fling$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ android.view.WindowInsetsAnimationController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ float Camera2StreamConfigurationMap;
        final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.view.WindowInsetsAnimationController getHighSpeedVideoFpsRanges;
        final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;
        final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection getInputFormats;
        int getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.animation.core.Animatable Animatable$default = androidx.compose.animation.core.AnimatableKt.Animatable$default(this.getHighResolutionOutputSizeshNQ4ISI, 0.0f, 2, null);
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoSizes);
                java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap);
                final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.getInputFormats;
                this.getInputSizeshNQ4ISI = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(Animatable$default, boxFloat, null, boxFloat2, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.this, (androidx.compose.animation.core.Animatable) obj2);
                        return Camera2StreamConfigurationMap;
                    }
                }, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges.finish(this.getHighSpeedVideoFpsRangesFor);
            this.getInputFormats.getHighSpeedVideoFpsRanges = null;
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, androidx.compose.animation.core.Animatable animatable) {
            windowInsetsNestedScrollConnection.getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) animatable.getValue()).floatValue());
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, int i2, float f, android.view.WindowInsetsAnimationController windowInsetsAnimationController, boolean z, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.coroutines.Continuation<? super androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = f;
            this.getHighSpeedVideoFpsRanges = windowInsetsAnimationController;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getInputFormats = windowInsetsNestedScrollConnection;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.getInputSizeshNQ4ISI;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, null), 3, null);
        windowInsetsNestedScrollConnection.getInputSizeshNQ4ISI = launch$default;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        windowInsetsNestedScrollConnection$fling$3.getOutputMinFrameDuration = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$3(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, int i2, float f, android.view.WindowInsetsAnimationController windowInsetsAnimationController, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = windowInsetsNestedScrollConnection;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = windowInsetsAnimationController;
        this.Camera2StreamConfigurationMap = z;
    }
}
