package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
        /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getOutputFormats;

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"}, v = 1)
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00211 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ long Camera2StreamConfigurationMap;
            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState;
                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState2;
                androidx.compose.foundation.interaction.PressInteraction.Press press;
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
                androidx.compose.foundation.interaction.PressInteraction.Press press2;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoSizes;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.PressInteraction.Press value = this.getHighSpeedVideoFpsRanges.getValue();
                    if (value != null) {
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.getHighSpeedVideoFpsRangesFor;
                        mutableState = this.getHighSpeedVideoFpsRanges;
                        androidx.compose.foundation.interaction.PressInteraction.Cancel cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(value);
                        if (mutableInteractionSource2 != null) {
                            this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
                            this.getHighSpeedVideoSizes = 1;
                            if (mutableInteractionSource2.emit(cancel, this) != coroutine_suspended) {
                                mutableState2 = mutableState;
                            }
                            return coroutine_suspended;
                        }
                        mutableState.setValue(null);
                    }
                    press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.Camera2StreamConfigurationMap, null);
                    mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor;
                    if (mutableInteractionSource != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = press;
                        this.getHighSpeedVideoSizes = 2;
                        if (mutableInteractionSource.emit(press, this) != coroutine_suspended) {
                            press2 = press;
                            press = press2;
                        }
                        return coroutine_suspended;
                    }
                    this.getHighSpeedVideoFpsRanges.setValue(press);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    press2 = (androidx.compose.foundation.interaction.PressInteraction.Press) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    press = press2;
                    this.getHighSpeedVideoFpsRanges.setValue(press);
                    return kotlin.Unit.INSTANCE;
                }
                mutableState2 = (androidx.compose.runtime.MutableState) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.Camera2StreamConfigurationMap, null);
                mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor;
                if (mutableInteractionSource != null) {
                }
                this.getHighSpeedVideoFpsRanges.setValue(press);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00211) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00211(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00211(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00211> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = mutableState;
                this.Camera2StreamConfigurationMap = j;
                this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.getOutputFormats;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00211(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                this.getHighSpeedVideoSizes = 1;
                obj = pressGestureScope.tryAwaitRelease(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, ((java.lang.Boolean) obj).booleanValue(), this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            java.lang.Object Camera2StreamConfigurationMap;
            final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState;
                androidx.compose.foundation.interaction.PressInteraction.Cancel cancel;
                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState2;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.PressInteraction.Press value = this.getHighSpeedVideoFpsRangesFor.getValue();
                    if (value != null) {
                        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoSizes;
                        mutableState = this.getHighSpeedVideoFpsRangesFor;
                        if (z) {
                            cancel = new androidx.compose.foundation.interaction.PressInteraction.Release(value);
                        } else {
                            cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(value);
                        }
                        if (mutableInteractionSource != null) {
                            this.Camera2StreamConfigurationMap = mutableState;
                            this.getHighSpeedVideoFpsRanges = 1;
                            if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState2 = (androidx.compose.runtime.MutableState) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = mutableState;
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                this.getHighSpeedVideoSizes = mutableInteractionSource;
            }
        }

        private java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getOutputFormats = pressGestureScope;
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = j;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return Camera2StreamConfigurationMap(pressGestureScope, offset.m5762unboximpl(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = coroutineScope;
            this.getHighSpeedVideoFpsRanges = mutableState;
            this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null);
        final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>> state = this.Camera2StreamConfigurationMap;
        java.lang.Object detectTapAndPress = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State.this, (androidx.compose.ui.geometry.Offset) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, continuation);
        return detectTapAndPress == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndPress : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State state, androidx.compose.ui.geometry.Offset offset) {
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(offset);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> mutableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit>> state) {
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableInteractionSource;
        this.Camera2StreamConfigurationMap = state;
    }
}
