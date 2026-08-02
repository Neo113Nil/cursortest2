package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class Iv extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC0952et.X(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
