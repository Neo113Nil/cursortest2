package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Landroid/view/DragEvent;", "toAndroidDragEvent", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroid/view/DragEvent;", "", "", "mimeTypes", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Ljava/util/Set;", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "positionInRoot"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final android.view.DragEvent toAndroidDragEvent(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent();
    }

    public static final java.util.Set<java.lang.String> mimeTypes(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        android.content.ClipDescription clipDescription = dragAndDropEvent.getDragEvent().getClipDescription();
        if (clipDescription == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            createSetBuilder.add(clipDescription.getMimeType(i));
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    public static final long getPositionInRoot(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        float x = dragAndDropEvent.getDragEvent().getX();
        float y = dragAndDropEvent.getDragEvent().getY();
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(x) << 32) | (java.lang.Float.floatToRawIntBits(y) & 4294967295L));
    }
}
