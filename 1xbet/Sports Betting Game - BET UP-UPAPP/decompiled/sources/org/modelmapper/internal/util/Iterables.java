package org.modelmapper.internal.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class Iterables {
    private Iterables() {
    }

    public static boolean isIterable(Class<?> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls);
    }

    public static int getLength(Object obj) {
        Assert.state(isIterable(obj.getClass()));
        return obj.getClass().isArray() ? Array.getLength(obj) : ((Collection) obj).size();
    }

    public static Iterator<Object> iterator(Object obj) {
        Assert.state(isIterable(obj.getClass()));
        return obj.getClass().isArray() ? new ArrayIterator(obj) : ((Iterable) obj).iterator();
    }

    public static Object getElement(Object obj, int i) {
        if (obj.getClass().isArray()) {
            return getElementFromArrary(obj, i);
        }
        if (obj instanceof Collection) {
            return getElementFromCollection((Collection) obj, i);
        }
        return null;
    }

    public static Object getElementFromArrary(Object obj, int i) {
        try {
            return Array.get(obj, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object getElementFromCollection(Collection<Object> collection, int i) {
        if (collection.size() < i + 1) {
            return null;
        }
        if (collection instanceof List) {
            return ((List) collection).get(i);
        }
        Iterator<Object> it = collection.iterator();
        for (int i2 = 0; i2 <= i; i2++) {
            it.next();
        }
        return it.next();
    }

    public static Iterable<Object> subIterable(Object obj, int i) {
        if (obj == null || getLength(obj) < i) {
            return Collections.emptyList();
        }
        final Iterator<Object> it = iterator(obj);
        for (int i2 = 0; i2 < i; i2++) {
            it.next();
        }
        return new Iterable<Object>() { // from class: org.modelmapper.internal.util.Iterables.1
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return it;
            }
        };
    }
}
