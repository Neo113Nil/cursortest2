package androidx.compose.foundation.text.modifiers;

/* compiled from: SelectionController.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¨\u0006\b"}, d2 = {"makeSelectionModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectableId", "", "layoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier makeSelectionModifier(final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, final long j, final kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0) {
        androidx.compose.foundation.text.TextDragObserver textDragObserver = new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long lastPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            private long dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo918onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
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

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo920onStartk4lQ0M(long startPoint) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!invoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo1065notifySelectionUpdateStartubNVwUQ(invoke, startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord(), true);
                    this.lastPosition = startPoint;
                }
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo919onDragk4lQ0M(long delta) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j2 = j;
                    if (invoke.isAttached() && androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                        long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(this.dragTotalDistance, delta);
                        this.dragTotalDistance = m1876plusMKHz9U;
                        long m1876plusMKHz9U2 = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(this.lastPosition, m1876plusMKHz9U);
                        if (selectionRegistrar2.mo1064notifySelectionUpdatenjBpvok(invoke, m1876plusMKHz9U2, this.lastPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true)) {
                            this.lastPosition = m1876plusMKHz9U2;
                            this.dragTotalDistance = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }
        };
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.ui.Modifier.INSTANCE, new androidx.compose.foundation.text.selection.MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo992onExtendk4lQ0M(long downPosition) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return false;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo1064notifySelectionUpdatenjBpvok(invoke, downPosition, this.lastPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone(), false)) {
                    this.lastPosition = downPosition;
                }
                return androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo993onExtendDragk4lQ0M(long dragPosition) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return true;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached() || !androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1064notifySelectionUpdatenjBpvok(invoke, dragPosition, this.lastPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone(), false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo994onStart3MmeM6k(long downPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return false;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo1065notifySelectionUpdateStartubNVwUQ(invoke, downPosition, adjustment, false);
                this.lastPosition = downPosition;
                return androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo991onDrag3MmeM6k(long dragPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
                androidx.compose.ui.layout.LayoutCoordinates invoke = function0.invoke();
                if (invoke == null) {
                    return true;
                }
                androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!invoke.isAttached() || !androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1064notifySelectionUpdatenjBpvok(invoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }
        }, textDragObserver);
    }
}
