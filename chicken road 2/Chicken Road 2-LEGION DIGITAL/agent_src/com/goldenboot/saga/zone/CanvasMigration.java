package com.goldenboot.saga.zone;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CanvasMigration extends AbstractMap {
    public boolean attachConfig;
    public Map connectPatch;
    public Map inflateAdapter;
    public List notifyMessage;
    public volatile FeedbackFlow purgeNode;
    public final int reduceScope;
    public volatile ScopedMigration resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends CanvasMigration {
        public ActivityMutator(int i) {
            super(i, null);
        }

        @Override // com.goldenboot.saga.zone.CanvasMigration
        public void attachConfig() {
            if (!connectPatch()) {
                if (peekRevision() > 0) {
                    TransitionMemento.evictLayout(connectJob(0).getKey());
                    throw null;
                }
                Iterator it = reduceScope().iterator();
                if (it.hasNext()) {
                    TransitionMemento.evictLayout(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.attachConfig();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class EndpointList implements Map.Entry, Comparable {
        public Object notifyMessage;
        public final Comparable reduceScope;

        public EndpointList(CanvasMigration canvasMigration, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* renamed from: clipOrigin, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.reduceScope;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return releaseHeader(this.reduceScope, entry.getKey()) && releaseHeader(this.notifyMessage, entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public int compareTo(EndpointList endpointList) {
            return getKey().compareTo(endpointList.getKey());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.notifyMessage;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.reduceScope;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.notifyMessage;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        public final boolean releaseHeader(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            CanvasMigration.this.applyTask();
            Object obj2 = this.notifyMessage;
            this.notifyMessage = obj;
            return obj2;
        }

        public String toString() {
            return this.reduceScope + "=" + this.notifyMessage;
        }

        public EndpointList(Comparable comparable, Object obj) {
            this.reduceScope = comparable;
            this.notifyMessage = obj;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class FeedbackFlow extends ScopedMigration {
        public FeedbackFlow() {
            super(CanvasMigration.this, null);
        }

        @Override // com.goldenboot.saga.zone.CanvasMigration.ScopedMigration, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new BounceHandler(CanvasMigration.this, null);
        }

        public /* synthetic */ FeedbackFlow(CanvasMigration canvasMigration, ActivityMutator activityMutator) {
            this();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class LayerUseCase {
        public static final Iterator evictLayout = new ActivityMutator();
        public static final Iterable growPayload = new BounceHandler();

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public class ActivityMutator implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public class BounceHandler implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return LayerUseCase.evictLayout;
            }
        }

        public static Iterable growPayload() {
            return growPayload;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ScopedMigration extends AbstractSet {
        public ScopedMigration() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CanvasMigration.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = CanvasMigration.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            CanvasMigration.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new StylusConverter(CanvasMigration.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            CanvasMigration.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CanvasMigration.this.size();
        }

        public /* synthetic */ ScopedMigration(CanvasMigration canvasMigration, ActivityMutator activityMutator) {
            this();
        }
    }

    public /* synthetic */ CanvasMigration(int i, ActivityMutator activityMutator) {
        this(i);
    }

    public static CanvasMigration resetDelta(int i) {
        return new ActivityMutator(i);
    }

    public final void applyTask() {
        if (this.attachConfig) {
            throw new UnsupportedOperationException();
        }
    }

    public void attachConfig() {
        if (this.attachConfig) {
            return;
        }
        this.connectPatch = this.connectPatch.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.connectPatch);
        this.inflateAdapter = this.inflateAdapter.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.inflateAdapter);
        this.attachConfig = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        applyTask();
        if (!this.notifyMessage.isEmpty()) {
            this.notifyMessage.clear();
        }
        if (this.connectPatch.isEmpty()) {
            return;
        }
        this.connectPatch.clear();
    }

    public Map.Entry connectJob(int i) {
        return (Map.Entry) this.notifyMessage.get(i);
    }

    public boolean connectPatch() {
        return this.attachConfig;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return updateTimer(comparable) >= 0 || this.connectPatch.containsKey(comparable);
    }

    public final void drawField() {
        applyTask();
        if (!this.notifyMessage.isEmpty() || (this.notifyMessage instanceof ArrayList)) {
            return;
        }
        this.notifyMessage = new ArrayList(this.reduceScope);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.resetDelta == null) {
            this.resetDelta = new ScopedMigration(this, null);
        }
        return this.resetDelta;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasMigration)) {
            return super.equals(obj);
        }
        CanvasMigration canvasMigration = (CanvasMigration) obj;
        int size = size();
        if (size != canvasMigration.size()) {
            return false;
        }
        int peekRevision = peekRevision();
        if (peekRevision != canvasMigration.peekRevision()) {
            return entrySet().equals(canvasMigration.entrySet());
        }
        for (int i = 0; i < peekRevision; i++) {
            if (!connectJob(i).equals(canvasMigration.connectJob(i))) {
                return false;
            }
        }
        if (peekRevision != size) {
            return this.connectPatch.equals(canvasMigration.connectPatch);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int updateTimer = updateTimer(comparable);
        return updateTimer >= 0 ? ((EndpointList) this.notifyMessage.get(updateTimer)).getValue() : this.connectPatch.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int peekRevision = peekRevision();
        int i = 0;
        for (int i2 = 0; i2 < peekRevision; i2++) {
            i += ((EndpointList) this.notifyMessage.get(i2)).hashCode();
        }
        return serializeOffset() > 0 ? i + this.connectPatch.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: inflateAdapter, reason: merged with bridge method [inline-methods] */
    public Object put(Comparable comparable, Object obj) {
        applyTask();
        int updateTimer = updateTimer(comparable);
        if (updateTimer >= 0) {
            return ((EndpointList) this.notifyMessage.get(updateTimer)).setValue(obj);
        }
        drawField();
        int i = -(updateTimer + 1);
        if (i >= this.reduceScope) {
            return notifyMessage().put(comparable, obj);
        }
        int size = this.notifyMessage.size();
        int i2 = this.reduceScope;
        if (size == i2) {
            EndpointList endpointList = (EndpointList) this.notifyMessage.remove(i2 - 1);
            notifyMessage().put(endpointList.getKey(), endpointList.getValue());
        }
        this.notifyMessage.add(i, new EndpointList(comparable, obj));
        return null;
    }

    public final SortedMap notifyMessage() {
        applyTask();
        if (this.connectPatch.isEmpty() && !(this.connectPatch instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.connectPatch = treeMap;
            this.inflateAdapter = treeMap.descendingMap();
        }
        return (SortedMap) this.connectPatch;
    }

    public int peekRevision() {
        return this.notifyMessage.size();
    }

    public Set popBlueprint() {
        if (this.purgeNode == null) {
            this.purgeNode = new FeedbackFlow(this, null);
        }
        return this.purgeNode;
    }

    public final Object purgeNode(int i) {
        applyTask();
        Object value = ((EndpointList) this.notifyMessage.remove(i)).getValue();
        if (!this.connectPatch.isEmpty()) {
            Iterator it = notifyMessage().entrySet().iterator();
            this.notifyMessage.add(new EndpointList(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public Iterable reduceScope() {
        return this.connectPatch.isEmpty() ? LayerUseCase.growPayload() : this.connectPatch.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        applyTask();
        Comparable comparable = (Comparable) obj;
        int updateTimer = updateTimer(comparable);
        if (updateTimer >= 0) {
            return purgeNode(updateTimer);
        }
        if (this.connectPatch.isEmpty()) {
            return null;
        }
        return this.connectPatch.remove(comparable);
    }

    public int serializeOffset() {
        return this.connectPatch.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.notifyMessage.size() + this.connectPatch.size();
    }

    public final int updateTimer(Comparable comparable) {
        int i;
        int size = this.notifyMessage.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((EndpointList) this.notifyMessage.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((EndpointList) this.notifyMessage.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler implements Iterator {
        public Iterator notifyMessage;
        public int reduceScope;

        public BounceHandler() {
            this.reduceScope = CanvasMigration.this.notifyMessage.size();
        }

        public final Iterator evictLayout() {
            if (this.notifyMessage == null) {
                this.notifyMessage = CanvasMigration.this.inflateAdapter.entrySet().iterator();
            }
            return this.notifyMessage;
        }

        @Override // java.util.Iterator
        /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (evictLayout().hasNext()) {
                return (Map.Entry) evictLayout().next();
            }
            List list = CanvasMigration.this.notifyMessage;
            int i = this.reduceScope - 1;
            this.reduceScope = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.reduceScope;
            return (i > 0 && i <= CanvasMigration.this.notifyMessage.size()) || evictLayout().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ BounceHandler(CanvasMigration canvasMigration, ActivityMutator activityMutator) {
            this();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class StylusConverter implements Iterator {
        public Iterator connectPatch;
        public boolean notifyMessage;
        public int reduceScope;

        public StylusConverter() {
            this.reduceScope = -1;
        }

        public final Iterator evictLayout() {
            if (this.connectPatch == null) {
                this.connectPatch = CanvasMigration.this.connectPatch.entrySet().iterator();
            }
            return this.connectPatch;
        }

        @Override // java.util.Iterator
        /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.notifyMessage = true;
            int i = this.reduceScope + 1;
            this.reduceScope = i;
            return i < CanvasMigration.this.notifyMessage.size() ? (Map.Entry) CanvasMigration.this.notifyMessage.get(this.reduceScope) : (Map.Entry) evictLayout().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.reduceScope + 1 < CanvasMigration.this.notifyMessage.size() || (!CanvasMigration.this.connectPatch.isEmpty() && evictLayout().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.notifyMessage) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.notifyMessage = false;
            CanvasMigration.this.applyTask();
            if (this.reduceScope >= CanvasMigration.this.notifyMessage.size()) {
                evictLayout().remove();
                return;
            }
            CanvasMigration canvasMigration = CanvasMigration.this;
            int i = this.reduceScope;
            this.reduceScope = i - 1;
            canvasMigration.purgeNode(i);
        }

        public /* synthetic */ StylusConverter(CanvasMigration canvasMigration, ActivityMutator activityMutator) {
            this();
        }
    }

    public CanvasMigration(int i) {
        this.reduceScope = i;
        this.notifyMessage = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.connectPatch = map;
        this.inflateAdapter = map;
    }
}
