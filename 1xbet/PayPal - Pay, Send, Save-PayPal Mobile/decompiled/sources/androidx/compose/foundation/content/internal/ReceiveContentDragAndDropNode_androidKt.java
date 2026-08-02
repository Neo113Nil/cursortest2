package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "dragAndDropRequestPermission", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "ReceiveContentDragAndDropNode", "(Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroidx/compose/foundation/content/TransferableContent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    public static /* synthetic */ boolean $r8$lambda$lcDu9kgzd3C_2nJaDZFJuvt7a_w(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        return true;
    }

    public static final androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode ReceiveContentDragAndDropNode(final androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function1) {
        return androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropTargetModifierNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.$r8$lambda$lcDu9kgzd3C_2nJaDZFJuvt7a_w((androidx.compose.ui.draganddrop.DragAndDropEvent) obj));
            }
        }, new androidx.compose.ui.draganddrop.DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onStarted(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration.this.getReceiveContentListener().onDragStart();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEnded(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnd();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEntered(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration.this.getReceiveContentListener().onDragEnter();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onExited(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration.this.getReceiveContentListener().onDragExit();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean onDrop(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                function1.invoke(event);
                androidx.compose.foundation.content.TransferableContent transferableContent = androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.toTransferableContent(event);
                return !kotlin.jvm.internal.Intrinsics.areEqual(transferableContent, androidx.compose.foundation.content.internal.ReceiveContentConfiguration.this.getReceiveContentListener().onReceive(transferableContent));
            }
        });
    }

    public static final androidx.compose.foundation.content.TransferableContent toTransferableContent(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        android.view.DragEvent androidDragEvent = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
        return new androidx.compose.foundation.content.TransferableContent(androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(androidDragEvent.getClipData()), androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipMetadata(androidDragEvent.getClipDescription()), androidx.compose.foundation.content.TransferableContent.Source.INSTANCE.m1376getDragAndDropkB6V9T0(), null, 8, null);
    }
}
