package com.google.common.collect;

import com.google.common.collect.AbstractC0958f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class Y<K, V> extends AbstractC0955c<K, V> {
    private static final long serialVersionUID = 0;
    public transient com.google.common.base.s<? extends List<V>> i;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.i = (com.google.common.base.s) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        j((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.i);
        objectOutputStream.writeObject(this.e);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Map<K, Collection<V>> g() {
        Map<K, Collection<V>> map = this.e;
        return map instanceof NavigableMap ? new AbstractC0958f.d(this, (NavigableMap) this.e) : map instanceof SortedMap ? new AbstractC0958f.g(this, (SortedMap) this.e) : new AbstractC0958f.a(this.e);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Collection h() {
        return this.i.get2();
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Set<K> i() {
        Map<K, Collection<V>> map = this.e;
        return map instanceof NavigableMap ? new AbstractC0958f.e(this, (NavigableMap) this.e) : map instanceof SortedMap ? new AbstractC0958f.h(this, (SortedMap) this.e) : new AbstractC0958f.c(this.e);
    }
}
