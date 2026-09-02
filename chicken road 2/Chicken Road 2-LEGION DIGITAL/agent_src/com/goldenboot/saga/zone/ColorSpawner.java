package com.goldenboot.saga.zone;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ColorSpawner implements Map, KMappedMarker {
    public LayoutEmitter attachConfig;
    public PagerProcessor connectPatch;
    public StreamMonitor notifyMessage;
    public final FontBarrier reduceScope;

    public ColorSpawner(FontBarrier parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.reduceScope = parent;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection clipOrigin() {
        LayoutEmitter layoutEmitter = this.attachConfig;
        if (layoutEmitter != null) {
            return layoutEmitter;
        }
        LayoutEmitter layoutEmitter2 = new LayoutEmitter(this.reduceScope);
        this.attachConfig = layoutEmitter2;
        return layoutEmitter2;
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.reduceScope.injectMetric(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.reduceScope.detachStream(obj);
    }

    public Set detachStream() {
        PagerProcessor pagerProcessor = this.connectPatch;
        if (pagerProcessor != null) {
            return pagerProcessor;
        }
        PagerProcessor pagerProcessor2 = new PagerProcessor(this.reduceScope);
        this.connectPatch = pagerProcessor2;
        return pagerProcessor2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return injectMetric();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.reduceScope, ((ColorSpawner) obj).reduceScope);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.reduceScope.releaseHeader(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.reduceScope.hashCode();
    }

    public Set injectMetric() {
        StreamMonitor streamMonitor = this.notifyMessage;
        if (streamMonitor != null) {
            return streamMonitor;
        }
        StreamMonitor streamMonitor2 = new StreamMonitor(this.reduceScope);
        this.notifyMessage = streamMonitor2;
        return streamMonitor2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.reduceScope.updateTimer();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return detachStream();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int releaseHeader() {
        return this.reduceScope.releaseHeader;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return releaseHeader();
    }

    public String toString() {
        return this.reduceScope.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return clipOrigin();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
