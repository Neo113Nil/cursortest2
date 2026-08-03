package androidx.compose.ui.input.pointer;

/* compiled from: PointerInteropFilter.android.kt */
@kotlin.Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J*\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends androidx.compose.ui.input.pointer.PointerInputFilter {
    private androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState state = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInteropFilter this$0;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    PointerInteropFilter$pointerInputFilter$1(androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3299onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        boolean z;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        if (!this.this$0.getDisallowIntercept()) {
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
                if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) && !androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                }
            }
            z = false;
            if (this.state != androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching) {
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && z) {
                    dispatchToView(pointerEvent);
                }
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Final && !z) {
                    dispatchToView(pointerEvent);
                }
            }
            if (pass != androidx.compose.ui.input.pointer.PointerEventPass.Final) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                        return;
                    }
                }
                reset();
                return;
            }
            return;
        }
        z = true;
        if (this.state != androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pass != androidx.compose.ui.input.pointer.PointerEventPass.Final) {
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = this.this$0;
            androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.emptyCancelMotionEventScope(uptimeMillis, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.view.MotionEvent motionEvent) {
                    androidx.compose.ui.input.pointer.PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    private final void reset() {
        this.state = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    private final void dispatchToView(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                if (this.state == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Dispatching) {
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates();
                    if (layoutCoordinates$ui_release != null) {
                        long mo3411localToRootMKHz9U = layoutCoordinates$ui_release.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
                        final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = this.this$0;
                        androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.m3335toCancelMotionEventScoped4ec7I(pointerEvent, mo3411localToRootMKHz9U, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                                invoke2(motionEvent);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(android.view.MotionEvent motionEvent) {
                                androidx.compose.ui.input.pointer.PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                            }
                        });
                    } else {
                        throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.state = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates();
        if (layoutCoordinates$ui_release2 != null) {
            long mo3411localToRootMKHz9U2 = layoutCoordinates$ui_release2.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
            final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter2 = this.this$0;
            androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.m3336toMotionEventScoped4ec7I(pointerEvent, mo3411localToRootMKHz9U2, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.view.MotionEvent motionEvent) {
                    androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    if (motionEvent.getActionMasked() == 0) {
                        androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.this;
                        if (pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                            dispatchToViewState = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Dispatching;
                        } else {
                            dispatchToViewState = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching;
                        }
                        pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                }
            });
            if (this.state == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept());
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
    }
}
