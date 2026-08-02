package org.bouncycastle.util;

/* loaded from: classes17.dex */
public interface Store<T> {
    java.util.Collection<T> getMatches(org.bouncycastle.util.Selector<T> selector) throws org.bouncycastle.util.StoreException;
}
