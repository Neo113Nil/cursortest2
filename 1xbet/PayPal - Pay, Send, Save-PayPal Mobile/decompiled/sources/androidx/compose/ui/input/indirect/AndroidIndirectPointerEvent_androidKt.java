package androidx.compose.ui.input.indirect;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxis", "previousMotionEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "IndirectPointerEvent-eAXfkT4", "(Landroid/view/MotionEvent;ILandroid/view/MotionEvent;)Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "IndirectPointerEvent", "", "actionMasked", "Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "convertActionToIndirectPointerEventType", "(I)I", "indirectPrimaryDirectionalScrollAxis", "(Landroid/view/MotionEvent;)I", "getNativeEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Landroid/view/MotionEvent;", "nativeEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidIndirectPointerEvent_androidKt {
    public static final android.view.MotionEvent getNativeEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent indirectPointerEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(indirectPointerEvent, "");
        return ((androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent();
    }

    /* renamed from: IndirectPointerEvent-eAXfkT4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.input.indirect.IndirectPointerEvent m6753IndirectPointerEventeAXfkT4$default(android.view.MotionEvent motionEvent, int i, android.view.MotionEvent motionEvent2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6760getNonenZO2Niw();
        }
        if ((i2 & 4) != 0) {
            motionEvent2 = null;
        }
        return m6752IndirectPointerEventeAXfkT4(motionEvent, i, motionEvent2);
    }

    /* renamed from: IndirectPointerEvent-eAXfkT4, reason: not valid java name */
    public static final androidx.compose.ui.input.indirect.IndirectPointerEvent m6752IndirectPointerEventeAXfkT4(android.view.MotionEvent motionEvent, int i, android.view.MotionEvent motionEvent2) {
        int i2;
        int i3;
        boolean z;
        long j;
        long j2;
        boolean z2;
        android.view.MotionEvent motionEvent3 = motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 1) {
            i2 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i2 = 0;
        }
        java.lang.Integer valueOf = motionEvent3 != null ? java.lang.Integer.valueOf(motionEvent2.getActionMasked()) : null;
        boolean z4 = (valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 2);
        long eventTime = motionEvent.getEventTime();
        int pointerCount = motionEvent.getPointerCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(pointerCount);
        int i4 = 0;
        while (i4 < pointerCount) {
            int pointerId = motionEvent.getPointerId(i4);
            long m7211constructorimpl = androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(pointerId);
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(motionEvent.getX(i4)) << 32) | (java.lang.Float.floatToRawIntBits(motionEvent.getY(i4)) & 4294967295L));
            boolean z5 = i4 != i2 ? z3 : false;
            if ((motionEvent3 != null ? motionEvent3.findPointerIndex(pointerId) : -1) >= 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(motionEvent2);
                long eventTime2 = motionEvent2.getEventTime();
                i3 = i2;
                z = z4;
                j = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(motionEvent3.getX(r8)) << 32) | (java.lang.Float.floatToRawIntBits(motionEvent3.getY(r8)) & 4294967295L));
                j2 = eventTime2;
                z2 = z;
            } else {
                i3 = i2;
                z = z4;
                j = m5744constructorimpl;
                j2 = eventTime;
                z2 = false;
            }
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new androidx.compose.ui.input.indirect.IndirectPointerInputChange(m7211constructorimpl, eventTime, m5744constructorimpl, z5, motionEvent.getPressure(i4), j2, j, z2, null));
            i4++;
            arrayList = arrayList2;
            pointerCount = pointerCount;
            i2 = i3;
            z4 = z;
            z3 = true;
            motionEvent3 = motionEvent2;
        }
        return new androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent(arrayList, convertActionToIndirectPointerEventType(actionMasked), i, motionEvent, null);
    }

    public static final int convertActionToIndirectPointerEventType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return androidx.compose.ui.input.indirect.IndirectPointerEventType.INSTANCE.m6769getMove4ZHQPSE();
                }
                if (i != 5) {
                    if (i != 6) {
                        return androidx.compose.ui.input.indirect.IndirectPointerEventType.INSTANCE.m6772getUnknown4ZHQPSE();
                    }
                }
            }
            return androidx.compose.ui.input.indirect.IndirectPointerEventType.INSTANCE.m6771getRelease4ZHQPSE();
        }
        return androidx.compose.ui.input.indirect.IndirectPointerEventType.INSTANCE.m6770getPress4ZHQPSE();
    }

    public static final int indirectPrimaryDirectionalScrollAxis(android.view.MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            throw new java.lang.IllegalArgumentException("MotionEvent must be a touch navigation source".toString());
        }
        android.view.InputDevice device = motionEvent.getDevice();
        if (device != null) {
            android.view.InputDevice.MotionRange motionRange = device.getMotionRange(0);
            android.view.InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                    return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6761getXnZO2Niw();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                    return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6762getYnZO2Niw();
                }
            }
        }
        return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m6760getNonenZO2Niw();
    }
}
