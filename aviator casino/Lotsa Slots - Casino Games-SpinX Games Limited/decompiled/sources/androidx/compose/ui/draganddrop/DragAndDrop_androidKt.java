package androidx.compose.ui.draganddrop;

/* compiled from: DragAndDrop.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "mimeTypes", "", "", "toAndroidDragEvent", "Landroid/view/DragEvent;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
        return androidx.compose.ui.geometry.OffsetKt.Offset(dragAndDropEvent.getDragEvent().getX(), dragAndDropEvent.getDragEvent().getY());
    }
}
