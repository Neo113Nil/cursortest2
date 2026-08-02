package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "dragAndDropTarget", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragAndDropTargetKt {
    public static final androidx.compose.ui.Modifier dragAndDropTarget(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new androidx.compose.foundation.draganddrop.DropTargetElement(function1, dragAndDropTarget));
    }
}
