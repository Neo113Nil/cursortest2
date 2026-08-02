package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.common.collect.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0962j<K, V> extends AbstractC0955c<Object, Object> {
    private static final long serialVersionUID = 0;
    public transient int i;

    public C0962j() {
        super(r.b(12));
        C0965m.b(3, "expectedValuesPerKey");
        this.i = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.i = 3;
        int readInt = objectInputStream.readInt();
        j(r.a());
        n0.a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.b(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Collection h() {
        return new ArrayList(this.i);
    }
}
