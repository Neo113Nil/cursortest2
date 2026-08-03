package androidx.compose.foundation;

/* compiled from: BasicMarquee.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class MarqueeModifierNode$runAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ androidx.compose.foundation.MarqueeModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarqueeModifierNode$runAnimation$2(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MarqueeModifierNode$runAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.MarqueeModifierNode$runAnimation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode = this.this$0;
            this.label = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Float invoke() {
                    int contentWidth;
                    int containerWidth;
                    int contentWidth2;
                    int spacingPx;
                    boolean hasFocus;
                    contentWidth = androidx.compose.foundation.MarqueeModifierNode.this.getContentWidth();
                    containerWidth = androidx.compose.foundation.MarqueeModifierNode.this.getContainerWidth();
                    if (contentWidth <= containerWidth) {
                        return null;
                    }
                    if (androidx.compose.foundation.MarqueeAnimationMode.m287equalsimpl0(androidx.compose.foundation.MarqueeModifierNode.this.m299getAnimationModeZbEOnfQ(), androidx.compose.foundation.MarqueeAnimationMode.INSTANCE.m294getWhileFocusedZbEOnfQ())) {
                        hasFocus = androidx.compose.foundation.MarqueeModifierNode.this.getHasFocus();
                        if (!hasFocus) {
                            return null;
                        }
                    }
                    contentWidth2 = androidx.compose.foundation.MarqueeModifierNode.this.getContentWidth();
                    spacingPx = androidx.compose.foundation.MarqueeModifierNode.this.getSpacingPx();
                    return java.lang.Float.valueOf(contentWidth2 + spacingPx);
                }
            }), new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
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

    /* compiled from: BasicMarquee.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {380, 382, 386, 386}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        final /* synthetic */ androidx.compose.foundation.MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2) create(f, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[RETURN] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Float, java.lang.Object] */
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
            androidx.compose.animation.core.AnimationSpec m219createMarqueeAnimationSpecZ4HSEVQ;
            androidx.compose.animation.core.Animatable animatable2;
            java.lang.Float f2;
            androidx.compose.animation.core.AnimationSpec animationSpec;
            androidx.compose.animation.core.Animatable animatable3;
            androidx.compose.animation.core.Animatable animatable4;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            int i5 = 4;
            try {
                if (i4 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Float f3 = (java.lang.Float) this.L$0;
                    if (f3 != null) {
                        i = this.this$0.iterations;
                        float floatValue = f3.floatValue();
                        i2 = this.this$0.initialDelayMillis;
                        i3 = this.this$0.delayMillis;
                        f = this.this$0.velocity;
                        m219createMarqueeAnimationSpecZ4HSEVQ = androidx.compose.foundation.BasicMarqueeKt.m219createMarqueeAnimationSpecZ4HSEVQ(i, floatValue, i2, i3, f, androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this.this$0));
                        animatable2 = this.this$0.offset;
                        this.L$0 = f3;
                        this.L$1 = m219createMarqueeAnimationSpecZ4HSEVQ;
                        this.label = 1;
                        if (animatable2.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        f2 = f3;
                        animationSpec = m219createMarqueeAnimationSpecZ4HSEVQ;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            animatable4 = this.this$0.offset;
                            i5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                            this.label = 3;
                            if (animatable4.snapTo(i5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i4 == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i4 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th = (java.lang.Throwable) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    androidx.compose.animation.core.AnimationSpec animationSpec2 = (androidx.compose.animation.core.AnimationSpec) this.L$1;
                    java.lang.Float f4 = (java.lang.Float) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    animationSpec = animationSpec2;
                    f2 = f4;
                }
                animatable3 = this.this$0.offset;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (androidx.compose.animation.core.Animatable.animateTo$default(animatable3, f2, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable4 = this.this$0.offset;
                i5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                this.label = 3;
                if (animatable4.snapTo(i5, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th2) {
                animatable = this.this$0.offset;
                this.L$0 = th2;
                this.L$1 = null;
                this.label = i5;
                if (animatable.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }
}
