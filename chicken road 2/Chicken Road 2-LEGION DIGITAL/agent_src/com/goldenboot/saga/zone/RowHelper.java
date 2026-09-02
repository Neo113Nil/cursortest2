package com.goldenboot.saga.zone;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class RowHelper extends ClipboardSequence {
    public final StartupGateway reduceScope;

    public RowHelper(StartupGateway backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.reduceScope = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // com.goldenboot.saga.zone.ClipboardSequence
    public boolean applyTask(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.reduceScope.expandArgs(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.reduceScope.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.reduceScope.drawScope(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.reduceScope.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.reduceScope.flattenPackage();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: notifyMessage, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // com.goldenboot.saga.zone.WidgetUtil
    public int releaseHeader() {
        return this.reduceScope.size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.reduceScope.gatherAdapter();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.reduceScope.gatherAdapter();
        return super.retainAll(elements);
    }

    @Override // com.goldenboot.saga.zone.ClipboardSequence
    public boolean serializeOffset(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.reduceScope.startResource(element);
    }
}
