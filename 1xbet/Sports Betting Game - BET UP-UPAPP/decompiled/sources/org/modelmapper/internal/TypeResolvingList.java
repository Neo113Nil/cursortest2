package org.modelmapper.internal;

import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.CopyOnWriteLinkedHashMap;

/* loaded from: classes4.dex */
public class TypeResolvingList<T> extends AbstractList<T> {
    private final Map<T, Class<?>> elements = new CopyOnWriteLinkedHashMap();
    private final Class<? super T> valueAccessorType;

    public TypeResolvingList(Class<? super T> cls) {
        this.valueAccessorType = cls;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        addElement(t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.elements.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        return addElement(t);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        Iterator<T> it = this.elements.keySet().iterator();
        for (int i2 = 0; i2 < i; i2++) {
            it.next();
        }
        return it.next();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (addElement(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.elements.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i) {
        T t = get(i);
        this.elements.remove(t);
        return t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        this.elements.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            this.elements.remove(it.next());
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public List<T> subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    private boolean addElement(T t) {
        Assert.notNull(t, "element");
        Class<?> resolveRawArgument = TypeResolver.resolveRawArgument((Type) this.valueAccessorType, t.getClass());
        Assert.notNull(resolveRawArgument, "Must declare source type argument <T> for the " + this.valueAccessorType.getSimpleName());
        this.elements.put(t, resolveRawArgument);
        return true;
    }

    public T first(Class<?> cls) {
        for (Map.Entry<T, Class<?>> entry : this.elements.entrySet()) {
            if (entry.getValue().isAssignableFrom(cls)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
