package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.DragHub;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class KeyframeFetcher extends FrameJob implements DragHub.ActivityMutator {
    public int attachConfig;
    public Object[] connectPatch;
    public int drawRequest;
    public Object[] inflateAdapter;
    public Object[] notifyMessage;
    public Object[] purgeNode;
    public DragHub reduceScope;
    public ServerTunnel resetDelta = new ServerTunnel();

    public KeyframeFetcher(DragHub dragHub, Object[] objArr, Object[] objArr2, int i) {
        this.reduceScope = dragHub;
        this.notifyMessage = objArr;
        this.connectPatch = objArr2;
        this.attachConfig = i;
        this.inflateAdapter = this.notifyMessage;
        this.purgeNode = this.connectPatch;
        this.drawRequest = this.reduceScope.size();
    }

    private final Object[] bindBody(Object[] objArr, int i, int i2, DoubleTapPort doubleTapPort) {
        Object[] bindBody;
        int evictLayout = DialogStack.evictLayout(i2 - 1, i);
        if (i == 5) {
            doubleTapPort.growPayload(objArr[evictLayout]);
            bindBody = null;
        } else {
            Object obj = objArr[evictLayout];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            bindBody = bindBody((Object[]) obj, i - 5, i2, doubleTapPort);
        }
        if (bindBody == null && evictLayout == 0) {
            return null;
        }
        Object[] filterPayload = filterPayload(objArr);
        filterPayload[evictLayout] = bindBody;
        return filterPayload;
    }

    private final Object[] cancelArchive(Object[] objArr, int i, int i2, DoubleTapPort doubleTapPort) {
        int evictLayout = DialogStack.evictLayout(i2, i);
        if (i == 0) {
            Object obj = objArr[evictLayout];
            Object[] popBlueprint = InsetsReader.popBlueprint(objArr, filterPayload(objArr), evictLayout, evictLayout + 1, 32);
            popBlueprint[31] = doubleTapPort.evictLayout();
            doubleTapPort.growPayload(obj);
            return popBlueprint;
        }
        int evictLayout2 = objArr[31] == null ? DialogStack.evictLayout(serializeTask() - 1, i) : 31;
        Object[] filterPayload = filterPayload(objArr);
        int i3 = i - 5;
        int i4 = evictLayout + 1;
        if (i4 <= evictLayout2) {
            while (true) {
                Object obj2 = filterPayload[evictLayout2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                filterPayload[evictLayout2] = cancelArchive((Object[]) obj2, i3, 0, doubleTapPort);
                if (evictLayout2 == i4) {
                    break;
                }
                evictLayout2--;
            }
        }
        Object obj3 = filterPayload[evictLayout];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        filterPayload[evictLayout] = cancelArchive((Object[]) obj3, i3, i2, doubleTapPort);
        return filterPayload;
    }

    public static final boolean formatPosition(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final Object[] serializeOffset(int i) {
        if (serializeTask() <= i) {
            return this.purgeNode;
        }
        Object[] objArr = this.inflateAdapter;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.attachConfig; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[DialogStack.evictLayout(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int serializeTask() {
        if (size() <= 32) {
            return 0;
        }
        return DialogStack.detachStream(size());
    }

    private final boolean startResource(TouchRecord touchRecord) {
        Object[] parseAsset;
        int locateSignal = locateSignal();
        DoubleTapPort doubleTapPort = new DoubleTapPort(null);
        if (this.inflateAdapter == null) {
            return resumeSignature(touchRecord, locateSignal, doubleTapPort) != locateSignal;
        }
        ListIterator storeCharset = storeCharset(0);
        int i = 32;
        while (i == 32 && storeCharset.hasNext()) {
            i = connectComponent(touchRecord, (Object[]) storeCharset.next(), 32, doubleTapPort);
        }
        if (i == 32) {
            CoreGraph.evictLayout(!storeCharset.hasNext());
            int resumeSignature = resumeSignature(touchRecord, locateSignal, doubleTapPort);
            if (resumeSignature == 0) {
                dispatchTimezone(this.inflateAdapter, size(), this.attachConfig);
            }
            return resumeSignature != locateSignal;
        }
        int previousIndex = storeCharset.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (storeCharset.hasNext()) {
            i2 = updateAction(touchRecord, (Object[]) storeCharset.next(), 32, i2, doubleTapPort, arrayList2, arrayList);
        }
        int updateAction = updateAction(touchRecord, this.purgeNode, locateSignal, i2, doubleTapPort, arrayList2, arrayList);
        Object evictLayout = doubleTapPort.evictLayout();
        Intrinsics.checkNotNull(evictLayout, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) evictLayout;
        InsetsReader.inflateAdapter(objArr, null, updateAction, 32);
        if (arrayList.isEmpty()) {
            parseAsset = this.inflateAdapter;
            Intrinsics.checkNotNull(parseAsset);
        } else {
            parseAsset = parseAsset(this.inflateAdapter, previousIndex, this.attachConfig, arrayList.iterator());
        }
        int size = previousIndex + (arrayList.size() << 5);
        this.inflateAdapter = resetValue(parseAsset, size);
        this.purgeNode = objArr;
        this.drawRequest = size + updateAction;
        return true;
    }

    private final Object[] syncScope(Object[] objArr, int i, int i2, Object obj, DoubleTapPort doubleTapPort) {
        Object obj2;
        int evictLayout = DialogStack.evictLayout(i2, i);
        if (i == 0) {
            doubleTapPort.growPayload(objArr[31]);
            Object[] popBlueprint = InsetsReader.popBlueprint(objArr, filterPayload(objArr), evictLayout + 1, evictLayout, 31);
            popBlueprint[evictLayout] = obj;
            return popBlueprint;
        }
        Object[] filterPayload = filterPayload(objArr);
        int i3 = i - 5;
        Object obj3 = filterPayload[evictLayout];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        filterPayload[evictLayout] = syncScope((Object[]) obj3, i3, i2, obj, doubleTapPort);
        while (true) {
            evictLayout++;
            if (evictLayout >= 32 || (obj2 = filterPayload[evictLayout]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            filterPayload[evictLayout] = syncScope((Object[]) obj2, i3, 0, doubleTapPort.evictLayout(), doubleTapPort);
        }
        return filterPayload;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int locateSignal = locateSignal();
        if (locateSignal < 32) {
            Object[] filterPayload = filterPayload(this.purgeNode);
            filterPayload[locateSignal] = obj;
            this.purgeNode = filterPayload;
            this.drawRequest = size() + 1;
        } else {
            attachCallback(this.inflateAdapter, this.purgeNode, packPackage(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int locateSignal = locateSignal();
        Iterator it = collection.iterator();
        if (32 - locateSignal >= collection.size()) {
            this.purgeNode = notifyMessage(filterPayload(this.purgeNode), locateSignal, it);
            this.drawRequest = size() + collection.size();
        } else {
            int size = ((collection.size() + locateSignal) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = notifyMessage(filterPayload(this.purgeNode), locateSignal, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = notifyMessage(queryModel(), 0, it);
            }
            this.inflateAdapter = mapJob(this.inflateAdapter, serializeTask(), objArr);
            this.purgeNode = notifyMessage(queryModel(), 0, it);
            this.drawRequest = size() + collection.size();
        }
        return true;
    }

    public final Object[] appendKey(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.inflateAdapter == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator storeCharset = storeCharset(serializeTask() >> 5);
        while (storeCharset.previousIndex() != i) {
            Object[] objArr3 = (Object[]) storeCharset.previous();
            InsetsReader.popBlueprint(objArr3, objArr2, 0, 32 - i2, 32);
            objArr2 = inflateEdge(objArr3, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return (Object[]) storeCharset.previous();
    }

    public final void attachCallback(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.attachConfig;
        if (size > (1 << i)) {
            this.inflateAdapter = prepareTask(packPackage(objArr), objArr2, this.attachConfig + 5);
            this.purgeNode = objArr3;
            this.attachConfig += 5;
            this.drawRequest = size() + 1;
            return;
        }
        if (objArr == null) {
            this.inflateAdapter = objArr2;
            this.purgeNode = objArr3;
            this.drawRequest = size() + 1;
        } else {
            this.inflateAdapter = prepareTask(objArr, objArr2, i);
            this.purgeNode = objArr3;
            this.drawRequest = size() + 1;
        }
    }

    @Override // com.goldenboot.saga.zone.DragHub.ActivityMutator
    public DragHub build() {
        DragHub listenerTree;
        if (this.inflateAdapter == this.notifyMessage && this.purgeNode == this.connectPatch) {
            listenerTree = this.reduceScope;
        } else {
            this.resetDelta = new ServerTunnel();
            Object[] objArr = this.inflateAdapter;
            this.notifyMessage = objArr;
            Object[] objArr2 = this.purgeNode;
            this.connectPatch = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.inflateAdapter;
                Intrinsics.checkNotNull(objArr3);
                listenerTree = new ListenerTree(objArr3, this.purgeNode, size(), this.attachConfig);
            } else if (objArr2.length == 0) {
                listenerTree = DialogStack.growPayload();
            } else {
                Object[] copyOf = Arrays.copyOf(this.purgeNode, size());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                listenerTree = new PressReporter(copyOf);
            }
        }
        this.reduceScope = listenerTree;
        return listenerTree;
    }

    @Override // com.goldenboot.saga.zone.FrameJob
    public Object clipOrigin(int i) {
        VibrationMolder.evictLayout(i, size());
        ((AbstractList) this).modCount++;
        int serializeTask = serializeTask();
        if (i >= serializeTask) {
            return resolveDelta(this.inflateAdapter, serializeTask, this.attachConfig, i - serializeTask);
        }
        DoubleTapPort doubleTapPort = new DoubleTapPort(this.purgeNode[0]);
        Object[] objArr = this.inflateAdapter;
        Intrinsics.checkNotNull(objArr);
        resolveDelta(cancelArchive(objArr, this.attachConfig, i, doubleTapPort), serializeTask, this.attachConfig, 0);
        return doubleTapPort.evictLayout();
    }

    public final void computeTarget(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] queryModel;
        if (!(i3 >= 1)) {
            NotificationCoordinator.evictLayout("requires at least one nullBuffer");
        }
        Object[] filterPayload = filterPayload(objArr);
        objArr2[0] = filterPayload;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            InsetsReader.popBlueprint(filterPayload, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                queryModel = filterPayload;
            } else {
                queryModel = queryModel();
                i3--;
                objArr2[i3] = queryModel;
            }
            int i7 = i2 - i6;
            InsetsReader.popBlueprint(filterPayload, objArr3, 0, i7, i2);
            InsetsReader.popBlueprint(filterPayload, queryModel, size + 1, i4, i7);
            objArr3 = queryModel;
        }
        Iterator it = collection.iterator();
        notifyMessage(filterPayload, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = notifyMessage(queryModel(), 0, it);
        }
        notifyMessage(objArr3, 0, it);
    }

    public final int connectComponent(TouchRecord touchRecord, Object[] objArr, int i, DoubleTapPort doubleTapPort) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) touchRecord.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = filterPayload(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        doubleTapPort.growPayload(objArr2);
        return i2;
    }

    public final void dispatchTimezone(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.inflateAdapter = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.purgeNode = objArr;
            this.drawRequest = i;
            this.attachConfig = i2;
            return;
        }
        DoubleTapPort doubleTapPort = new DoubleTapPort(null);
        Intrinsics.checkNotNull(objArr);
        Object[] bindBody = bindBody(objArr, i2, i, doubleTapPort);
        Intrinsics.checkNotNull(bindBody);
        Object evictLayout = doubleTapPort.evictLayout();
        Intrinsics.checkNotNull(evictLayout, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.purgeNode = (Object[]) evictLayout;
        this.drawRequest = i;
        if (bindBody[1] == null) {
            this.inflateAdapter = (Object[]) bindBody[0];
            this.attachConfig = i2 - 5;
        } else {
            this.inflateAdapter = bindBody;
            this.attachConfig = i2;
        }
    }

    public final Object[] drawScope() {
        return this.inflateAdapter;
    }

    public final int emitStrategy(int i) {
        return i <= 32 ? i : i - DialogStack.detachStream(i);
    }

    public final int expandArgs() {
        return this.attachConfig;
    }

    public final Object[] filterPayload(Object[] objArr) {
        return objArr == null ? queryModel() : injectConstraint(objArr) ? objArr : InsetsReader.reduceScope(objArr, queryModel(), 0, 0, CellEntry.updateTimer(objArr.length, 32), 6, null);
    }

    public final Object[] findTask() {
        return this.purgeNode;
    }

    public final void flattenPackage(Object[] objArr, int i, Object obj) {
        int locateSignal = locateSignal();
        Object[] filterPayload = filterPayload(this.purgeNode);
        if (locateSignal < 32) {
            InsetsReader.popBlueprint(this.purgeNode, filterPayload, i + 1, i, locateSignal);
            filterPayload[i] = obj;
            this.inflateAdapter = objArr;
            this.purgeNode = filterPayload;
            this.drawRequest = size() + 1;
            return;
        }
        Object[] objArr2 = this.purgeNode;
        Object obj2 = objArr2[31];
        InsetsReader.popBlueprint(objArr2, filterPayload, i + 1, i, 31);
        filterPayload[i] = obj;
        attachCallback(objArr, filterPayload, packPackage(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        VibrationMolder.evictLayout(i, size());
        return serializeOffset(i)[i & 31];
    }

    public final boolean groupArchive(TouchRecord touchRecord) {
        boolean startResource = startResource(touchRecord);
        if (startResource) {
            ((AbstractList) this).modCount++;
        }
        return startResource;
    }

    public final int inflateAdapter() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] inflateEdge(Object[] objArr, int i) {
        return injectConstraint(objArr) ? InsetsReader.popBlueprint(objArr, objArr, i, 0, 32 - i) : InsetsReader.popBlueprint(objArr, queryModel(), i, 0, 32 - i);
    }

    public final boolean injectConstraint(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.resetDelta;
    }

    public final Object[] injectField(Object[] objArr, int i, int i2, Object obj, DoubleTapPort doubleTapPort) {
        int evictLayout = DialogStack.evictLayout(i2, i);
        Object[] filterPayload = filterPayload(objArr);
        if (i != 0) {
            Object obj2 = filterPayload[evictLayout];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            filterPayload[evictLayout] = injectField((Object[]) obj2, i - 5, i2, obj, doubleTapPort);
            return filterPayload;
        }
        if (filterPayload != objArr) {
            ((AbstractList) this).modCount++;
        }
        doubleTapPort.growPayload(filterPayload[evictLayout]);
        filterPayload[evictLayout] = obj;
        return filterPayload;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final int locateSignal() {
        return emitStrategy(size());
    }

    public final Object[] mapJob(Object[] objArr, int i, Object[][] objArr2) {
        Iterator it = ArrayIteratorKt.iterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.attachConfig;
        Object[] parseAsset = i2 < (1 << i3) ? parseAsset(objArr, i, i3, it) : filterPayload(objArr);
        while (it.hasNext()) {
            this.attachConfig += 5;
            parseAsset = packPackage(parseAsset);
            int i4 = this.attachConfig;
            parseAsset(parseAsset, 1 << i4, i4, it);
        }
        return parseAsset;
    }

    public final void mergeLocale(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        if (this.inflateAdapter == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        Object[] appendKey = appendKey(i4, i2, objArr, i3, objArr2);
        int serializeTask = i3 - (((serializeTask() >> 5) - 1) - i4);
        if (serializeTask < i3) {
            Object[] objArr4 = objArr[serializeTask];
            Intrinsics.checkNotNull(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        computeTarget(collection, i, appendKey, 32, objArr, serializeTask, objArr3);
    }

    public final Object[] notifyMessage(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public final Object[] packPackage(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.resetDelta;
        return objArr;
    }

    public final Object[] parseAsset(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            NotificationCoordinator.evictLayout("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            NotificationCoordinator.evictLayout("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] filterPayload = filterPayload(objArr);
        int evictLayout = DialogStack.evictLayout(i, i2);
        int i3 = i2 - 5;
        filterPayload[evictLayout] = parseAsset((Object[]) filterPayload[evictLayout], i, i3, it);
        while (true) {
            evictLayout++;
            if (evictLayout >= 32 || !it.hasNext()) {
                break;
            }
            filterPayload[evictLayout] = parseAsset((Object[]) filterPayload[evictLayout], 0, i3, it);
        }
        return filterPayload;
    }

    public final Object[] prepareTask(Object[] objArr, Object[] objArr2, int i) {
        int evictLayout = DialogStack.evictLayout(size() - 1, i);
        Object[] filterPayload = filterPayload(objArr);
        if (i == 5) {
            filterPayload[evictLayout] = objArr2;
            return filterPayload;
        }
        filterPayload[evictLayout] = prepareTask((Object[]) filterPayload[evictLayout], objArr2, i - 5);
        return filterPayload;
    }

    public final Object[] queryModel() {
        Object[] objArr = new Object[33];
        objArr[32] = this.resetDelta;
        return objArr;
    }

    @Override // com.goldenboot.saga.zone.FrameJob
    public int releaseHeader() {
        return this.drawRequest;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection collection) {
        return groupArchive(new TouchRecord() { // from class: com.goldenboot.saga.zone.CardDiff
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                boolean formatPosition;
                formatPosition = KeyframeFetcher.formatPosition(collection, obj);
                return Boolean.valueOf(formatPosition);
            }
        });
    }

    public final Object[] resetValue(Object[] objArr, int i) {
        if (!((i & 31) == 0)) {
            NotificationCoordinator.evictLayout("invalid size");
        }
        if (i == 0) {
            this.attachConfig = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.attachConfig;
            if ((i2 >> i3) != 0) {
                return unlockMessage(objArr, i2, i3);
            }
            this.attachConfig = i3 - 5;
            Object[] objArr2 = objArr[0];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    public final Object resolveDelta(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        CoreGraph.evictLayout(i3 < size);
        if (size == 1) {
            Object obj = this.purgeNode[0];
            dispatchTimezone(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.purgeNode;
        Object obj2 = objArr2[i3];
        Object[] popBlueprint = InsetsReader.popBlueprint(objArr2, filterPayload(objArr2), i3, i3 + 1, size);
        popBlueprint[size - 1] = null;
        this.inflateAdapter = objArr;
        this.purgeNode = popBlueprint;
        this.drawRequest = (i + size) - 1;
        this.attachConfig = i2;
        return obj2;
    }

    public final int resumeSignature(TouchRecord touchRecord, int i, DoubleTapPort doubleTapPort) {
        int connectComponent = connectComponent(touchRecord, this.purgeNode, i, doubleTapPort);
        if (connectComponent == i) {
            CoreGraph.evictLayout(doubleTapPort.evictLayout() == this.purgeNode);
            return i;
        }
        Object evictLayout = doubleTapPort.evictLayout();
        Intrinsics.checkNotNull(evictLayout, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) evictLayout;
        InsetsReader.inflateAdapter(objArr, null, connectComponent, i);
        this.purgeNode = objArr;
        this.drawRequest = size() - (i - connectComponent);
        return connectComponent;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        VibrationMolder.evictLayout(i, size());
        if (serializeTask() > i) {
            DoubleTapPort doubleTapPort = new DoubleTapPort(null);
            Object[] objArr = this.inflateAdapter;
            Intrinsics.checkNotNull(objArr);
            this.inflateAdapter = injectField(objArr, this.attachConfig, i, obj, doubleTapPort);
            return doubleTapPort.evictLayout();
        }
        Object[] filterPayload = filterPayload(this.purgeNode);
        if (filterPayload != this.purgeNode) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = filterPayload[i2];
        filterPayload[i2] = obj;
        this.purgeNode = filterPayload;
        return obj2;
    }

    public final ListIterator storeCharset(int i) {
        Object[] objArr = this.inflateAdapter;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int serializeTask = serializeTask() >> 5;
        VibrationMolder.growPayload(i, serializeTask);
        int i2 = this.attachConfig;
        return i2 == 0 ? new InsetsInitializer(objArr, i) : new ToastSyncer(objArr, i, serializeTask, i2 / 5);
    }

    public final Object[] unlockMessage(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            NotificationCoordinator.evictLayout("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int evictLayout = DialogStack.evictLayout(i, i2);
        Object obj = objArr[evictLayout];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object unlockMessage = unlockMessage((Object[]) obj, i, i2 - 5);
        if (evictLayout < 31) {
            int i3 = evictLayout + 1;
            if (objArr[i3] != null) {
                if (injectConstraint(objArr)) {
                    InsetsReader.inflateAdapter(objArr, null, i3, 32);
                }
                objArr = InsetsReader.popBlueprint(objArr, queryModel(), 0, 0, i3);
            }
        }
        if (unlockMessage == objArr[evictLayout]) {
            return objArr;
        }
        Object[] filterPayload = filterPayload(objArr);
        filterPayload[evictLayout] = unlockMessage;
        return filterPayload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int updateAction(TouchRecord touchRecord, Object[] objArr, int i, int i2, DoubleTapPort doubleTapPort, List list, List list2) {
        if (injectConstraint(objArr)) {
            list.add(objArr);
        }
        Object evictLayout = doubleTapPort.evictLayout();
        Intrinsics.checkNotNull(evictLayout, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) evictLayout;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) touchRecord.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : queryModel();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        doubleTapPort.growPayload(objArr3);
        if (objArr2 != doubleTapPort.evictLayout()) {
            list2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        VibrationMolder.growPayload(i, size());
        return new RemoteConfigurator(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        VibrationMolder.growPayload(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int serializeTask = serializeTask();
        if (i >= serializeTask) {
            flattenPackage(this.inflateAdapter, i - serializeTask, obj);
            return;
        }
        DoubleTapPort doubleTapPort = new DoubleTapPort(null);
        Object[] objArr = this.inflateAdapter;
        Intrinsics.checkNotNull(objArr);
        flattenPackage(syncScope(objArr, this.attachConfig, i, obj, doubleTapPort), 0, doubleTapPort.evictLayout());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        KeyframeFetcher keyframeFetcher;
        Collection collection2;
        Object[] popBlueprint;
        Object[][] objArr;
        VibrationMolder.growPayload(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            CoreGraph.evictLayout(i >= serializeTask());
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr2 = this.purgeNode;
            Object[] popBlueprint2 = InsetsReader.popBlueprint(objArr2, filterPayload(objArr2), size2 + 1, i3, locateSignal());
            notifyMessage(popBlueprint2, i3, collection.iterator());
            this.purgeNode = popBlueprint2;
            this.drawRequest = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int locateSignal = locateSignal();
        int emitStrategy = emitStrategy(size() + collection.size());
        if (i >= serializeTask()) {
            popBlueprint = queryModel();
            objArr = objArr3;
            keyframeFetcher = this;
            collection2 = collection;
            keyframeFetcher.computeTarget(collection2, i, this.purgeNode, locateSignal, objArr, size, popBlueprint);
        } else {
            keyframeFetcher = this;
            collection2 = collection;
            if (emitStrategy > locateSignal) {
                int i4 = emitStrategy - locateSignal;
                Object[] inflateEdge = keyframeFetcher.inflateEdge(keyframeFetcher.purgeNode, i4);
                keyframeFetcher.mergeLocale(collection2, i, i4, objArr3, size, inflateEdge);
                objArr = objArr3;
                popBlueprint = inflateEdge;
            } else {
                int i5 = locateSignal - emitStrategy;
                popBlueprint = InsetsReader.popBlueprint(keyframeFetcher.purgeNode, keyframeFetcher.queryModel(), 0, i5, locateSignal);
                int i6 = 32 - i5;
                Object[] inflateEdge2 = keyframeFetcher.inflateEdge(keyframeFetcher.purgeNode, i6);
                int i7 = size - 1;
                objArr3[i7] = inflateEdge2;
                keyframeFetcher.mergeLocale(collection2, i, i6, objArr3, i7, inflateEdge2);
                collection2 = collection2;
                objArr = objArr3;
                keyframeFetcher = keyframeFetcher;
            }
        }
        keyframeFetcher.inflateAdapter = keyframeFetcher.mapJob(keyframeFetcher.inflateAdapter, i2, objArr);
        keyframeFetcher.purgeNode = popBlueprint;
        keyframeFetcher.drawRequest = keyframeFetcher.size() + collection2.size();
        return true;
    }
}
