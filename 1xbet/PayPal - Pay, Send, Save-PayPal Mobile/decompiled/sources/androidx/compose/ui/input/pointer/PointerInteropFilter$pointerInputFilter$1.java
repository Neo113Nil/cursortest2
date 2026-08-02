package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "()V", "getHighSpeedVideoFpsRangesFor", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)V", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "getHighSpeedVideoSizes", "getShareWithSiblings", "()Z", "shareWithSiblings", "Landroidx/compose/ui/input/pointer/PointerEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends androidx.compose.ui.input.pointer.PointerInputFilter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState getHighSpeedVideoSizes = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerEvent getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInteropFilter getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final boolean getShareWithSiblings() {
        return true;
    }

    PointerInteropFilter$pointerInputFilter$1(androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter) {
        this.getHighSpeedVideoFpsRangesFor = pointerInteropFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f A[ORIG_RETURN, RETURN] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7253onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        boolean z;
        boolean z2;
        boolean z3;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list = changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!changes.get(i2).isConsumed()) {
                }
            }
            z2 = true;
            if (!this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept()) {
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i3);
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) || androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (this.getHighSpeedVideoSizes != androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighResolutionOutputSizeshNQ4ISI) {
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && z3) {
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerEvent;
                    getHighResolutionOutputSizeshNQ4ISI(pointerEvent, !z || this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept());
                }
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Main && z && kotlin.jvm.internal.Intrinsics.areEqual(pointerEvent, this.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept()) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        changes.get(i4).consume();
                    }
                }
                if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Final && !z3 && !kotlin.jvm.internal.Intrinsics.areEqual(pointerEvent, this.getHighResolutionOutputSizeshNQ4ISI)) {
                    getHighResolutionOutputSizeshNQ4ISI(pointerEvent, true);
                }
            }
            if (pass != androidx.compose.ui.input.pointer.PointerEventPass.Final) {
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size5) {
                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(changes.get(i5))) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        break;
                    }
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(pointerEvent, this.getHighResolutionOutputSizeshNQ4ISI) && z) {
                    int size6 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!changes.get(i6).isConsumed()) {
                            i6++;
                        } else if (!this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept()) {
                            getHighSpeedVideoFpsRanges(pointerEvent);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        changes.get(i7).consume();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept()) {
        }
        z3 = true;
        if (this.getHighSpeedVideoSizes != androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighResolutionOutputSizeshNQ4ISI) {
        }
        if (pass != androidx.compose.ui.input.pointer.PointerEventPass.Final) {
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final void onCancel() {
        if (this.getHighSpeedVideoSizes == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoSizes) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.emptyCancelMotionEventScope(uptimeMillis, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                    Camera2StreamConfigurationMap(motionEvent);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(android.view.MotionEvent motionEvent) {
                    androidx.compose.ui.input.pointer.PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                }

                {
                    super(1);
                }
            });
            getHighSpeedVideoFpsRangesFor();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoSizes = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor.setDisallowIntercept$ui(false);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerEvent p0, boolean p1) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = p0.getChanges();
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list = changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                getHighSpeedVideoFpsRanges(p0);
                return;
            }
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates != null) {
            long mo7364localToRootMKHz9U = layoutCoordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.m7289toMotionEventScoped4ec7I(p0, mo7364localToRootMKHz9U, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                    getHighSpeedVideoFpsRanges(motionEvent);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent) {
                    androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    if (motionEvent.getActionMasked() == 0) {
                        androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.this;
                        if (pointerInteropFilter.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                            dispatchToViewState = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoSizes;
                        } else {
                            dispatchToViewState = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        pointerInteropFilter$pointerInputFilter$1.getHighSpeedVideoSizes = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            if (this.getHighSpeedVideoSizes == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoSizes) {
                if (p1) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        changes.get(i2).consume();
                    }
                }
                androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent = p0.getInternalPointerEvent();
                if (internalPointerEvent != null) {
                    internalPointerEvent.setSuppressMovementConsumption(!this.getHighSpeedVideoFpsRangesFor.getDisallowIntercept());
                    return;
                }
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerEvent p0) {
        if (this.getHighSpeedVideoSizes == androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighSpeedVideoSizes) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
            if (layoutCoordinates != null) {
                long mo7364localToRootMKHz9U = layoutCoordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                final androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = this.getHighSpeedVideoFpsRangesFor;
                androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt.m7288toCancelMotionEventScoped4ec7I(p0, mo7364localToRootMKHz9U, new kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(android.view.MotionEvent motionEvent) {
                        getHighSpeedVideoFpsRanges(motionEvent);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent) {
                        androidx.compose.ui.input.pointer.PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                    }

                    {
                        super(1);
                    }
                });
            } else {
                throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
            }
        }
        this.getHighSpeedVideoSizes = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.getHighResolutionOutputSizeshNQ4ISI;
    }
}
