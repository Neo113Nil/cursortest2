package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnchoredDraggableState$anchoredDrag$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ T getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
            final androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState = this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            highSpeedVideoFpsRanges = androidx.compose.material3.internal.AnchoredDraggableKt.getHighSpeedVideoFpsRanges(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Pair pair;
                    pair = kotlin.TuplesKt.to(r0.getAnchors(), androidx.compose.material3.internal.AnchoredDraggableState.this.getTargetValue());
                    return pair;
                }
            }, new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), this);
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "<destruct>", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends androidx.compose.material3.internal.DraggableAnchors<T>, ? extends T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Pair pair = (kotlin.Pair) this.getHighSpeedVideoFpsRanges;
                androidx.compose.material3.internal.DraggableAnchors draggableAnchors = (androidx.compose.material3.internal.DraggableAnchors) pair.component1();
                java.lang.Object component2 = pair.component2();
                kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function4 = this.getHighSpeedVideoSizes;
                anchoredDragScope = ((androidx.compose.material3.internal.AnchoredDraggableState) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (function4.invoke(anchoredDragScope, draggableAnchors, component2, this) == coroutine_suspended) {
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
            return ((androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2) create((kotlin.Pair) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2 anonymousClass2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function4<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function4;
            this.getHighSpeedVideoFpsRangesFor = anchoredDraggableState;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$anchoredDrag$4(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, T t, kotlin.jvm.functions.Function4<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = anchoredDraggableState;
        this.getHighSpeedVideoFpsRanges = t;
        this.getHighSpeedVideoSizes = function4;
    }
}
