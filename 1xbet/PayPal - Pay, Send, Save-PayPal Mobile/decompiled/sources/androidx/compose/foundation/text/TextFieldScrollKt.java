package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001e\u001a\u00020\u001d*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "textFieldScrollable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "defaultTextFieldScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Density;", "", "p0", "Landroidx/compose/ui/text/input/TransformedText;", "p1", "Landroidx/compose/ui/text/TextLayoutResult;", "p2", "p3", "p4", "Landroidx/compose/ui/geometry/Rect;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/TextLayoutResult;ZI)Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldScrollKt {
    public static /* synthetic */ androidx.compose.ui.Modifier textFieldScrollable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, androidx.compose.foundation.OverscrollEffect overscrollEffect, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z, overscrollEffect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, boolean z, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-2137546592);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2137546592, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
        }
        boolean z2 = textFieldScrollerPosition.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical || !(composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl);
        boolean changed = composer.changed(textFieldScrollerPosition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    float Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldScrollKt.Camera2StreamConfigurationMap(androidx.compose.foundation.text.TextFieldScrollerPosition.this, ((java.lang.Float) obj).floatValue());
                    return java.lang.Float.valueOf(Camera2StreamConfigurationMap);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.ScrollableState rememberScrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState((kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
        boolean changed2 = composer.changed(rememberScrollableState);
        boolean changed3 = composer.changed(textFieldScrollerPosition);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(rememberScrollableState, textFieldScrollerPosition);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.ui.Modifier scrollable$default = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(androidx.compose.ui.Modifier.INSTANCE, (androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, textFieldScrollerPosition.getOrientation(), overscrollEffect, z && textFieldScrollerPosition.getMaximum() != 0.0f, z2, null, mutableInteractionSource, null, 160, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return scrollable$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, float f) {
        float offset = textFieldScrollerPosition.getOffset() + f;
        if (offset > textFieldScrollerPosition.getMaximum()) {
            f = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f = -textFieldScrollerPosition.getOffset();
        }
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f);
        return f;
    }

    public static final androidx.compose.ui.Modifier defaultTextFieldScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> function0) {
        androidx.compose.foundation.text.VerticalScrollLayoutModifier verticalScrollLayoutModifier;
        androidx.compose.foundation.gestures.Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m2128getOffsetToFollow5zctL8 = textFieldScrollerPosition.m2128getOffsetToFollow5zctL8(textFieldValue.getSelection());
        textFieldScrollerPosition.m2130setPreviousSelection5zctL8(textFieldValue.getSelection());
        androidx.compose.ui.text.input.TransformedText filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i = androidx.compose.foundation.text.TextFieldScrollKt.WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            verticalScrollLayoutModifier = new androidx.compose.foundation.text.VerticalScrollLayoutModifier(textFieldScrollerPosition, m2128getOffsetToFollow5zctL8, filterWithValidation, function0);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new androidx.compose.foundation.text.HorizontalScrollLayoutModifier(textFieldScrollerPosition, m2128getOffsetToFollow5zctL8, filterWithValidation, function0);
        }
        return androidx.compose.ui.draw.ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density density, int i, androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.TextLayoutResult textLayoutResult, boolean z, int i2) {
        androidx.compose.ui.geometry.Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.geometry.Rect rect = zero;
        int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.getDefaultCursorThickness());
        if (z) {
            left = (i2 - rect.getLeft()) - mo1412roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i2 - rect.getLeft();
        } else {
            left2 = mo1412roundToPx0680j_4 + rect.getLeft();
        }
        return androidx.compose.ui.geometry.Rect.copy$default(rect, f, 0.0f, left2, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.Modifier textFieldScrollable(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final boolean z, final androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldScrollKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextFieldScrollerPosition.this, z, overscrollEffect, mutableInteractionSource, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}
