package androidx.compose.foundation.draganddrop;

@kotlin.Deprecated(message = "Replaced by a callback for obtain a transfer data,start detection is performed by Compose itself")
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "", "startTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DragAndDropSourceScope extends androidx.compose.ui.input.pointer.PointerInputScope {
    void startTransfer(androidx.compose.ui.draganddrop.DragAndDropTransferData transferData);
}
