package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B5\u0012,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bR<\u0010\u000f\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u000eR#\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/compose/ui/viewinterop/BringIntoViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "()V", "onDetach", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BringIntoViewNode extends androidx.compose.ui.Modifier.Node {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Rect, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Rect, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Rect rect) {
            Camera2StreamConfigurationMap(rect);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", i = {}, l = {763}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.ui.viewinterop.BringIntoViewNode getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.viewinterop.BringIntoViewNode bringIntoViewNode = this.getHighSpeedVideoSizes;
                    final androidx.compose.ui.geometry.Rect rect = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewNode, new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.ui.geometry.Rect invoke() {
                            return androidx.compose.ui.geometry.Rect.this;
                        }

                        {
                            super(0);
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

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(androidx.compose.ui.viewinterop.BringIntoViewNode bringIntoViewNode, androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1.AnonymousClass1> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoSizes = bringIntoViewNode;
                this.getHighSpeedVideoFpsRanges = rect;
            }
        }

        public final void Camera2StreamConfigurationMap(androidx.compose.ui.geometry.Rect rect) {
            if (androidx.compose.ui.viewinterop.BringIntoViewNode.this.getIsAttached()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.compose.ui.viewinterop.BringIntoViewNode.this.getCoroutineScope(), null, null, new androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1.AnonymousClass1(androidx.compose.ui.viewinterop.BringIntoViewNode.this, rect, null), 3, null);
            }
        }

        {
            super(1);
        }
    };

    public BringIntoViewNode(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit>, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.getHighSpeedVideoFpsRangesFor.invoke(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighSpeedVideoFpsRangesFor.invoke(null);
    }
}
