package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "progress", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Landroidx/compose/material3/internal/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1", f = "SearchBar.kt", i = {}, l = {570}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SearchBarKt$SearchBar$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.MutatorMutex getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1", f = "SearchBar.kt", i = {}, l = {573}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoSizes;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat> getInputFormats;
        int getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.Camera2StreamConfigurationMap.setFloatValue(Float.NaN);
                    kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat> flow = this.getInputFormats;
                    final androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
                    final androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2 = this.getHighSpeedVideoSizes;
                    final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighSpeedVideoFpsRanges;
                    this.getInputSizeshNQ4ISI = 1;
                    if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.SearchBarKt.SearchBar.4.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                            androidx.view.BackEventCompat backEventCompat = (androidx.view.BackEventCompat) obj2;
                            if (mutableState.getValue() == null) {
                                mutableState.setValue(backEventCompat);
                            }
                            mutableState2.setValue(backEventCompat);
                            java.lang.Object snapTo = animatable.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f - androidx.compose.material3.internal.PredictiveBack.INSTANCE.transform$material3(backEventCompat.getProgress())), continuation);
                            return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
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
                this.Camera2StreamConfigurationMap.setFloatValue(this.getHighSpeedVideoFpsRanges.getValue().floatValue());
                this.getOutputMinFrameDuration.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            } catch (java.util.concurrent.CancellationException unused) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), 3, null);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2", f = "SearchBar.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.Camera2StreamConfigurationMap;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f);
                    finiteAnimationSpec = androidx.compose.material3.SearchBarKt.getHighSpeedVideoSizesFor;
                    this.Camera2StreamConfigurationMap = 1;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, finiteAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRanges.setFloatValue(Float.NaN);
                this.getHighSpeedVideoFpsRangesFor.setValue(null);
                this.getHighSpeedVideoSizes.setValue(null);
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = animatable;
                this.getHighSpeedVideoFpsRanges = mutableFloatState;
                this.getHighSpeedVideoFpsRangesFor = mutableState;
                this.getHighSpeedVideoSizes = mutableState2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.runtime.MutableFloatState mutableFloatState, kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat> flow, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.Camera2StreamConfigurationMap = mutableFloatState;
            this.getInputFormats = flow;
            this.getHighSpeedVideoFpsRanges = animatable;
            this.getOutputMinFrameDuration = function1;
            this.getHighSpeedVideoFpsRangesFor = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
            this.getHighSpeedVideoSizes = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow flow = (kotlinx.coroutines.flow.Flow) this.getInputFormats;
            this.getOutputMinFrameDuration = 1;
            if (androidx.compose.foundation.MutatorMutex.mutate$default(this.getHighSpeedVideoSizesFor, null, new androidx.compose.material3.SearchBarKt$SearchBar$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, flow, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), this, 1, null) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SearchBarKt$SearchBar$4$1) create(flow, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new androidx.compose.material3.SearchBarKt$SearchBar$4$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        searchBarKt$SearchBar$4$1.getInputFormats = obj;
        return searchBarKt$SearchBar$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchBarKt$SearchBar$4$1(androidx.compose.foundation.MutatorMutex mutatorMutex, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarKt$SearchBar$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = mutatorMutex;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
        this.getHighSpeedVideoSizes = animatable;
        this.getInputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
