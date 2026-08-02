package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"androidx/compose/foundation/draganddrop/AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDragAndDropSource_androidKt {
    @kotlin.Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @kotlin.ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    public static final androidx.compose.ui.Modifier dragAndDropSource(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return androidx.compose.foundation.draganddrop.AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt.dragAndDropSource(modifier, function2);
    }
}
