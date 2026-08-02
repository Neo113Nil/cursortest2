package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionState$selectionHandleGestures$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (this.getHighSpeedVideoSizes.detectTouchMode(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = textFieldSelectionState;
            this.getHighSpeedVideoFpsRangesFor = pointerInputScope;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), 1, null);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), 1, null);
            final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = this.getHighSpeedVideoSizes;
            launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
                }
            });
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass4(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), 1, null);
            return launch$default2;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope Camera2StreamConfigurationMap;
        final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = this.Camera2StreamConfigurationMap;
                final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = this.getHighSpeedVideoFpsRangesFor;
                final boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.foundation.text.input.internal.selection.TapOnPosition tapOnPosition = new androidx.compose.foundation.text.input.internal.selection.TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                    /* renamed from: onEvent-k-4lQ0M */
                    public final void mo2292onEventk4lQ0M(long j) {
                        androidx.compose.foundation.text.Handle handle;
                        long highResolutionOutputSizeshNQ4ISI;
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$markStartContentVisibleOffset(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this;
                        if (z) {
                            handle = androidx.compose.foundation.text.Handle.SelectionStart;
                        } else {
                            handle = androidx.compose.foundation.text.Handle.SelectionEnd;
                        }
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getHighResolutionOutputSizeshNQ4ISI(z);
                        textFieldSelectionState2.m2309updateHandleDraggingUv8p0NA(handle, androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(highResolutionOutputSizeshNQ4ISI));
                    }
                };
                final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                if (androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2.getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
                    }
                }, this) == coroutine_suspended) {
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

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
            textFieldSelectionState.clearHandleDragging();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = pointerInputScope;
            this.getHighSpeedVideoFpsRangesFor = textFieldSelectionState;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4", f = "TextFieldSelectionState.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this);
                if (Camera2StreamConfigurationMap == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass4(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass4> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = textFieldSelectionState;
            this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
            this.getHighSpeedVideoFpsRanges = z;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.clearHandleDragging();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
        return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        textFieldSelectionState$selectionHandleGestures$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$selectionHandleGestures$2(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = textFieldSelectionState;
        this.getHighSpeedVideoFpsRangesFor = pointerInputScope;
        this.Camera2StreamConfigurationMap = z;
    }
}
