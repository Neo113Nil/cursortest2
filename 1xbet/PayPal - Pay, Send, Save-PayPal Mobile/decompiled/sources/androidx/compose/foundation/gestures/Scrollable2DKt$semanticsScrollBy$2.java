package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", i = {}, l = {510}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Scrollable2DKt$semanticsScrollBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object animate;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.Camera2StreamConfigurationMap;
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE);
            androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            androidx.compose.ui.geometry.Offset m5741boximpl2 = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighResolutionOutputSizeshNQ4ISI);
            final kotlin.jvm.internal.Ref.LongRef longRef = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            animate = androidx.compose.animation.core.SuspendAnimationKt.animate(vectorConverter, m5741boximpl, m5741boximpl2, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : null, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2.getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.LongRef.this, nestedScrollScope, (androidx.compose.ui.geometry.Offset) obj2);
                    return highSpeedVideoSizes;
                }
            }, this);
            if (animate == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, androidx.compose.ui.geometry.Offset offset) {
        longRef.element = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(longRef.element, nestedScrollScope.mo1490scrollByOzD1aCk(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(offset.m5762unboximpl(), longRef.element), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        scrollable2DKt$semanticsScrollBy$2.Camera2StreamConfigurationMap = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Scrollable2DKt$semanticsScrollBy$2(long j, kotlin.jvm.internal.Ref.LongRef longRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = longRef;
    }
}
