package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldCoreModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2", f = "TextFieldCoreModifier.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TextFieldCoreModifierNode$updateNode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState $textFieldState;
    int label;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$updateNode$2(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2> continuation) {
        super(2, continuation);
        this.$textFieldState = transformedTextFieldState;
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2(this.$textFieldState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(androidx.compose.foundation.text2.input.internal.FixedMotionDurationScale.INSTANCE, new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1(this.$textFieldState, this.this$0, null), this) == coroutine_suspended) {
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

    /* compiled from: TextFieldCoreModifier.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1", f = "TextFieldCoreModifier.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState $textFieldState;
        int label;
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$textFieldState = transformedTextFieldState;
            this.this$0 = textFieldCoreModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1(this.$textFieldState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.$textFieldState;
                this.label = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.TextFieldCharSequence>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.updateNode.2.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.compose.foundation.text2.input.TextFieldCharSequence invoke() {
                        return androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this.getText();
                    }
                }), new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1.AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
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

        /* compiled from: TextFieldCoreModifier.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {230, 232}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.text2.input.TextFieldCharSequence, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int label;
            final /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1.AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2.AnonymousClass1.AnonymousClass2) create(textFieldCharSequence, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.animation.core.Animatable animatable;
                androidx.compose.animation.core.Animatable animatable2;
                androidx.compose.animation.core.AnimationSpec animationSpec;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    animatable = this.this$0.cursorAlpha;
                    this.label = 1;
                    if (animatable.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                animatable2 = this.this$0.cursorAlpha;
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                animationSpec = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.cursorAnimationSpec;
                this.label = 2;
                if (androidx.compose.animation.core.Animatable.animateTo$default(animatable2, boxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
