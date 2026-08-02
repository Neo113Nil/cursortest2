package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {1119}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class ScrollableKt$semanticsScrollBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.Camera2StreamConfigurationMap;
            float m1537toFloatk4lQ0M = this.getHighResolutionOutputSizeshNQ4ISI.m1537toFloatk4lQ0M(this.getHighSpeedVideoFpsRanges);
            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoSizes;
            final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(0.0f, m1537toFloatk4lQ0M, 0.0f, null, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef.this, scrollingLogic, nestedScrollScope, ((java.lang.Float) obj2).floatValue());
                    return highSpeedVideoFpsRangesFor;
                }
            }, this, 12, null) == coroutine_suspended) {
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
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, float f) {
        floatRef.element += scrollingLogic.reverseIfNeeded(scrollingLogic.m1537toFloatk4lQ0M(nestedScrollScope.mo1490scrollByOzD1aCk(scrollingLogic.m1538toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f - floatRef.element)), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        scrollableKt$semanticsScrollBy$2.Camera2StreamConfigurationMap = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$semanticsScrollBy$2(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, long j, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = scrollingLogic;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = floatRef;
    }
}
