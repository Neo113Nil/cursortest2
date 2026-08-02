package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        this.zaa = (com.google.android.gms.common.data.DataBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() - 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (hasNext()) {
            com.google.android.gms.common.data.DataBuffer dataBuffer = this.zaa;
            int i = this.zab + 1;
            this.zab = i;
            return dataBuffer.get(i);
        }
        int i2 = this.zab;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new java.util.NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
