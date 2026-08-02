package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class MarqueeModifierNode$runAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.MarqueeModifierNode Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.Camera2StreamConfigurationMap(androidx.compose.foundation.MarqueeModifierNode.this);
                }
            }), new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {427, 429, 433, 433}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"}, v = 1)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.MarqueeModifierNode getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
        
            if (r0.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r18) != r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
        
            if (r0 != r2) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.Animatable animatable;
            int i;
            int i2;
            int i3;
            float f;
            androidx.compose.animation.core.Animatable animatable2;
            java.lang.Float f2;
            androidx.compose.animation.core.AnimationSpec animationSpec;
            androidx.compose.animation.core.Animatable animatable3;
            java.lang.Object animateTo$default;
            androidx.compose.animation.core.Animatable animatable4;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
            } catch (java.lang.Throwable th) {
                animatable = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
                this.getHighSpeedVideoSizes = th;
                this.Camera2StreamConfigurationMap = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 4;
                if (animatable.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) != coroutine_suspended) {
                    throw th;
                }
            }
            if (i4 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Float f3 = (java.lang.Float) this.getHighSpeedVideoSizes;
                if (f3 != null) {
                    i = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                    float floatValue = f3.floatValue();
                    i2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                    f = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                    androidx.compose.animation.core.AnimationSpec m1288access$createMarqueeAnimationSpecZ4HSEVQ = androidx.compose.foundation.BasicMarqueeKt.m1288access$createMarqueeAnimationSpecZ4HSEVQ(i, floatValue, i2, i3, f, androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this.getHighSpeedVideoFpsRangesFor));
                    animatable2 = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
                    this.getHighSpeedVideoSizes = f3;
                    this.Camera2StreamConfigurationMap = m1288access$createMarqueeAnimationSpecZ4HSEVQ;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (animatable2.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) != coroutine_suspended) {
                        f2 = f3;
                        animationSpec = m1288access$createMarqueeAnimationSpecZ4HSEVQ;
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i4 == 1) {
                androidx.compose.animation.core.AnimationSpec animationSpec2 = (androidx.compose.animation.core.AnimationSpec) this.Camera2StreamConfigurationMap;
                java.lang.Float f4 = (java.lang.Float) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                animationSpec = animationSpec2;
                f2 = f4;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i4 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th2 = (java.lang.Throwable) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                animateTo$default = obj;
                animatable4 = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
            }
            animatable3 = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(animatable3, f2, animationSpec, null, null, this, 12, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2) create(f, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoSizes = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = marqueeModifierNode;
        }
    }

    public static /* synthetic */ java.lang.Float Camera2StreamConfigurationMap(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode) {
        int highSpeedVideoFpsRangesFor;
        int highSpeedVideoSizes;
        int highSpeedVideoFpsRangesFor2;
        int outputMinFrameDuration;
        boolean Camera2StreamConfigurationMap;
        highSpeedVideoFpsRangesFor = marqueeModifierNode.getHighSpeedVideoFpsRangesFor();
        highSpeedVideoSizes = marqueeModifierNode.getHighSpeedVideoSizes();
        if (highSpeedVideoFpsRangesFor <= highSpeedVideoSizes) {
            return null;
        }
        if (androidx.compose.foundation.MarqueeAnimationMode.m1352equalsimpl0(marqueeModifierNode.getHighSpeedVideoFpsRanges(), androidx.compose.foundation.MarqueeAnimationMode.INSTANCE.m1357getWhileFocusedZbEOnfQ())) {
            Camera2StreamConfigurationMap = marqueeModifierNode.Camera2StreamConfigurationMap();
            if (!Camera2StreamConfigurationMap) {
                return null;
            }
        }
        highSpeedVideoFpsRangesFor2 = marqueeModifierNode.getHighSpeedVideoFpsRangesFor();
        outputMinFrameDuration = marqueeModifierNode.getOutputMinFrameDuration();
        return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor2 + outputMinFrameDuration);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.MarqueeModifierNode$runAnimation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarqueeModifierNode$runAnimation$2(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MarqueeModifierNode$runAnimation$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = marqueeModifierNode;
    }
}
