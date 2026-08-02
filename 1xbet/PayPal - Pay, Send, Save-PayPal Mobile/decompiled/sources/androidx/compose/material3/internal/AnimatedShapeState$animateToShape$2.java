package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2", f = "AnimatedShape.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnimatedShapeState$animateToShape$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1", f = "AnimatedShape.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.Animatable animatable;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                animatable = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                if (animatable != null) {
                    this.getHighSpeedVideoSizes = 1;
                    obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap.getTopStart().mo1966toPxTmRCtEA(this.getHighSpeedVideoFpsRangesFor.getSize(), this.getHighSpeedVideoFpsRangesFor.getDensity())), this.getHighSpeedVideoFpsRangesFor.getSpec(), null, null, this, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = animatedShapeState;
            this.Camera2StreamConfigurationMap = cornerBasedShape;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass3(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass4(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return launch$default;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2", f = "AnimatedShape.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.Animatable animatable;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                animatable = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                if (animatable != null) {
                    this.Camera2StreamConfigurationMap = 1;
                    obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRanges.getTopEnd().mo1966toPxTmRCtEA(this.getHighResolutionOutputSizeshNQ4ISI.getSize(), this.getHighResolutionOutputSizeshNQ4ISI.getDensity())), this.getHighResolutionOutputSizeshNQ4ISI.getSpec(), null, null, this, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = animatedShapeState;
            this.getHighSpeedVideoFpsRanges = cornerBasedShape;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3", f = "AnimatedShape.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.Animatable animatable;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                animatable = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                if (animatable != null) {
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap.getBottomStart().mo1966toPxTmRCtEA(this.getHighResolutionOutputSizeshNQ4ISI.getSize(), this.getHighResolutionOutputSizeshNQ4ISI.getDensity())), this.getHighResolutionOutputSizeshNQ4ISI.getSpec(), null, null, this, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass3(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass3> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = animatedShapeState;
            this.Camera2StreamConfigurationMap = cornerBasedShape;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4", f = "AnimatedShape.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.Animatable animatable;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                animatable = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                if (animatable != null) {
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoSizes.getBottomEnd().mo1966toPxTmRCtEA(this.Camera2StreamConfigurationMap.getSize(), this.Camera2StreamConfigurationMap.getDensity())), this.Camera2StreamConfigurationMap.getSpec(), null, null, this, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass4(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2.AnonymousClass4> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = animatedShapeState;
            this.getHighSpeedVideoSizes = cornerBasedShape;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
        return ((androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2 animatedShapeState$animateToShape$2 = new androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        animatedShapeState$animateToShape$2.getHighSpeedVideoSizes = obj;
        return animatedShapeState$animateToShape$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedShapeState$animateToShape$2(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animatedShapeState;
        this.getHighSpeedVideoFpsRangesFor = cornerBasedShape;
    }
}
