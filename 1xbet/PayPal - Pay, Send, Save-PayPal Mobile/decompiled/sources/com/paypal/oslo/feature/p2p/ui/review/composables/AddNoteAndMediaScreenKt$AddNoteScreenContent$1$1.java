package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1", f = "AddNoteAndMediaScreen.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, nl = {152}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.ScrollState scrollState = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    int maxValue;
                    maxValue = androidx.compose.foundation.ScrollState.this.getMaxValue();
                    return java.lang.Integer.valueOf(maxValue);
                }
            })), new com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "maxValue", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1$2", f = "AddNoteAndMediaScreen.kt", i = {0}, l = {149}, m = "invokeSuspend", n = {"maxValue"}, nl = {151}, s = {"I$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.ScrollState Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (i > 0) {
                    this.getHighSpeedVideoFpsRangesFor = i;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (androidx.compose.foundation.ScrollState.animateScrollTo$default(this.Camera2StreamConfigurationMap, i, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1.AnonymousClass2) create(java.lang.Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1.AnonymousClass2(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass2.getHighSpeedVideoFpsRangesFor = ((java.lang.Number) obj).intValue();
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.foundation.ScrollState scrollState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = scrollState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1(androidx.compose.foundation.ScrollState scrollState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.AddNoteAndMediaScreenKt$AddNoteScreenContent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = scrollState;
    }
}
