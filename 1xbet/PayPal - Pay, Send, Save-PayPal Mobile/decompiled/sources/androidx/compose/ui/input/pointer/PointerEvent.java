package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\"\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\fR*\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010("}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "Landroidx/compose/ui/input/pointer/PointerEventType;", "getHighSpeedVideoFpsRangesFor", "()I", "component1", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "motionEvent", "copy", "(Ljava/util/List;Landroid/view/MotionEvent;)Landroidx/compose/ui/input/pointer/PointerEvent;", "Ljava/util/List;", "getChanges", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getInternalPointerEvent$ui", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "", "classification", com.visa.cbp.getEncExpo.warmup, "getClassification", "Landroidx/compose/ui/input/pointer/PointerButtons;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BUTTONS, "getButtons-ry648PA", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "keyboardModifiers", "getKeyboardModifiers-k7X9c1A", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "type", "getType-7fucELk", "setType-EhbLWgg$ui", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
    private final int classification;
    private final androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        android.view.MotionEvent motionEvent;
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        this.classification = (android.os.Build.VERSION.SDK_INT < 29 || (motionEvent = getMotionEvent()) == null) ? 0 : motionEvent.getClassification();
        android.view.MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = androidx.compose.ui.input.pointer.PointerButtons.m7166constructorimpl(motionEvent2 != null ? motionEvent2.getButtonState() : 0);
        android.view.MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7291constructorimpl(motionEvent3 != null ? motionEvent3.getMetaState() : 0);
        this.type = getHighSpeedVideoFpsRangesFor();
    }

    public final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> getChanges() {
        return this.changes;
    }

    /* renamed from: getInternalPointerEvent$ui, reason: from getter */
    public final androidx.compose.ui.input.pointer.InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final android.view.MotionEvent getMotionEvent() {
        androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    public final int getClassification() {
        return this.classification;
    }

    public PointerEvent(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list) {
        this(list, null);
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name and from getter */
    public final int getButtons() {
        return this.buttons;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name and from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui, reason: not valid java name */
    public final void m7175setTypeEhbLWgg$ui(int i) {
        this.type = i;
    }

    private final int getHighSpeedVideoFpsRangesFor() {
        android.view.MotionEvent motionEvent = getMotionEvent();
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7189getScroll7fucELk();
                            case 9:
                                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk();
                            case 10:
                                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk();
                            default:
                                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7190getUnknown7fucELk();
                        }
                    }
                    return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk();
                }
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7188getRelease7fucELk();
            }
            return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7187getPress7fucELk();
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = list.get(i);
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7188getRelease7fucELk();
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7187getPress7fucELk();
            }
        }
        return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7186getMove7fucELk();
    }

    public final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> component1() {
        return this.changes;
    }

    public final androidx.compose.ui.input.pointer.PointerEvent copy(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes, android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new androidx.compose.ui.input.pointer.PointerEvent(changes, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(motionEvent, getMotionEvent())) {
            return new androidx.compose.ui.input.pointer.PointerEvent(changes, this.internalPointerEvent);
        }
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray(changes.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(changes.size());
        int size = changes.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i);
            longSparseArray.put(pointerInputChange.getId(), pointerInputChange);
            java.util.ArrayList arrayList2 = arrayList;
            long id = pointerInputChange.getId();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long position = pointerInputChange.getPosition();
            long position2 = pointerInputChange.getPosition();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int type = pointerInputChange.getType();
            androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i2 = i;
            arrayList2.add(new androidx.compose.ui.input.pointer.PointerInputEventData(id, uptimeMillis, position, position2, pressed, pressure, type, internalPointerEvent != null && internalPointerEvent.m7161activeHoverEvent0FcD4WY(pointerInputChange.getId()), null, 0L, 0L, 1792, null));
            i = i2 + 1;
        }
        return new androidx.compose.ui.input.pointer.PointerEvent(changes, new androidx.compose.ui.input.pointer.InternalPointerEvent(longSparseArray, new androidx.compose.ui.input.pointer.PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }
}
