package androidx.compose.ui.input.pointer;

/* compiled from: PointerEvent.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u001f\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\"\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", com.helpshift.proactive.InAppViewConstants.BUTTONS, "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
    private final androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        android.view.MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = androidx.compose.ui.input.pointer.PointerButtons.m3208constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        android.view.MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m3339constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m3214calculatePointerEventType7fucELk();
    }

    public final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> getChanges() {
        return this.changes;
    }

    /* renamed from: getInternalPointerEvent$ui_release, reason: from getter */
    public final androidx.compose.ui.input.pointer.InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final android.view.MotionEvent getMotionEvent$ui_release() {
        androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
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

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m3218setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m3214calculatePointerEventType7fucELk() {
        android.view.MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3231getPress7fucELk();
                    }
                    return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk();
                }
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3232getRelease7fucELk();
            }
            return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3231getPress7fucELk();
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = list.get(i);
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3232getRelease7fucELk();
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3231getPress7fucELk();
            }
        }
        return androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3230getMove7fucELk();
    }

    public final java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> component1() {
        return this.changes;
    }

    public final androidx.compose.ui.input.pointer.PointerEvent copy(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes, android.view.MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return new androidx.compose.ui.input.pointer.PointerEvent(changes, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release())) {
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
            if (internalPointerEvent != null) {
                z = true;
                if (internalPointerEvent.m3204issuesEnterExitEvent0FcD4WY(pointerInputChange.getId())) {
                    arrayList2.add(new androidx.compose.ui.input.pointer.PointerInputEventData(id, uptimeMillis, position, position2, pressed, pressure, type, z, null, 0L, 0L, 1792, null));
                    i = i2 + 1;
                }
            }
            z = false;
            arrayList2.add(new androidx.compose.ui.input.pointer.PointerInputEventData(id, uptimeMillis, position, position2, pressed, pressure, type, z, null, 0L, 0L, 1792, null));
            i = i2 + 1;
        }
        return new androidx.compose.ui.input.pointer.PointerEvent(changes, new androidx.compose.ui.input.pointer.InternalPointerEvent(longSparseArray, new androidx.compose.ui.input.pointer.PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }
}
