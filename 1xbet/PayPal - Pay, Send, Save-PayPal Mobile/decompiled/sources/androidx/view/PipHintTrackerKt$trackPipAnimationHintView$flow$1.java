package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/graphics/Rect;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes5.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super android.graphics.Rect>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.view.View getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.channels.ProducerScope.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            final android.view.View view = this.getHighSpeedVideoSizes;
            final android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU(androidx.view.Activity.access$trackPipAnimationHintView$positionInWindow(view));
                }
            };
            final android.view.View view2 = this.getHighSpeedVideoSizes;
            final ?? r4 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                    producerScope.mo9266trySendJP2dKIU(androidx.view.Activity.access$trackPipAnimationHintView$positionInWindow(view2));
                    view2.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                    v.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.getHighSpeedVideoSizes.isAttachedToWindow()) {
                producerScope.mo9266trySendJP2dKIU(androidx.view.Activity.access$trackPipAnimationHintView$positionInWindow(this.getHighSpeedVideoSizes));
                this.getHighSpeedVideoSizes.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.getHighSpeedVideoSizes.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.getHighSpeedVideoSizes.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r4);
            final android.view.View view3 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1.getHighResolutionOutputSizeshNQ4ISI(view3, onScrollChangedListener, onLayoutChangeListener, r4);
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

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.channels.ProducerScope producerScope, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(view);
        producerScope.mo9266trySendJP2dKIU(androidx.view.Activity.access$trackPipAnimationHintView$positionInWindow(view));
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, android.view.View.OnLayoutChangeListener onLayoutChangeListener, androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
        view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        view.removeOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super android.graphics.Rect> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.getHighSpeedVideoSizes, continuation);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipHintTrackerKt$trackPipAnimationHintView$flow$1(android.view.View view, kotlin.coroutines.Continuation<? super androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = view;
    }
}
