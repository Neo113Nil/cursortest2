package androidx.compose.foundation.text;

/* compiled from: TextFieldScroll.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0000¨\u0006\u001b"}, d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", com.helpshift.proactive.InAppViewConstants.RTL, "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* compiled from: TextFieldScroll.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.Orientation.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ androidx.compose.ui.Modifier textFieldScrollable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z);
    }

    public static final androidx.compose.ui.Modifier textFieldScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> function0) {
        androidx.compose.foundation.text.VerticalScrollLayoutModifier verticalScrollLayoutModifier;
        androidx.compose.foundation.gestures.Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m939getOffsetToFollow5zctL8 = textFieldScrollerPosition.m939getOffsetToFollow5zctL8(textFieldValue.getSelection());
        textFieldScrollerPosition.m941setPreviousSelection5zctL8(textFieldValue.getSelection());
        androidx.compose.ui.text.input.TransformedText filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i = androidx.compose.foundation.text.TextFieldScrollKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            verticalScrollLayoutModifier = new androidx.compose.foundation.text.VerticalScrollLayoutModifier(textFieldScrollerPosition, m939getOffsetToFollow5zctL8, filterWithValidation, function0);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new androidx.compose.foundation.text.HorizontalScrollLayoutModifier(textFieldScrollerPosition, m939getOffsetToFollow5zctL8, filterWithValidation, function0);
        }
        return androidx.compose.ui.draw.ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getCursorRectInScroller(androidx.compose.ui.unit.Density density, int i, androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.TextLayoutResult textLayoutResult, boolean z, int i2) {
        androidx.compose.ui.geometry.Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.geometry.Rect rect = zero;
        int mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(androidx.compose.foundation.text.TextFieldCursorKt.getDefaultCursorThickness());
        if (z) {
            left = (i2 - rect.getLeft()) - mo309roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i2 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + mo309roundToPx0680j_4;
        }
        return androidx.compose.ui.geometry.Rect.copy$default(rect, f, 0.0f, left2, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.Modifier textFieldScrollable(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final boolean z) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", androidx.compose.foundation.text.TextFieldScrollerPosition.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier scrollable;
                composer.startReplaceableGroup(805428266);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C68@2901L7,70@3046L412,83@3610L352:TextFieldScroll.kt#423gt5");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localLayoutDirection);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                boolean z2 = androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical || !(consume == androidx.compose.ui.unit.LayoutDirection.Rtl);
                composer.startReplaceableGroup(753734506);
                boolean changed = composer.changed(androidx.compose.foundation.text.TextFieldScrollerPosition.this);
                final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition2 = androidx.compose.foundation.text.TextFieldScrollerPosition.this;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
                            return invoke(f.floatValue());
                        }

                        public final java.lang.Float invoke(float f) {
                            float offset = androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOffset() + f;
                            if (offset > androidx.compose.foundation.text.TextFieldScrollerPosition.this.getMaximum()) {
                                f = androidx.compose.foundation.text.TextFieldScrollerPosition.this.getMaximum() - androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOffset();
                            } else if (offset < 0.0f) {
                                f = -androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOffset();
                            }
                            androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = androidx.compose.foundation.text.TextFieldScrollerPosition.this;
                            textFieldScrollerPosition3.setOffset(textFieldScrollerPosition3.getOffset() + f);
                            return java.lang.Float.valueOf(f);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final androidx.compose.foundation.gestures.ScrollableState rememberScrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState((kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
                final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = androidx.compose.foundation.text.TextFieldScrollerPosition.this;
                composer.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(textFieldScrollerPosition3);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new androidx.compose.foundation.gestures.ScrollableState(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                        /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
                        private final androidx.compose.runtime.State canScrollBackward;

                        /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
                        private final androidx.compose.runtime.State canScrollForward;

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float delta) {
                            return androidx.compose.foundation.gestures.ScrollableState.this.dispatchRawDelta(delta);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return androidx.compose.foundation.gestures.ScrollableState.this.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return androidx.compose.foundation.gestures.ScrollableState.this.scroll(mutatePriority, function2, continuation);
                        }

                        {
                            this.canScrollForward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOffset() < androidx.compose.foundation.text.TextFieldScrollerPosition.this.getMaximum());
                                }
                            });
                            this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.ui.Modifier.INSTANCE, (androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, androidx.compose.foundation.text.TextFieldScrollerPosition.this.getOrientation(), (r14 & 4) != 0 ? true : z && androidx.compose.foundation.text.TextFieldScrollerPosition.this.getMaximum() != 0.0f, (r14 & 8) != 0 ? false : z2, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return scrollable;
            }
        });
    }
}
