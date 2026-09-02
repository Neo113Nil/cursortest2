package com.goldenboot.saga.zone;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001e\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\fR\u0017\u0010!\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b \u0010\fR*\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/goldenboot/saga/zone/DrawableCustodian;", "", "", "Lcom/goldenboot/saga/zone/PulseNotifier;", "changes", "Lcom/goldenboot/saga/zone/SetupEntry;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lcom/goldenboot/saga/zone/SetupEntry;)V", "(Ljava/util/List;)V", "Lcom/goldenboot/saga/zone/BoxFabricator;", "evictLayout", "()I", "growPayload", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "motionEvent", "injectMetric", "(Ljava/util/List;Landroid/view/MotionEvent;)Lcom/goldenboot/saga/zone/DrawableCustodian;", "Ljava/util/List;", "releaseHeader", "Lcom/goldenboot/saga/zone/SetupEntry;", "flushSample", "()Lcom/goldenboot/saga/zone/SetupEntry;", "", "I", "clipOrigin", "classification", "Lcom/goldenboot/saga/zone/SingletonInteractor;", "detachStream", "buttons", "Lcom/goldenboot/saga/zone/BannerTracker;", "updateTimer", "keyboardModifiers", "value", "popBlueprint", "drawField", "(I)V", "type", "applyTask", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawableCustodian {
    public static final int flushSample = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private int type;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final int buttons;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final SetupEntry internalPointerEvent;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int classification;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final int keyboardModifiers;

    public DrawableCustodian(List<PointerInputChange> list, SetupEntry setupEntry) {
        this.changes = list;
        this.internalPointerEvent = setupEntry;
        MotionEvent applyTask = applyTask();
        this.classification = applyTask != null ? applyTask.getClassification() : 0;
        MotionEvent applyTask2 = applyTask();
        this.buttons = SingletonInteractor.growPayload(applyTask2 != null ? applyTask2.getButtonState() : 0);
        MotionEvent applyTask3 = applyTask();
        this.keyboardModifiers = BannerTracker.growPayload(applyTask3 != null ? applyTask3.getMetaState() : 0);
        this.type = evictLayout();
    }

    private final int evictLayout() {
        MotionEvent applyTask = applyTask();
        if (applyTask == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = list.get(i);
                if (BundleMap.releaseHeader(pointerInputChange)) {
                    return BoxFabricator.INSTANCE.releaseHeader();
                }
                if (BundleMap.injectMetric(pointerInputChange)) {
                    return BoxFabricator.INSTANCE.detachStream();
                }
            }
            return BoxFabricator.INSTANCE.injectMetric();
        }
        int actionMasked = applyTask.getActionMasked();
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
                            return BoxFabricator.INSTANCE.clipOrigin();
                        case 9:
                            return BoxFabricator.INSTANCE.evictLayout();
                        case ViewStreamer.applyTask /* 10 */:
                            return BoxFabricator.INSTANCE.growPayload();
                        default:
                            return BoxFabricator.INSTANCE.flushSample();
                    }
                }
                return BoxFabricator.INSTANCE.injectMetric();
            }
            return BoxFabricator.INSTANCE.releaseHeader();
        }
        return BoxFabricator.INSTANCE.detachStream();
    }

    public final MotionEvent applyTask() {
        SetupEntry setupEntry = this.internalPointerEvent;
        if (setupEntry != null) {
            return setupEntry.injectMetric();
        }
        return null;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final int getClassification() {
        return this.classification;
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final void drawField(int i) {
        this.type = i;
    }

    /* renamed from: flushSample, reason: from getter */
    public final SetupEntry getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final List<PointerInputChange> growPayload() {
        return this.changes;
    }

    public final DrawableCustodian injectMetric(List<PointerInputChange> changes, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new DrawableCustodian(changes, null);
        }
        if (Intrinsics.areEqual(motionEvent, applyTask())) {
            return new DrawableCustodian(changes, this.internalPointerEvent);
        }
        StateJob stateJob = new StateJob(changes.size());
        ArrayList arrayList = new ArrayList(changes.size());
        int size = changes.size();
        int i = 0;
        while (i < size) {
            PointerInputChange pointerInputChange = changes.get(i);
            stateJob.applyTask(pointerInputChange.getId(), pointerInputChange);
            long id = pointerInputChange.getId();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long position = pointerInputChange.getPosition();
            long position2 = pointerInputChange.getPosition();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int type = pointerInputChange.getType();
            SetupEntry setupEntry = this.internalPointerEvent;
            int i2 = i;
            arrayList.add(new PointerInputEventData(id, uptimeMillis, position, position2, pressed, pressure, type, setupEntry != null && setupEntry.evictLayout(pointerInputChange.getId()), null, 0L, 0L, 1792, null));
            i = i2 + 1;
        }
        return new DrawableCustodian(changes, new SetupEntry(stateJob, new HeaderCustodian(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final List<PointerInputChange> releaseHeader() {
        return this.changes;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    public DrawableCustodian(List<PointerInputChange> list) {
        this(list, null);
    }
}
