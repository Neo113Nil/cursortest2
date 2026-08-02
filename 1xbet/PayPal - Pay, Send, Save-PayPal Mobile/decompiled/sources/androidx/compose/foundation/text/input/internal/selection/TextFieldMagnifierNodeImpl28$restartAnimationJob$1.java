package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            final androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.this);
                }
            });
            final androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.animation.core.Animatable animatable;
                    androidx.compose.animation.core.Animatable animatable2;
                    androidx.compose.animation.core.Animatable animatable3;
                    long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) obj2).m5762unboximpl();
                    animatable = androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.this.getHighSpeedVideoSizesFor;
                    if ((((androidx.compose.ui.geometry.Offset) animatable.getValue()).m5762unboximpl() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats && (m5762unboximpl & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        animatable3 = androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.this.getHighSpeedVideoSizesFor;
                        if (java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) animatable3.getValue()).m5762unboximpl() & 4294967295L)) != java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L))) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.this, m5762unboximpl, null), 3, null);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    animatable2 = androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.this.getHighSpeedVideoSizesFor;
                    java.lang.Object snapTo = animatable2.snapTo(androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl), continuation);
                    if (snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return snapTo;
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ long Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRanges;
                    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.animation.core.Animatable animatable;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighSpeedVideoFpsRanges;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            animatable = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
                            this.getHighSpeedVideoFpsRanges = 1;
                            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, androidx.compose.ui.geometry.Offset.m5741boximpl(this.Camera2StreamConfigurationMap), androidx.compose.foundation.text.selection.SelectionMagnifierKt.getMagnifierSpringSpec(), null, null, this, 12, null) == coroutine_suspended) {
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
                        return ((androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.AnonymousClass2.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRangesFor = textFieldMagnifierNodeImpl28;
                        this.Camera2StreamConfigurationMap = j;
                    }
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

    public static /* synthetic */ androidx.compose.ui.geometry.Offset getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        boolean z;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState;
        long Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2;
        z = textFieldMagnifierNodeImpl28.getHighSpeedVideoSizes;
        if (!z) {
            textFieldSelectionState2 = textFieldMagnifierNodeImpl28.getHighSpeedVideoFpsRangesFor;
            if (textFieldSelectionState2.getDirectDragGestureInitiator() != androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.Touch) {
                return androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
            }
        }
        transformedTextFieldState = textFieldMagnifierNodeImpl28.getHighResolutionOutputSizeshNQ4ISI;
        textFieldSelectionState = textFieldMagnifierNodeImpl28.getHighSpeedVideoFpsRangesFor;
        textLayoutState = textFieldMagnifierNodeImpl28.getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = textFieldMagnifierNodeImpl28.Camera2StreamConfigurationMap();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierKt.m2297calculateSelectionMagnifierCenterAndroidhUlJWOE(transformedTextFieldState, textFieldSelectionState, textLayoutState, Camera2StreamConfigurationMap));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.getHighSpeedVideoSizes = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldMagnifierNodeImpl28$restartAnimationJob$1(androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = textFieldMagnifierNodeImpl28;
    }
}
