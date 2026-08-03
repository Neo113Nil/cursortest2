package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<androidx.compose.ui.draganddrop.DragAndDropTransferData, androidx.compose.ui.geometry.Size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? extends kotlin.Unit>, java.lang.Boolean> {
    AndroidComposeView$dragAndDropModifierOnDragListener$1(java.lang.Object obj) {
        super(3, obj, androidx.compose.ui.platform.AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, androidx.compose.ui.geometry.Size size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? extends kotlin.Unit> function1) {
        return m3699invoke12SF9DM(dragAndDropTransferData, size.getPackedValue(), function1);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final java.lang.Boolean m3699invoke12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        boolean m3697startDrag12SF9DM;
        m3697startDrag12SF9DM = ((androidx.compose.ui.platform.AndroidComposeView) this.receiver).m3697startDrag12SF9DM(dragAndDropTransferData, j, function1);
        return java.lang.Boolean.valueOf(m3697startDrag12SF9DM);
    }
}
