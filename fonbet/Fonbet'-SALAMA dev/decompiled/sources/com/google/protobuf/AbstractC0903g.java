package com.google.protobuf;

import java.util.Iterator;

/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0903g implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
