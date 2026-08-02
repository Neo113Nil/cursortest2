package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR7\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends androidx.compose.ui.node.DelegatingNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoFpsRangesFor;

    public LegacyDragSourceNodeWithDefaultPainter(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        final androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback();
        delegate(androidx.compose.ui.draw.DrawModifierKt.CacheDrawModifierNode(new androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        delegate(new androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.getHighSpeedVideoFpsRanges(androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        }, new androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.AnonymousClass2(null)));
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropSourceScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.draganddrop.DragAndDropSourceScope dragAndDropSourceScope = (androidx.compose.foundation.draganddrop.DragAndDropSourceScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2 = androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                if (function2.invoke(dragAndDropSourceScope, this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.draganddrop.DragAndDropSourceScope dragAndDropSourceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.AnonymousClass2) create(dragAndDropSourceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.AnonymousClass2 anonymousClass2 = androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.this.new AnonymousClass2(continuation);
            anonymousClass2.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass2;
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        return kotlin.Unit.INSTANCE;
    }
}
