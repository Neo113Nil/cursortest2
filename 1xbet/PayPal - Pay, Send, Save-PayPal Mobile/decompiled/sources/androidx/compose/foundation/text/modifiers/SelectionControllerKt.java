package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/Modifier;", "makeDefaultSelectionModifier", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionControllerKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    public static final androidx.compose.ui.Modifier makeDefaultSelectionModifier(final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, final long j, final kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0) {
        final ?? r0 = new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1
            private long lastPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            private long dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            private androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustmentMode = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo2103onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final void setDragTotalDistance(long j2) {
                this.dragTotalDistance = j2;
            }

            public final androidx.compose.foundation.text.selection.SelectionAdjustment getSelectionAdjustmentMode() {
                return this.selectionAdjustmentMode;
            }

            public final void setSelectionAdjustmentMode(androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!invoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo2433notifySelectionUpdateStartubNVwUQ(invoke, startPoint, this.selectionAdjustmentMode, true);
                    this.lastPosition = startPoint;
                }
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public final void mo2104onDragk4lQ0M(long delta) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j2 = j;
                    if (invoke.isAttached() && androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                        long m5757plusMKHz9U = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.dragTotalDistance, delta);
                        this.dragTotalDistance = m5757plusMKHz9U;
                        long m5757plusMKHz9U2 = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.lastPosition, m5757plusMKHz9U);
                        if (selectionRegistrar2.mo2432notifySelectionUpdatenjBpvok(invoke, m5757plusMKHz9U2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                            this.lastPosition = m5757plusMKHz9U2;
                            this.dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }
        };
        final ?? r1 = new androidx.compose.foundation.text.selection.MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public final boolean mo2312onExtendk4lQ0M(long downPosition) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return false;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo2432notifySelectionUpdatenjBpvok(invoke, downPosition, this.lastPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone(), false)) {
                    this.lastPosition = downPosition;
                }
                return androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public final boolean mo2313onExtendDragk4lQ0M(long dragPosition) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return true;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached() || !androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo2432notifySelectionUpdatenjBpvok(invoke, dragPosition, this.lastPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone(), false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public final boolean mo2314onStart9KIMszo(long downPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, int clickCount) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return false;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo2433notifySelectionUpdateStartubNVwUQ(invoke, downPosition, adjustment, false);
                this.lastPosition = downPosition;
                return androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public final boolean mo2311onDrag3MmeM6k(long dragPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return true;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached() || !androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo2432notifySelectionUpdatenjBpvok(invoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }
        };
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, (java.lang.Object) r1, (java.lang.Object) r0, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object awaitSelectionGestures = androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1.this, r0, continuation);
                return awaitSelectionGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitSelectionGestures : kotlin.Unit.INSTANCE;
            }
        });
    }
}
