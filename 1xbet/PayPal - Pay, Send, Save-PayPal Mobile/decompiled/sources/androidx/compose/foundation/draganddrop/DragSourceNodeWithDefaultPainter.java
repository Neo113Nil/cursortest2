package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BL\u0012-\u0010\t\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0004\b\u0001`\u0007¢\u0006\u0002\b\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetector;", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "p1", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DragSourceNodeWithDefaultPainter extends androidx.compose.ui.node.DelegatingNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final androidx.compose.foundation.draganddrop.DragAndDropSourceNode getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback getHighSpeedVideoFpsRanges;

    public DragSourceNodeWithDefaultPainter(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> function1) {
        androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback();
        delegate(androidx.compose.ui.draw.DrawModifierKt.CacheDrawModifierNode(new androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.getHighSpeedVideoFpsRanges = cacheDrawScopeDragShadowCallback;
        this.getHighSpeedVideoSizes = (androidx.compose.foundation.draganddrop.DragAndDropSourceNode) delegate(new androidx.compose.foundation.draganddrop.DragAndDropSourceNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter.Camera2StreamConfigurationMap(androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        }, function2, function1));
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        dragSourceNodeWithDefaultPainter.getHighSpeedVideoFpsRanges.drawDragShadow(drawScope);
        return kotlin.Unit.INSTANCE;
    }
}
