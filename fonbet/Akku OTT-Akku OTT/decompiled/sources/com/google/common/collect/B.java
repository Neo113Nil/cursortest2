package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class B<K, V> extends AbstractC0961i<Object, Object> {
    private static final long serialVersionUID = 0;
    public transient int i;

    public B() {
        super(r.b(12));
        this.i = 2;
        this.i = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.i = 2;
        int readInt = objectInputStream.readInt();
        j(r.b(12));
        n0.a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.b(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Collection h() {
        return C0970s.a(this.i);
    }
}
