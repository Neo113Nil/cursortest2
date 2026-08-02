package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "dragAndDropSource", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/foundation/draganddrop/AndroidDragAndDropSource_androidKt")
/* loaded from: classes.dex */
final /* synthetic */ class AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt {
    @kotlin.Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @kotlin.ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    public static final androidx.compose.ui.Modifier dragAndDropSource(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return modifier.then(new androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceWithDefaultShadowElement(function2));
    }
}
