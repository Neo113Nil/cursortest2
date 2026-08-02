package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "key", "Landroidx/compose/runtime/MutableFloatState;", androidx.constraintlayout.motion.widget.Key.MOTIONPROGRESS, "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "motionPointerInput", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/MotionMeasurer;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MotionDragHandlerKt {
    public static final androidx.compose.ui.Modifier motionPointerInput(androidx.compose.ui.Modifier modifier, final java.lang.Object obj, final androidx.compose.runtime.MutableFloatState mutableFloatState, final androidx.constraintlayout.compose.MotionMeasurer motionMeasurer) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("motionPointerInput");
                inspectorInfo.getProperties().set("key", obj);
                inspectorInfo.getProperties().set(androidx.constraintlayout.motion.widget.Key.MOTIONPROGRESS, mutableFloatState);
                inspectorInfo.getProperties().set("measurer", motionMeasurer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return getHighSpeedVideoSizes(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier then;
                composer.startReplaceGroup(146198586);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(146198586, i, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
                }
                if (!androidx.constraintlayout.compose.MotionMeasurer.this.getTransition().hasOnSwipe()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifier2;
                }
                boolean changed = composer.changed(obj);
                androidx.constraintlayout.compose.MotionMeasurer motionMeasurer2 = androidx.constraintlayout.compose.MotionMeasurer.this;
                androidx.compose.runtime.MutableFloatState mutableFloatState2 = mutableFloatState;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.constraintlayout.compose.TransitionHandler(motionMeasurer2, mutableFloatState2);
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.constraintlayout.compose.TransitionHandler transitionHandler = (androidx.constraintlayout.compose.TransitionHandler) rememberedValue;
                boolean changed2 = composer.changed(obj);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue2;
                java.lang.Object obj2 = obj;
                boolean changedInstance = composer.changedInstance(transitionHandler);
                boolean changedInstance2 = composer.changedInstance(channel);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1(transitionHandler, channel, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(obj2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, 0);
                java.lang.Object obj3 = obj;
                boolean changedInstance3 = composer.changedInstance(transitionHandler);
                boolean changedInstance4 = composer.changedInstance(channel);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1(transitionHandler, channel, null);
                    composer.updateRememberedValue(rememberedValue4);
                }
                then = modifier2.then(new androidx.compose.ui.input.pointer.SuspendPointerInputElement(obj3, null, null, new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((kotlin.jvm.functions.Function2) rememberedValue4), 6, null));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        });
    }

    public static final /* synthetic */ java.lang.Object access$detectDragGesturesWhenNeeded(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(function1, function12, function2, function02, function0, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }
}
