package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0089\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/foundation/content/MediaType;", "hintMediaTypes", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/ClipEntry;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/platform/ClipMetadata;", "", "onDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "dragAndDropRequestPermission", "onStarted", "onEntered", "Landroidx/compose/ui/geometry/Offset;", "onMoved", "onChanged", "onExited", "onEnded", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "textFieldDragAndDropNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldDragAndDropNode_androidKt {
    public static final androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode textFieldDragAndDropNode(final kotlin.jvm.functions.Function0<? extends java.util.Set<androidx.compose.foundation.content.MediaType>> function0, final kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.ClipEntry, ? super androidx.compose.ui.platform.ClipMetadata, java.lang.Boolean> function2, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function13, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function14, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function15, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function16, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function17) {
        return androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropTargetModifierNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.$r8$lambda$_7iixzYZJCudRFLkqqTIPv3GJRs(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj));
            }
        }, new androidx.compose.ui.draganddrop.DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean onDrop(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                function1.invoke(event);
                return function2.invoke(androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(event).getClipData()), androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipMetadata(androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(event).getClipDescription())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onStarted(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function18 = function12;
                if (function18 != null) {
                    function18.invoke(event);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEntered(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function18 = function13;
                if (function18 != null) {
                    function18.invoke(event);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                android.view.DragEvent androidDragEvent = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(event);
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function18 = function14;
                if (function18 != null) {
                    float x = androidDragEvent.getX();
                    float y = androidDragEvent.getY();
                    function18.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(x) << 32) | (java.lang.Float.floatToRawIntBits(y) & 4294967295L))));
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onExited(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function18 = function16;
                if (function18 != null) {
                    function18.invoke(event);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onChanged(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function18 = function15;
                if (function18 != null) {
                    function18.invoke(event);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEnded(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, kotlin.Unit> function18 = function17;
                if (function18 != null) {
                    function18.invoke(event);
                }
            }
        });
    }

    public static /* synthetic */ boolean $r8$lambda$_7iixzYZJCudRFLkqqTIPv3GJRs(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        android.content.ClipDescription clipDescription = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
        java.lang.Iterable<androidx.compose.foundation.content.MediaType> iterable = (java.lang.Iterable) function0.invoke();
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
            return false;
        }
        for (androidx.compose.foundation.content.MediaType mediaType : iterable) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(mediaType, androidx.compose.foundation.content.MediaType.INSTANCE.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                return true;
            }
        }
        return false;
    }
}
