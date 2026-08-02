package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceKt__DragAndDropSourceKt", "androidx/compose/foundation/draganddrop/DragAndDropSourceKt__LegacyDragAndDropSource_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropSourceKt {
    public static final androidx.compose.ui.Modifier dragAndDropSource(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> function1) {
        return androidx.compose.foundation.draganddrop.DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, function1);
    }

    public static final androidx.compose.ui.Modifier dragAndDropSource(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> function12) {
        return androidx.compose.foundation.draganddrop.DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, function1, function12);
    }

    @kotlin.Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @kotlin.ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    public static final androidx.compose.ui.Modifier dragAndDropSource(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return androidx.compose.foundation.draganddrop.DragAndDropSourceKt__LegacyDragAndDropSource_androidKt.dragAndDropSource(modifier, function1, function2);
    }
}
