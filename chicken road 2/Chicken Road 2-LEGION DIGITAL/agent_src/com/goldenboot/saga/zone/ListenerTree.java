package com.goldenboot.saga.zone;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ListenerTree extends LongPressPipe implements DragHub {
    public final int attachConfig;
    public final Object[] connectPatch;
    public final Object[] notifyMessage;
    public final int resetDelta;

    public ListenerTree(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.notifyMessage = objArr;
        this.connectPatch = objArr2;
        this.attachConfig = i;
        this.resetDelta = i2;
        if (!(size() > 32)) {
            NotificationCoordinator.evictLayout("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CoreGraph.evictLayout(size() - DialogStack.detachStream(size()) <= CellEntry.updateTimer(objArr2.length, 32));
    }

    @Override // java.util.Collection, java.util.List, com.goldenboot.saga.zone.DragHub
    public DragHub add(Object obj) {
        int size = size() - inflateEdge();
        if (size >= 32) {
            return flattenPackage(this.notifyMessage, this.connectPatch, DialogStack.injectMetric(obj));
        }
        Object[] copyOf = Arrays.copyOf(this.connectPatch, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[size] = obj;
        return new ListenerTree(this.notifyMessage, copyOf, size() + 1, this.resetDelta);
    }

    @Override // com.goldenboot.saga.zone.RemoteCallback
    public int clipOrigin() {
        return this.attachConfig;
    }

    @Override // com.goldenboot.saga.zone.DragHub
    public DragHub connectPatch(TouchRecord touchRecord) {
        KeyframeFetcher builder = builder();
        builder.groupArchive(touchRecord);
        return builder.build();
    }

    @Override // com.goldenboot.saga.zone.DragHub
    public DragHub drawField(int i) {
        VibrationMolder.evictLayout(i, size());
        int inflateEdge = inflateEdge();
        return i >= inflateEdge ? filterPayload(this.notifyMessage, inflateEdge, this.resetDelta, i - inflateEdge) : filterPayload(storeCharset(this.notifyMessage, this.resetDelta, i, new DoubleTapPort(this.connectPatch[0])), inflateEdge, this.resetDelta, 0);
    }

    @Override // com.goldenboot.saga.zone.DragHub
    /* renamed from: drawScope, reason: merged with bridge method [inline-methods] */
    public KeyframeFetcher builder() {
        return new KeyframeFetcher(this, this.notifyMessage, this.connectPatch, this.resetDelta);
    }

    public final Object[] expandArgs(Object[] objArr, int i, int i2, Object obj, DoubleTapPort doubleTapPort) {
        Object[] copyOf;
        int evictLayout = DialogStack.evictLayout(i2, i);
        if (i == 0) {
            if (evictLayout == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            }
            InsetsReader.popBlueprint(objArr, copyOf, evictLayout + 1, evictLayout, 31);
            doubleTapPort.growPayload(objArr[31]);
            copyOf[evictLayout] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        Object obj2 = objArr[evictLayout];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[evictLayout] = expandArgs((Object[]) obj2, i3, i2, obj, doubleTapPort);
        while (true) {
            evictLayout++;
            if (evictLayout >= 32 || copyOf2[evictLayout] == null) {
                break;
            }
            Object obj3 = objArr[evictLayout];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[evictLayout] = expandArgs((Object[]) obj3, i3, 0, doubleTapPort.evictLayout(), doubleTapPort);
        }
        return copyOf2;
    }

    public final DragHub filterPayload(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        CoreGraph.evictLayout(i3 < size);
        if (size == 1) {
            return syncScope(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.connectPatch, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int i4 = size - 1;
        if (i3 < i4) {
            InsetsReader.popBlueprint(this.connectPatch, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new ListenerTree(objArr, copyOf, (i + size) - 1, i2);
    }

    public final ListenerTree findTask(Object[] objArr, int i, Object obj) {
        int size = size() - inflateEdge();
        Object[] copyOf = Arrays.copyOf(this.connectPatch, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        if (size < 32) {
            InsetsReader.popBlueprint(this.connectPatch, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new ListenerTree(objArr, copyOf, size() + 1, this.resetDelta);
        }
        Object[] objArr2 = this.connectPatch;
        Object obj2 = objArr2[31];
        InsetsReader.popBlueprint(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return flattenPackage(objArr, copyOf, DialogStack.injectMetric(obj2));
    }

    public final ListenerTree flattenPackage(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.resetDelta;
        if (size <= (1 << i)) {
            return new ListenerTree(injectConstraint(objArr, i, objArr2), objArr3, size() + 1, this.resetDelta);
        }
        Object[] injectMetric = DialogStack.injectMetric(objArr);
        int i2 = this.resetDelta + 5;
        return new ListenerTree(injectConstraint(injectMetric, i2, objArr2), objArr3, size() + 1, i2);
    }

    @Override // com.goldenboot.saga.zone.AccentAlerter, java.util.List
    public Object get(int i) {
        VibrationMolder.evictLayout(i, size());
        return inflateAdapter(i)[i & 31];
    }

    public final Object[] inflateAdapter(int i) {
        if (inflateEdge() <= i) {
            return this.connectPatch;
        }
        Object[] objArr = this.notifyMessage;
        for (int i2 = this.resetDelta; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[DialogStack.evictLayout(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    public final int inflateEdge() {
        return DialogStack.detachStream(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object[] injectConstraint(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        int evictLayout = DialogStack.evictLayout(size() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(...)");
        }
        objArr3 = new Object[32];
        if (i == 5) {
            objArr3[evictLayout] = objArr2;
            return objArr3;
        }
        objArr3[evictLayout] = injectConstraint((Object[]) objArr3[evictLayout], i - 5, objArr2);
        return objArr3;
    }

    @Override // com.goldenboot.saga.zone.AccentAlerter, java.util.List
    public ListIterator listIterator(int i) {
        VibrationMolder.growPayload(i, size());
        return new HeaderBenchmark(this.notifyMessage, this.connectPatch, i, size(), (this.resetDelta / 5) + 1);
    }

    public final Object[] mergeLocale(Object[] objArr, int i, int i2, DoubleTapPort doubleTapPort) {
        Object[] mergeLocale;
        int evictLayout = DialogStack.evictLayout(i2, i);
        if (i == 5) {
            doubleTapPort.growPayload(objArr[evictLayout]);
            mergeLocale = null;
        } else {
            Object obj = objArr[evictLayout];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            mergeLocale = mergeLocale((Object[]) obj, i - 5, i2, doubleTapPort);
        }
        if (mergeLocale == null && evictLayout == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[evictLayout] = mergeLocale;
        return copyOf;
    }

    public final Object[] queryModel(Object[] objArr, int i, int i2, Object obj) {
        int evictLayout = DialogStack.evictLayout(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        if (i == 0) {
            copyOf[evictLayout] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[evictLayout];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[evictLayout] = queryModel((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // com.goldenboot.saga.zone.AccentAlerter, java.util.List
    public DragHub set(int i, Object obj) {
        VibrationMolder.evictLayout(i, size());
        if (inflateEdge() > i) {
            return new ListenerTree(queryModel(this.notifyMessage, this.resetDelta, i, obj), this.connectPatch, size(), this.resetDelta);
        }
        Object[] copyOf = Arrays.copyOf(this.connectPatch, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[i & 31] = obj;
        return new ListenerTree(this.notifyMessage, copyOf, size(), this.resetDelta);
    }

    public final Object[] storeCharset(Object[] objArr, int i, int i2, DoubleTapPort doubleTapPort) {
        Object[] copyOf;
        int evictLayout = DialogStack.evictLayout(i2, i);
        if (i == 0) {
            if (evictLayout == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            }
            InsetsReader.popBlueprint(objArr, copyOf, evictLayout, evictLayout + 1, 32);
            copyOf[31] = doubleTapPort.evictLayout();
            doubleTapPort.growPayload(objArr[evictLayout]);
            return copyOf;
        }
        int evictLayout2 = objArr[31] == null ? DialogStack.evictLayout(inflateEdge() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        int i4 = evictLayout + 1;
        if (i4 <= evictLayout2) {
            while (true) {
                Object obj = copyOf2[evictLayout2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[evictLayout2] = storeCharset((Object[]) obj, i3, 0, doubleTapPort);
                if (evictLayout2 == i4) {
                    break;
                }
                evictLayout2--;
            }
        }
        Object obj2 = copyOf2[evictLayout];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[evictLayout] = storeCharset((Object[]) obj2, i3, i2, doubleTapPort);
        return copyOf2;
    }

    public final DragHub syncScope(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            }
            return new PressReporter(objArr);
        }
        DoubleTapPort doubleTapPort = new DoubleTapPort(null);
        Object[] mergeLocale = mergeLocale(objArr, i2, i - 1, doubleTapPort);
        Intrinsics.checkNotNull(mergeLocale);
        Object evictLayout = doubleTapPort.evictLayout();
        Intrinsics.checkNotNull(evictLayout, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) evictLayout;
        if (mergeLocale[1] != null) {
            return new ListenerTree(mergeLocale, objArr2, i, i2);
        }
        Object obj = mergeLocale[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new ListenerTree((Object[]) obj, objArr2, i, i2 - 5);
    }

    @Override // java.util.List, com.goldenboot.saga.zone.DragHub
    public DragHub add(int i, Object obj) {
        VibrationMolder.growPayload(i, size());
        if (i == size()) {
            return add(obj);
        }
        int inflateEdge = inflateEdge();
        if (i >= inflateEdge) {
            return findTask(this.notifyMessage, i - inflateEdge, obj);
        }
        DoubleTapPort doubleTapPort = new DoubleTapPort(null);
        return findTask(expandArgs(this.notifyMessage, this.resetDelta, i, obj, doubleTapPort), 0, doubleTapPort.evictLayout());
    }
}
