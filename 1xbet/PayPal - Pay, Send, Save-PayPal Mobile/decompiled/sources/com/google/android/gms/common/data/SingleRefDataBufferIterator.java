package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private java.lang.Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            int i = this.zab;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot advance the iterator beyond ");
            sb.append(i);
            throw new java.util.NoSuchElementException(sb.toString());
        }
        int i2 = this.zab + 1;
        this.zab = i2;
        if (i2 == 0) {
            java.lang.Object checkNotNull = com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = checkNotNull;
            if (!(checkNotNull instanceof com.google.android.gms.common.data.DataBufferRef)) {
                java.lang.String valueOf = java.lang.String.valueOf(checkNotNull.getClass());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DataBuffer reference of type ");
                sb2.append(valueOf);
                sb2.append(" is not movable");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        } else {
            ((com.google.android.gms.common.data.DataBufferRef) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
