package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> state = this.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this);
                }
            });
            final androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animatable = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) obj2).m5762unboximpl();
                    if ((animatable.getValue().m5762unboximpl() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats && (m5762unboximpl & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats && java.lang.Float.intBitsToFloat((int) (animatable.getValue().m5762unboximpl() & 4294967295L)) != java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L))) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.AnonymousClass2.AnonymousClass1(animatable, m5762unboximpl, null), 3, null);
                    } else {
                        java.lang.Object snapTo = animatable.snapTo(androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl), continuation);
                        if (snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return snapTo;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighSpeedVideoSizes;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighSpeedVideoSizes = 1;
                            if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRanges, androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighResolutionOutputSizeshNQ4ISI), androidx.compose.foundation.text.selection.SelectionMagnifierKt.getMagnifierSpringSpec(), null, null, this, 12, null) == coroutine_suspended) {
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
                        return ((androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.AnonymousClass2.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animatable, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.AnonymousClass2.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRanges = animatable;
                        this.getHighResolutionOutputSizeshNQ4ISI = j;
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

    public static /* synthetic */ androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state) {
        long m5762unboximpl;
        m5762unboximpl = ((androidx.compose.ui.geometry.Offset) state.getValue()).m5762unboximpl();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> state, androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animatable, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRanges = animatable;
    }
}
