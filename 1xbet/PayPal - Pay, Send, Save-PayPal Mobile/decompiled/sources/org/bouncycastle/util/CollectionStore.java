package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class CollectionStore<T> implements org.bouncycastle.util.Store<T>, org.bouncycastle.util.Iterable<T> {
    private java.util.Collection<T> getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return getMatches(null).iterator();
    }

    @Override // org.bouncycastle.util.Store
    public java.util.Collection<T> getMatches(org.bouncycastle.util.Selector<T> selector) {
        if (selector == null) {
            return new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (selector.match(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public CollectionStore(java.util.Collection<T> collection) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(collection);
    }
}
