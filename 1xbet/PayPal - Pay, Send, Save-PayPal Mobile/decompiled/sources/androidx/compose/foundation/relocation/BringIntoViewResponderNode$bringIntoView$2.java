package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class BringIntoViewResponderNode$bringIntoView$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewResponderNode Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), 3, null);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return launch$default;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewResponderNode Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (this.Camera2StreamConfigurationMap.getResponder().bringChildIntoView(new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1.C00191(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        static final /* synthetic */ class C00191 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> {
            final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewResponderNode getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoSizes;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.ui.geometry.Rect highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.relocation.BringIntoViewResponderNode.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
                return highSpeedVideoSizes;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00191(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0) {
                super(0, kotlin.jvm.internal.Intrinsics.Kotlin.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.getHighSpeedVideoFpsRanges = bringIntoViewResponderNode;
                this.getHighSpeedVideoSizes = layoutCoordinates;
                this.Camera2StreamConfigurationMap = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = bringIntoViewResponderNode;
            this.getHighSpeedVideoFpsRanges = layoutCoordinates;
            this.getHighSpeedVideoFpsRangesFor = function0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewResponderNode Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = bringIntoViewResponderNode;
            this.getHighSpeedVideoSizes = function0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
        return ((androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        bringIntoViewResponderNode$bringIntoView$2.getInputSizeshNQ4ISI = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderNode$bringIntoView$2(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function02, kotlin.coroutines.Continuation<? super androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bringIntoViewResponderNode;
        this.getHighSpeedVideoFpsRanges = layoutCoordinates;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
    }
}
