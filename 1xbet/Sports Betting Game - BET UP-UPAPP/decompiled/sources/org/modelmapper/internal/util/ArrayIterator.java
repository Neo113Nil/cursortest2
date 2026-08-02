package org.modelmapper.internal.util;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ArrayIterator implements Iterator<Object> {
    private final Object array;
    private int index;
    private final int length;

    @Override // java.util.Iterator
    public void remove() {
    }

    public ArrayIterator(Object obj) {
        Assert.isTrue(obj.getClass().isArray());
        this.array = obj;
        this.length = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.array;
        int i = this.index;
        this.index = i + 1;
        return Array.get(obj, i);
    }
}
