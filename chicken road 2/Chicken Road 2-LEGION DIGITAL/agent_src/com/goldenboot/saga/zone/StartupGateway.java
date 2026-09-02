package com.goldenboot.saga.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class StartupGateway implements Map, Serializable, KMutableMap {
    public static final ActivityMutator mergeLocale = new ActivityMutator(null);
    public static final StartupGateway syncScope;
    public int[] attachConfig;
    public int[] connectPatch;
    public StylusProbe decodePath;
    public int drawRequest;
    public ContentHook drawScope;
    public RowHelper expandArgs;
    public boolean findTask;
    public int gatherAdapter;
    public int inflateAdapter;
    public Object[] notifyMessage;
    public int purgeNode;
    public Object[] reduceScope;
    public int resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int detachStream(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final int injectMetric(int i) {
            return Integer.highestOneBit(CellEntry.releaseHeader(i, 1) * 3);
        }

        public final StartupGateway releaseHeader() {
            return StartupGateway.syncScope;
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends LayerUseCase implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(StartupGateway map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        public final int inflateAdapter() {
            if (detachStream() >= clipOrigin().inflateAdapter) {
                throw new NoSuchElementException();
            }
            int detachStream = detachStream();
            popBlueprint(detachStream + 1);
            serializeOffset(detachStream);
            Object obj = clipOrigin().reduceScope[releaseHeader()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = clipOrigin().notifyMessage;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[releaseHeader()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            applyTask();
            return hashCode2;
        }

        @Override // java.util.Iterator
        /* renamed from: notifyMessage, reason: merged with bridge method [inline-methods] */
        public FeedbackFlow next() {
            injectMetric();
            if (detachStream() >= clipOrigin().inflateAdapter) {
                throw new NoSuchElementException();
            }
            int detachStream = detachStream();
            popBlueprint(detachStream + 1);
            serializeOffset(detachStream);
            FeedbackFlow feedbackFlow = new FeedbackFlow(clipOrigin(), releaseHeader());
            applyTask();
            return feedbackFlow;
        }

        public final void resetDelta(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (detachStream() >= clipOrigin().inflateAdapter) {
                throw new NoSuchElementException();
            }
            int detachStream = detachStream();
            popBlueprint(detachStream + 1);
            serializeOffset(detachStream);
            Object obj = clipOrigin().reduceScope[releaseHeader()];
            if (obj == clipOrigin()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = clipOrigin().notifyMessage;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[releaseHeader()];
            if (obj2 == clipOrigin()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            applyTask();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends LayerUseCase implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndpointList(StartupGateway map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            injectMetric();
            if (detachStream() >= clipOrigin().inflateAdapter) {
                throw new NoSuchElementException();
            }
            int detachStream = detachStream();
            popBlueprint(detachStream + 1);
            serializeOffset(detachStream);
            Object obj = clipOrigin().reduceScope[releaseHeader()];
            applyTask();
            return obj;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow implements Map.Entry, KMutableMap.Entry {
        public final int connectPatch;
        public final int notifyMessage;
        public final StartupGateway reduceScope;

        public FeedbackFlow(StartupGateway map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.reduceScope = map;
            this.notifyMessage = i;
            this.connectPatch = map.drawRequest;
        }

        private final void injectMetric() {
            if (this.reduceScope.drawRequest != this.connectPatch) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            injectMetric();
            return this.reduceScope.reduceScope[this.notifyMessage];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            injectMetric();
            Object[] objArr = this.reduceScope.notifyMessage;
            Intrinsics.checkNotNull(objArr);
            return objArr[this.notifyMessage];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            injectMetric();
            this.reduceScope.gatherAdapter();
            Object[] inflateAdapter = this.reduceScope.inflateAdapter();
            int i = this.notifyMessage;
            Object obj2 = inflateAdapter[i];
            inflateAdapter[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class LayerUseCase {
        public int attachConfig;
        public int connectPatch;
        public int notifyMessage;
        public final StartupGateway reduceScope;

        public LayerUseCase(StartupGateway map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.reduceScope = map;
            this.connectPatch = -1;
            this.attachConfig = map.drawRequest;
            applyTask();
        }

        public final void applyTask() {
            while (this.notifyMessage < this.reduceScope.inflateAdapter) {
                int[] iArr = this.reduceScope.connectPatch;
                int i = this.notifyMessage;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.notifyMessage = i + 1;
                }
            }
        }

        public final StartupGateway clipOrigin() {
            return this.reduceScope;
        }

        public final int detachStream() {
            return this.notifyMessage;
        }

        public final boolean hasNext() {
            return this.notifyMessage < this.reduceScope.inflateAdapter;
        }

        public final void injectMetric() {
            if (this.reduceScope.drawRequest != this.attachConfig) {
                throw new ConcurrentModificationException();
            }
        }

        public final void popBlueprint(int i) {
            this.notifyMessage = i;
        }

        public final int releaseHeader() {
            return this.connectPatch;
        }

        public final void remove() {
            injectMetric();
            if (this.connectPatch == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.reduceScope.gatherAdapter();
            this.reduceScope.formatPosition(this.connectPatch);
            this.connectPatch = -1;
            this.attachConfig = this.reduceScope.drawRequest;
        }

        public final void serializeOffset(int i) {
            this.connectPatch = i;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends LayerUseCase implements Iterator, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(StartupGateway map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            injectMetric();
            if (detachStream() >= clipOrigin().inflateAdapter) {
                throw new NoSuchElementException();
            }
            int detachStream = detachStream();
            popBlueprint(detachStream + 1);
            serializeOffset(detachStream);
            Object[] objArr = clipOrigin().notifyMessage;
            Intrinsics.checkNotNull(objArr);
            Object obj = objArr[releaseHeader()];
            applyTask();
            return obj;
        }
    }

    static {
        StartupGateway startupGateway = new StartupGateway(0);
        startupGateway.findTask = true;
        syncScope = startupGateway;
    }

    public StartupGateway(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.reduceScope = objArr;
        this.notifyMessage = objArr2;
        this.connectPatch = iArr;
        this.attachConfig = iArr2;
        this.resetDelta = i;
        this.inflateAdapter = i2;
        this.purgeNode = mergeLocale.detachStream(queryModel());
    }

    private final void mergeLocale(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > filterPayload()) {
            int detachStream = AccentAlerter.reduceScope.detachStream(filterPayload(), i);
            this.reduceScope = ComponentInterpreter.releaseHeader(this.reduceScope, detachStream);
            Object[] objArr = this.notifyMessage;
            this.notifyMessage = objArr != null ? ComponentInterpreter.releaseHeader(objArr, detachStream) : null;
            int[] copyOf = Arrays.copyOf(this.connectPatch, detachStream);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.connectPatch = copyOf;
            int injectMetric = mergeLocale.injectMetric(detachStream);
            if (injectMetric > queryModel()) {
                connectComponent(injectMetric);
            }
        }
    }

    private final void syncScope(int i) {
        if (resolveDelta(i)) {
            decodePath(true);
        } else {
            mergeLocale(this.inflateAdapter + i);
        }
    }

    private final void updateAction() {
        this.drawRequest++;
    }

    public final boolean attachCallback(Map.Entry entry) {
        int resetDelta = resetDelta(entry.getKey());
        Object[] inflateAdapter = inflateAdapter();
        if (resetDelta >= 0) {
            inflateAdapter[resetDelta] = entry.getValue();
            return true;
        }
        int i = (-resetDelta) - 1;
        if (Intrinsics.areEqual(entry.getValue(), inflateAdapter[i])) {
            return false;
        }
        inflateAdapter[i] = entry.getValue();
        return true;
    }

    public Collection bindBody() {
        ContentHook contentHook = this.drawScope;
        if (contentHook != null) {
            return contentHook;
        }
        ContentHook contentHook2 = new ContentHook(this);
        this.drawScope = contentHook2;
        return contentHook2;
    }

    public final boolean cancelArchive(Object obj) {
        gatherAdapter();
        int storeCharset = storeCharset(obj);
        if (storeCharset < 0) {
            return false;
        }
        formatPosition(storeCharset);
        return true;
    }

    @Override // java.util.Map
    public void clear() {
        gatherAdapter();
        int i = this.inflateAdapter - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.connectPatch;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.attachConfig[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ComponentInterpreter.flushSample(this.reduceScope, 0, this.inflateAdapter);
        Object[] objArr = this.notifyMessage;
        if (objArr != null) {
            ComponentInterpreter.flushSample(objArr, 0, this.inflateAdapter);
        }
        this.gatherAdapter = 0;
        this.inflateAdapter = 0;
        updateAction();
    }

    public final void connectComponent(int i) {
        updateAction();
        int i2 = 0;
        if (this.inflateAdapter > size()) {
            decodePath(false);
        }
        this.attachConfig = new int[i];
        this.purgeNode = mergeLocale.detachStream(i);
        while (i2 < this.inflateAdapter) {
            int i3 = i2 + 1;
            if (!prepareTask(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return injectConstraint(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return storeCharset(obj) >= 0;
    }

    public final void decodePath(boolean z) {
        int i;
        Object[] objArr = this.notifyMessage;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.inflateAdapter;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.connectPatch;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.reduceScope;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.attachConfig[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ComponentInterpreter.flushSample(this.reduceScope, i3, i);
        if (objArr != null) {
            ComponentInterpreter.flushSample(objArr, i3, this.inflateAdapter);
        }
        this.inflateAdapter = i3;
    }

    public final int dispatchTimezone(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.purgeNode;
    }

    public final Map drawRequest() {
        gatherAdapter();
        this.findTask = true;
        if (size() > 0) {
            return this;
        }
        StartupGateway startupGateway = syncScope;
        Intrinsics.checkNotNull(startupGateway, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return startupGateway;
    }

    public final boolean drawScope(Collection m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!expandArgs((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return inflateEdge();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && findTask((Map) obj);
        }
        return true;
    }

    public final boolean expandArgs(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int injectConstraint = injectConstraint(entry.getKey());
        if (injectConstraint < 0) {
            return false;
        }
        Object[] objArr = this.notifyMessage;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[injectConstraint], entry.getValue());
    }

    public final int filterPayload() {
        return this.reduceScope.length;
    }

    public final boolean findTask(Map map) {
        return size() == map.size() && drawScope(map.entrySet());
    }

    public final BounceHandler flattenPackage() {
        return new BounceHandler(this);
    }

    public final void formatPosition(int i) {
        ComponentInterpreter.clipOrigin(this.reduceScope, i);
        Object[] objArr = this.notifyMessage;
        if (objArr != null) {
            ComponentInterpreter.clipOrigin(objArr, i);
        }
        resumeSignature(this.connectPatch[i]);
        this.connectPatch[i] = -1;
        this.gatherAdapter = size() - 1;
        updateAction();
    }

    public final void gatherAdapter() {
        if (this.findTask) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int injectConstraint = injectConstraint(obj);
        if (injectConstraint < 0) {
            return null;
        }
        Object[] objArr = this.notifyMessage;
        Intrinsics.checkNotNull(objArr);
        return objArr[injectConstraint];
    }

    public final boolean groupArchive(Object obj) {
        gatherAdapter();
        int injectConstraint = injectConstraint(obj);
        if (injectConstraint < 0) {
            return false;
        }
        formatPosition(injectConstraint);
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        BounceHandler flattenPackage = flattenPackage();
        int i = 0;
        while (flattenPackage.hasNext()) {
            i += flattenPackage.inflateAdapter();
        }
        return i;
    }

    public final Object[] inflateAdapter() {
        Object[] objArr = this.notifyMessage;
        if (objArr != null) {
            return objArr;
        }
        Object[] detachStream = ComponentInterpreter.detachStream(filterPayload());
        this.notifyMessage = detachStream;
        return detachStream;
    }

    public Set inflateEdge() {
        RowHelper rowHelper = this.expandArgs;
        if (rowHelper != null) {
            return rowHelper;
        }
        RowHelper rowHelper2 = new RowHelper(this);
        this.expandArgs = rowHelper2;
        return rowHelper2;
    }

    public final int injectConstraint(Object obj) {
        int dispatchTimezone = dispatchTimezone(obj);
        int i = this.resetDelta;
        while (true) {
            int i2 = this.attachConfig[dispatchTimezone];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(this.reduceScope[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            dispatchTimezone = dispatchTimezone == 0 ? queryModel() - 1 : dispatchTimezone - 1;
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return packPackage();
    }

    public final boolean mapJob(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        syncScope(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (attachCallback((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public Set packPackage() {
        StylusProbe stylusProbe = this.decodePath;
        if (stylusProbe != null) {
            return stylusProbe;
        }
        StylusProbe stylusProbe2 = new StylusProbe(this);
        this.decodePath = stylusProbe2;
        return stylusProbe2;
    }

    public final EndpointList parseAsset() {
        return new EndpointList(this);
    }

    public final boolean prepareTask(int i) {
        int dispatchTimezone = dispatchTimezone(this.reduceScope[i]);
        int i2 = this.resetDelta;
        while (true) {
            int[] iArr = this.attachConfig;
            if (iArr[dispatchTimezone] == 0) {
                iArr[dispatchTimezone] = i + 1;
                this.connectPatch[i] = dispatchTimezone;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            dispatchTimezone = dispatchTimezone == 0 ? queryModel() - 1 : dispatchTimezone - 1;
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        gatherAdapter();
        int resetDelta = resetDelta(obj);
        Object[] inflateAdapter = inflateAdapter();
        if (resetDelta >= 0) {
            inflateAdapter[resetDelta] = obj2;
            return null;
        }
        int i = (-resetDelta) - 1;
        Object obj3 = inflateAdapter[i];
        inflateAdapter[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        gatherAdapter();
        mapJob(from.entrySet());
    }

    public final int queryModel() {
        return this.attachConfig.length;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        gatherAdapter();
        int injectConstraint = injectConstraint(obj);
        if (injectConstraint < 0) {
            return null;
        }
        Object[] objArr = this.notifyMessage;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[injectConstraint];
        formatPosition(injectConstraint);
        return obj2;
    }

    public final int resetDelta(Object obj) {
        gatherAdapter();
        while (true) {
            int dispatchTimezone = dispatchTimezone(obj);
            int updateTimer = CellEntry.updateTimer(this.resetDelta * 2, queryModel() / 2);
            int i = 0;
            while (true) {
                int i2 = this.attachConfig[dispatchTimezone];
                if (i2 <= 0) {
                    if (this.inflateAdapter < filterPayload()) {
                        int i3 = this.inflateAdapter;
                        int i4 = i3 + 1;
                        this.inflateAdapter = i4;
                        this.reduceScope[i3] = obj;
                        this.connectPatch[i3] = dispatchTimezone;
                        this.attachConfig[dispatchTimezone] = i4;
                        this.gatherAdapter = size() + 1;
                        updateAction();
                        if (i > this.resetDelta) {
                            this.resetDelta = i;
                        }
                        return i3;
                    }
                    syncScope(1);
                } else {
                    if (Intrinsics.areEqual(this.reduceScope[i2 - 1], obj)) {
                        return -i2;
                    }
                    i++;
                    if (i > updateTimer) {
                        connectComponent(queryModel() * 2);
                        break;
                    }
                    dispatchTimezone = dispatchTimezone == 0 ? queryModel() - 1 : dispatchTimezone - 1;
                }
            }
        }
    }

    public final StylusConverter resetValue() {
        return new StylusConverter(this);
    }

    public final boolean resolveDelta(int i) {
        int filterPayload = filterPayload();
        int i2 = this.inflateAdapter;
        int i3 = filterPayload - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= filterPayload() / 4;
    }

    public final void resumeSignature(int i) {
        int updateTimer = CellEntry.updateTimer(this.resetDelta * 2, queryModel() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? queryModel() - 1 : i - 1;
            i2++;
            if (i2 > this.resetDelta) {
                this.attachConfig[i3] = 0;
                return;
            }
            int[] iArr = this.attachConfig;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((dispatchTimezone(this.reduceScope[i5]) - i) & (queryModel() - 1)) >= i2) {
                    this.attachConfig[i3] = i4;
                    this.connectPatch[i5] = i3;
                }
                updateTimer--;
            }
            i3 = i;
            i2 = 0;
            updateTimer--;
        } while (updateTimer >= 0);
        this.attachConfig[i3] = -1;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return unlockMessage();
    }

    public final boolean startResource(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        gatherAdapter();
        int injectConstraint = injectConstraint(entry.getKey());
        if (injectConstraint < 0) {
            return false;
        }
        Object[] objArr = this.notifyMessage;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[injectConstraint], entry.getValue())) {
            return false;
        }
        formatPosition(injectConstraint);
        return true;
    }

    public final int storeCharset(Object obj) {
        int i = this.inflateAdapter;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.connectPatch[i] >= 0) {
                Object[] objArr = this.notifyMessage;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        BounceHandler flattenPackage = flattenPackage();
        int i = 0;
        while (flattenPackage.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            flattenPackage.resetDelta(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public int unlockMessage() {
        return this.gatherAdapter;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return bindBody();
    }

    public StartupGateway() {
        this(8);
    }

    public StartupGateway(int i) {
        this(ComponentInterpreter.detachStream(i), null, new int[i], new int[mergeLocale.injectMetric(i)], 2, 0);
    }
}
