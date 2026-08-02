package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onTap", "tapPressTextFieldModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldPressGestureFilterKt {
    public static /* synthetic */ androidx.compose.ui.Modifier tapPressTextFieldModifier$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z, function1);
    }

    public static final androidx.compose.ui.Modifier tapPressTextFieldModifier(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1) {
        return z ? androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, mutableInteractionSource, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-102778667);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, 0);
        boolean changed = composer.changed(mutableInteractionSource);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, mutableInteractionSource);
                    return Camera2StreamConfigurationMap;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(mutableInteractionSource, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, composer, 0);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean changedInstance = composer.changedInstance(coroutineScope);
        boolean changed2 = composer.changed(mutableInteractionSource);
        boolean changed3 = composer.changed(rememberUpdatedState);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance | changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(coroutineScope, mutableState, mutableInteractionSource, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, mutableInteractionSource, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap(final androidx.compose.runtime.MutableState mutableState, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$lambda$0$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.interaction.PressInteraction.Press press = (androidx.compose.foundation.interaction.PressInteraction.Press) androidx.compose.runtime.MutableState.this.getValue();
                if (press != null) {
                    androidx.compose.foundation.interaction.PressInteraction.Cancel cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(press);
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.tryEmit(cancel);
                    }
                    androidx.compose.runtime.MutableState.this.setValue(null);
                }
            }
        };
    }
}
