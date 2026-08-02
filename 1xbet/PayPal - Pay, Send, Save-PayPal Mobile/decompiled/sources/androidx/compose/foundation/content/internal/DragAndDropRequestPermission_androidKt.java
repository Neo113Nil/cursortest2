package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "event", "", "dragAndDropRequestPermission", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragAndDropRequestPermission_androidKt {
    public static final void dragAndDropRequestPermission(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        android.app.Activity activity;
        android.content.ClipData clipData = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            android.net.Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "content")) {
                if (delegatableNode.getNode().getIsAttached()) {
                    android.content.Context context = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(delegatableNode).getContext();
                    while (true) {
                        if (!(context instanceof android.content.ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof android.app.Activity) {
                                activity = (android.app.Activity) context;
                                break;
                            }
                            context = ((android.content.ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null) {
                        androidx.core.view.DragAndDropPermissionsCompat.request(activity, androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
