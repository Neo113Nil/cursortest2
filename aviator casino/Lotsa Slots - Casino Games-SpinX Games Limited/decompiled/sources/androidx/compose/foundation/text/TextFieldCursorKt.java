package androidx.compose.foundation.text;

/* compiled from: TextFieldCursor.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> cursorAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf, 0);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf, 499);
            java.lang.Float valueOf2 = java.lang.Float.valueOf(0.0f);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf2, 500);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = androidx.compose.ui.unit.Dp.m4478constructorimpl(2);

    public static final androidx.compose.ui.Modifier cursor(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.TextFieldState textFieldState, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final androidx.compose.ui.text.input.OffsetMapping offsetMapping, final androidx.compose.ui.graphics.Brush brush, boolean z) {
        return z ? androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier.Companion companion;
                composer.startReplaceableGroup(1634330012);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C45@1739L27,48@1941L491:TextFieldCursor.kt#423gt5");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.animation.core.AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue;
                androidx.compose.ui.graphics.Brush brush2 = androidx.compose.ui.graphics.Brush.this;
                boolean z2 = ((brush2 instanceof androidx.compose.ui.graphics.SolidColor) && ((androidx.compose.ui.graphics.SolidColor) brush2).getValue() == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) ? false : true;
                if (textFieldState.getHasFocus() && androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && z2) {
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(textFieldValue.getAnnotatedString(), androidx.compose.ui.text.TextRange.m3952boximpl(textFieldValue.getSelection()), new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1(animatable, null), composer, 512);
                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = offsetMapping;
                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                    final androidx.compose.foundation.text.TextFieldState textFieldState2 = textFieldState;
                    final androidx.compose.ui.graphics.Brush brush3 = androidx.compose.ui.graphics.Brush.this;
                    companion = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(modifier2, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                            androidx.compose.ui.geometry.Rect rect;
                            androidx.compose.ui.text.TextLayoutResult value;
                            contentDrawScope.drawContent();
                            float coerceIn = kotlin.ranges.RangesKt.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (coerceIn == 0.0f) {
                                return;
                            }
                            int originalToTransformed = offsetMapping2.originalToTransformed(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue2.getSelection()));
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                                rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float f = contentDrawScope.mo315toPx0680j_4(androidx.compose.foundation.text.TextFieldCursorKt.getDefaultCursorThickness());
                            float f2 = f / 2;
                            float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(rect.getLeft() + f2, androidx.compose.ui.geometry.Size.m1940getWidthimpl(contentDrawScope.mo2592getSizeNHjbRc()) - f2), f2);
                            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2663drawLine1RTmtNc$default(contentDrawScope, brush3, androidx.compose.ui.geometry.OffsetKt.Offset(coerceAtLeast, rect.getTop()), androidx.compose.ui.geometry.OffsetKt.Offset(coerceAtLeast, rect.getBottom()), f, 0, null, coerceIn, null, 0, 432, null);
                        }
                    });
                } else {
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return companion;
            }

            /* compiled from: TextFieldCursor.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> $cursorAlpha;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1(this.$cursorAlpha, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (kotlinx.coroutines.BuildersKt.withContext(androidx.compose.foundation.text.FixedMotionDurationScale.INSTANCE, new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1.C00261(this.$cursorAlpha, null), this) == coroutine_suspended) {
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

                /* compiled from: TextFieldCursor.kt */
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {53, 55}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00261 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> $cursorAlpha;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00261(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1.C00261> continuation) {
                        super(2, continuation);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1.C00261(this.$cursorAlpha, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.AnonymousClass1.C00261) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.animation.core.AnimationSpec animationSpec;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$cursorAlpha.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
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
                        androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.$cursorAlpha;
                        java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                        animationSpec = androidx.compose.foundation.text.TextFieldCursorKt.cursorAnimationSpec;
                        this.label = 2;
                        if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
