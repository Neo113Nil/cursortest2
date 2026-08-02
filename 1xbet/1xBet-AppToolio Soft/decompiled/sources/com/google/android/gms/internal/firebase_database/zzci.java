package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzci implements Iterator<zzid> {
    private int offset;
    private final /* synthetic */ zzch zzht;

    zzci(zzch zzchVar) {
        int i;
        this.zzht = zzchVar;
        i = this.zzht.start;
        this.offset = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.offset;
        i = this.zzht.end;
        return i2 < i;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzid next() {
        zzid[] zzidVarArr;
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements.");
        }
        zzidVarArr = this.zzht.zzhr;
        int i = this.offset;
        zzid zzidVar = zzidVarArr[i];
        this.offset = i + 1;
        return zzidVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove component from immutable Path!");
    }
}
