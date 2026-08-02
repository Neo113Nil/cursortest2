package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "Landroid/view/DragEvent;", "dragEvent", "<init>", "(Landroid/view/DragEvent;)V", "Landroid/view/DragEvent;", "getDragEvent$ui", "()Landroid/view/DragEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;
    private final android.view.DragEvent dragEvent;

    public DragAndDropEvent(android.view.DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    /* renamed from: getDragEvent$ui, reason: from getter */
    public final android.view.DragEvent getDragEvent() {
        return this.dragEvent;
    }
}
