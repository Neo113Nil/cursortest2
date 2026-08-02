package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<androidx.compose.ui.draganddrop.DragAndDropTransferData, androidx.compose.ui.geometry.Size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? extends kotlin.Unit>, java.lang.Boolean> {
    private java.lang.Boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        boolean highSpeedVideoSizes;
        highSpeedVideoSizes = ((androidx.compose.ui.platform.AndroidComposeView) this.receiver).getHighSpeedVideoSizes(dragAndDropTransferData, j, function1);
        return java.lang.Boolean.valueOf(highSpeedVideoSizes);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, androidx.compose.ui.geometry.Size size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? extends kotlin.Unit> function1) {
        return getHighSpeedVideoFpsRangesFor(dragAndDropTransferData, size.m5826unboximpl(), function1);
    }

    AndroidComposeView$dragAndDropManager$1(java.lang.Object obj) {
        super(3, obj, androidx.compose.ui.platform.AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }
}
