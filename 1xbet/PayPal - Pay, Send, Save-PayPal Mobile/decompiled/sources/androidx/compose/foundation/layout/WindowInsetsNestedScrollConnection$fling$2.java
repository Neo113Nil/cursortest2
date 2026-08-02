package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class WindowInsetsNestedScrollConnection$fling$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.view.WindowInsetsAnimationController getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec getInputFormats;
    final /* synthetic */ boolean getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ int getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ float Camera2StreamConfigurationMap;
        final /* synthetic */ android.view.WindowInsetsAnimationController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRanges;
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;
        final /* synthetic */ boolean getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec getInputFormats;
        final /* synthetic */ int getInputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection getOutputFormats;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDuration;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                float f = this.getHighSpeedVideoFpsRangesFor;
                float f2 = this.Camera2StreamConfigurationMap;
                androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.getInputFormats;
                final int i2 = this.getHighSpeedVideoSizes;
                final int i3 = this.getInputSizeshNQ4ISI;
                final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.getOutputFormats;
                final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoFpsRanges;
                final android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.getHighResolutionOutputSizeshNQ4ISI;
                final boolean z = this.getHighSpeedVideoSizesFor;
                this.getOutputMinFrameDuration = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay(f, f2, splineBasedFloatDecayAnimationSpec, (kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        kotlin.Unit Z_;
                        Z_ = androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1.Z_(i2, i3, windowInsetsNestedScrollConnection, floatRef, windowInsetsAnimationController, z, ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
                        return Z_;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit Z_(int i, int i2, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.jvm.internal.Ref.FloatRef floatRef, android.view.WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f, float f2) {
            kotlinx.coroutines.Job job;
            float f3 = i;
            if (f <= i2 && f3 <= f) {
                windowInsetsNestedScrollConnection.getHighResolutionOutputSizeshNQ4ISI(f);
            } else {
                floatRef.element = f2;
                windowInsetsAnimationController.finish(z);
                windowInsetsNestedScrollConnection.getHighSpeedVideoFpsRanges = null;
                job = windowInsetsNestedScrollConnection.getInputSizeshNQ4ISI;
                if (job != null) {
                    job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, float f, androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i2, int i3, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.jvm.internal.Ref.FloatRef floatRef, android.view.WindowInsetsAnimationController windowInsetsAnimationController, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = f;
            this.getInputFormats = splineBasedFloatDecayAnimationSpec;
            this.getHighSpeedVideoSizes = i2;
            this.getInputSizeshNQ4ISI = i3;
            this.getOutputFormats = windowInsetsNestedScrollConnection;
            this.getHighSpeedVideoFpsRanges = floatRef;
            this.getHighResolutionOutputSizeshNQ4ISI = windowInsetsAnimationController;
            this.getHighSpeedVideoSizesFor = z;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDurationlomOqCM;
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.getHighSpeedVideoSizesFor;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, null), 3, null);
            windowInsetsNestedScrollConnection.getInputSizeshNQ4ISI = launch$default;
            job = this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI;
            if (job != null) {
                this.getOutputFormats = 1;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI = null;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, continuation);
        windowInsetsNestedScrollConnection$fling$2.getOutputMinFrameDurationlomOqCM = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$2(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, float f, androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i2, int i3, kotlin.jvm.internal.Ref.FloatRef floatRef, android.view.WindowInsetsAnimationController windowInsetsAnimationController, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = windowInsetsNestedScrollConnection;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getInputFormats = splineBasedFloatDecayAnimationSpec;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getOutputMinFrameDuration = i3;
        this.Camera2StreamConfigurationMap = floatRef;
        this.getHighSpeedVideoSizes = windowInsetsAnimationController;
        this.getInputSizeshNQ4ISI = z;
    }
}
