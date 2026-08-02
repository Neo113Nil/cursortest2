package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnchoredDraggableState$anchoredDrag$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/material3/internal/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.material3.internal.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.material3.internal.DraggableAnchors<T> draggableAnchors = (androidx.compose.material3.internal.DraggableAnchors) this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function3<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
                anchoredDragScope = ((androidx.compose.material3.internal.AnchoredDraggableState) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = 1;
                if (function3.invoke(anchoredDragScope, draggableAnchors, this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2) create((androidx.compose.material3.internal.DraggableAnchors) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2 anonymousClass2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            anonymousClass2.Camera2StreamConfigurationMap = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function3;
            this.getHighSpeedVideoSizes = anchoredDraggableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            highSpeedVideoFpsRanges = androidx.compose.material3.internal.AnchoredDraggableKt.getHighSpeedVideoFpsRanges(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.material3.internal.DraggableAnchors anchors;
                    anchors = androidx.compose.material3.internal.AnchoredDraggableState.this.getAnchors();
                    return anchors;
                }
            }, new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this);
            if (highSpeedVideoFpsRanges == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$anchoredDrag$2(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anchoredDraggableState;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
